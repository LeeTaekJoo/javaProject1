package com.shinhan.day12;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;

import com.shinhan.day05.Account;

public class IOTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		f11();

	}

	private static void f11() {
		String fileName = "src/com/shinhan/day12/scoreData.txt";
		File f = new File(fileName);
		
		System.out.println(f.exists());
		System.out.println(f.lastModified());
		Date d = new Date(f.lastModified());
		System.out.println(d);
		System.out.println("파일의 사이즈: " + f.length()); 
		
		
		
	}

	private static void f10() throws IOException, ClassNotFoundException {
		FileOutputStream fw = new FileOutputStream("serialize.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fw);
		
		oos.writeObject(new Account("1234","이1"));
		oos.writeObject(new Account("3333","이2"));
		oos.writeObject(new Account("4444","이3"));
		
		
		oos.close();
		fw.close();
		
		FileInputStream fi = new FileInputStream("serialize.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Account s1 = (Account)ois.readObject();
		Account s2 = (Account)ois.readObject();
		Account s3 = (Account)ois.readObject();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		fi.close();
		
	}

	private static void f9() throws IOException, ClassNotFoundException {
		FileOutputStream fw = new FileOutputStream("serialize.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fw);
		
		oos.writeObject(new Student("김1",100,99));
		oos.writeObject(new Student("김2",100,99));
		oos.writeObject(new Student("김3",100,99));
		
		oos.close();
		fw.close();
		
		FileInputStream fi = new FileInputStream("serialize.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Student s1 = (Student)ois.readObject();
		Student s2 = (Student)ois.readObject();
		Student s3 = (Student)ois.readObject();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		fi.close();
	}

	private static void f8() throws IOException {
		FileWriter fw = new FileWriter("print.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		pw.print(false);
		pw.print("false");
		pw.print(1234);
		
		fw.close();
		pw.close();
	}

	private static void f7() throws IOException {
		OutputStream fw = new FileOutputStream("primitiveData.txt");
		// 자바의 기본타입을 저장하고 그대로 읽고자한다.
		DataOutputStream dos = new DataOutputStream(fw);
		dos.write(100);
		dos.write(200);
		dos.writeBoolean(false);
		dos.writeDouble(3.14);
		dos.writeChar('A');
		
		dos.close();
		fw.close();
		
		InputStream fr = new FileInputStream("primitiveData.txt");
		int a = fr.read();
		int b = fr.read();
		System.out.println(a+b);
		
		fr.close();
		
	}

	private static void f6() throws IOException {
		String fileName = "src/com/shinhan/day12/scoreData.txt";
		Path path = Paths.get(fileName);
		Files.lines(path).forEach(row->{
			System.out.println(row.replaceAll("/", "\t"));
			String[] arr = row.split("/");
			int total = 0;
			for(int i=1; i<arr.length; i++) {
				try {
				total += Integer.parseInt(arr[i]);
				}catch (NumberFormatException e) {
					
				}
			}
			System.out.println("\t" + total + "\t" + total/(arr.length-1));
		});
		
	}

	private static void f5() throws IOException {
		String path = "src/com/shinhan/day12/scoreData.txt";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String row;
		
		String title = br.readLine();
		System.out.println(title.replaceAll("/", "\t"));
		while((row = br.readLine()) != null ){
			System.out.println(row.replaceAll("/", "\t"));
			String[] arr = row.split("/");
			int total = 0;
			for(int i=1; i<arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}
			System.out.println("\t"+total + "\t" + total/(arr.length-1));
					
		}
		br.close();
		fr.close();
	}

	private static void f4() {
		//1.class기준
//		Path path = Paths.get(IOTest.class.getResource("data.txt").toURI());
		//2.절대경로 /로 시작한다.
		//Path path = Paths.get(StreamTest3.class.getResource("/com/shinhan/day11/data.txt").toURI());
		//3.상대경로는 현재위치를 기준으로한다.
		//다음은 현재의 절대경로를 얻는다.
		Path path = Paths.get(""); //1)
		//String absolute = System.getProperty("user.dir")+"/data.txt";//2)
		//Path path = Paths.get(absolute);
		String s = path.toAbsolutePath().toString();
		path =Paths.get(s+"/data.txt");
		System.out.println("현재 작업 경로: " + s);
		System.out.println(Charset.defaultCharset());
		
	}

	private static void f3() throws IOException {
//		String path = System.getProperty("user.dir");
		String path = "src/com/shinhan\\day11\\data.txt";
		FileReader fr = new FileReader(path);
		FileWriter fw = new FileWriter("data2.txt");
		int i;
		
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
			fw.write(i);
		}
		fw.close();
		fr.close();
		
	}

	private static void f1() throws IOException {
		// InputStream, OutputStream, Reader, Writer
		// FileInputStream, FileOutputStream, FileReader, FileWriter
		InputStream is = System.in; // 표준입력: 키보드이다. 변경가능
		byte[] arr = new byte[100];
		int i = is.read(arr);
		
		System.out.println(i);
		System.out.println(Arrays.toString(arr));
		for(int a=0; a<i-2; a++){
			System.out.println((char)arr[a]);
		}
	}

}
