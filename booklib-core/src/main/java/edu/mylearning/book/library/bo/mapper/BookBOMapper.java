package edu.mylearning.book.library.bo.mapper;

import java.util.List;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import edu.mylearning.book.library.bo.BookBO;
import edu.mylearning.book.library.entity.Book;

@Mapper(builder = @Builder(disableBuilder = true), componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface BookBOMapper {

	@Mapping(target = "name", ignore = true)
	BookBO toBO(Book book);

	@Mapping(target = "name", ignore = true)
	List<BookBO> toBO(List<Book> books);
}
