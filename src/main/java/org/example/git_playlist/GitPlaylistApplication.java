package org.example.git_playlist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GitPlaylistApplication {

	public void addData(String data) {
		System.out.println("Java");
	}

	public static void main(String[] args) {


		SpringApplication.run(GitPlaylistApplication.class, args);
	}

}
