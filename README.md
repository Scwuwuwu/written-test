## 启动说明: 
1. 确保您已安装 Java 17 和 Maven
2. 克隆此仓库到本地
3. 启动DemoApplication
4. 应用将在 http://localhost:8080 启动

## API 说明
### Hello World API

- URL: `/hello`
- 方法: GET
- 认证: 需要
- 返回: 字符串 "Hello World"

### 登录

- 使用 Spring Security 默认的表单登录
- 默认登录页面: `/login`
- 测试账号:
  - 用户名: `test`
  - 密码: `123456`
