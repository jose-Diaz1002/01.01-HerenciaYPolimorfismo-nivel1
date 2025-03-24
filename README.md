Exercise 1
In a music group, there are different types of musical instruments. There are 
wind instruments, string instruments, and percussion instruments.
All instruments have as attributes their name and price. Additionally, 
they have a method called play(). This method is abstract in the Instrument 
class and must be implemented in the child classes.
If a wind instrument is being played, the method 
should print: "A wind instrument is playing".
If a string instrument is being played, it should print: 
"A string instrument is playing".
If a percussion instrument is being played, 
it should print: "A percussion instrument is playing".
The process of loading a class only happens once. 
Demonstrate that loading can be triggered either by:
Creating the first instance of that class, or
Accessing a static member of that class.
Research initialization blocks and static blocks in Java.

Exercise 2
Create a class Car with the following attributes:
brand (static final)
model (static)
power (final)
Demonstrate the difference between the three. Is there any attribute that 
can be initialized in the class constructor?
Add two methods to the Car class:
A static method called brake() that prints: "The vehicle is braking".
A non-static method called accelerate() that prints: "The vehicle is accelerating".
Demonstrate how to call the static method and the non-static method from the main() method in the principal class.
