import java.awt.*;

// could have made it abstract class
// decided to make it interface, so we don't
// have to remove Element as superclass for Image and ImageProxy
public interface Picture {
    String url();
//    will be implemented later, needs additional classes
//    Dimension dim();
//    PictureContent content();
}
