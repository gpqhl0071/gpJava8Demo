# Java 8功能

只针对主要的特性进行了编码学习，其他更多还待完善 

更多参考：[https://www.journaldev.com/2389/java-8-features-with-examples#iterable-forEach](https://www.journaldev.com/2389/java-8-features-with-examples)

Java 8于2014年3月18日发布

Java 8的一些重要功能是：

- [Iterable接口中的forEach（）方法](#Iterable接口中的forEach（）方法)
- [接口中的默认方法和静态方法](#接口中的默认方法和静态方法)
- [功能接口和Lambda表达式](#功能接口和Lambda表达式)
- [用于集合上批量数据操作的Java Stream API](#用于集合上批量数据操作的Stream)
- [Java时间API](#Java时间API)
- [集合API的改进](https://www.journaldev.com/2389/java-8-features-with-examples#java8-collection)
- [并发API改进](https://www.journaldev.com/2389/java-8-features-with-examples#java8-concurrency)
- [Java IO改进](https://www.journaldev.com/2389/java-8-features-with-examples#java8-io)
- [其他核心API改进](https://www.journaldev.com/2389/java-8-features-with-examples#java8-core)

---

## Iterable接口中的forEach（）方法 

Java 8 在接口中引入了forEach方法，java.lang.Iterable因此在编写代码时，我们仅关注业务逻辑。forEach方法将java.util.function.Consumer对象作为参数，因此有助于将我们的业务逻辑放在可重用的单独位置。让我们通过简单的示例查看forEach的用法。

demo详见：[src/main/java/com/gp/demo/Java8ForEachExample.java](src/main/java/com/gp/demo/Java8ForEachExample.java)

## 接口中的默认方法和静态方法 

从Java 8开始，接口已增强为具有实现的方法。我们可以使用default和static关键字来创建带有方法实现的接口。Iterable接口中的forEach方法实现为：

demo详见：

[src/main/java/com/gp/demo/Interface1.java](src/main/java/com/gp/demo/Interface1.java)

[src/main/java/com/gp/demo/Interface2.java](src/main/java/com/gp/demo/Interface2.java)

[src/main/java/com/gp/demo/InterfaceClass.java](src/main/java/com/gp/demo/InterfaceClass.java)

## 功能接口和Lambda表达式 

简化了实现一个接口方法的繁琐编码过程

demo详见：

[src/main/java/com/gp/demo/LambdaDemo.java](src/main/java/com/gp/demo/LambdaDemo.java)

## 用于集合上批量数据操作的Stream 

Java 8中已添加了新内容，以对该集合执行类似过滤/映射/归约的操作。Stream API将允许顺序执行和并行执行。这对我来说是最好的功能之一，因为我经常处理Collections，通常使用Big Data，因此我们需要根据某些条件过滤掉它们。

demo详见：

[src/main/java/com/gp/demo/StreamExample.java](src/main/java/com/gp/demo/StreamExample.java)

## Java时间API

在Java中使用日期，时间和时区一直很困难。Java中没有用于日期和时间的标准方法或API。Java 8的一个不错的附加功能是该java.time软件包，它将简化Java中使用时间的过程。

仅查看Java Time API软件包，我就可以感觉到它非常易于使用。它具有一些子包java.time.format，这些子包提供用于打印和解析日期和时间的类，并java.time.zone提供对时区及其规则的支持。

新的Time API在整月的几个月和一周中的几天中都更喜欢枚举而不是整数常量。有用的类之一是DateTimeFormatter将datetime对象转换为字符串。

[更多详见](document/Java8日期.md) 


## 参考

[https://howtodoinjava.com/java-8-tutorial/](https://howtodoinjava.com/java-8-tutorial/)

[https://www.journaldev.com/2389/java-8-features-with-examples#iterable-forEach](https://www.journaldev.com/2389/java-8-features-with-examples)