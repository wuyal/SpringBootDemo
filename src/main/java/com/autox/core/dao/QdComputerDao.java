package com.autox.core.dao;

import com.autox.core.entity.QdComputerEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 测试模块只读DAO类
 * @author Autox
 */
@Mapper
public interface QdComputerDao extends GenericDao<QdComputerEntity, String> {

}
