import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream input = System.in;
        OutputStream output = System.out;

        try{
            //schade geht doch nicht
            for (int code=input.read(); code >=0; code=input.read()){
                code=input.read();
                System.out.println(code);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            input.close();
            output.close();
        }

    }//Ende Main
}//Ende Klasse