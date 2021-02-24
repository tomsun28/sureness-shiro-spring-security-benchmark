# Benchmark Test | [中文文档](README_CN.md)    

**sureness VS shiro VS spring security**   

The demo code for testing their performance.   

### Quickly Start   

1. start the demo - (shiro-demo/spring-security-demo/sureness-demo), listen on localhost:8088
2. Installed apache server, https://www.apachelounge.com/download/  
3. cd apache/bin/  
4. ab -n 4000 -c 50 -A root:23456 localhost:8088/api/v1/source1  

### Result  

**environment - 2 cores, 8 GB dell xps on win10.**  

**each demo contains 200 api auth filter chains.**   

![benchmark](benchmark.png)    


### Conclusion     

Compared with frameless protection, sureness only consumes a little application performance.  

Benchmark test shows sureness to lose 0.026ms performance compared to frameless application, shiro lose 0.088ms, spring security lose 0.116ms.   

In contrast, sureness basically does not consume performance, and the performance (TPS loss) is 3 times that of shiro and 4 times that of spring security.   

**The performance gap will be further widened as the api matching chain increases.**       

### Other    

**When using spring security's default BCryptPasswordEncoder for encryption and decryption, spring security loses 44.813ms, and the sureness performance is 1700 times that of spring security**    

Detail see [Another Benchmark](https://github.com/tomsun28/sureness-shiro-spring-security-benchmark/tree/bcrypt)    
