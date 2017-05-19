package DataClases;

import java.awt.image.BufferedImage;

/**
 * Created by Ian on 5/18/2017.
 */
public class ImageProcedure extends Procedure{
    private BufferedImage image;

    public ImageProcedure(BufferedImage image){
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }
}
