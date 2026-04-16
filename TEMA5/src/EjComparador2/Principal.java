package EjComparador2;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        
        // 1. Creamos un array de socios desordenados
        Socio[] listaSocios = {
            new Socio("Carlos", 52),
            new Socio("Ana", 25),
            new Socio("Zulema", 80),
            new Socio("Bernardo", 18),
            new Socio("Lucía", 45)
        };

        System.out.println("=== LISTA ORIGINAL ===");
        imprimirArray(listaSocios);

        // 2. Ordenar por Nombre (Alfabético)
        Arrays.sort(listaSocios, new CompararNombres());
        System.out.println("\n=== ORDENADO POR NOMBRE (A-Z) ===");
        imprimirArray(listaSocios);

        // 3. Ordenar por Edad (Mayor a Menor)
        Arrays.sort(listaSocios, new CompararEdad());
        System.out.println("\n=== ORDENADO POR EDAD (MAYOR A MENOR) ===");
        imprimirArray(listaSocios);
    }

    // Método auxiliar para no repetir código al imprimir
    public static void imprimirArray(Socio[] socios) {
        for (Socio s : socios) {
            System.out.println(s);
        }
    }
}