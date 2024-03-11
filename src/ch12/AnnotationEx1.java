package ch12;

class Parent {
    void parentMethod() { }
}

class Child extends Parent {
    @Override
    void parentMethod(){}
    //void parentmethod() { } // 조상 메서드의 이름을 잘못 적었음.
    //parentMethod로 변경하고 컴파일시 에러 메시지가 나타나지 않음
}