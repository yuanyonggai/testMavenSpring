package com.wisely.task.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoScheduledTask {

  private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

  @Scheduled(fixedRate = 5000) //每五秒执行一次
  public void reportCurrentTime() {
       System.out.println("每隔五秒执行一次 " + dateFormat.format(new Date()));
   }

  @Scheduled(cron = "0 22 11 ? * *") //每天上午11点22执行
  public void fixTimeExecution(){
      System.out.println("在指定时间 " + dateFormat.format(new Date())+"执行");
  }



}