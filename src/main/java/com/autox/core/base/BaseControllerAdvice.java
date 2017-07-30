package com.autox.core.base;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.annotation.Resource;

/**
 * 全局控制器
 */
@ControllerAdvice
public class BaseControllerAdvice {
  @Resource
  private CustomProperties customProperties;

  /**
   * 全局绑定，所有注解@RequestMapping的方法都可以获得键值对
   * @param model 模型
   */
  @ModelAttribute
  public void addAttributes(Model model) {
    model.addAttribute("customProperties", customProperties);
  }
}
