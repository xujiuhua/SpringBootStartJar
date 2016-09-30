SpringBoot Crete Jar

> springboot搭建以及打包jar

## 创建步骤

<img src="img/new1.png"/>

<img src="img/new2.png"/>

<img src="img/new3.png"/>

<img src="img/new4.png"/>

<img src="img/new5.png"/>


## 新建controller
```java
@Controller
public class JarExample {

    @RequestMapping("jar")
    @ResponseBody
    public Map<String, Object> jar() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("jar", "This is a jar Example");
        return map;
    }
}
```

## 运行main

```java
@SpringBootApplication
public class SpringBootStartJarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartJarApplication.class, args);
	}
}
```

<img src="img/run.png"/>

<img src="img/result.png"/>

## 打包jar

修改build.gradle
```gradle
jar {
	baseName = 'SpringBootStartJar'
	version = '0.0.1-SNAPSHOT'
	manifest {
		attributes 'Main-Class': 'com.johuer.SpringBootStartJarApplication'
	}
}
```

运行build

<img src="img/build1.png"/>

<img src="img/build2.png"/>


## 执行jar

cd 到jar包目录，执行`java -jar xxxx.jar`(xxxx.jar为打包好的jar)

<img src="img/jar.png">

## 结果

`http://localhost:8080/jar`

<img src="img/result.png"/>



