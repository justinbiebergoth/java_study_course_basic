import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Robot;
import java.io.File;
import java.awt.Toolkit;
import java.awt.Rectangle;
import java.io.IOException;
import java.awt.AWTException;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileSystemView;


public class hackerThing {

    public static void main(String[] args){

        SimpleDateFormat dateFormat = new SimpleDateFormat
                ("yyyy"+"MM"+"dd"+"_"+"HH"+"mm"+"ss");
        Date now = new Date();

        try {
            String workDir  = getHomeDir()  + "/Downloads/screens";
            String fileName = dateFormat.format(now) +"screen.png";
            File screenSohaniYeptaKudaNado = new File(workDir, fileName);
            ImageIO.write(grabScreen(), "png", screenSohaniYeptaKudaNado);


        } catch (IOException e) {
            System.out.println("IO exception"+e);
        }
    }

    private static File getHomeDir() {
        FileSystemView fsv = FileSystemView.getFileSystemView();
        return fsv.getHomeDirectory();
    }


    private static BufferedImage grabScreen() {
        try {
            return new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())) ;
        } catch (SecurityException e) {
        } catch (AWTException e) {
        }
        return null;

    }
}
