# JerseyWebServicesWithSpringBoot
https://www.sagarandcompany.com/




#JSON

To GET
http://localhost:8080/employee/get?id=1

{
"name": "Sagar",
"salary": 60000,
"age": 25
}




To Save

http://localhost:8080/employee/save

PayLoad:

{
"name" : "Spring BOOT",
"salary":7000,
"age":20
}



#To XML


To Get

http://localhost:8080/person/xml?id=1


Result:


<pre><code><person>
<name>Sagar</name>
<salary>60000</salary>
<age>25</age>
</person>
</code></pre>

