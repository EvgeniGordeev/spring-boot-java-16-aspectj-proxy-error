# Spring Boot 2.4 example 

To reproduce the issue run `mvn`:

```
Caused by: java.lang.IllegalAccessException: module java.base does not open java.lang to unnamed module @11dc3715
	at java.base/java.lang.invoke.MethodHandles.privateLookupIn(MethodHandles.java:260) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:567) ~[na:na]
	at org.springframework.cglib.core.ReflectUtils.defineClass(ReflectUtils.java:574) ~[spring-core-5.3.6.jar:5.3.6]
	... 23 common frames omitted

```
