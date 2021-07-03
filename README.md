뉴렉쳐 스프링 11강 내용 바탕으로 작성입니다. 제가 이해하기 위해 쓴글이므로 맞춤법이 이상하고 반말을 해도 양해 부탁드립니다.^^
오늘 배운 내용은 스프링에서 콜렉션을 어떻게 다루는가야 코드는 프로젝트에 다 작성되어 있엉 크게 엄청난거 없엉
그냥 스프링에서도 List<Exam> exams = new ArrayList<>(); 이와 같은 코드를 컬렉션으로 바꿀수 있는가야
xml을 보면 내가 구현을 해놓았어 <bean id="exams" class="java.util.ArrayList" /> 그냥 저위에 코드만 구현한다면
이런식이고 이걸 자바 코드에서 활용하면 List<Exam> exams = (List<Exam>) context.getBean("exams"); 이런식이야
내용은 딱봐도 이해가갈거라 생각해 jsp에서 빈즈파일 구성할때랑 사용법이 비슷해서 아마 더 이해가 잘될거야
근데 여기서 만약에 .add를 한다면 어떤식으로 구현해야할까 이거의 답은 arrayList를 보면 인자로 리스트와 같은
컬렉션을 넘길수가 있어 그럼 저번시간에 배웠던 constructor-arg태그를 사용해서 인자를 넘길수 있겠지?
그리고 리스트를 넘겨야되는데 xml에서 리스트는 list태그를 사용하면되 다음과같이

<!-- <bean id="exams" class="java.util.ArrayList">
	<constructor-arg>
	<list>
		<bean class="spring.di.entity.SongExam" p:kor="1" p:eng="1" p:math="1" p:com="1" />
		<ref bean="exam"/>
	</list>
	</constructor-arg>
	</bean>-->

리스트안에 bean 태그와 ref 태그가 있는데
리스트에는 exam타입의 객체가 들어가야하고 당연히 이름은 필요없으니까 빈태그에 id는 넣지 않은거고
ref태그 같은 경우에는 보기만해도 이해가 갈거같긴한데 xml에 있는 exam빈을 참조해서 리스트 안에 넣은거야
즉 리스트에는 멤버변수를 모두 1로 초기화한 객체 하나와 exam을 참조하는 객체하나가 들어있고 이 리스트는
생성자의 인수로 적용이되서 ArrayList의 생성과 초기화까지 된거지
근데 여기까지 들으면 의문이 생길거야 그러면 저렇게 생성자로 안넘기고 그냥 컬렉션 자체를 만들어버리면 안되나?
그걸 사용하기위해서는 util이라는 namespace를 적용해야되고 적용을 했다면

<!--<util:list id="exams" list-class="java.util.ArrayList">
		<bean class="spring.di.entity.SongExam" p:kor="1" p:eng="1" p:math="1" p:com="1" />
		<ref bean="exam"/>
	</util:list>--> 이와 같은 방식으로 만들어서 위에꺼와 같은 결과를 출력할수있어 이게 훨씬 간편하지

이코드를 좀 해석하자면 util 네임 스페이스를 활용해서 exams라는 아이디를 같는 ArrayList컬렉션을 만든거야
오늘은 여기까지!!
