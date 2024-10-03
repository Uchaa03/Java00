//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
    }

    // Ejercicio 1
    public static void ejercicio1() {
        int x = 144;
        int y = 999;
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        System.out.println("Suma: " + (x + y));
        System.out.println("Resta: " + (x - y));
        System.out.println("Multiplicación: " + (x * y));
        // Casting a double para obtener un resultado decimal
        System.out.println("División: " + (x / (double) y));
    }

    // Ejercicio 2
    public static void ejercicio2() {
        String nombre = "Adrián Ucha Sousa";
        System.out.println("Nombre: " + nombre);
    }

    // Ejercicio 3
    public static void ejercicio3() {
        String nombre = "Adrián Ucha Sousa";
        String direccion = "Quencia 7";
        String telefono = "619766936";

        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }

    // Ejercicio 4
    public static void ejercicio4() {
        double euros = 75;
        double pesetas = euros * 166.386; // 1 euro = 166.386 pesetas
        System.out.println(euros + " euros son " + pesetas + " pesetas.");
    }

    // Ejercicio 5
    public static void ejercicio5() {
        double pesetas = 16638000.0;
        double euros = pesetas / 166.386;
        System.out.println(pesetas + " pesetas son " + euros + " euros.");
    }

    // Ejercicio 6
    public static void ejercicio6() {
        double baseImponible = 40;
        double IVA = 0.21; // Porcentaje del IVA
        double total = baseImponible * (1 + IVA);
        System.out.println("Total de la factura: " + total);
    }
}