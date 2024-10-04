//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicios00 {

    // Ejercicio 1
    public static String ejercicio1() {
        int x = 144;
        int y = 999;
        int suma = x + y;
        int resta = y - x;
        int multiplicacion = x * y;
        //Lo parseamos para la mostrar bien los valores en la divisón
        float division = (float) y / x;

        return (String.format("""
                   x = %d
                   y = %d
                   Suma: %d
                   Resta: %d
                   División: %.2f
                   Multiplicación: %d
                """,x,y,suma,resta,division,multiplicacion));
    }

    // Ejercicio 2
    public static String ejercicio2(String nombre) {
        return String.format("Mi nombre es %s",nombre);
    }

    // Ejercicio 3
    public static String ejercicio3(String nombre, String direccion, String tlf) {
        return String.format("""
                Nombre: %s
                Dirección: %s
                Teléfono: %s
                """,nombre,direccion,tlf);
    }

    // Ejercicio 4
    public static Double eurosAPesetas(int euros) {
        return 166.386 * euros;
    }

    // Ejercicio 5
    public static Double pesetasAEuros(int euros) {
        return euros/166.386;
    }

    // Ejercicio 6
    public static Double calcularTotalFactura(int precio) {
        //Para aplicar la suma de iva al total directamente utlizamos * 1.21
        return precio * 1.21;
    }
}