package suazoandNezamy;

import java.io.*;
import java.net.*;

public class Echo {

	public static void main(String[] args){
		String ui = args [0];
		File file = new File(ui);
		BufferedReader kb = null;
		String line;
		
		try{
			if(file.exists()){
				kb = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			}
			else{
				URL url = new URL(ui);
				InputStream is = url.openStream();
				kb = new BufferedReader(new InputStreamReader(is));
			}
			
			while((line = kb.readLine()) != null){
				System.out.println(line);
				line = kb.readLine();
			}
			kb.close();
		}
		catch(Exception e){
			System.out.print("Exception was caught");
		}
	}

}