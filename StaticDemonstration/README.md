# Static Block Demostration

Static means one per class, which simply means if we declare an integer with a static keyword in the class and create multiple instances from that class and change the value of one instance, it will change the value of every other instances. In static all the instances are referring the same instance variable rather than creating multiple instance variables with multiple values.

Demonstrating how static works.....

## StaticDemo
In StaticDemo class I created a static integer variable called id. After that I created another class called Application which,
1. print the value of the StaticDemo.id (Without creating StaticDemo object):
Output: 0
Reason: In the JVM Class loader in the linking phase, under the preparation stage, it will assign default values to the instance variable which is also known as static variables.

2. Create and assign x value to the StaticDemo.id, after that I created an instance called "test" from StaticDemo and assigned values through that object. Finally I print the values of StaticDemo.id and  test.id:
Output:
20
20
Reason: Static variable belongs to the class and not to the instance, as result of that whether its access through the class or the object, both are referring from the same reference.

3. Dereference the instance called "test" and print the value of test.id using object reference:
Output: 
20
Reason: Though object reference is null, it prints 20 because it is referred from class.

##StaticDemo1
In the StaticDemo1 class I created the empty block, static block and implemented a constructor to identify the order of execution. After that I have implemented main method and within the main method, I created the instance.
Output:
Static block executed.....
Empty block executed.....
Constructor executed......
Reason: In the JVM Class loader, in the linking phase, under the initialization stage, it will execute static block (Simply means it will execute when the class is loading by class loader), empty block will execute when the object is created with new keyword before the constructor executes.
