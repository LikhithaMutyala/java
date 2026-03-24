import java.io.*;
class BufferDemo
{
public static void main(String args[])throws IOException
{
//write
BufferedWriter bw= new BufferedWriter(new FileWriter("sample.txt"));
bw.write("hello sample file");
bw.newLine();
bw.write("Buffered Writer Class");
bw.close();
System.out.println("Text is written in the sample.txt");
//read
BufferedReader br= new BufferedReader(new FileReader("sample.txt"));
String line;
System.out.println("Read the data from txt file");
while((line=br.readLine())!=null)
{
System.out.println(line);
}
br.close();
}
}