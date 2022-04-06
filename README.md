# Qulaifier Annotation in Spring
The @Autowired annotation is a great way of making the need to inject a dependency in Spring explicit. Although it's useful, there are use cases for which this annotation alone isn't enough for Spring to understand which bean to inject.

When we have multiple beans with same names we go for @qulaifier Annotation

 Example here we declare two Order beans :
 ```
 <context:annotation-config />

    <bean id="paymentGateway" class="com.javaspr.bean.PaymentGateway"/>

    <bean id="javaOrderBean" class="com.javaspr.bean.Order" >
        <property name="item" value="pedda balasiksha Book" />
        <property name="price" value="RS 4005" />
    </bean>
    <bean id="bookOrderBean" class="com.javaspr.bean.Order" >
        <property name="item" value="chinna bala siksha Book" />
        <property name="price" value="RS 300" />
    </bean>```
    
     And here @Qualifier annotation with bean name,so spring container picks the right bean declaration and assigned to the property.
     
     ````
     public class PaymentGateway {

    @Autowired
    @Qualifier("bookOrderBean")
    private Order order;

    @Override
    public String toString(){
        return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
    }```
    
   #### Required Tools and Softwares:
-Java_8V - Programing Language
-IDE(IntelliJIDEA)
-spring
