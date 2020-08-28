> 有了一些小成绩就不求上进，这完全不符合我的性格。攀登上一个阶梯，这固然很好，只要还有力气，那就意味着必须再继续前进一步 。
>
> 每天进步一点，加油 ! 😄

![](https://imgconvert.csdnimg.cn/aHR0cHM6Ly9pMDRwaWNjZG4uc29nb3VjZG4uY29tLzU1ZjQwN2QxMThlOTk1Mzc?x-oss-process=image/format,png)





# 反射机制运行原理：
​	1. `Jvm` 扫描 `java`文件,读取文件的信息(构造,属性,方法,实现的接口...)

​	2. 将读取的信息保存在一个 类对象( `java.lang.Class` 包的对象)

​	3. 通过类对象的 `newInstance` 方法获得对象.



## 使用步骤:


 	1. 首先通过 `Class.forName(“全限定名”);`

 	2. 接收返回的类的对象 `Class` 变量名 = `Class.forName(“全限定名”);`

 	3. Object`  变量名= `变量名.newInstance();`（反射)返回一个实例对象 `Object` 类型	





## 获得类对象的三种方式:
​		1. `Class.forName(“全限定名”);`

​		2. `类.class`

​		3. `对象.getClass();`



**首先得再项目工程里创建实体类，如下图：**

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200828183458643.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ5ODg4NTMz,size_16,color_FFFFFF,t_70#pic_center)




##### 方式一：

​	使用 **全限定名**，获取类对象

> 代码如下：

```java
package com.to.demo;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Demo1
 * 
 * @author To be happy oh
 *
 */
public class demo1 {
	
	/**
	 * @param args  参数
	 * @throws Exception  这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {
		
		// 1、 获取类对象
		Class<?> zj = Class.forName("com.to.entity.zj_articles");
		
		// 2、实例化对象，这里需要给对象进行强制转换
		zj_articles newInstance = (zj_articles) zj.newInstance();
		
		// 3、输出对象信息
		System.out.println(newInstance);
	}

}
```



> 控制台如下：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200828183451410.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ5ODg4NTMz,size_16,color_FFFFFF,t_70#pic_center)


![在这里插入图片描述](https://img-blog.csdnimg.cn/20200828183410914.jpg#pic_center)

哈哈 但这里并没有对象信息



##### 方式二：

​		可直接通过 **类名称**  点出类对象

> 代码如下：

```java
package com.to.demo;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Demo2
 * 
 * @author To be happy oh
 *
 */
public class demo2 {

	/**
	 * @param args 参数
	 * @throws Exception 这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {

		// 1、获取 object 对象
		Class<zj_articles> className = zj_articles.class;
		
		// 2、实例化对象，这里需要给对象进行强制转换
		zj_articles newInstance = (zj_articles) className.newInstance();
		
		// 3、输出对象信息,哈哈 但这里并没有对象信息
		System.out.println(newInstance);
	}
}
```





##### 方式三：

​		想要通过 **对象**，获取类对象

> 代码如下：

```java
package com.to.demo;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Demo3
 * 
 * @author To be happy oh
 *
 */
public class demo3 {

	/**
	 * @param args 参数
	 * @throws Exception 这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {
		
		// 1、实例化一个对象，储存堆（元空间） 里
		zj_articles zj = new zj_articles();

		// 2、获取 object 对象
		Class<? extends zj_articles> obj = zj.getClass();
		
		// 3、实例化对象，这里需要给对象进行强制转换
		zj_articles newInstance = (zj_articles) obj.newInstance();
		
		// 4、输出对象信息,哈哈 但这里并没有对象信息
		System.out.println(newInstance);
	}
}
```









## 通过类对象可以获得类中的所有属性对象



> 代码如下：

```java
package com.to.demo;

import java.lang.reflect.Field;
import java.util.Arrays;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Get Property . . .
 * 
 * @author To be happy oh
 *
 */
public class demo4 {

	/**
	 * @param args 参数
	 * @throws Exception 这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {
		
		// 1、实例化一个对象，储存堆（元空间） 里
		zj_articles zj = new zj_articles();

		// 2、获取 object 对象
		Class<? extends zj_articles> obj = zj.getClass();
		
		// 4、获取所有公开的属性集合
		Field[] fields = obj.getFields();
		
		System.out.println(Arrays.toString(fields));
		
		// 5、指定获取公开的属性
		Field BQ = obj.getField("BQ");
		
		System.out.println(BQ);
		
		// 6、获取所有私有属性集合
		Field[] DeclaredFields = obj.getDeclaredFields();
		
		System.out.println(Arrays.toString(DeclaredFields));
		
		// 7、获取私有属性
		Field article_id = obj.getDeclaredField("article_id");
		
		System.out.println(article_id);
	}
}
```





## 反射给对象赋值:

> 代码如下：

```java
package com.to.demo;

import java.util.Date;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Demo5
 * 
 * @author To be happy oh
 *
 */
public class demo5 {
	
	/**
	 * @param args  参数
	 * @throws Exception  这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {
		
		// 1、 获取类对象
		Class<?> obj = Class.forName("com.to.entity.zj_articles");
		
		// 2、实例化对象，这里需要给对象进行强制转换
		zj_articles zj = (zj_articles) obj.newInstance();
		
		
		// 3、属性赋值
		zj.setArticle_id(1); // 设置 ID
		zj.setArticle_date(new Date(System.currentTimeMillis())); // 设置时间

		
		// 4、输出对象信息
		System.out.println(zj);
	}

}
```



> 控制台如下：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200828183312249.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ5ODg4NTMz,size_16,color_FFFFFF,t_70#pic_center)





## 反射去给对象值:

> 代码如下：

```java
package com.to.demo;

import java.lang.reflect.Field;

/**
 * 
 * Test refle Mechanism Demo6
 * 
 * @author To be happy oh
 *
 */
public class demo6 {
	
	/**
	 * @param args  参数
	 * @throws Exception  这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {
		
		// 1、 获取类对象
		Class<?> obj = Class.forName("com.to.entity.zj_articles");
		
		// 2、实例化对象
		Object newInstance = obj.newInstance();
		
		// 3、使用  Field 获取共有属性方法，DeclaredField 获取私有属性方法
		Field article_id = obj.getDeclaredField("article_id"); // 私有属性
		Field BQ = obj.getField("BQ"); // 共有属性
		
		
		// 4、注意这一点，私有属性必须要解锁
		article_id.setAccessible(true);
		BQ.setAccessible(true);
		
		
		// 5、设置属性值
		article_id.set(newInstance, 1);
		BQ.set(newInstance, "Java");

		
		// 6、使用属性获取值
		int Id = (Integer)article_id.get(newInstance);
		String bq = (String)BQ.get(newInstance);
		
		System.out.println(Id);
		System.out.println(bq);
	}

}
```


### 获得构造方法

```java
package com.to.demo;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * 
 * Test refle Mechanism Demo1
 * 
 * @author To be happy oh
 *
 */
public class demo7 {
	
	/**
	 * @param args  参数
	 * @throws Exception  这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {
		
		// 1、 获取类对象
		Class<?> zj = Class.forName("com.to.entity.zj_articles");
		
		
		// 2、获取所有公开构造方法
		Constructor<?>[] constructors = zj.getConstructors();
		
		System.out.println(Arrays.toString(constructors));
		
		
		// 3、指定参数获取公开构造方法
		Constructor<?> constructor = zj.getConstructor(String.class);
		
		System.out.println(constructor);
		
		
		// 4、获取所有私有构造方法
		Constructor<?>[] declaredConstructors = zj.getDeclaredConstructors();
		
		System.out.println(Arrays.toString(declaredConstructors));
		
		
		// 5、指定获取私有构造方法
		Constructor<?> declaredConstructor = zj.getDeclaredConstructor(String.class,int.class);
	
		System.out.println(declaredConstructor);
		
	}
```



**注意事项:**

​     如果构造器是访问受限的,那么需要先调用 `cons.setAccessable(true);`





### 获得方法

 ```java
package com.to.demo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Demo1
 * 
 * @author To be happy oh
 *
 */
public class demo8 {

	/**
	 * @param args 参数
	 * @throws Exception 这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {

		// 1、 获取类对象
		Class<?> zj = Class.forName("com.to.entity.zj_articles");
		
		
		// 2 、实例化
		Object newInstance = zj.newInstance();

		// 3.、获得可以访问的方法（包括父类方法）
		Method[] methods = zj.getMethods();

		System.out.println(Arrays.toString(methods));

		// 4、指定获取可以访问方法
		Method method = zj.getMethod("demo");

		System.out.println(method);

		// 5、获得声明在本类中的所有方法
		Method[] declaredMethods = zj.getDeclaredMethods();

		System.out.println(Arrays.toString(declaredMethods));

		// 6、指定获取可以访问方法
		Method DeclaredMethod = zj.getDeclaredMethod("demo");

		System.out.println(DeclaredMethod);

		
		// 7、执行方法
		method.invoke(newInstance);
		
		// 8、获取修饰符
		String Modifiers = Modifier.toString(method.getModifiers());
		
		System.out.println(Modifiers);
		
		// 9、获取返回值类型
		Class<?> returnType = method.getReturnType();
		
		System.out.println(returnType);
		
		// 10、获得参数列表的类型的类对象
		Class<?>[] parameterTypes = method.getParameterTypes();
		
		System.out.println(Arrays.toString(parameterTypes));
	}

}
 ```





## 源代码：

`GitHub` 地址：https://github.com/MrLi12/reflect
