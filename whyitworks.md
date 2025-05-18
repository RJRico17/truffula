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

