package labseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

// TODO: This code may have bugs and your team must find them!

public class CommandLineGeometer {

  private enum GeometricShape { sphere, triangle, cylinder }

  public static void main(String[] args) {

    // display the welcome message
    System.out.println("Gregory M. Kapfhammer " + new Date());
    System.out.println("Welcome to the Command Line Geometer!");
    System.out.println();

    // declare the starting file and scanner
    File geometryInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      geometryInputsFile = new File("input/geometry_inputs.txt");
      scanner = new Scanner(geometryInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the file!");
    }

    // specify the first file for which we will calculate
    GeometricShape shape = GeometricShape.sphere;

    // TODO: Add comments to all of the remaining code!

    double radius;
    radius = scanner.nextDouble();
    System.out.println("I am reading in the radius for the " + shape + ".");
    System.out.println();

    System.out.println("Calculating the volume of a "
        + shape + " with radius equal to " + radius + ".");
    double sphereVolume = GeometricCalculator.calculateSphereVolume(radius);
    System.out.println("The volume is equal to " + sphereVolume + ".");
    System.out.println();

    shape = GeometricShape.triangle;

    int firstSide;
    firstSide = scanner.nextInt();
    System.out.println("I am reading in the length of the first side.");

    int secondSide;
    secondSide = scanner.nextInt();
    System.out.println("I am reading in the length of the second side.");

    int thirdSide;
    thirdSide = scanner.nextInt();
    System.out.println("I am reading in the length of the third side.");
    System.out.println();

    System.out.println("Calculating the area of a " + shape + ".");
    double triangleArea =
        GeometricCalculator.calculateTriangleArea(firstSide, secondSide, thirdSide);
    System.out.println("The area is equal to " + triangleArea + ".");
    System.out.println();

    shape = GeometricShape.cylinder;

    System.out.println("I am reading in the radius for the " + shape + ".");
    radius = scanner.nextDouble();

    double height;
    System.out.println("I am reading in the height for the " + shape + ".");
    height = scanner.nextDouble();
    System.out.println();

    System.out.println("Calculating the volume of a "
          + shape + " with radius equal to " + radius + ".");
    System.out.println("Calculating the volume of a "
          + shape + " with height equal to " + height + ".");
    double cylinderVolume = GeometricCalculator.calculateCylinderVolume(radius, height);
    System.out.println("The volume is equal to " + sphereVolume);
  }
}
