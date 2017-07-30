package com.autox.core.web;

import com.alibaba.fastjson.JSONObject;
import com.autox.core.base.BaseConstant;
import com.autox.core.entity.QdComputerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
  private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

  @RequestMapping(value = "t/{id}", method = RequestMethod.POST, produces = BaseConstant.JSON)
  public String test(@PathVariable String id,
                           @ModelAttribute QdComputerEntity entity,
                           @RequestBody QdComputerDto dto) {
    JSONObject json = new JSONObject();
    json.put("id", id);
    json.put("entity", entity);
    json.put("dto", dto);
    String jstr = json.toJSONString();
    LOGGER.error("[IndexController]showJson: data = {}", jstr);
    return jstr;
  }


}
