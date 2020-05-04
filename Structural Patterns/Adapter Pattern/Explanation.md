# Adapter Pattern
Adapter Pattern convert the interface of a class into another interface the clients expert. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

## Example 
Suppose you have __*Dragon*__ class with run() and fire() methods and also a __*Bird*__ class with fly() method. Now, you're decided to create a new __*Dragon*__ called __*FlyingDragon*__. We all are know, __*FlyingDragon*__ have same functionalities of __*Dragon*__, but it's fly instead of run. So, we should add fly() method in a __*Dragon*__ class. But wait, why we should create fly() method once again, because we already created it in a __*Bird*__ class, so use it insead of writting it. Yeah, we are going to create a __*FlyingDragon*__ class by using __*Dragon*__ and __*Bird*__ classes. But wait, both are implemented from different interfaces(like, try to connect us plugin on indian plug point). So, how do connect them. 

__*What you do to connect us plugin on indian plug point?*__

Yes, you're right. __*Adapter*__.

Same concept we useing here. Create new class(like Adapter), which convert interface of a class into another interface. 
So we connect __*Dragon*__ and __*Bird*__ classes through new class called __*Adapter*__. which give you flexibility to access the __*Bird*__ class methods through class the __*Dragon*__ object. For, better understanding see the implementation.
