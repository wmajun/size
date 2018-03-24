package g;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class prints {
	public prints(String path,ArrayList<String> list)
	{
		try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for(String str:list){
                bw.write(str+"\r\n");  
            }
            bw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
	}
}
