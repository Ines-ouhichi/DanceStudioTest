package Controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.assertj.core.api.Assertions;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.demo.Entity.cours;
import com.example.demo.Respository.CoursRepository;
import com.example.demo.Service.CoursService;
import com.example.demo.controller.CoursController;


@SpringBootTest(classes = {CoursController.class})
@ExtendWith(SpringExtension.class)
public class CoursControllerTest {
	@MockBean
	private CoursService coursService;
	
	private MockMvc mockMvc;
	
	@Autowired
	private CoursController CoursController;
	
	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(CoursController).build();
	}
	
	private Object getController() {
		// TODO Auto-generated method stub
		return CoursController;
	}
    
	@Test
	public void getCoursByIdTest() throws Exception {
		cours cours=new cours(1,"tap dance",80,"tous les mercredis");
		String s=Integer.toString(cours.getCode());
		/*int code = 1;
		when(coursService.getCoursById(code)).thenReturn(cours);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/cours/{code}").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse());
		String excepted = "{code:1,description:tous les mercredis,nom_c:tap dance,prix_c:80}";
		JSONAssert.assertEquals(excepted, result.getResponse().getContentAsString(), false);*/
	
		Mockito
        .doReturn(cours)
        .when(coursService)
        .getCoursById(Mockito.anyInt());

// invoke the get endpoint
MvcResult result =mockMvc.perform(get("/cours/1")
            //.param("code", s )
            .contentType(MediaType.APPLICATION_JSON))
            .andReturn();
System.out.println(result.getResponse().getStatus());
//assertEquals(cours,result.getResponse().getContentAsString());
Assertions.assertThat(200).isEqualTo(result.getResponse().getStatus());
}}
