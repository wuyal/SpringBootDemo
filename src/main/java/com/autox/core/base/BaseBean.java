package com.autox.core.base;


import com.autox.core.util.JsonUtil;

import java.io.Serializable;

/**
 * 微信实体基础类
 * @author autox.rem
 */
public abstract class BaseBean implements Serializable {
  private static final long serialVersionUID = -1805283690606975260L;

  /**
   * 转换成JSON字符串
   * @return JSON字符串
   */
  public String toJson() {
    return JsonUtil.toJson(this);
  }

  /**
   * 重写toString方法
   * @return JSON字符串
   * @see Object#toString()
   */
  @Override
  public String toString() {
    return this.toJson();
  }
}
