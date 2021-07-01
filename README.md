뉴렉님 유튜브 강의 10강을 들은 정리해본 내용입니다.
오늘 배운거는 그전에 배웠던 내용과 비슷하지만 이번에는 생성자에 멤버변수를 초기화할때
그걸 configurefile 즉 xml을 통해 하는 작업이야 프로젝트에는 써놨지만
그걸 위해서 준비해야 될게있어 바로 멤버변수를 초기화하는 생성자를 미리 exam에 만들어두는거야
만약에 만들었다면 프로젝트처럼
<!-- <constructor-arg name="kor" value="10"></constructor-arg>
	<constructor-arg name="eng" value="20"></constructor-arg>
	<constructor-arg name="com" value="30"></constructor-arg>
	<constructor-arg name="math" value="40"></constructor-arg>-->
<constructor>태그를 사용해서 대입시킬 값을 name 혹은 index로가져와서 value에 넣어주면됩니당.
index로 할수도 있겠지만 인덱스로하는것보단 변수를 특정하는 name을 쓰는게 낫겠지? 그리고 추가로
만약에 타입이 다른 생성자가 두개 있을때 프로퍼티로 type까지 넣어줘서 float int처럼 type형을 대입
해주면 명시적으로 함수를 생성자를 처리해줄수있어.

여기서 잠깐 이방법으로 값을 대입시킬수있지만 좀길고 귀찬찮아 우리는 늘 사용법을 주려야해
그래서 나온방법이 <bean id="exam" class="spring.di.entity.SongExam" p:kor="10" p:eng="10" p:math="10" p:com="10" >
위와같은 방법이ㅑ p:이부분은 namespace인데 namespace는 아마 너도 알겠지만 특정 모듈같은거야 예를들어 이름이 같은 코든데
그 기능이 다를때 우리가 원하는 코드를 고르기위해 다른 이름을 부여해 그것을 특정 처리기로 처리하거나 구별하기위해 사용해
즉 그걸 사용해서 저렇게 bean 태그안에서 저렇게 간단하게 값을 대입할수있다는것 오늘은 여기까지
