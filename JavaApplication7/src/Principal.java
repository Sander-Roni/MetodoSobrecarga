public class Principal {
    public static void main(String[] args) {
        MetodoSobrecarga metodo = new MetodoSobrecarga();
        metodo.calcular(2, 4);
        metodo.calcular("O", "i");
        metodo.calcular(2, 5, 3);
        System.out.println(metodo.calcular(2));
        System.out.println(metodo.calcular("O", "i"));
    }
}
