package com.peramdy;

import java.lang.annotation.*;

/**
 * Created by Peramdy on 2017/1/19.
 *
 * @Target 用于描述注解的使用范围(即：被描述的注解可以用在什么地方) 常量含义
 * CONSTRUCTOR       用于描述构造器（领盒饭）。
 * FIELD             用于描述域（领盒饭）。
 * LOCAL_VARIABLE    用于描述局部变量（领盒饭）。
 * METHOD      用于描述方法。
 * PACKAGE     用于描述包（领盒饭）。
 * PARAMETER   用于描述参数。
 * TYPE        用于描述类或接口（甚至 enum ）。
 *
 * @Retention 用于描述注解的生命周期（即：被描述的注解在什么范围内有效）
 * SOURCE   在源文件中有效（即源文件保留，领盒饭）。
 * CLASS    在 class 文件中有效（即 class 保留，领盒饭）。
 * RUNTIME  在运行时有效（即运行时保留）。
 *
 * @Documented 在默认的情况下javadoc命令不会将我们的annotation生成再doc中去的，所以使用该标记就是告诉jdk让它也将annotation生成到doc中去
 *
 * @Inherited 比如有一个类A，在他上面有一个标记annotation，那么A的子类B是否不用再次标记annotation就可以继承得到呢，答案是肯定的
 *
 *
 *
 */




@Target({ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {

}