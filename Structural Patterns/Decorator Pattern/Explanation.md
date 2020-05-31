# Decorator Pattern
 The Decorator Pattern attaches additional responsibilities to an object dynamically.Decorators provide a flexible alternative to
subclassing for extending functionality.

Decorator design patterns allow us to add functionality to an object at runtime, and we can apply this customized functionality to an individual object based on our requirement and choice.

## Example
Suppose, you are building a __*Pizza*__ ordering application. In it, you have to derive multiple classes for differnent type of Pizza's.

At now, you are derived a classes for Pizza's. Think, in the application user can specify the ingredient by their own(like add extra cheese or toppings). But, they have to pay for all of the additional ingredients.

__How do you calculate the price?__

Now, you are thing just define the variable for all ingredients and calculate the price.

But, we have a problem in it. What you do, if you have to change one or more ingredients price or adding new ingredient. In this situation, you have to change the existing code for the changes. But, It is not a good and perferable way. Because, it needs more effective and you have to know the working of the full code under the class.

Using, Decorator pattern we add additional responsibilities to the class without affecting existing code.

Just split the different functionality of class into different classes.

So, we can add or change the ingredients just implementing new class or change the specific class.

look the code for better understanding.


