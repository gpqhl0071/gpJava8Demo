参考：[https://www.journaldev.com/2800/java-8-date-localdate-localdatetime-instant](https://www.journaldev.com/2800/java-8-date-localdate-localdatetime-instant)

# 为什么我们需要新的Java日期时间API？

1. Java的日期时间类没有一致的定义，我们有时间在类都java.util和java.sql包。再次在java.text包中定义了格式化和解析类。
1. java.util.Date同时包含日期和时间，而java.sql.Date仅包含日期。在有了这个java.sql包是没有意义的。而且这两个类都具有相同的名称，这本身就是一个很糟糕的设计。
1. 没有明确定义的时间，时间戳，格式和解析类。我们有java.text.DateFormat用于解析和格式化需求的抽象类。通常，SimpleDateFormat类用于解析和格式化。
1. 所有的Date类都是可变的，因此它们不是线程安全的。这是Java Date和Calendar类的最大问题之一。
1. 日期类不提供国际化，没有时区支持。因此java.util.Calendar，java.util.TimeZone引入了类，但是它们也具有上面列出的所有问题。




参考上面文章，运行了下demo

- [src/main/java/com/gp/demo/date/DateAPILegacySupport.java](src/main/java/com/gp/demo/date/DateAPILegacySupport.java)
- [src/main/java/com/gp/demo/date/DateAPIUtilities.java](src/main/java/com/gp/demo/date/DateAPIUtilities.java)
- [src/main/java/com/gp/demo/date/DateParseFormatExample.java](src/main/java/com/gp/demo/date/DateParseFormatExample.java)
- [src/main/java/com/gp/demo/date/InstantExample.java](src/main/java/com/gp/demo/date/InstantExample.java)
- [src/main/java/com/gp/demo/date/LocalDateExample.java](src/main/java/com/gp/demo/date/LocalDateExample.java)
- [src/main/java/com/gp/demo/date/LocalDateTimeExample.java](src/main/java/com/gp/demo/date/LocalDateTimeExample.java)
- [src/main/java/com/gp/demo/date/LocalTimeExample.java](src/main/java/com/gp/demo/date/LocalTimeExample.java)


目前来说我个人比较喜欢使用 [hutool](https://github.com/looly/hutool)
开源工具中提供的 Date组件进行日期的处理，使用简单，功能也比较全面。