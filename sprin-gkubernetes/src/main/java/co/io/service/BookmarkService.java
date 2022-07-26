package co.io.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.io.domain.Bookmark;
import co.io.repository.BookmarkRepository;

@Service
@org.springframework.transaction.annotation.Transactional
public class BookmarkService {
	
	@Autowired
	private BookmarkRepository bookmarkRepository;
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<Bookmark> getBookamrks()
	{
		return bookmarkRepository.findAll();
	}

}
