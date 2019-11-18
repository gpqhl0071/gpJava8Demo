package com.gp.demo;

/**
 * @author gao peng
 * @date 2019/11/18 15:28
 */
@FunctionalInterface
public interface Interface2 {
  void method2();

  default void log(String str) {
    System.out.println("I2 logging::" + str);
  }


}
