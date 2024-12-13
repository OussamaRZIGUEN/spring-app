package org.example.git_playlist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GitPlaylistApplication {

	public String purchase(String username, String amount, String productName) {
		return "HI am"+ username+ " I ....";
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
