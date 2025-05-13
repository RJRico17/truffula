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
`ColorPrinter.java` allows use to define what color to use to print console messages. Colors can be changed or kept depnding on our needs. ColorPrinter is an object, we pass in System.out, we use setCurrentColor to set color of System.out messages, then we print out the messages using the object name and println("Hello World"). We have multiple methods such as getCurrentColor(), setCurrentColor(takes param color), println("message") this is overwriting a already existing method. We also make sure to reset the color? Yes next method we reset the color if needed, if we println("hello") WITHOUT specifying reset boolean, will always be true. also print("msg") without making new line, also boolean always set to true. Need to implement print("msg") where we reset the color. We also construct colorPrinter objects with default white color and specified printStream.

## TruffulaOptions.java / TruffulaOptionsTest.java

## TruffulaPrinter.java / TruffulaPrinterTest.java

## AlphabeticalFileSorter.java