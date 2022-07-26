package co.io.helper;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import co.io.domain.Bookmark;
import co.io.repository.BookmarkRepository;

@Component
public class DataInitializer implements CommandLineRunner{

	@Autowired
	private  BookmarkRepository bookmarkRepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookmarkRepo.save(new Bookmark(null,"Spring Init","www.spring.io",Instant.now()));
		bookmarkRepo.save(new Bookmark(null,"Youtube","www.youtube.com",Instant.now()));
		bookmarkRepo.save(new Bookmark(null,"Google","www.google.com",Instant.now()));
		bookmarkRepo.save(new Bookmark(null,"Dell","www.dell.com",Instant.now()));
		
	}

}
