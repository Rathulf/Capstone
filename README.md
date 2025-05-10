# Simple Pet Simulator Game


## Classes and Objects
The project uses classes and objects to make the Simple Pet Simulator Game functional. It uses and the abstract class **Entity** to contain the common fields such as the **name**, **happiness**, **hunger**, **energy**, and **message**, it also contains the abstract methods like **feed**, **play**, and the **sleep** methods. the **Pet** class which extends to the Entity class and provides the behavior of the pet, such as eating, sleeping, and playing. The **Game** class is resposible for the Grapical User Interface, it controls the way the pet interacts with the user, and it shows the Pets status, like Happiness, Hunger, and Energy. The **FileHandler** class is responsible for the saving and the loading of your pets data. 

## Class Diagram
A class diagram was made to act as a blueprint for the project it shows how the different class interact with each other. With the **Entity** class as the parent class, which is inherited by the **Pet** class which uses the Entity class as a base for functionality and for the pets behavior. It show how the **Game** file uses the **Pet** file to interact with the user its user. The class diagram show how all files interact with one another to make the game functional.

## Four OOP Principles
The Game shows all four OOP principles and how they are used. Abstraction is used by the abstract **Entity** class, which hides common functionality while allowing subclasses to define details. Encapsulation is used to protect data fields, provide getter methods, control access. Inheritance is shown by how **Pet** extends **Entity**, reusing code and simplifying the design. Polymorphism is used when the **Game** class uses a **Entity** reference to call methods on a **Pet** object, allowing for future substitution of different pet types.

## Exception Handling
Try-catch was used for the reading and writeing of the file. If there was an error unt saving it would state that "File not saved". And it is the same for is an error will occur in loading the file it will prompt "Failed to load file". Overall the code used for the exception handling is a basic code using only Try-Catch method.

## File Handling
File handling was used in the the game to save a pets status in the game, and to load a pets status to the game. Whem saving the the game would create a text file uwing FileWriter to save the name, happiness, hunger, and energy of the pet. The same goes for when you are trying to load a pet to the game if would read the values in the file created by the FileWriter back to the game, this lets users continue with what they were doing with the their virtual pet.

## Graphical User Interface
I used the SWING GUI in createing the GUI for the game, making it interactive with the user. The user can name their pets using the TextField, and it would prompt in the TextArea below. The same goes for how the user interacts with the pets, using the buttons it would determine the actions used to interact with their pets. For the pets status I used a progress bar to show their happiness, hunger, and energy, the GUI also updates when you interact with your pet. It is a beginner friendly layout that can be used easily.


