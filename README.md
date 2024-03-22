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
  프로세스는 실행 중인 프로그램을 말하며, 독립적이기 때문에 메모리 영역을 다른 프로세스와 공유하지 않는다. 프로세스는 최소 1개 이상의 스레드를 가지고 있다.
  스레드는 프로세스 내에서 Stack만 따로 할당 받고, 그 이외의 메모리 영역을 공유하기 때문에 다른 스레드의 실행 결과를 즉시 확인할 수 있다.
  또한 프로세스 내에 존재하며 프로세스가 할당받은 자원을 이용하여 실행된다.
  
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
