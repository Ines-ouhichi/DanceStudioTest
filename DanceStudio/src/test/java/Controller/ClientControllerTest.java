package Controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.junit.jupiter.api.Test;

import com.example.demo.Entity.Client;
import com.example.demo.Service.ClientService;
import com.example.demo.Service.CoursService;
import com.example.demo.controller.CoursController;
import com.example.demo.controller.ClientController;

@SpringBootTest(classes = {CoursController.class})
@ExtendWith(SpringExtension.class)
public class ClientControllerTest {
	@MockBean
	private ClientService cltService;
	
	private MockMvc mockMvc;
	
	@Autowired
	private ClientController ClientController;
	
	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(ClientController).build();
	}
	
	private Object getController() {
		// TODO Auto-generated method stub
		return ClientController;
	}
	 
	@Test
	void enregistrerCltTest() throws Exception{
		Client clt = new Client(Long.valueOf(1),"sarra@gmail.com","5555","Soltani","Sarra");
		
		/*String exampleCourseJson = "{\"id\":\"1\",\"email\":\"sarra@gmail.com\",\"password\":\"5555\",\"nom_Pers\":\"Soltani\",\"prenom_Pers\":\"Sarra\"}";
		Mockito.when(cltService.save(Mockito.any(Client.class))).thenReturn(clt);
		
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/cltEnregistre")
				.accept(MediaType.APPLICATION_JSON).content(exampleCourseJson)
				.contentType(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		assertEquals(HttpStatus.CREATED.value(), response.getStatus());*/
		
		
		Mockito
        .doReturn(clt)
        .when(cltService)
        .save(clt);
		
		MvcResult result =mockMvc.perform(post("/cltEnregistre")
	            //.param("code", s )
	            .contentType(MediaType.APPLICATION_JSON))
	            .andReturn();
		

		MockHttpServletResponse response = result.getResponse();
		assertEquals(HttpStatus.CREATED.value(), response.getStatus());
 
		Assertions.assertThat(200).isEqualTo(result.getResponse().getStatus());
		
		
		
	 }

}
