# Apache-Log4j
Apache Log4j 远程代码执行复现 JDK11

> 攻击者可直接构造恶意远程RMI reference 类, JDK 11默认以下参数false,所以面对漏洞或者bug早点升级jdk才是关键

> 设置以下参数重现

`System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");`
`System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");`

### 修复方案：

（1）修改jvm参数
-Dlog4j2.formatMsgNoLookups=true

（2）修改配置
在应用classpath下添加log4j2.component.properties配置文件，log4j2.formatMsgNoLookups=true
