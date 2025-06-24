import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {
    private static String  FILE_NAME = "demo.txt";
    static String inpPath="demoInput.pdf";
    static String outputpath="demooutput.pdf";
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Jaya.Balaji\\Preet_repo\\TelecomApplication\\FileHandling\\demo.txt";
try {
//    String fileName="demo.txt";
//
//    creatFile(fileName);
//
//    writeTOFile(fileName,"hi This is jayabalaji");
//
//    readToFIle(fileName);
//
//    deleteFile(path);
//
//    convertByteToImage(imgPath,outPath);
//
//    imagetobyte(imgPath);

    pdfconvert(inpPath,outputpath);

}catch (Exception e){
    e.printStackTrace();
}

    }
    public static void creatFile(String name) throws IOException {
        File file=new File(name);
        if(file.createNewFile()){
            System.out.println("file created "+file.getName());
        }else {
            System.out.println("file already exixts");
        }
    }
    public static void writeTOFile(String fileName,String conetxt) throws IOException {
       try(FileOutputStream fileOutputStream=new FileOutputStream(fileName)){
        byte[] bytes=conetxt.getBytes();
        fileOutputStream.write(bytes);
        System.out.println("data written in file");}
    }

    public static void readToFIle(String fileName) throws IOException{
       try( FileInputStream fileInputStream=new FileInputStream(fileName)) {
           int i;
           while ((i = fileInputStream.read()) != -1) {
               System.out.print((char) i);
           }
       }
        System.out.println();
    }

    public static void deleteFile(String fileName) throws IOException {

        Files.deleteIfExists(Paths.get(fileName));
        System.out.println("file deleted");
    }
public static String imgPath="C:\\Users\\Jaya.Balaji\\Preet_repo\\TelecomApplication\\FileHandling\\LinkedIn Template (002).jpg";
    public static void imagetobyte(String path)throws  IOException{

        File file=new File(path);
        byte[] bytes=new byte[(int) file.length()];
        try(InputStream inputStream=new FileInputStream(file)){

                    inputStream.read(bytes);
            byte[] dd=bytes;
            System.out.println("bytes length "+dd.length);
        }

    }
    public static String outPath="C:\\Users\\Jaya.Balaji\\Preet_repo\\TelecomApplication\\FileHandling\\outputImg.jpg";
    public static void convertByteToImage(String imgPath, String outPath) throws IOException{
        File file=new File(imgPath);
        byte[] imgBytearray=new byte[(int) file.length()];
        try(FileInputStream fileInputStream=new FileInputStream(file)){
            fileInputStream.read(imgBytearray);
            System.out.println("image converted to bytes"+imgBytearray);
        }
        try(FileOutputStream fileOutputStream=new FileOutputStream(outPath)){
            fileOutputStream.write(imgBytearray);
            System.out.println("output path is created and saved "+outPath);
        }


    }

    public static void pdfconvert(String path1, String path2)throws IOException{
        try (
            FileInputStream fileInputStream=new FileInputStream(path1);
            FileOutputStream fileOutputStream=new FileOutputStream(path2);)
        {
        byte[] bytes=new byte[1024];
        int bytereads;
        while ((bytereads=fileInputStream.read(bytes))!= -1){
            fileOutputStream.write(bytes,0,bytereads);
            System.out.println("Image copied succesfully");
        }
        }
    }


}