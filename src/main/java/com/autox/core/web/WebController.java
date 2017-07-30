package com.autox.core.web;

import com.alibaba.fastjson.JSONObject;
import com.autox.core.base.BaseConstant;
import com.autox.core.entity.QdComputerEntity;
import com.autox.core.service.QdComputerService;
import com.autox.core.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
@RequestMapping(value = "/rest")
public class WebController {
  private static final Logger LOGGER = LoggerFactory.getLogger(WebController.class);

  @Resource
  private QdComputerService qdComputerService;

  //查询
  @RequestMapping(value = "user/{id}", method = RequestMethod.GET, produces = BaseConstant.JSON)
  public String findUser(@PathVariable String id) {
    try {
      return JsonUtil.toJson(qdComputerService.findById(id));
    } catch (Exception ex) {
      ex.printStackTrace();
      JSONObject json = new JSONObject();
      json.put("success", false);
      json.put("error", ex.getMessage());
      return json.toJSONString();
    }
  }

  //删除
  @RequestMapping(value = "user/{id}", method = RequestMethod.POST, produces = BaseConstant.JSON)
  public String deleteUser(@PathVariable String id) {
    LOGGER.info("[IndexController]deleteUser: id = {}", id);
    JSONObject json = new JSONObject();
    try {
      qdComputerService.deleteById(id);
      json.put("success", true);
    } catch (Exception ex) {
      json.put("success", false);
      json.put("error", ex.getMessage());
    }
    return json.toJSONString();
  }

  //新增
  @RequestMapping(value = "user", method = RequestMethod.POST, produces = BaseConstant.JSON)
  public String insertUser(@ModelAttribute QdComputerEntity entity) {
    JSONObject json = new JSONObject();
    try {
      entity.setId(UUID.randomUUID().toString());
      qdComputerService.insertOne(entity);
      json.put("success", true);
    } catch (Exception ex) {
      json.put("success", false);
      json.put("error", ex.getMessage());
    }
    return json.toJSONString();
  }

  //修改
  @RequestMapping(value = "user/edit", method = RequestMethod.GET, produces = BaseConstant.JSON)
  public String updateUser(@RequestParam(value = "id") String id) {
    JSONObject json = new JSONObject();
    try {
      QdComputerEntity entity = qdComputerService.findById(id);
      entity.setRemark(UUID.randomUUID().toString());
      qdComputerService.updateOne(entity);
      json.put("success", true);
    } catch (Exception ex) {
      json.put("success", false);
      json.put("error", ex.getMessage());
    }
    return json.toJSONString();
  }
}
