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

## ColorPrinter.java / ColorPrinterTest.java

## TruffulaOptions.java / TruffulaOptionsTest.java

## TruffulaPrinter.java / TruffulaPrinterTest.java

## AlphabeticalFileSorter.java