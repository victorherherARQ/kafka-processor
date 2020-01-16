package com.poc.kafka.spring.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.handler.annotation.SendTo;

import com.poc.kafka.spring.stream.data.Article;

@EnableBinding(Source.class)
public class ArticleSource {
	

//	@StreamListener
//	@SendTo(Source.OUTPUT)
	public Article sourceOrder() {
	
		Article article= new Article();
		article.setCode("123");
		article.setName("prueba");
		
		return article;
		
	}

}
