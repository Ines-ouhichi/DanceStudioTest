package com.example.demo;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.stream.Stream;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.Service.CoursService;
import com.example.demo.Entity.cours;
import com.example.demo.Respository.CoursRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class DanceStudioApplicationTests {

	@MockBean
	private CoursService coursService;
	
	@Autowired 
	private MockMvc mockMvc;
	@MockBean
	private CoursRepository CoursRespository;
	
	@Test
	public void getCoursByIdTest() throws Exception {
		int code = 1;
		when(coursService.getCoursById(code)).thenReturn(new cours(1,"tap dance",80,"tous les mercredis"));
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/cours/{code}").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse());
		String excepted = "{code:1,description:tous les mercredis,nom_c:tap dance,prix_c:80}";
		JSONAssert.assertEquals(excepted, result.getResponse().getContentAsString(), false);
		
		
}}
