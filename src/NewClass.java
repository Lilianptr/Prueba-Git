/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilit
 */
import java.util.Scanner;
public class NewClass {
    
    public static double f(double x) {
    return x * x;
}
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double d = Double.parseDouble(sc.nextLine());
    System.out.println(f(d));
}
}
    