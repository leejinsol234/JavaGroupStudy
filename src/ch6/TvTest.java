package ch6;
    class Tv{
        //Tv의 속성(멤버 변수)
        String color;
        boolean power;
        int channel;

        //Tv의 기능(메서드)
        void power() { power = !power; }//tv를 켜거나 끄는 기능을 하는 메서드
        void channelUp(){ ++channel; }//tv 채널을 높이는 기능을 하는 메서드

        void channelDown(){--channel; }//tv 채널을 낮추는 기능을 하는 메서드

    }
    class TvTest{
        public static void main(String[] args) {
            Tv t; //Tv 인스턴스를 참조하기 위한 변수 t를 선언
            t = new Tv(); //Tv 인스턴스를 생성한다.
            t.channel = 7; //Tv 인스턴스의 멤버 변수 channel의 값을 7로 한다.
            t.channelDown(); //Tv 인스턴스의 메서드 channelDown()을 호출한다.
            System.out.println("현재 채널은 " + t.channel + "입니다.");
        }
    }

    class TvTest2 {
        public static void main(String[] args) {
            Tv t1 = new Tv(); //Tv t1; t1 = new Tv();를 한 문장으로 작성
            Tv t2 = new Tv();

            System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
            System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");

            t1.channel = 7;
            System.out.println("t1의 channel값을 7로 변경하였습니다.");

            System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
            System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
        }
    }

    class TvTest3 {
        public static void main(String[] args) {
            Tv t1 = new Tv(); //Tv t1; t1 = new Tv();를 한 문장으로 작성
            Tv t2 = new Tv();

            System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
            System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");

            t2 = t1; //t1이 저장하고 있는 값(주소)을 t2에 저장한다.
            t1.channel = 7; //channel 값을 7로 한다.
            System.out.println("t1의 channel값을 7로 변경하였습니다.");

            System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
            System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
        }
    }
    
    class TvTest4 {
        public static void main(String[] args) {
            Tv[] tvArr = new Tv[3];
            
            //Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 저장
            for(int i=0; i<tvArr.length; i++){
                tvArr[i] = new Tv();
                tvArr[i].channel = i+10; //tvArr[i]의 channel에 i+10을 저장
            }
            
            for(int i=0; i<tvArr.length; i++){
                tvArr[i].channelUp(); //tvArr[i]의 메서드를 호출. 채널이 1 증가
                System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
            }
        }
    }
