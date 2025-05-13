# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java
RJ
Looking like `app.java` is showing us all the different uses Truffula has for us. Its almost like a page for isntructions on how to use Truffula like a user guide. It also describes how Truffula works and what it does, its like a documentation. It also shows you the main method in where we actually run Truffula.

Abdi
It's the main app of our code that will be running the main method. Like RJ said, it's a like a set of instructions that gives us a run down of how the overall app should be behaving. Features like if order of the flags (-nc & -h) are important and how the path will need to work when calling it on the command line.

## ConsoleColor.java
RJ 
Just googled it an an enum is something in java that never changes. Its let a const variable in javascript where it does not change. So in `ConsoleColor.java` we define all of the colors we want use and since they never change we use an enum. We also have a couple of constructors. We can change the console text with consolecolor(String code) with the code being our enum colors. We can get the code of the color with getCode(). We can also get the code as a string by overwriting toString().

Abdi
After googling, I can sort of relate enums to JavaScript consts in a way - because enums are constant. They don't change. It also explains ANSI codes wll be implemented to assign the colors. It defines the different colors as enums. Then at the very bottom of the file, there's constructors. ConsoleColor(Strnig code) changes the console text color to the given enum color using ANSI. getCode() simply returns the ANSI code of a given string while toString() returns our enum code as a String.

## ColorPrinter.java / ColorPrinterTest.java
RJ
`ColorPrinter.java` allows use to define what color to use to print console messages. Colors can be changed or kept depnding on our needs. ColorPrinter is an object, we pass in System.out, we use setCurrentColor to set color of System.out messages, then we print out the messages using the object name and println("Hello World"). We have multiple methods such as getCurrentColor(), setCurrentColor(takes param color), println("message") this is overwriting a already existing method. We also make sure to reset the color? Yes next method we reset the color if needed, if we println("hello") WITHOUT specifying reset boolean, will always be true. also print("msg") without making new line, also boolean always set to true. Need to implement print("msg") where we reset the color. We also construct colorPrinter objects with default white color and specified printStream. In `ColorPrinterTest.java` we arrange act and assert by arranging a new print stream, we set that print stream color to a specficed color aka red, and we pass in a new message, `"I speak for the trees"` and we assert that it is equal in the console log as a red text message to what we think it should produce.

Abdi
This java file will basically help in both settings our colors and printing our messages. Our messages can keep the desired current color or they can change, but the key point is all print operations after setting the color using setCurrentColor will use that color. Then there's some overwriting going on, like in println for example. Something noteworthy is the concept of reset - in the 2nd println method on line 67, it defines what the boolean reset does. It's an optional feature given that allows us to reset the color if desired. We will need to implement code for our method print which is similar to println method except it won't append a newline and similar to the print method with the way we will be using the reset. Finally, 2 ColorPrint constructors.

## TruffulaOptions.java / TruffulaOptionsTest.java
RJ 
`TruffulaOptions.java` is like setting up the different parameters we can have when we call truffula for example we use the arguments `-h` or `-nc` which allows us to see hidden files or print with no color. We also take in a path argument of either what folder we want to explore, or where we want to explore relative to where our terminal is viewing in. It also gives us examples of different ways to construct valid and invalid truffula calls. We have a truffula constructor with private values of root, showhidden, and usecolor. getRoot() returns the root of the directory. we also have a toString() method that overwrites the existing and shows the configged arugments. We also have boolean methods isuseColor() and isShowHidden() which returns whether or not we show hidden files or use color by returning true or not. Towards the end there is a place where we have to implement what argument is passed to use via the console and we have to process it by checking if we use those `-h` or `-nc` flags. `TruffulaOptions.java` tests if we are getting the correct paths or files showing depending on what we call, also asserts if no color is shown if we define it to or not.


## TruffulaPrinter.java / TruffulaPrinterTest.java

## AlphabeticalFileSorter.java