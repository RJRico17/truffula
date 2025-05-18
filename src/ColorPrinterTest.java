import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorPrinterTest {

  @Test
  void testPrintlnWithRedColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message);


    String expectedOutput = ConsoleColor.RED + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintWithRedColorAndReset() {
    // Arrange
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act
    String message = "red terminal text with color reset";
    printer.print(message, true);


    String expectedOutput = ConsoleColor.RED + "red terminal text with color reset" + ConsoleColor.RESET;

    // Assert
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnWithRedColorAndNoReset() {
    // Arrange
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act
    String message = "red terminal text on a new line without color reset";
    printer.println(message, false);


    String expectedOutput = ConsoleColor.RED + "red terminal text on a new line without color reset" + System.lineSeparator();

    // Assert
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintWithRedColorAndNoReset() {
    // Arrange
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act
    String message = "red terminal text without color reset";
    printer.print(message, false);


    String expectedOutput = ConsoleColor.RED + "red terminal text without color reset";

    // Assert
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnWithDefaultColorAndReset() {
    // Arrange
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RESET);

    // Act
    String message = "default terminal text on a new line with color reset";
    printer.println(message, true);


    String expectedOutput = ConsoleColor.RESET + "default terminal text on a new line with color reset" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintWithDefaultColorAndReset() {
    // Arrange
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RESET);

    // Act
    String message = "default terminal text with color reset";
    printer.print(message, true);


    String expectedOutput = ConsoleColor.RESET + "default terminal text with color reset" + ConsoleColor.RESET;

    // Assert
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnWithDefaultColorAndNoReset() {
    // Arrange
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RESET);

    // Act
    String message = "default terminal text on a new line without color reset";
    printer.println(message, false);


    String expectedOutput = ConsoleColor.RESET + "default terminal text on a new line without color reset" + System.lineSeparator();

    // Assert
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintWithDefaultColorAndNoReset() {
    // Arrange
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RESET);

    // Act
    String message = "default terminal text without color reset";
    printer.print(message, false);


    String expectedOutput = ConsoleColor.RESET + "default terminal text without color reset";

    // Assert
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintWithCyanColorAndNoReset() {
    // Arrange
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.CYAN);

    // Act
    String message = "cyan terminal text without color reset";
    printer.print(message, false);


    String expectedOutput = ConsoleColor.CYAN + "cyan terminal text without color reset";

    // Assert
    assertEquals(expectedOutput, outputStream.toString());
  }
}
