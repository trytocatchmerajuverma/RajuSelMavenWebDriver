package qa.sensiple.logfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import qa.sensiple.directories.FileDirectories;

public class WriteToNotePad {

	private static final String path = FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE + FileDirectories.SENSIPLE_WRITE_TO_NOTEPAD;
	private static final boolean append_to_file = true;
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");

	public void deleteLogFiles() throws IOException {
		File oldFile = new File(path);
		oldFile.delete();
		oldFile.createNewFile();

	}// End Method

	public static void writeAllLines(String textline) throws IOException {

		FileWriter write;
		try {
			write = new FileWriter(path, append_to_file);
			PrintWriter print_line = new PrintWriter(write);
			print_line.printf("%s" + "%n", "[ " + dateFormat.format(new Date()) + " ]: " + textline);
			print_line.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// End Method

}
