뉴렉처 스프링 15강 내용입니다. 주제는 어노테이션 11강에서도 말했지만 혹시 히스토리를 통해 제 과거 스프링 공부를 보신다면
README.AD는 RAW로 봐주시기 바랍니다. 과거에는 지금처럼 태그를 보이게 해놓지않아서 안보일겁니다.
읽기전에! 제가 이해하기위해 작성한 글이므로 반말 존댓말이 섞일수 있으며 맞춤법이 잘 맞지 않을수 있으므로 양해 부탁드립니다. 그럼 설명ㄱ!
그리고 좀 지저분해서 그전 주석내용들 몇개는 지웠어요 보실거라면 히스토리 보시면됩니다!!!

---

우리는 di를 어노테이션으로 변경해서 간단하게 하는법을 배웠는데요. 이번에는 빈자체를 어노테이션으로 만드는 방법을 배웠습니다.
간단히 설명을 해보자면 프로젝트에 GridExamConsole 처럼 그 객체 선언위에 <code>@Component</code>를 사용해서 객체를 어노테이션으로 생성할수
있습니다. 이를 통해서 xml에 빈을 생성해주는것처럼 생성해주고 <code>@Autowired</code>를 사용해 di를 해주는것이죠 하지만 이걸 사용해주기전에
역시 xml에 context를 추가해주어야 되는데요 왜냐하면<code>@Autowired</code>같은 경우에는 `<context:annotation-config/>`를 통해
그 빈객체를 조사해서 어노테이션을 찾는거라면 이번에는 객체 바깥에있는 <code>@Component</code>를 찾아야 하기때문에
`<context:component-scan base-package="spring.di.ui"/>`이거와 같이 패키지에있는 컴포넌트를 찾으라는 태그를 추가해서
<code>@Component</code> 찾으면 됩니다. 추가로 만약 위와같은 태그를 쓸경우에는 컴포넌트 안에있는 어노테이션을 읽으므로
`<context:annotation-config/>`는 안써도 됩니다. 이번 프로젝트는 이것을 적용하기 위해 xml에 모든 빈태그를 주석을 하고 진행하였는데요.
GridExamConsole에만 <code>@Component</code>를 추가하고 실행한결과 조금의 에러가 떳는데 그 이유는 프로그램 코드에서
<code>ExamConsole console = (ExamConsole) context.getBean("console")</code> 이부분은 console이라는 빈 객체를 찾는 것이기 때문에
GridExamConsole에 어노테이션을 @Component("console") 다음과 같이 수정하여 해결해 주었고 후에 SongExam도 <code>@Component</code>를 추가하였는데요
SongExam같은 경우에는 다른 패키지에 있으므로 프로젝트를 보시면 알겠지만 다른패키지 주소를 컴마를 통해 문자열로 이어서 추가하였습니다.
GridExamConsole에 <code>@Autowired</code>의 required속성을 true로 해주었는데요 결과 SongExam도 빈이 생성되었지만 멤버변수들이
초기화가 되지않아 0이 출력되었습니다. 멤버변수 초기화방법은 다음강의를 통해 보겠습니다.
