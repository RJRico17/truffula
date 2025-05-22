# wave 1:

So basically
`ByteArrayOutputStream outputStream = new ByteArrayOutputStream();`
`PrintStream printStream = new PrintStream(outputStream);`
is the way storing System.out to the `printStream` variable, as System.out is a way to define WHERE we print our text. When we pass it into making a
new ColorPrinter object named printer as such:

`ColorPrinter printer = new ColorPrinter(printStream);`
We're kinda saying "hey in this obj printer we just defined all of the outputs will be made at System.out" and we found that out because of the
private final variable `printStream` on top of the `ColorPrinter.java` file. So now when we output from our methods instead of using System.out we will use
printStream, that final private variable that was passed to use when we first created our instance of the printer obj.
`printStream.print(this.currentColor + message + ConsoleColor.RESET);`

# wave 2:
So basically
We create temp variables to hold our booleans and files, `hiddBoolean`,`colorBoolean`, and `rootPath` that will hold our values from string[] args. We use a for i loop ignoring the last index and check if the values equal `-nc` or `-h` respectively and turn booleans into true or false depending on what the args dictate. If the arg does not equal one of those options we throw a `IllegalArgumentException`. We also look at the last index of args[] and check if they DONT equal `-h` or `-nc`, if so we can assume it is the root path. We check the `rootPath` if it either `!.exists()` or `!.isDirectory()` and if they fail meaning the path either does not exist or is not a directory we will throw a `FileNotFoundException`. After we pass all of our variables and args through the checker we assign them to the final variables of the `TruffulaOptions` object