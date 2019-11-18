package com.gp.jdk7.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author gao peng
 * @date 2019/11/18 16:50
 */
public class TryWithResources {

  public static void main(String[] args) {

    String line;

    try (BufferedReader br = new BufferedReader(
        new FileReader("C:\\testing.txt"))) {

      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    // br will be closed automatically
  }

  /*
  public static void main(String[] args) {

   BufferedReader br = null;
   String line;

   try {

      br = new BufferedReader(new FileReader("C:\\testing.txt"));
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null) br.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }
  */


}
