# Java 8功能

只针对主要的特性进行了编码学习，其他更多还待完善 

更多参考：[https://www.journaldev.com/2389/java-8-features-with-examples#iterable-forEach](https://www.journaldev.com/2389/java-8-features-with-examples#iterable-forEach)

Java 8于2014年3月18日发布

Java 8的一些重要功能是：

- [Iterable接口中的forEach（）方法](#Iterable接口中的forEach（）方法)
- [接口中的默认方法和静态方法](#接口中的默认方法和静态方法)
- [功能接口和Lambda表达式](#功能接口和Lambda表达式)
- [用于集合上批量数据操作的Java Stream API](#用于集合上批量数据操作的Stream)
- [Java时间API]()
- [集合API的改进]()
- [并发API改进]()
- [Java IO改进]()
- [其他核心API改进]()

---

## Iterable接口中的forEach（）方法 

Java 8 在接口中引入了forEach方法，java.lang.Iterable因此在编写代码时，我们仅关注业务逻辑。forEach方法将java.util.function.Consumer对象作为参数，因此有助于将我们的业务逻辑放在可重用的单独位置。让我们通过简单的示例查看forEach的用法。

demo详见：[src\main\java\com\gp\demo\Java8ForEachExample.java](src\main\java\com\gp\demo\Java8ForEachExample.java)

## 接口中的默认方法和静态方法 

从Java 8开始，接口已增强为具有实现的方法。我们可以使用default和static关键字来创建带有方法实现的接口。Iterable接口中的forEach方法实现为：

demo详见：

[src\main\java\com\gp\demo\Interface1.java](src\main\java\com\gp\demo\Interface1.java)

[src\main\java\com\gp\demo\Interface2.java](src\main\java\com\gp\demo\Interface2.java)

[src\main\java\com\gp\demo\InterfaceClass.java](src\main\java\com\gp\demo\InterfaceClass.java)

## 功能接口和Lambda表达式 

简化了实现一个借口方法的繁琐编码过程

demo详见：

[src\main\java\com\gp\demo\LambdaDemo.java](src\main\java\com\gp\demo\LambdaDemo.java)

## 用于集合上批量数据操作的Stream 

Java 8中已添加了新内容，以对该集合执行类似过滤/映射/归约的操作。Stream API将允许顺序执行和并行执行。这对我来说是最好的功能之一，因为我经常处理Collections，通常使用Big Data，因此我们需要根据某些条件过滤掉它们。

demo详见：

[src\main\java\com\gp\demo\StreamExample.java](src\main\java\com\gp\demo\StreamExample.java)

