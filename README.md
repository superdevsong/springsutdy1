뉴렉처 스프링 aop 8강 내용입니다. 주제는 어노테이션 11강에서도 말했지만 혹시 히스토리를 통해 제 과거 스프링 공부를 보신다면
README.AD는 RAW로 봐주시기 바랍니다. 과거에는 지금처럼 태그를 보이게 해놓지않아서 안보일겁니다.
읽기전에! 제가 이해하기위해 작성한 글이므로 반말 존댓말이 섞일수 있으며 맞춤법이 잘 맞지 않을수 있으므로 양해 부탁드립니다. 그럼 설명ㄱ!
그리고 좀 지저분해서 그전 주석내용들 몇개는 지웠어요 보실거라면 히스토리 보시면됩니다!!!

---------------------------------------------------------------------------------------------------------
오늘은 저번 시간에 배운 Pointcut이 코드를 간소화 하는법을 배웠어요. 그럼 설명하겠습니다.
만약 <code>Pointcut</code>을 계속 <code>pointcut bean</code>을 만들어서 사용하면 어떻게될까요. <code>classicadvisor</code>마다 모두 똑같이 <code>Pointcut</code>을 사용한다면
문제가 될것은 없을겁니다. 하지만 각자 <code>Pointcut</code>을 다른것을 필요로한다면 해당하는 <code>Pointcut</code>을 일일히 다 만들고 그 <code>id</code>값을 대입해야되죠
그래서 간소화하는 방법이 필요한데요. 코드를 바로 보면서 설명하겠습니다. 
먼저 주석상태인 코드부터 설명하겠습니다.
이제는 안사용할코드는 저번시간에 만든것으로 간소화 한것이 아닙니다.
바로 아래에 패턴형으로 바꾸기 위해 주석처리한것부터가 이번 강의내용을 적용해서 간소화 한것입니다.
보기엔 크게 달라진것은 없습니다. 일단 클래스 이름이 조금 바뀌었습니다. <code>NameMatchMethodPointcutAdvisor</code> 이렇게 바뀌었는데요. 바꾼 이유 그전에 사용한 advice 지정과 <code>Pointcut</code>을 생성을 합치기 위해서 입니다.
그전에는 <code>Pointcut</code>을 빈으로 만들어서 설정했다면 이번에는 <code>Advisor</code>를 만들때 따로 <code>Pointcut</code>생성과 동시에 적용하는것을 볼수있습니다. 여기서 <code>property</code>의 <code>name</code>을 <code>mappedName</code>으로 한다면 하나만 지정할수있고 <code>mappedNames</code>로 한다면 여러개를 지정하는것을 확인할수있습니다. 같이 사용하면 오류가 발생하니 반드시 두 <code>name</code>중 하나만 사용해야합니다.
이제 주석을 나오면 패턴을 적용해서 만든 <code>Advisor</code>을 볼 수있는데요. 이는 패턴형중에 정규형이라는것을 사용한것인데. 보시면 class의 이름이 바뀌어있고 <code>property</code>중에 <code>name</code> 이 <code>patterns</code>인 것이 있는데요. 여기에 <code>value</code>를 <code>.*to.*</code> 다음과 같이 주면 to를 포함를 함수를 <code>Pointcut</code>으로 지정할수 있습니다.
