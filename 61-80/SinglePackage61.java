public class SinglePackage61 {

    
    static class Pack1 {
        static class Hello {
            public void display() {
                System.out.println("\n**********************");
                System.out.println("Welcome to Package pack1");
                System.out.println("**********************");
            }
        }
    }
    public static void main(String[] args) {
        Pack1.Hello obA = new Pack1.Hello();
        obA.display();
    }
}
