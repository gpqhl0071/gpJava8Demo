package com.gp.demo;

/**
 * @author gao peng
 * @date 2019/11/18 15:31
 */
public class LambdaDemo {

  public static void main(String[] args) {
    Interface1 i1 = (s) -> System.out.println(s);

    i1.method1("abc");
  }

}
