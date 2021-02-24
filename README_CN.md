# 基准性能测试     

**sureness VS shiro VS spring security**   

这个仓库是对sureness进行基准性能测试对比的代码测试样例仓库。  

### 快速开始测试   

1. 依次启动对应框架的样例工程(shiro-demo/spring-security-demo/sureness-demo), 工程启动后默认监听8088端口  
2. 安装apache server，里面自带我们的性能测试工具 Apache Bench, 安装包地址：https://www.apachelounge.com/download/  
3. 进入到apache/bin目录下： cd apache/bin/  
4. 执行测试命令： ab -n 4000 -c 50 -A root:23456 localhost:8088/api/v1/source1  

### 基准性能测试结果  

**环境 - 2 cores, 8 GB dell xps on win10.**  

**每个样例配置了200个api权限配置过滤链.**   

![benchmark](benchmark_cn.png)    


### 测试结论       

**基准测试显示sureness对比无权限框架应用损耗0.026ms性能，shiro损耗0.088ms,spring security损耗0.116ms，
相比之下sureness基本不消耗性能，且性能(参考TPS损耗)是shiro的3倍，spring security的4倍**        

**性能差距会随着api匹配链的增加而进一步拉大**    


### 其它  

**当使用spring security默认的BCryptPasswordEncoder加解密时，spring security损耗44.813ms，sureness性能为spring security的1700倍**    
详见[另一个基准测试](https://github.com/tomsun28/sureness-shiro-spring-security-benchmark/tree/bcrypt)       

   


