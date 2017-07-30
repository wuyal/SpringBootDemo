package com.autox.core.service;

import com.autox.core.dao.GenericDao;
import com.autox.core.dao.QdComputerDao;
import com.autox.core.entity.QdComputerEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class QdComputerServiceImpl extends GenericServiceImpl<QdComputerEntity, String>
    implements QdComputerService {

  @Resource
  private QdComputerDao qdComputerDao;

  @Override
  public GenericDao getDao() {
    return qdComputerDao;
  }

//  @Cacheable(cacheNames = "qdcomputer", key = "#root.targetClass+'_'+#id")
//  @Override
//  public QdComputerEntity findById(String id) {
//    return qdComputerDao.selectByPrimaryKey(id);
//  }
//
//  @CacheEvict(cacheNames = "qdcomputer", key = "#root.targetClass+'_'+#id")
//  @Override
//  public int deleteById(String id) {
//    return qdComputerDao.deleteByPrimaryKey(id);
//  }
//
//  @CacheEvict(cacheNames = "qdcomputer", key = "#root.targetClass+'_'+#model.id")
//  @Override
//  public int insertOne(QdComputerEntity model) {
//    return qdComputerDao.insertSelective(model);
//  }
//
//  @CacheEvict(cacheNames = "qdcomputer", key = "#root.targetClass+'_'+#model.id")
//  @Override
//  public int updateOne(QdComputerEntity model) {
//    return qdComputerDao.updateByPrimaryKeySelective(model);
//  }

}
