package com.wisely.springel;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

@Configuration
@PropertySource("classpath:com/wisely/springel/test.properties")
public class DemoService {
	@Value("#{systemProperties}")
	private Properties systemProperties;

	@Value("#{systemProperties['os.name']}")
	private String osName;

	@Value("#{ T(java.lang.Math).random() * 100.0 }")
	private double randomNumber;

	@Value("classpath:com/wisely/springel/info.txt")
	private Resource info;

	@Value("#{demoBean.another}")
	private String fromAnother;
	// 注意注入properties使用$而不是#,且需要声明propertyConfigure,在下面的@Bean
	@Value("${wisely.name}")
	private String myName;

	@Value("I love iteye and github")
	private String normal;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public Properties getSystemProperties() {
		return systemProperties;
	}

	public void setSystemProperties(Properties systemProperties) {
		this.systemProperties = systemProperties;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public double getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(double randomNumber) {
		this.randomNumber = randomNumber;
	}

	public Resource getInfo() {
		return info;
	}

	public void setInfo(Resource info) {
		this.info = info;
	}

	public String getFromAnother() {
		return fromAnother;
	}

	public void setFromAnother(String fromAnother) {
		this.fromAnother = fromAnother;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getNormal() {
		return normal;
	}

	public void setNormal(String normal) {
		this.normal = normal;
	}

}