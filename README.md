- Generics란?<br>
  지네릭스란 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능이다.
  객체의 타입을 컴파일 시에 체크하기 때문에 객체의 타입 안정성을 높이고 형변환의 번거로움이 줄어든다는 장점이 있다.
  타입 안정성을 높인다는 것은 의도하지 않은 타입의 객체가 저장되는 것을 막고, 저장된 객체를 꺼내올 때 원래의 타입과 다른 타입으로 잘못 형변환되어 발생할 수 있는 오류를 줄여준다는 뜻이다.

- 열거형이란?<br>
  열거형은 서로 관련된 상수를 편리하게 선언하기 위한 것으로 여러 상수를 정의할 때 사용하면 유용하다.
  자바의 열거형은 C언어의 열거형보다 더 향상된 것으로 열거형이 갖는 값뿐만 아니라 타입도 관리하기 때문에 보다 논리적인 오류를 줄일 수 있다.

- Annotation이란?<br>
  프로그램의 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킨 것이다.
  애너테이션은 주석처럼 프로그래밍 언어에 영향을 미치지 않으면서도 다른 프로그램에게 유용한 정보를 제공할 수 있다는 장점이 있다.

- 프로세스와 스레드의 차이는 무엇인가?<br>
  프로세스는 운영체제로부터 자원을 할당받은 독립적인 실행 단위이다. 각 프로세스는 독립된 주소 공간과 자원을 가지며,
  다른 프로세스와는 별개로 실행된다.
  스레드는 하나의 프로세스 내에서 실행되는 여러 실행 흐름으로, 주소 공간을 공유하고 자원을 공유할 수 있다.
  프로세스의 자원을 공유하기 때문에 경량화되어 프로세스보다 빠른 실행이 가능하다.
  
- Thread와 Runnable인터페이스의 차이점은 무엇인가?<br>
  Thread를 상속받으면 다른 클래스를 상속받을 수 없지만, Runnable인터페이스를 구현하면 다른 클래스도 상속받을 수 있다.
  따라서 Runnable인터페이스를 구현하는 것이 일반적이며 재사용성이 높고 코드의 일관성을 유지할 수 있기 때문에 보다 객체지향적인 방법이라고 할 수 있다.
  
- 스레드 동기화 방법에는 어떤 것들이 있나?<br>
  synchronized 키워드, Lock인터페이스 및 그 구현체들을 사용하여 스레드를 동기화할 수 있다.
  먼저 synchronized 키워드는 임계 영역을 설정하는 데에 사용된다. synchronized키워드로 동기화를 하면 자동으로 lock이 잠기고 풀리기 때문에 편리하지만
  때로는 같은 메서드 내에서만 lock을 걸 수 있어서 불편하다. 그럴 때 lock클래스의 ReentrantLock, ReentrantReadWriteLock 등을 사용한다. 

- wait(), notify(), notifyAll() 메서드의 공통점과 차이점은 무엇인가?<br>
  세 가지 메서드의 공통점은 Object에 정의되어 있고, 동기화 블럭 내에서만 사용할 수 있으며 보다 효율적인 동기화를 가능하게 한다.
  차이점으로는 wait() 메서드는 스레드를 일시 정지시키고 다른 스레드가 notify() 또는 notifyAll()을 호출할 때까지 기다리게 한다.
  notify() 메서드는 대기 중인 하나의 스레드를 재개하고, notifyAll() 메서드는 모든 스레드를 재개한다.

- Lambda식(Lambda Expression)이란 무엇이고 왜 사용하는가?<br>
  람다식은 익명 함수를 나타내는 자바의 함수형 프로그래밍 기능이다. 메서드처럼 이름이 없고, 파라미터를 받아들이며
  반환값을 생략할 수 있다. 람다식을 사용하는 이유는 코드의 간결성과 가독성을 향상시키며, 함수형 프로그래밍을 지원하기 위해서이다.

