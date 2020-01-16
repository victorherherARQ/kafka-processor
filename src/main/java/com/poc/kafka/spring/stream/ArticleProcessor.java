package com.poc.kafka.spring.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

import com.poc.kafka.spring.stream.data.Article;

//@EnableBinding(Processor.class)
public class ArticleProcessor {

//	@StreamListener(Processor.INPUT)
//	@SendTo(Processor.OUTPUT)
	public Article processOrder(Article article) {
	
		System.out.println("Received: " + article);
		article.setName(article.getName().toUpperCase());
		
		return article;
		
	}

}
