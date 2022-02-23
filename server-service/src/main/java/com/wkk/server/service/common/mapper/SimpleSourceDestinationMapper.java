package com.wkk.server.service.common.mapper;


import com.wkk.server.service.domain.SimpleDestination;
import com.wkk.server.service.domain.SimpleSource;
import org.mapstruct.Mapper;

/**
 * TODO 类描述
 *
 * @author weikunkun
 * @since 2022/2/23
 */
@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
