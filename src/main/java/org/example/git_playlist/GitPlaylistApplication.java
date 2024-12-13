package org.example.git_playlist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
public class GitPlaylistApplication {

	@PostMapping("/")
	public String purchase(@RequestBody Order order) {
		return "HI am"+ order.getUsername()+ " I ....";
	}

	public void addData(String data) {

		if(data.equals(Constant.data)) {
			System.out.println("Java/Spring");
		}

		System.out.println("Others");
	}

	public static void main(String[] args) {
		SpringApplication.run(GitPlaylistApplication.class, args);
	}

}
