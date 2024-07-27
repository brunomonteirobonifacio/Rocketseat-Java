package je05_tipos_wrappers;

public class TiposWrappers {
    public static void main(String[] args) {
        Integer int1 = Integer.valueOf("100");
        Integer int2 = Integer.valueOf("100");

        switch (int1.compareTo(int2)) {
            case -1 -> System.out.println("Menor");
            case 0  -> System.out.println("Igual");
            case 1  -> System.out.println("Maior");
        }
    }
}
