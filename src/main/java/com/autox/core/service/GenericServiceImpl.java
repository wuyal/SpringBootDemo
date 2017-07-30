package com.autox.core.service;

import com.autox.core.base.BaseBean;
import com.autox.core.dao.GenericDao;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * 抽象类
 */
public abstract class GenericServiceImpl<Model extends BaseBean, PK>
    implements GenericService<Model, PK> {
  /**
   * 抽象方法,由子类实现，完成Dao的注入
   * @return GenericDao实现类
   */
  public abstract GenericDao<Model, PK> getDao();

  @Override
  @Cacheable(cacheNames = "htss:qrcb:cache", key = "#root.targetClass+'_'+#id")
  public Model findById(PK id) {
    return getDao().selectByPrimaryKey(id);
  }

  @Override
  @CacheEvict(cacheNames = "htss:qrcb:cache", key = "#root.targetClass+'_'+#id")
  public int deleteById(PK id) {
    return getDao().deleteByPrimaryKey(id);
  }

  @Override
  @CachePut(cacheNames = "htss:qrcb:cache", key = "#root.targetClass+'_'+#result.id")
  public Model insertOne(Model model) {
    getDao().insertSelective(model);
    return model;
  }

  @Override
  @CacheEvict(cacheNames = "htss:qrcb:cache", key = "#root.targetClass+'_'+#model.id")
  public int updateOne(Model model) {
    return getDao().updateByPrimaryKeySelective(model);
  }

  //多条删除，只能全部清除缓存
  @CacheEvict(cacheNames = "htss:qrcb:cache", allEntries = true)
  public int deleteByIds(final List<PK> idsList) {
    return getDao().deleteByIds(idsList);
  }
}
