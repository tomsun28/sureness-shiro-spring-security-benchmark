# Benchmark Test   

**sureness VS shiro VS spring security**   

The demo code for testing their performance.   

### Quickly Start   

1. start the demo - (shiro-demo/spring-security-demo/sureness-demo), listen on localhost:8088
2. Installed apache server, https://www.apachelounge.com/download/  
3. cd apache/bin/  
4. ab -n 40000 -c 1000 -A root:23456 localhost:8088/api/v1/source3  

### Result  

**environment - 2 cores, 8 GB dell xps on win10.**  

![benchmark](benchmark.png)    

##### sureness VS shiro  

Time taken for tests is similar. - 7.777 seconds / 7.792 seconds  
The shiro demo not support restful api, only for get method.  

##### sureness VS spring security  

Time taken for tests is huge difference, 230 times. - 1843.510 seconds / 7.792 seconds  


##### report   

1. sureness-demo benchmark report  

````
D:\app\apache\Apache24\bin>ab -n 40000 -c 1000 -A root:23456 localhost:8088/api/v1/source3
This is ApacheBench, Version 2.3 <$Revision: 1879490 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 4000 requests
Completed 8000 requests
Completed 12000 requests
Completed 16000 requests
Completed 20000 requests
Completed 24000 requests
Completed 28000 requests
Completed 32000 requests
Completed 36000 requests
Completed 40000 requests
Finished 40000 requests


Server Software:
Server Hostname:        localhost
Server Port:            8088

Document Path:          /api/v1/source3
Document Length:        28 bytes

Concurrency Level:      1000
Time taken for tests:   7.792 seconds
Complete requests:      40000
Failed requests:        0
Total transferred:      6440000 bytes
HTML transferred:       1120000 bytes
Requests per second:    5133.67 [#/sec] (mean)
Time per request:       194.792 [ms] (mean)
Time per request:       0.195 [ms] (mean, across all concurrent requests)
Transfer rate:          807.15 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.3      0       5
Processing:    37  192  16.4    192     231
Waiting:        1   97  52.9     97     222
Total:         37  192  16.4    192     231

Percentage of the requests served within a certain time (ms)
  50%    192
  66%    193
  75%    194
  80%    195
  90%    198
  95%    218
  98%    225
  99%    226
 100%    231 (longest request)
````

2. spring-security-demo benchmark report  

````
D:\app\apache\Apache24\bin>ab -n 40000 -c 1000 -A root:23456 localhost:8088/api/v1/source3
This is ApacheBench, Version 2.3 <$Revision: 1879490 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 4000 requests
Completed 8000 requests
Completed 12000 requests
Completed 16000 requests
Completed 20000 requests
Completed 24000 requests
Completed 28000 requests
Completed 32000 requests
Completed 36000 requests
Completed 40000 requests
Finished 40000 requests


Server Software:
Server Hostname:        localhost
Server Port:            8088

Document Path:          /api/v1/source3
Document Length:        28 bytes

Concurrency Level:      1000
Time taken for tests:   1843.510 seconds
Complete requests:      40000
Failed requests:        0
Total transferred:      16720000 bytes
HTML transferred:       1120000 bytes
Requests per second:    21.70 [#/sec] (mean)
Time per request:       46087.742 [ms] (mean)
Time per request:       46.088 [ms] (mean, across all concurrent requests)
Transfer rate:          8.86 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   8.1      0    1534
Processing:  2595 45646 5763.3  45917   64513
Waiting:      349 45018 5573.7  45181   64511
Total:       2595 45646 5763.2  45917   64513

Percentage of the requests served within a certain time (ms)
  50%  45917
  66%  47782
  75%  48983
  80%  49733
  90%  51659
  95%  53225
  98%  54983
  99%  56188
 100%  64513 (longest request)
````

3. shiro-demo benchmark report  

````
D:\app\apache\Apache24\bin>ab -n 40000 -c 1000 -A root:23456 localhost:8088/api/v1/source3
This is ApacheBench, Version 2.3 <$Revision: 1879490 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 4000 requests
Completed 8000 requests
Completed 12000 requests
Completed 16000 requests
Completed 20000 requests
Completed 24000 requests
Completed 28000 requests
Completed 32000 requests
Completed 36000 requests
Completed 40000 requests
Finished 40000 requests


Server Software:
Server Hostname:        localhost
Server Port:            8088

Document Path:          /api/v1/source3
Document Length:        28 bytes

Concurrency Level:      1000
Time taken for tests:   7.777 seconds
Complete requests:      40000
Failed requests:        0
Total transferred:      6440000 bytes
HTML transferred:       1120000 bytes
Requests per second:    5143.37 [#/sec] (mean)
Time per request:       194.425 [ms] (mean)
Time per request:       0.194 [ms] (mean, across all concurrent requests)
Transfer rate:          808.67 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.3      0       1
Processing:    35  192  14.2    193     206
Waiting:        1   98  52.2     98     202
Total:         35  192  14.2    193     207
````