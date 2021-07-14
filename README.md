뉴렉처 스프링 aop 7강 내용입니다. 주제는 어노테이션 11강에서도 말했지만 혹시 히스토리를 통해 제 과거 스프링 공부를 보신다면
README.AD는 RAW로 봐주시기 바랍니다. 과거에는 지금처럼 태그를 보이게 해놓지않아서 안보일겁니다.
읽기전에! 제가 이해하기위해 작성한 글이므로 반말 존댓말이 섞일수 있으며 맞춤법이 잘 맞지 않을수 있으므로 양해 부탁드립니다. 그럼 설명ㄱ!
그리고 좀 지저분해서 그전 주석내용들 몇개는 지웠어요 보실거라면 히스토리 보시면됩니다!!!

---------------------------------------------------------------------------------------------------------
오늘은 Point cuts라는것을 배웠어요. Point cuts를 배우기전에 Weaving 과 Join Point를 먼저 학습하게 되는데요. 내용은 이렇습니다. 저희가 cross-cutting concern을 Core concern에 넣잖아요 근데 이 작업을 어떤 사물에 비유하자면 마치 뜨개질하는거같다고 해요. 
다시 설명하자면 이런 겉다리업무를 꽂아넣는 과정을 좀 뜨개질하는거 같다고 해서 이 행위를
뜨개징 Weaving이라고 합니다. 그리고 이 Weaving을 했을때 Weaving의 대상 즉 주업무 사용자의 관점에서의 일을 JoinPoint라고 합니다. 그럼여기서 Point Cuts란 무엇일까요
Join Point는 하나일수도있지만 저희가 프로젝트를 해봐서 아시겠지만 사용되는 모든함수에 적용이 되요. (ex 저번 프로젝트에서 total과 avg둘다 Weaving했죠??) 여기서 짐작이 슬슬 가실겁니다.
Point cuts는 이런 Join Point를 잘라서 다른 일부분만 Weaving 할수있는 설정 정보를 말해요!!
이제 코드 설명하겠습니다 이번코드는 setting.xml만 변경되어 있습니다.
새로 추가된 빈이 있는데요. 첫번째로 id가 classicPointCut인 빈부터 설명하겠습니다. 
classicPointCut 빈은 앞에서 말한 Pointcut을 구현하기 위한 빈인데요. class는 참고해주시기 바랍니다. 혹시 작성하시다가 외우기가 힘드시다면 자바코드에서 작성하시면 자동완성으로 되니까 더 편할겁니다.
classicPointCut빈은 name이 mappedName인 property를 갖는데요. 이것은 setter 함수를 호출하는 정해진 형식이므로 꼭 name은 mappedName 으로 해주셔야합니다. 뜻은 value 값만 Weaving을 적용하게 한다는 뜻입니다. 근데 이것만 쓴다고 Point cut을 제대로 사용하는게 아닌데요.
다른 어드바이저에 끼워서 사용해야합니다. 코드는 보시면 바로이해할겁니다. 예시로 id가 classicBeforeAdvisor인 빈을 보시면 name이 advice pointcut인 property가 있을 것입니다. 
이거또한 정해진 setter가있기에 꼭 name은 위에와 같은 형식에 따라야하구요. ref값을 넣는데 이것을 해석하자면 setAdvice를해서 사용할 advice를지정하고 setPointcut을 해서 사용할 Pointcut을 지정하는겁니다.
이렇게 만들어진 classicAdvisor을 id가 exam인 빈에 interceptorNames 프로퍼티에 리스트에
해당하는 어드바이저를 갈아 끼워주면 됩니다. 즉 제가 만든 classicBeforeAdvisor이나 classicAroundAdvisor을 logBeforeAdvice logAroundAdvice와 바꿔주면 되는것이죠. 이로써 total만 Weaving을 하는것을 확인할수 있을것입니다.
