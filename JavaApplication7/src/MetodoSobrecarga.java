public class MetodoSobrecarga {
    
    public void calcular(int n1, int n2){
        System.out.println("Soma: "+(n1+n2));
    }
    
    public void calcular(int n1, int n2, int n3){
        System.out.println("Conta"+((n1+n2)-n3));
    }
    public String calcular(String t1, String t2){
        return (t1 + t2);
    }
    public double calcular(int n1){
        return  Math.sqrt(n1);
    }
}