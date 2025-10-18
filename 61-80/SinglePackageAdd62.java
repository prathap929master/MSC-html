
public class SinglePackageAdd62 {

   
    static class pack2 {
        static class AddNumbers {
            public int add(int a, int b) {
                return a + b;
            }
        }
    }

    public static void main(String[] args) {
        pack2.AddNumbers obj = new pack2.AddNumbers();
        int result = obj.add(15, 25);
        System.out.println("The Sum = " + result);
    }
}
