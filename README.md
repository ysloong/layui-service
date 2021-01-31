#### 介绍

记录一种创建Spring Boot 的方式

#### 默认依赖,即可使用mybatis

~~~java
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>3.4.2</version>
</dependency>
~~~

#### @Select 注解

~~~java
@Select("select product.*,product_category.name category_name from product,product_category " +
            "  WHERE product.category_one_id = product_category.id;")
    List<ProductDetailVo> findProductDetailList();
~~~



