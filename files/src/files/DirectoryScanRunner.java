package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DirectoryScanRunner
{

	public static void main(String[] args) throws IOException
	{
		Path currentDirectory = Paths.get(".");
		
		// Functional Programming
		// 현재 위치의 파일 및 디렉토리 목록을 출력한다
		// Files.list(currentDirectory).forEach(System.out::println);
		
		// Files.walk(currentDirectory, 2).forEach(System.out::println);
		
		// 1
		// only java files
		// check path and whether it contains ".java" or not
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		
		// Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);
		
		//2
		// only java files
		BiPredicate<Path, BasicFileAttributes> javaMatcher
		= (path,attributes) -> String.valueOf(path).contains(".java");

		// only directory
		BiPredicate<Path, BasicFileAttributes> directoryMathcer
		= (path,attributes) -> attributes.isDirectory();
		
		Files.find(currentDirectory, 4, directoryMathcer)
		.forEach(System.out::println);

	}

}
