package ch7;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }

    Product2() {} // 기본 생성자
}

class Tv5 extends Product2 {
    Tv5() {
        super(100);	 //조상 클래스의 생성자 Product(int price)를 호출한다.
    }

    public String toString() { return "Tv"; }
}

class Computer2 extends Product2 {
    Computer2() { super(200); }

    public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
    Audio2() { super(50); }

    public String toString() { return "Audio"; }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] item = new Product2[10];	// 구입한 제품을 저장하기 열
    int i =0;			// Product배열에 사용될터

    void buy2(Product2 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;	        // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;	// 제품의 보너스 점수를 추가한다.
        item[i++] = p;		        // 제품을 Product[] item에 저장한다.
        System.out.println(p + "을(를) 구입하셨습니다.");
    }

    void summary() {		    // 구입한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0;		 	// 구입한 물품의 가격 합계
        String itemList =""; 	//구입한 물품 목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i=0; i<item.length;i++) {
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class PolyArgumentTest2 {
    public static void main(String args[]) {
        Buyer2 b = new Buyer2();

        b.buy2(new Tv5());
        b.buy2(new Computer2());
        b.buy2(new Audio2());
        b.summary();
    }
}