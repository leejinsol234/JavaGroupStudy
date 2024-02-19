package ch7;

class BindingTest2 {
    public static void main(String[] args) {
        Parent02 p = new Child02();
        Child02 c = new Child02();

        System.out.println("p.x = " + p.x);
        p.method02();

        System.out.println("c.x = " + c.x);
        c.method02();
    }
}

class Parent02 {
    int x = 100;

    void method02() {
        System.out.println("Parent Method");
    }
}

class Child02 extends Parent02 { }