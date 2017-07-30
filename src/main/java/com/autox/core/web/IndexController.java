package com.autox.core.web;

import com.autox.core.base.BaseConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class IndexController {
  private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

  @RequestMapping(value = "/index", method = RequestMethod.GET, produces = BaseConstant.HTML)
  public String index(Model model) {
    String id = "test";
    //在BaseControllerAdvice类中，设置全局model属性注入
    model.addAttribute("testid", id);
    model.addAttribute("datetime", new Date());
    model.addAttribute("bignum", System.currentTimeMillis());
    model.addAttribute("num", 123456.654321);
    return "web/index";
  }
}
