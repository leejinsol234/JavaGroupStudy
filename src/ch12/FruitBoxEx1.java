package ch12;

import java.util.ArrayList;

class Fruit1				  { public String toString() { return "Fruit";}}
class Apple1 extends Fruit1 { public String toString() { return "Apple";}}
class Grape1 extends Fruit1 { public String toString() { return "Grape";}}
class Toy1		          { public String toString() { return "Toy"  ;}}

class FruitBoxEx1 {
    public static void main(String[] args) {
        Box1<Fruit1> fruitBox = new Box1<Fruit1>();
        Box1<Apple1> appleBox = new Box1<Apple1>();
        Box1<Toy1>   toyBox   = new Box1<Toy1>();
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치

        fruitBox.add(new Fruit1());
        fruitBox.add(new Apple1()); // OK. void add(Fruit item)

        appleBox.add(new Apple1());
        appleBox.add(new Apple1());
//		appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만 담을 수 있음.

        toyBox.add(new Toy1());
//		toyBox.add(new Apple()); // 에러. Box<Toy>에는 Apple을 담을 수 없음

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }  // main의 끝
}

class Box1<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item)  { list.add(item); }
    T get(int i)      { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString();}
}
