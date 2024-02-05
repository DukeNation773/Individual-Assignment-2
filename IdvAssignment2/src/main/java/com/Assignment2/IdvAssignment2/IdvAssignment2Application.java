package com.Assignment2.IdvAssignment2;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class IdvAssignment2Application {

	public static void main(String[] args) {
		SpringApplication.run(IdvAssignment2Application.class, args);
                getJoke();
	}
        
        public static void getJoke() {
        try {
            String url = "https://api.chucknorris.io/jokes/random";
            RestTemplate restTemplate = new RestTemplate();
            
            String joke = restTemplate.getForObject(url, String.class);
            
            System.out.println("**********Chuck Norris Joke********");
            System.out.println("Joke: " + joke);

        } catch (RestClientException ex) {
            Logger.getLogger(IdvAssignment2Application.class.getName()).log(
                    Level.SEVERE, null, ex);
            System.out.println("error in getJoke");

        }
    }
        
        
        
        
        
        

}
