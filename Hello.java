class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
        this.Chanachai();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("Trainee - Krerk Piromsopa, Ph.D. --- ");
    }
    
    private void Chanachai() {
        System.out.println("Trainee - Chanachai");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
}
