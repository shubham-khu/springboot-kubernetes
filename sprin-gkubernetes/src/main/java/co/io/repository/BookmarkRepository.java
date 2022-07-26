package co.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.io.domain.Bookmark;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark	, Long>{

}
