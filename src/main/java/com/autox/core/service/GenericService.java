package com.autox.core.service;


import com.autox.core.base.BaseBean;

import java.util.List;

public interface GenericService<Model extends BaseBean, PK> {

  /**
   * 根据id获取数据
   * @param id 主键ID
   * @return ServiceResult封装，实体对象
   */
  Model findById(PK id);


  /**
   * 插入
   * @param model 对象实体
   * @return 影响行数
   */
  Model insertOne(Model model);

  /**
   * 更新
   * @param model 对象实体
   * @return 影响行数
   */
  int updateOne(Model model);

  /**
   * 删除
   * @param id 主键ID
   * @return 影响行数
   */
  int deleteById(PK id);

  /**
   * 删除多条
   * @param idsList id集合
   * @return 影响行数
   */
  int deleteByIds(final List<PK> idsList);
}
