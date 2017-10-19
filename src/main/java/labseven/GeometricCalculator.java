package labseven;

// TODO: This code may have bugs and your team must find them!

public class GeometricCalculator {

  public static double calculateSphereVolume(double radius) {
    double volume;
    volume = (3 / 4) * (Math.PI) * radius * radius * radius;
    return volume;
  }

  public static double calculateTriangleArea(double sideA, double sideB, double sideC) {
    double area;
    area = sideA * sideA + sideB * sideC;
    return area;
  }

  public static double calculateCylinderVolume(double radius, double height) {
    double volume;
    volume = (Math.PI) * radius * radius * radius * height;
    return volume;
  }
}
