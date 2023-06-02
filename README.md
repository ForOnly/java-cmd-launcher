# java-cmd-demo
仅用java命令运行java程序
***已实现***

1.   多文件程序
2.   包程序
3.   引入了三方jar包
4.   仅用java命令(使用了相关操作系统文件操作命令，不影响此次项目的目的)
5.   ......

***未实现***

1. 打jar包
2. 打war包
3. 引入maven
4. 引入spring环境
5.	......

### 参考文献

1.    [【java命令行加载第三方jar包】](https://juejin.cn/s/java%E5%91%BD%E4%BB%A4%E8%A1%8C%E5%8A%A0%E8%BD%BD%E7%AC%AC%E4%B8%89%E6%96%B9jar%E5%8C%85)

2.   [【Compiling and Running Java Without an IDE】](https://dzone.com/articles/compiling-and-running-java)

3.   [【无IDE时编译和运行Java】](https://www.cnblogs.com/GarfieldEr007/p/9953844.html)
4.   ......


## 运行

### windows环境下(默认已经配好java环境)
1.   进入项目

     ```shell
     cd java-cmd-demo
     ```

2.   创建classes文件夹

     ```shell
     md classes
     ```

3.   复制resources中的文件到classes中

     ```shell
     copy resources classes\
     ```

4.   复制相关jar包到classes的lib目录下

     ```shell
     xcopy lib classes\lib\
     ```

5.   使用javac命令编译程序

     ```shell
     javac -cp lib\*.jar -d classes com\foronly\example\demo\*.java com\foronly\example\onlycmd\*.java com\foronly\example\*.java
     ```

6.   使用java命令运行程序

     ```shell
     java -cp lib\log4j-1.2.17.jar;classes com.foronly.example.Main
     ```

7.   最终运行截图

     ![image-20230602155847507](Images/image-20230602155847507.png)

