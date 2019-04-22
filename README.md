# SingleRedis
springboot+redis单机配置
## 1. 先pom.xml上添加上依赖
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
</dependency>
```
## 2. 然后application.yml中添加redis的配置
```
spring:
  application:
    name: people-pro
  datasource:
    type: com.alibaba.druid.pool.DruidDataSource            # 当前数据源操作类型
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/edu?serverTimezone=GMT%2B8&amp&useUnicode=true&amp&characterEncoding=utf-8
    username: root
    password: 123456
  redis:
    host: 127.0.0.1
    password: 12345
    port: 6379
    jedis:
      pool:
        max-active: 200
        max-wait: -1ms
        max-idle: 10
        min-idle: 0
    timeout: 1000ms
```
## 3. 工具类
文件对应于RedisUtils.java
## 4. 避免中文乱码的配置类
此配置类是用来获取RedisTemplate,配置类文件名为：RedisConfig.java
## 5. 将主类上添加@EnableCaching
## 6. 使用
参见OrganizationController.java中的初步使用如下
```
@Resource
private RedisUtil redisUtil;

redisUtil.set("xxf", "hhhh");//存
return String.valueOf(redisUtil.get("xxf"));//取
```
