import java.io.*; 
public class filehandling { 
 public static void main(String[] args) { 
 try { 

 File file = new File("data.txt"); 
 
 System.out.println("File name: " + file.getName()); 
 System.out.println("File path: " + file.getAbsolutePath()); 
 System.out.println("File size: " + file.length() + " bytes"); 

 FileWriter writer = new FileWriter(file); 
 writer.write("Hello, world!\n"); 
 writer.write("This is a test.\n"); 
 writer.write("12345\n"); 
 writer.close(); 
 
 FileReader reader = new FileReader(file); 
 BufferedReader bufferedReader = new BufferedReader(reader); 
 String line; 
 while ((line = bufferedReader.readLine()) != null) { 
 System.out.println(line); 
 } 
 bufferedReader.close(); 
 reader.close(); 

 if (file.delete()) { 
 System.out.println("File deleted successfully."); 
 } else { 
 System.out.println("Failed to delete the file."); 
 } 
 } catch (IOException e) { 
 System.out.println("Error: " + e.getMessage()); 
 } 
 } 
}
