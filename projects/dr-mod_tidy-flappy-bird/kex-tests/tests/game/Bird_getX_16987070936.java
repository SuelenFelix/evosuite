package game;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Bird_getX_16987070936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8778;

    public Bird_getX_16987070936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8778 = newInstance(Class.forName("game.Bird"));
        Object[] term8785 = (Object[]) newArray("java.awt.image.BufferedImage", 6);
        Object term8786 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8788 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8797 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term8806 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8807 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8813 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8815 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8824 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8825 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8831 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8834 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8837 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8840 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term8778, term8778.getClass(), "x", -82632953);
        setIntField(term8778, term8778.getClass(), "y", -1473876284);
        setIntField(term8778, term8778.getClass(), "birdHeight", -1389314671);
        setIntField(term8778, term8778.getClass(), "birdWidth", -499699841);
        setDoubleField(term8778, term8778.getClass(), "velocity", 0.6397214730945112);
        setIntField(term8778, term8778.getClass(), "count", 360972386);
        setIntField(term8786, term8786.getClass(), "imageType", -2063884849);
        setField(term8786, term8786.getClass(), "colorModel", null);
        setField(term8788, term8788.getClass(), "sampleModel", null);
        setField(term8788, term8788.getClass(), "dataBuffer", null);
        setIntField(term8788, term8788.getClass(), "minX", 1054887169);
        setIntField(term8788, term8788.getClass(), "minY", 692873905);
        setIntField(term8788, term8788.getClass(), "width", 1734759369);
        setIntField(term8788, term8788.getClass(), "height", 1841493736);
        setIntField(term8788, term8788.getClass(), "sampleModelTranslateX", 320739944);
        setIntField(term8788, term8788.getClass(), "sampleModelTranslateY", 760218111);
        setIntField(term8788, term8788.getClass(), "numBands", -1986366126);
        setIntField(term8788, term8788.getClass(), "numDataElements", -1963228619);
        setField(term8797, term8797.getClass(), "sampleModel", null);
        setField(term8797, term8797.getClass(), "dataBuffer", null);
        setIntField(term8797, term8797.getClass(), "minX", -709868952);
        setIntField(term8797, term8797.getClass(), "minY", 847207929);
        setIntField(term8797, term8797.getClass(), "width", -1665928103);
        setIntField(term8797, term8797.getClass(), "height", 1574458332);
        setIntField(term8797, term8797.getClass(), "sampleModelTranslateX", -975856245);
        setIntField(term8797, term8797.getClass(), "sampleModelTranslateY", -1023366103);
        setIntField(term8797, term8797.getClass(), "numBands", 81427089);
        setIntField(term8797, term8797.getClass(), "numDataElements", 755951489);
        setField(term8797, term8797.getClass(), "parent", null);
        setField(term8788, term8788.getClass(), "parent", term8797);
        setField(term8786, term8786.getClass(), "raster", term8788);
        setField(term8786, term8786.getClass(), "osis", null);
        setField(term8806, term8806.getClass(), "table", term8807);
        setIntField(term8806, term8806.getClass(), "count", 1);
        setIntField(term8806, term8806.getClass(), "threshold", 8);
        setFloatField(term8806, term8806.getClass(), "loadFactor", 0.75F);
        setIntField(term8806, term8806.getClass(), "modCount", 1);
        setField(term8806, term8806.getClass(), "keySet", null);
        setField(term8806, term8806.getClass(), "entrySet", null);
        setField(term8806, term8806.getClass(), "values", null);
        setField(term8786, term8786.getClass(), "properties", term8806);
        setFloatField(term8786, term8786.getClass(), "accelerationPriority", 0.9985961F);
        setField(term8786, term8786.getClass(), "surfaceManager", null);
        setElement(term8785, 0, term8786);
        setIntField(term8813, term8813.getClass(), "imageType", -2137419728);
        setField(term8813, term8813.getClass(), "colorModel", null);
        setField(term8815, term8815.getClass(), "sampleModel", null);
        setField(term8815, term8815.getClass(), "dataBuffer", null);
        setIntField(term8815, term8815.getClass(), "minX", 0);
        setIntField(term8815, term8815.getClass(), "minY", 0);
        setIntField(term8815, term8815.getClass(), "width", 0);
        setIntField(term8815, term8815.getClass(), "height", 0);
        setIntField(term8815, term8815.getClass(), "sampleModelTranslateX", 0);
        setIntField(term8815, term8815.getClass(), "sampleModelTranslateY", 0);
        setIntField(term8815, term8815.getClass(), "numBands", 0);
        setIntField(term8815, term8815.getClass(), "numDataElements", 0);
        setField(term8815, term8815.getClass(), "parent", null);
        setField(term8813, term8813.getClass(), "raster", term8815);
        setField(term8813, term8813.getClass(), "osis", null);
        setField(term8824, term8824.getClass(), "table", term8825);
        setIntField(term8824, term8824.getClass(), "count", 1);
        setIntField(term8824, term8824.getClass(), "threshold", 8);
        setFloatField(term8824, term8824.getClass(), "loadFactor", 0.75F);
        setIntField(term8824, term8824.getClass(), "modCount", 1);
        setField(term8824, term8824.getClass(), "keySet", null);
        setField(term8824, term8824.getClass(), "entrySet", null);
        setField(term8824, term8824.getClass(), "values", null);
        setField(term8813, term8813.getClass(), "properties", term8824);
        setFloatField(term8813, term8813.getClass(), "accelerationPriority", 0.0F);
        setField(term8813, term8813.getClass(), "surfaceManager", null);
        setElement(term8785, 1, term8813);
        setIntField(term8831, term8831.getClass(), "imageType", 0);
        setField(term8831, term8831.getClass(), "colorModel", null);
        setField(term8831, term8831.getClass(), "raster", null);
        setField(term8831, term8831.getClass(), "osis", null);
        setField(term8831, term8831.getClass(), "properties", null);
        setFloatField(term8831, term8831.getClass(), "accelerationPriority", 0.0F);
        setField(term8831, term8831.getClass(), "surfaceManager", null);
        setElement(term8785, 2, term8831);
        setIntField(term8834, term8834.getClass(), "imageType", 0);
        setField(term8834, term8834.getClass(), "colorModel", null);
        setField(term8834, term8834.getClass(), "raster", null);
        setField(term8834, term8834.getClass(), "osis", null);
        setField(term8834, term8834.getClass(), "properties", null);
        setFloatField(term8834, term8834.getClass(), "accelerationPriority", 0.0F);
        setField(term8834, term8834.getClass(), "surfaceManager", null);
        setElement(term8785, 3, term8834);
        setIntField(term8837, term8837.getClass(), "imageType", 0);
        setField(term8837, term8837.getClass(), "colorModel", null);
        setField(term8837, term8837.getClass(), "raster", null);
        setField(term8837, term8837.getClass(), "osis", null);
        setField(term8837, term8837.getClass(), "properties", null);
        setFloatField(term8837, term8837.getClass(), "accelerationPriority", 0.0F);
        setField(term8837, term8837.getClass(), "surfaceManager", null);
        setElement(term8785, 4, term8837);
        setIntField(term8840, term8840.getClass(), "imageType", 0);
        setField(term8840, term8840.getClass(), "colorModel", null);
        setField(term8840, term8840.getClass(), "raster", null);
        setField(term8840, term8840.getClass(), "osis", null);
        setField(term8840, term8840.getClass(), "properties", null);
        setFloatField(term8840, term8840.getClass(), "accelerationPriority", 0.0F);
        setField(term8840, term8840.getClass(), "surfaceManager", null);
        setElement(term8785, 5, term8840);
        setField(term8778, term8778.getClass(), "images", term8785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getX", argTypes, term8778, args);
    }

};


