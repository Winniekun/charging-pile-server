package com.wkk.server.configuration;

import com.wkk.server.service.service.grpc.StudentServerServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * TODO 类描述
 *
 * @author weikunkun
 * @since 2022/2/23
 */

@Slf4j
@Configuration
public class GrpcServerManager {
    @Value("${grpc.server.charging-pile-server-grpc-server.port}")
    private Integer port;

    private Server server;

    @Autowired
    private StudentServerServiceImpl studentServerService;

    /**
     * GRPC 服务启动入口
     */
    public void start() {
        try {
            server = ServerBuilder.forPort(port)
                    .addService(studentServerService)
                    .build()
                    .start();
            log.info("charging-pile server grpc server started, listening on {}", port);
        } catch (IOException e) {
            log.error("charging-pile server grpc server start failed with error", e);
        }
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            log.info("*** shutting down znzs gRPC server since JVM is shutting down");
            GrpcServerManager.this.stop();
            log.info("*** znzs gRPC server shut down");
        }));
        GrpcServerManager.this.blockUntilShutdown();
    }

    /**
     * grpc服务停止方法
     */
    private void stop() {
        if (server != null) {
            try {
                server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                log.error("charging-pile gRPC server stop with error", e);
            }
        }
    }

    private void blockUntilShutdown() {
        if (server != null) {
            try {
                server.awaitTermination();
            } catch (InterruptedException e) {
                log.error("charging-pile gRPC server blockUntilShutdown with error", e);
            }
        }
    }
}
