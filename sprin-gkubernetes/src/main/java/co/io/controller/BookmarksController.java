package co.io.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.io.domain.Bookmark;
import co.io.service.BookmarkService;

@RestController
public class BookmarksController {
	
	@Autowired
	private BookmarkService bookmarkService;	
	
	
	@GetMapping("/check")
	public String check()
	{
		return "Ram Ram";
	}

	
	@RequestMapping("/bookmarks")
	public List<Bookmark> getAllBookmark()
	{
		return bookmarkService.getBookamrks();
	}

}
