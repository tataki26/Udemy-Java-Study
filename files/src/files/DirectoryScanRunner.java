package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryScanRunner
{

	public static void main(String[] args) throws IOException
	{
		// Functional Programming
		// 현재 위치의 파일 및 디렉토리 목록을 출력한다
		Files.list(Paths.get(".")).forEach(System.out::println);

	}

}
