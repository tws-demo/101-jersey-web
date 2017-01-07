# 基于 jersey + mybaties + flyway 的api 练习

## 运行方式
1. 在 Mysql 数据库中新建 supermarket 库

   ```mysql
   CREATE DATABASE `supermarket` /*!40100 DEFAULT CHARACTER SET utf8 */
   ```

2. 检查 ./src/main/resources/config.properties 中参数配置是否正确

3. 然后在命令行中执行如下命令


```bash
./gradlew jettyrun
```
然后可以再浏览器中输入 http://localhost:8080/api 即可看到现有接口



## 常见问题

1. 若是基于docker的数据库，可能会出现假死现象，需要重启 docker 和 mysql



## 练习要求

#### 基础篇
1. 完成下列接口
   ```
   GET /items/:id	# 获取一个item
   POST /items #增加一个item
   DELETE /items/:id # 删除一个item
   PUT /items/:id	# 更新一个item
   ```

2. 创建 category 表，category 表与 item 表为一对多关系，并参照上面完成相应接口

3. 创建 cart 表，cart 表与item 表为多对多关系，并参照上面完成相应接口


#### 进阶篇

1. 参照 root_path_shoule_return_items_uri 完成上述接口的集成测试


#### 提升篇
1. 从一个空库开始完成上述过程
2. 画图(电子版)描述 web.xml 与 App.class 的文件结构与运行机制
