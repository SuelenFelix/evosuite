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

public class CollisionDetector_collision_14609001611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;
     Object term67;

    public CollisionDetector_collision_14609001611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("game.CollisionDetector"));
        setIntField(term3, term3.getClass(), "screenBottom", 1162663216);
        term5 = newInstance(Class.forName("game.Bird"));
        Object[] term12 = (Object[]) newArray("java.awt.image.BufferedImage", 5);
        Object term13 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term15 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term24 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term33 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term34 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term40 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term42 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term51 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term52 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term58 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term61 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term64 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term5, term5.getClass(), "x", 1484323161);
        setIntField(term5, term5.getClass(), "y", 391863371);
        setIntField(term5, term5.getClass(), "birdHeight", -1922583790);
        setIntField(term5, term5.getClass(), "birdWidth", -616727354);
        setDoubleField(term5, term5.getClass(), "velocity", 0.13238746331190498);
        setIntField(term5, term5.getClass(), "count", -1955890973);
        setIntField(term13, term13.getClass(), "imageType", -2038273078);
        setField(term13, term13.getClass(), "colorModel", null);
        setField(term15, term15.getClass(), "sampleModel", null);
        setField(term15, term15.getClass(), "dataBuffer", null);
        setIntField(term15, term15.getClass(), "minX", 1227103734);
        setIntField(term15, term15.getClass(), "minY", -1339778481);
        setIntField(term15, term15.getClass(), "width", 1725571209);
        setIntField(term15, term15.getClass(), "height", -522618178);
        setIntField(term15, term15.getClass(), "sampleModelTranslateX", 1134449235);
        setIntField(term15, term15.getClass(), "sampleModelTranslateY", -883034806);
        setIntField(term15, term15.getClass(), "numBands", 1585847225);
        setIntField(term15, term15.getClass(), "numDataElements", 597278769);
        setField(term24, term24.getClass(), "sampleModel", null);
        setField(term24, term24.getClass(), "dataBuffer", null);
        setIntField(term24, term24.getClass(), "minX", -1685132342);
        setIntField(term24, term24.getClass(), "minY", -1456670397);
        setIntField(term24, term24.getClass(), "width", 1622346318);
        setIntField(term24, term24.getClass(), "height", 1048535127);
        setIntField(term24, term24.getClass(), "sampleModelTranslateX", -655067527);
        setIntField(term24, term24.getClass(), "sampleModelTranslateY", -6029667);
        setIntField(term24, term24.getClass(), "numBands", -2068769794);
        setIntField(term24, term24.getClass(), "numDataElements", -117576464);
        setField(term24, term24.getClass(), "parent", null);
        setField(term15, term15.getClass(), "parent", term24);
        setField(term13, term13.getClass(), "raster", term15);
        setField(term13, term13.getClass(), "osis", null);
        setField(term33, term33.getClass(), "table", term34);
        setIntField(term33, term33.getClass(), "count", 1);
        setIntField(term33, term33.getClass(), "threshold", 8);
        setFloatField(term33, term33.getClass(), "loadFactor", 0.75F);
        setIntField(term33, term33.getClass(), "modCount", 1);
        setField(term33, term33.getClass(), "keySet", null);
        setField(term33, term33.getClass(), "entrySet", null);
        setField(term33, term33.getClass(), "values", null);
        setField(term13, term13.getClass(), "properties", term33);
        setFloatField(term13, term13.getClass(), "accelerationPriority", 0.13238746F);
        setField(term13, term13.getClass(), "surfaceManager", null);
        setElement(term12, 0, term13);
        setIntField(term40, term40.getClass(), "imageType", 1135664017);
        setField(term40, term40.getClass(), "colorModel", null);
        setField(term42, term42.getClass(), "sampleModel", null);
        setField(term42, term42.getClass(), "dataBuffer", null);
        setIntField(term42, term42.getClass(), "minX", 0);
        setIntField(term42, term42.getClass(), "minY", 0);
        setIntField(term42, term42.getClass(), "width", 0);
        setIntField(term42, term42.getClass(), "height", 0);
        setIntField(term42, term42.getClass(), "sampleModelTranslateX", 0);
        setIntField(term42, term42.getClass(), "sampleModelTranslateY", 0);
        setIntField(term42, term42.getClass(), "numBands", 0);
        setIntField(term42, term42.getClass(), "numDataElements", 0);
        setField(term42, term42.getClass(), "parent", null);
        setField(term40, term40.getClass(), "raster", term42);
        setField(term40, term40.getClass(), "osis", null);
        setField(term51, term51.getClass(), "table", term52);
        setIntField(term51, term51.getClass(), "count", 1);
        setIntField(term51, term51.getClass(), "threshold", 8);
        setFloatField(term51, term51.getClass(), "loadFactor", 0.75F);
        setIntField(term51, term51.getClass(), "modCount", 1);
        setField(term51, term51.getClass(), "keySet", null);
        setField(term51, term51.getClass(), "entrySet", null);
        setField(term51, term51.getClass(), "values", null);
        setField(term40, term40.getClass(), "properties", term51);
        setFloatField(term40, term40.getClass(), "accelerationPriority", 0.0F);
        setField(term40, term40.getClass(), "surfaceManager", null);
        setElement(term12, 1, term40);
        setIntField(term58, term58.getClass(), "imageType", 0);
        setField(term58, term58.getClass(), "colorModel", null);
        setField(term58, term58.getClass(), "raster", null);
        setField(term58, term58.getClass(), "osis", null);
        setField(term58, term58.getClass(), "properties", null);
        setFloatField(term58, term58.getClass(), "accelerationPriority", 0.0F);
        setField(term58, term58.getClass(), "surfaceManager", null);
        setElement(term12, 2, term58);
        setIntField(term61, term61.getClass(), "imageType", 0);
        setField(term61, term61.getClass(), "colorModel", null);
        setField(term61, term61.getClass(), "raster", null);
        setField(term61, term61.getClass(), "osis", null);
        setField(term61, term61.getClass(), "properties", null);
        setFloatField(term61, term61.getClass(), "accelerationPriority", 0.0F);
        setField(term61, term61.getClass(), "surfaceManager", null);
        setElement(term12, 3, term61);
        setIntField(term64, term64.getClass(), "imageType", 0);
        setField(term64, term64.getClass(), "colorModel", null);
        setField(term64, term64.getClass(), "raster", null);
        setField(term64, term64.getClass(), "osis", null);
        setField(term64, term64.getClass(), "properties", null);
        setFloatField(term64, term64.getClass(), "accelerationPriority", 0.0F);
        setField(term64, term64.getClass(), "surfaceManager", null);
        setElement(term12, 4, term64);
        setField(term5, term5.getClass(), "images", term12);
        term67 = newInstance(Class.forName("game.Pipe"));
        setIntField(term67, term67.getClass(), "x", -1968847291);
        setIntField(term67, term67.getClass(), "yOpeningStart", 579005622);
        setIntField(term67, term67.getClass(), "yOpeningEnd", -14890619);
        setIntField(term67, term67.getClass(), "width", 1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.CollisionDetector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Bird");
        argTypes[1] = Class.forName("game.Pipe");
        Object[] args = new Object[2];
        args[0] = term5;
        args[1] = term67;
        callMethod(klass, "collision", argTypes, term3, args);
    }

};


