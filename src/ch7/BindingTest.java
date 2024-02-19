package ch7;

class BindingTest{
    public static void main(String[] args) {
        Parent1 p = new Child1();
        Child1 c = new Child1();

        System.out.println("p.x = " + p.x);
        p.method1();

        System.out.println("c.x = " + c.x);
        c.method1();
    }
}

class Parent1 {
    int x = 100;

    void method1() {
        System.out.println("Parent Method");
    }
}

class Child1 extends Parent1 {
    int x = 200;

    void method1() {
        System.out.println("Child Method");
    }
}
