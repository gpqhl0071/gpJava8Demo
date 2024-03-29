package com.gp.demo.date;

import java.time.Duration;
import java.time.Instant;

/**
 * @author gao peng
 * @date 2019/11/18 16:21
 */
public class InstantExample {
  public static void main(String[] args) {
    //Current timestamp
    Instant timestamp = Instant.now();
    System.out.println("Current Timestamp = " + timestamp);

    //Instant from timestamp
    Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
    System.out.println("Specific Time = " + specificTime);

    //Duration example
    Duration thirtyDay = Duration.ofDays(30);
    System.out.println(thirtyDay);
  }
}
