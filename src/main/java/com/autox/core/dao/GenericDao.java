package com.autox.core.dao;

import com.autox.core.base.BaseBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GenericDao<Model extends BaseBean, PK> {

  Model selectByPrimaryKey(@Param("id") final PK id);

  int insertSelective(final Model model);

  int updateByPrimaryKeySelective(final Model model);

  int deleteByPrimaryKey(@Param("id") final PK id);

  int deleteByIds(final List<PK> idsList);

}
