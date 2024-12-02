# 生命线
## 项目简介
这个项目是一个用于地震数据分析的系统，能够根据用户指定的经纬度和半径，查询指定年份内发生的地震、滑坡等事件。
## 技术栈
### 后端
- **SpringBoot**：Java框架
- **SpringMVC**：MVC框架
- **Mybatis**：一个持久层框架，用于简化数据库操作
- **Maven**：一个项目管理工具，主要用于构建和依赖管理
- **Knife4j**：基于 Swagger 的 API 文档生成工具
### 数据库
- MySQL
## 部署
### 克隆仓库
```bash
git clone https://github.com/zazhiii/Life-Line
```
### 初始化数据
创建数据库
```sql
CREATE DATABASE lifeline;
USE lifeline;
```
运行doc中的lifeline.sql导入数据。这里只给出部分数据。
### 修改配置
修改`application.yml`中的数据库配置为你的配置

