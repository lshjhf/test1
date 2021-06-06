import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;

public class zhu {
    public static void main(String args[]) throws Exception{
        Contact <Integer> a=new Contact<Integer>();
        File f= new File("/Users/daniel/Downloads/t.txt");
        OutputStream out=null;
        out=new FileOutputStream(f);
        try {
            a.name.add("1");
            a.name.add("siyu");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(1);
        } finally {
        }
        String str="hello";
        byte b[]=str.getBytes();
        out.write(b);
        out.close();
        try {
            a.zhangsan=1/0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error2");
        }
        System.out.println(a.name);
        System.out.println(a.zhangsan);
    }
}
