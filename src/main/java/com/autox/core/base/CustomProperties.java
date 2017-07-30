package com.autox.core.base;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 自定义属性
 */
@ConfigurationProperties(prefix = "Web")
@Validated
public class CustomProperties extends BaseBean {
  private static final long serialVersionUID = 5023173611461242704L;
  @NotNull
  private String name;

  @NotEmpty
  private String optVersion;

  @Max(value = 200)
  @Min(value = 1)
  private String optNumber;

  @URL
  private String url;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOptVersion() {
    return optVersion;
  }

  public void setOptVersion(String optVersion) {
    this.optVersion = optVersion;
  }

  public String getOptNumber() {
    return optNumber;
  }

  public void setOptNumber(String optNumber) {
    this.optNumber = optNumber;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
