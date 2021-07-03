뉴렉처 스프링 14강 내용입니다. 주제는 어노테이션 11강에서도 말했지만 혹시 히스토리를 통해 제 과거 스프링 공부를 보신다면
README.AD는 RAW로 봐주시기 바랍니다. 과거에는 지금처럼 태그를 보이게 해놓지않아서 안보일겁니다.
읽기전에! 제가 이해하기위해 작성한 글이므로 반말 존댓말이 섞일수 있으며 맞춤법이 잘 맞지 않을수 있으므로 양해 부탁드립니다. 그럼 설명ㄱ!
그리고 좀 지저분해서 그전 주석내용들 몇개는 지웠어요 보실거라면 히스토리 보시면됩니다!!!

---

오늘은 <code>@Autowired</code>에 대해서 배웠어 Autowired는 set말고도 오버로딩 생성자, 멤버 변수에서도 쓰일수있어.
쓰는법은 멤버변수 위에 <code>@Autowired</code> <code>@Qualifier("exam")</code>을 쓰면되 set이랑 똑같지
di방법중에 오버로딩 생성자를 통한 di가 있으니 이해가 가지만 멤버변수는 뭘까 멤버변수같은경우에는 일반 생성자를 통해
di하는 방법이야 실제로 프로젝트에서 일반생성자 오버로딩생성자 setExam 모두 문장을 출력하는 함수를 두었는데
그걸 통해 확인할수 있었지 또 기본생성자를 지우니 멤버변수 위에 어노테이션을 사용한 경우는 오류가 났어
추가로 오버로딩 생성자 같은 경우에는 <code>@Qualifier("exam")</code>를 그냥은 못써 왜냐하면 오버로딩이 되는 매개변수가
두개일수도 하나일수도 있기때문이야 그래서 다음과같이
<code>
@Autowired
public GridExamConsole(@Qualifier("exam")Exam exam) {
System.out.println("overloaded constructor");
this.exam = exam;
}</code>
파라미터에 어노테이션을 써주면 되는거얌
마지막<code>@Autowired</code>에는 required라는 속성이 있는데 이걸 false로 하면 만약에 해당하는 빈이 없을경우 에러가 안뜨고
그냥 null을 삽입해 이걸활용해 프로젝트에 GridExamConsole에 print함수처럼 디폴트를 처리해줄수있어
