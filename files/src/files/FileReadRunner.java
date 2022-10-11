package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FileReadRunner
{

	public static void main(String[] args) throws IOException
	{
		Path pathFileToRead = Paths.get("./resources/data.txt");
		
//		List<String> lines = Files.readAllLines(pathFileToRead);
//		System.out.println(lines);
		
		Files.lines(pathFileToRead)
			//.map(String::toLowerCase)
			.filter(str -> str.contains("a"))
			.forEach(System.out::println);

	}

}
