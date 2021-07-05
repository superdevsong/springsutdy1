package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.SongExam;

 //<context:component-scan base-package="spring.di" />
@Configuration//컨피그 파일이다.
public class SongDiConfig {
	@Bean//<bean  id ="exam" class="spring.di.entity.SongExam" />
	public Exam exam() {
	return new SongExam();

	}
}
