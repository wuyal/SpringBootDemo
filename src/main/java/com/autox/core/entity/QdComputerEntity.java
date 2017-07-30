/**
 * 模块：测试模块
 * 本文件由代码生成器自动完成
 */
package com.autox.core.entity;


import com.autox.core.base.BaseBean;

import java.util.Date;

/**
 * QdComputer实体类
 * @author autox
 */
public class QdComputerEntity extends BaseBean {
  private static final long serialVersionUID = -2007555110412798965L;

  /**
   * <code>id</code> :
   */
  private String id;

  /**
   * <code>macAddress</code> : MAC地址
   */
  private String macAddress;

  /**
   * <code>userName</code> :
   */
  private String userName;

  /**
   * <code>ip</code> :
   */
  private String ip;

  /**
   * <code>createUser</code> : 创建者
   */
  private String createUser;

  /**
   * <code>createTime</code> :
   */
  private Date createTime;

  /**
   * <code>updateUser</code> : 最后更新人
   */
  private String updateUser;

  /**
   * <code>updateTime</code> :
   */
  private Date updateTime;

  /**
   * <code>remark</code> : 备注
   */
  private String remark;

  /**
   * 获取id属性
   *
   * @return id
   * @see QdComputerEntity#id
   */
  //@ExcelField(title = "id", type = ExcelEnum.BOTH, align = ExcelEnum.LEFT, sort = 10)
  public String getId() {
    return this.id;
  }

  /**
   * 设置id属性
   *
   * @param id id
   * @see QdComputerEntity#id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * 获取macAddress属性(MAC地址)
   *
   * @return MAC地址
   * @see QdComputerEntity#macAddress
   */
  //@ExcelField(title = "MAC地址", type = ExcelEnum.BOTH, align = ExcelEnum.LEFT, sort = 20)
  public String getMacAddress() {
    return this.macAddress;
  }

  /**
   * 设置macAddress属性
   *
   * @param macAddress MAC地址
   * @see QdComputerEntity#macAddress
   */
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  /**
   * 获取userName属性
   *
   * @return userName
   * @see QdComputerEntity#userName
   */
  //@ExcelField(title = "userName", type = ExcelEnum.BOTH, align = ExcelEnum.LEFT, sort = 30)
  public String getUserName() {
    return this.userName;
  }

  /**
   * 设置userName属性
   *
   * @param userName userName
   * @see QdComputerEntity#userName
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * 获取ip属性
   *
   * @return ip
   * @see QdComputerEntity#ip
   */
  //@ExcelField(title = "ip", type = ExcelEnum.BOTH, align = ExcelEnum.LEFT, sort = 40)
  public String getIp() {
    return this.ip;
  }

  /**
   * 设置ip属性
   *
   * @param ip ip
   * @see QdComputerEntity#ip
   */
  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   * 获取createUser属性(创建者)
   *
   * @return 创建者
   * @see QdComputerEntity#createUser
   */
  //@ExcelField(title = "创建者", type = ExcelEnum.BOTH, align = ExcelEnum.LEFT, sort = 50)
  public String getCreateUser() {
    return this.createUser;
  }

  /**
   * 设置createUser属性
   *
   * @param createUser 创建者
   * @see QdComputerEntity#createUser
   */
  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  /**
   * 获取createTime属性
   *
   * @return createTime
   * @see QdComputerEntity#createTime
   */
  //@ExcelField(title = "createTime", type = ExcelEnum.BOTH, align = ExcelEnum.LEFT, sort = 60)
  public Date getCreateTime() {
    return this.createTime;
  }

  /**
   * 设置createTime属性
   *
   * @param createTime createTime
   * @see QdComputerEntity#createTime
   */
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  /**
   * 获取updateUser属性(最后更新人)
   *
   * @return 最后更新人
   * @see QdComputerEntity#updateUser
   */
  //@ExcelField(title = "最后更新人", type = ExcelEnum.BOTH, align = ExcelEnum.LEFT, sort = 70)
  public String getUpdateUser() {
    return this.updateUser;
  }

  /**
   * 设置updateUser属性
   *
   * @param updateUser 最后更新人
   * @see QdComputerEntity#updateUser
   */
  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

  /**
   * 获取updateTime属性
   *
   * @return updateTime
   * @see QdComputerEntity#updateTime
   */
  //@ExcelField(title = "updateTime", type = ExcelEnum.BOTH, align = ExcelEnum.LEFT, sort = 80)
  public Date getUpdateTime() {
    return this.updateTime;
  }

  /**
   * 设置updateTime属性
   *
   * @param updateTime updateTime
   * @see QdComputerEntity#updateTime
   */
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  /**
   * 获取remark属性(备注)
   *
   * @return 备注
   * @see QdComputerEntity#remark
   */
  //@ExcelField(title = "备注", type = ExcelEnum.BOTH, align = ExcelEnum.LEFT, sort = 90)
  public String getRemark() {
    return this.remark;
  }

  /**
   * 设置remark属性
   *
   * @param remark 备注
   * @see QdComputerEntity#remark
   */
  public void setRemark(String remark) {
    this.remark = remark;
  }
}