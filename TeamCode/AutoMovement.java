import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import java.util.List;
import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer.CameraDirection;
import org.firstinspires.ftc.robotcore.external.tfod.TFObjectDetector;
import org.firstinspires.ftc.robotcore.external.tfod.Recognition;

@Autonomous(name = "AutoMovement", group = "Auto")
public class AutoMovement extends LinearOpMode {

    /*
     * I do not know if we want to create an object for this class. This is a rough
     * outline using the given images and not a physical field. This will determine
     * what autonomous path the robot takes depending on where it starts. The code
     * that stores the names of the pictures in SkystoneNavigation is
     * "trackable.getName()". Parse that information, then store the image number as
     * an int.
     * 
     */
    // String scannedImage;

    @Override
    public void runOpMode() {
        
        if (scannedImage.equals("Front Perimeter 1")) {
            // execute image 1 commands

        } else if (scannedImage.equals("Front Perimeter 2")) {
            // execute image 2 commands

        } else if (scannedImage.equals("Red Perimeter 2")) {
            // execute image 3 commands

        } else if (scannedImage.equals("Blue Perimeter 1") {
            // execute image 4 commands

        } else if (scannedImage.equals("Red Perimeter 1")) {
            // execute image 5 commands

        } else if (scannedImage.equals("Blue Perimeter 2")) {
            // execute image 6 commands

        } else if (scannedImage.equals("Rear Perimeter 2")) {
            // execute image 7 commands

        } else if (scannedImage.equals("Rear Perimeter 1")){
            // execute image 8 commands

        }
    }
}