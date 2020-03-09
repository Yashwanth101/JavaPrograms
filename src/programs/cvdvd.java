package programs;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class cvdvd {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateAndTime = sdf.format(new Date());
        File dr = new File("");
        String ff = dr.getAbsolutePath()+"\\"+"Test"+"\\"+"cdscsd";
        File f = new File(ff);
        f.mkdir();
        //System.out.println(ff);
    }
}
