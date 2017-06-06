## Spring Context, Beans
Spring Context, Beans, Dependency Injection  <br />
Configuration with xml and annoations <br />

### Technologies
Spring Core, Context, Beans, Dependeny Injection <br /> 


### Spring Contexts
ClassPathXmlApplicationContext <br /> 
Xml-based configuration: applicationContext.xml <br /> 

AnnotationConfigApplicationContext <br /> 
Annotation based configuration: class DIConfiguration  <br /> 


### Beans
ClassPathXmlApplicationContext:  <br />
3 Beans: MyXMLApp, email, twitter  <br />

AnnotationConfigApplicationContext <br />
9 Beans <br /> 



### Dependency Injection
AnnotationConfigApplicationContext <br />
Bean definition: @Bean annotation <br />
Bean injection: @Autowired annotation <br />



### Steps
##### Compoile Create jar
*mvn clean compile package*  <br />

##### Run jar
*java -jar target/jar-name.jar* <br />


##### Run tests
*mvn test*  <br />