- Stream은 무엇이고 사용하는 이유는 무엇인가?<br>
  Stream은 데이터 소스를 추상화하고, 데이터를 다루는데 자주 사용되는 메서드들을 정의해 놓은 것이다.
  데이터 소스를 추상화한다는 것은 데이터 소스가 무엇이든 간에 같은 방식으로 다룰 수 있게 되었다는 것과 코드의 재사용성이 높아진다는 것을 의미한다.
  Stream을 사용하면 데이터를 효율적으로 처리하고 다양한 연산을 적용할 수 있다. 또한 병렬 처리를 통해 성능을 향상시킬 수 있다.

- Optional클래스는 무엇이고 어떻게 사용해야 하는가?<br>
  Optional클래스는 값을 감싸서 null 또는 NPE(Null Pointer Exception)로부터 부담을 줄이기 위한 wrapper클래스이다.
  Optional클래스는 값을 랩핑하고 다시 풀고, null일 경우에는 대체하는 함수를 호출하는 등의 오버헤드가 있으므로 잘못 사용하면 시스템 성능이 저하된다.
  그렇기 때문에 메서드의 반환값이 절대 null이 아니라면 Optional을 사용하지 않는 것이 좋다.
  즉, Optional은 메서드의 결과가 null이 될 수 있으며, null에 의해 오류가 발생할 가능성이 매우 높을 때 반환값으로만 사용되어야 한다.

- 입출력 작업에서 예외 처리는 왜 중요한가?<br>
  입출력 작업은 네트워크나 파일 시스템과 같은 외부 자원과 상호작용하기 때문에 예상치 못한 문제가 발생할 수 있다.
  예를 들어, 파일이 존재하지 않을 수 있거나 네트워크 연결이 끊어질 수 있다.
  따라서 입출력 작업에서는 예외 처리를 통해 이러한 예외 상황을 처리하고 프로그램의 안정성을 보장해야 한다.

- Java I/O에서 사용되는 스트림(Stream)과 리더(Reader), 그리고 그 차이점은 무엇인가?<br>
  스트림은 바이트 단위로 데이터를 처리하는데 사용되고, InputStream 및 OutputStream 클래스를 기반으로 한다.
  반면에 리더는 문자 단위로 데이터를 처리하는데 사용되고, Reader 및 Writer 클래스를 기반으로 한다.
  이러한 클래스들은 각각 바이트 스트림과 문자 스트림에 특화되어 있으며, 문자 인코딩을 처리하는 데에도 차이가 있다.

- Java에서 소켓(Socket)을 사용하여 어떻게 통신할 수 있나?<br>
  소켓(Socket)을 사용하여 통신하기 위해 먼저 클라이언트는 서버의 IP 주소와 포트 번호를 지정하여 소켓을 만든다.
  그런 다음 클라이언트는 소켓을 사용하여 서버에 연결하고 데이터를 보내고 받을 수 있다.
  서버는 클라이언트의 연결을 수락하고 데이터를 송수신하기 위해 서버소켓(ServerSocket)을 사용한다.

- Java에서 다중 스레드 환경에서 네트워킹을 어떻게 처리하나?<br>
  다중 스레드 환경에서 네트워킹을 처리하기 위해 스레드를 사용하여 각 클라이언트의 요청을 병렬로 처리할 수 있다.
  일반적으로 각 클라이언트 연결마다 별도의 스레드를 생성하여 요청을 처리한다.
  그러나 이때 스레드 간 동기화에 주의해야 하며, 적절한 자원 관리와 데드락을 피하기 위해 조심해야 한다.

- 네트워킹 작업에서 발생할 수 있는 예외는 어떤 것이 있나?<br>
  네트워킹 작업에서는 다양한 예외 상황이 발생할 수 있다. 예를 들어, 연결이 거부되거나 타임아웃이 발생할 수 있다.
  또한 데이터 전송 중에 끊어진 연결이나 잘못된 호스트명 등의 문제가 발생할 수 있다. 따라서 네트워킹 코드에서는 예외 처리를 적절히 수행하여 안정성을 보장해야 한다.

  
