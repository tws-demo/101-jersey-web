# 基于  springBoot+ flyway 的api 练习

## 运行方式
1. 请重新创建项目的base,不必clone 上面的库

1. 在 Mysql 数据库中新建 supermarket 库和 item 表

   ```mysql
   CREATE DATABASE `supermarket` /*!40100 DEFAULT CHARACTER SET utf8 */

   # 在supermarket中建表
   CREATE TABLE `item` (
     `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
     `price` double unsigned NOT NULL DEFAULT '0',
     `name` varchar(255) DEFAULT NULL,
     PRIMARY KEY (`id`)
   ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

   # 可以在 item 中自定义两条数据
   ```

2. 检查 ./src/main/resources/config.properties 中参数配置是否正确


   ​


## 练习要求

**重要：本题包含四个篇目：基础，进阶，提高，出栈，做完一个篇目后，需要到 https://jinshuju.net/f/27Zpwx 提交做题记录**

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
4. 尽量用 stream 操作集合运算


#### 进阶篇

1. 用 flyway 的方式创建上述数据库，并完成功能
2. 参照 root_path_shoule_return_items_uri 完成上述接口的集成测试
3. 学会用调试功能解决问题


#### 提升篇
1. 从一个空库开始完成上述过程
2. 画图(电子版)描述 web.xml 与 App.class 的文件结构与运行机制

## 常见问题

1. 若是基于docker的数据库，可能会出现假死现象，需要重启 docker 和 mysql