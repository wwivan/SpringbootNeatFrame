目前整合了eureka，gateway，security，jwttoken，redis缓存，mysql
还需整合：
log日志，mysql数据的两种形态mybatis（用来处理关系复杂的数据），jpa（处理简单逻辑的）
rabbitmq，定时任务

坑点小结：
1、当需要使用security时，eureka与子服务只能eureka导入security包，子服务只要引入security包报错
2、maven打包配置，只需在各个web的pom里加入<build>...</build>就行，其余均会使得打包失败，因为聚合工程父子项目问题
```xml
    <build>
<!--    打包web工程-->
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <executions>
                    <execution>
                        <goals>
                            <goal>repackage</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <configuration>
                    <skipTests>true</skipTests>    <!--默认关掉单元测试 -->
                </configuration>
            </plugin>
        </plugins>
    </build>
```
        
