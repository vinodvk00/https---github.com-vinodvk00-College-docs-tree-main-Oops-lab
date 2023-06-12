class A{
    int a = 10;

    public void a() {
        int a = 20;
        System.out.println(a);
        System.out.println(this.a);
    }
}

class Main {
    public static void main(String[] args) {
        A A = new A();
        A.a();
    }
}