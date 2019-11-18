package com.gp.demo;

/**
 * @author gao peng
 * @date 2019/11/18 15:28
 */
public class InterfaceClass implements Interface1, Interface2 {
  @Override
  public void method2() {
  }

  @Override
  public void method1(String str) {
  }

  //InterfaceClass won't compile without having it's own log() implementation
  @Override
  public void log(String str) {
    System.out.println("InterfaceClass logging::" + str);
    Interface1.print("abc");
  }
}
