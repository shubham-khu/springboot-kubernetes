package co.io.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "bookmark_table")
public class Bookmark {

	@Id
	@SequenceGenerator(name="bm_id_seq_gen", sequenceName = "bm_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "bm_id_seq_gen")
	private Long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String url;
	
	private Instant createdAt;
	
	

	public Bookmark() {
		}

	public Bookmark(Long id, String title, String url, Instant createdAt) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
