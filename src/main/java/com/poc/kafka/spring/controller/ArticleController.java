package com.poc.kafka.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.poc.kafka.spring.stream.data.Article;

@RestController
@EnableBinding(Source.class)
public class ArticleController {
	@Autowired
	private Source source;

	@GetMapping("/populateArticle")
	public void populateArticleInput() {
		source.output().send(MessageBuilder.withPayload(sourceOrder()).build());

	}

	public Article sourceOrder() {

		Article article = new Article();
		article.setCode("123");
		article.setName("prueba");

		return article;

	}

}
