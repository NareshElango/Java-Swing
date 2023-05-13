package dummypack;
import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        File file1=new File("read.txt");
        File file2=new File("write.txt");
        if(file1.createNewFile())
        	System.out.println(file1.getAbsolutePath());
        if(file2.createNewFile())
        System.out.println("file creates"+file2.getAbsolutePath());
        else 
        System.out.println("file already exits");
        FileWriter fw=new FileWriter("write.txt");
        FileInputStream stream=new FileInputStream(file1);
        Scanner obj=new Scanner(stream);
        String str="";
        while(obj.hasNextLine()){
            str=obj.nextLine();
            fw.write(str);
        }
        fw.close();
        String str1;
        int wordcount=0;
        int charactercount=0;
        int whitespace=0;
        int paracount=0;
        int sentence=0;
        FileInputStream f2=new FileInputStream(file2);
        Scanner obj1=new Scanner(f2);
        while(obj1.hasNextLine()){
            str1=obj1.nextLine();
           // f2.write(str1);
           if(str1.equals(""))
           paracount+=1;
           else{
        charactercount=str1.length();
        String[] word=str1.split("\\s+");
        wordcount+=word.length;
        whitespace+=wordcount-1;
        String sent[]=str1.split("[!?.:]+");
        sentence+=sent.length;
           }
        }
        if(sentence>1)
        paracount++;
        System.out.println(wordcount);
        System.out.println(charactercount);
        System.out.println(whitespace);
        System.out.println(sentence);
    }
    
}
