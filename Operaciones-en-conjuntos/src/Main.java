import java.util.HashSet;
import java.util.Set;

public class Main {

    public static Set<Object> union(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.addAll(b);
        return resultado;
    }

    public static Set<Object> intersect(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.retainAll(b);
        return resultado;
    }

    public static Set<Object> diff(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.removeAll(b);
        return resultado;
    }

    public static boolean isSubset(Set<Object> a, Set<Object> b) {
        return a.containsAll(b);
    }

    public static Set<String> cartesiano(Set<Object> a, Set<Object> b) {
        Set<String> resultado = new HashSet<>();
        for (Object elementoA : a) {
            for (Object elementoB : b) {
                resultado.add("(" + elementoA + ", " + elementoB + ")");
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Set<Object> conjuntoA = new HashSet<>();
        conjuntoA.add("a");
        conjuntoA.add("b");
        conjuntoA.add("c");

        Set<Object> conjuntoB = new HashSet<>();
        conjuntoB.add("b");
        conjuntoB.add("c");
        conjuntoB.add("d");

        System.out.println("Union: " + union(conjuntoA, conjuntoB));
        System.out.println("Intersección: " + intersect(conjuntoA, conjuntoB));
        System.out.println("Diferencia A - B: " + diff(conjuntoA, conjuntoB));
        System.out.println("B es subconjunto de A: " + isSubset(conjuntoA, conjuntoB));
        System.out.println("Producto cartesiano: " + cartesiano(conjuntoA, conjuntoB));
    }
}
