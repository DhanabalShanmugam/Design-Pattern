# Builder Pattern
Using Builder Pattern, we can create complex object using simple objects and using a step by step approach. This enables us to create multiple representations using the same construction process.

* Which is used in complex constructor situations.
### Complex constructor.
Multiple constructor having combinations of multiple parameter with nested objects.
### Large number of parameters.
if you having large number of field parameter is also the key point to consider.

## Example
We have class called __*PersonDetails*__. We have to store the persons details in it. So, We required large number of parameters(like firstName, lastName, fatherName, motherName, age, address, education,work, salary and etc). If you have constructor with large amount of parameter it cause error. So, It is very difficult for customer to create object for __*PersonDetails*__ with parameter and it's also require many types of parameter constructure because every one want to create a details with different of parameters( like one person only give a firstName, another person don't want to create give a education and etc). To shortout this problem we using __*Builder Pattern*__. 

To implement the __*Builder Pattern__* we using __*getter and setter*__ methods.
