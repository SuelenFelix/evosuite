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

public class Bird_getVelocity_2523144779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8982;

    public Bird_getVelocity_2523144779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8982 = newInstance(Class.forName("game.Bird"));
        Object[] term8989 = (Object[]) newArray("java.awt.image.BufferedImage", 4);
        Object term8990 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8992 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term9001 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term9010 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term9011 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term9017 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term9019 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term9028 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term9029 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term9035 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term9038 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term8982, term8982.getClass(), "x", -2058884635);
        setIntField(term8982, term8982.getClass(), "y", 1064185088);
        setIntField(term8982, term8982.getClass(), "birdHeight", -1249782654);
        setIntField(term8982, term8982.getClass(), "birdWidth", 399302934);
        setDoubleField(term8982, term8982.getClass(), "velocity", 0.8823181080774973);
        setIntField(term8982, term8982.getClass(), "count", -1823255084);
        setIntField(term8990, term8990.getClass(), "imageType", 793345010);
        setField(term8990, term8990.getClass(), "colorModel", null);
        setField(term8992, term8992.getClass(), "sampleModel", null);
        setField(term8992, term8992.getClass(), "dataBuffer", null);
        setIntField(term8992, term8992.getClass(), "minX", -2092117838);
        setIntField(term8992, term8992.getClass(), "minY", 1524590776);
        setIntField(term8992, term8992.getClass(), "width", 1523896653);
        setIntField(term8992, term8992.getClass(), "height", -1731921726);
        setIntField(term8992, term8992.getClass(), "sampleModelTranslateX", 919994471);
        setIntField(term8992, term8992.getClass(), "sampleModelTranslateY", 183531701);
        setIntField(term8992, term8992.getClass(), "numBands", -974923743);
        setIntField(term8992, term8992.getClass(), "numDataElements", 1876738932);
        setField(term9001, term9001.getClass(), "sampleModel", null);
        setField(term9001, term9001.getClass(), "dataBuffer", null);
        setIntField(term9001, term9001.getClass(), "minX", -1870339027);
        setIntField(term9001, term9001.getClass(), "minY", -1549603566);
        setIntField(term9001, term9001.getClass(), "width", 1077223540);
        setIntField(term9001, term9001.getClass(), "height", -1823813592);
        setIntField(term9001, term9001.getClass(), "sampleModelTranslateX", -1644358555);
        setIntField(term9001, term9001.getClass(), "sampleModelTranslateY", -388591034);
        setIntField(term9001, term9001.getClass(), "numBands", -1270258033);
        setIntField(term9001, term9001.getClass(), "numDataElements", 1677994069);
        setField(term9001, term9001.getClass(), "parent", null);
        setField(term8992, term8992.getClass(), "parent", term9001);
        setField(term8990, term8990.getClass(), "raster", term8992);
        setField(term8990, term8990.getClass(), "osis", null);
        setField(term9010, term9010.getClass(), "table", term9011);
        setIntField(term9010, term9010.getClass(), "count", 1);
        setIntField(term9010, term9010.getClass(), "threshold", 8);
        setFloatField(term9010, term9010.getClass(), "loadFactor", 0.75F);
        setIntField(term9010, term9010.getClass(), "modCount", 1);
        setField(term9010, term9010.getClass(), "keySet", null);
        setField(term9010, term9010.getClass(), "entrySet", null);
        setField(term9010, term9010.getClass(), "values", null);
        setField(term8990, term8990.getClass(), "properties", term9010);
        setFloatField(term8990, term8990.getClass(), "accelerationPriority", 0.26441735F);
        setField(term8990, term8990.getClass(), "surfaceManager", null);
        setElement(term8989, 0, term8990);
        setIntField(term9017, term9017.getClass(), "imageType", 924095007);
        setField(term9017, term9017.getClass(), "colorModel", null);
        setField(term9019, term9019.getClass(), "sampleModel", null);
        setField(term9019, term9019.getClass(), "dataBuffer", null);
        setIntField(term9019, term9019.getClass(), "minX", 0);
        setIntField(term9019, term9019.getClass(), "minY", 0);
        setIntField(term9019, term9019.getClass(), "width", 0);
        setIntField(term9019, term9019.getClass(), "height", 0);
        setIntField(term9019, term9019.getClass(), "sampleModelTranslateX", 0);
        setIntField(term9019, term9019.getClass(), "sampleModelTranslateY", 0);
        setIntField(term9019, term9019.getClass(), "numBands", 0);
        setIntField(term9019, term9019.getClass(), "numDataElements", 0);
        setField(term9019, term9019.getClass(), "parent", null);
        setField(term9017, term9017.getClass(), "raster", term9019);
        setField(term9017, term9017.getClass(), "osis", null);
        setField(term9028, term9028.getClass(), "table", term9029);
        setIntField(term9028, term9028.getClass(), "count", 1);
        setIntField(term9028, term9028.getClass(), "threshold", 8);
        setFloatField(term9028, term9028.getClass(), "loadFactor", 0.75F);
        setIntField(term9028, term9028.getClass(), "modCount", 1);
        setField(term9028, term9028.getClass(), "keySet", null);
        setField(term9028, term9028.getClass(), "entrySet", null);
        setField(term9028, term9028.getClass(), "values", null);
        setField(term9017, term9017.getClass(), "properties", term9028);
        setFloatField(term9017, term9017.getClass(), "accelerationPriority", 0.0F);
        setField(term9017, term9017.getClass(), "surfaceManager", null);
        setElement(term8989, 1, term9017);
        setIntField(term9035, term9035.getClass(), "imageType", 0);
        setField(term9035, term9035.getClass(), "colorModel", null);
        setField(term9035, term9035.getClass(), "raster", null);
        setField(term9035, term9035.getClass(), "osis", null);
        setField(term9035, term9035.getClass(), "properties", null);
        setFloatField(term9035, term9035.getClass(), "accelerationPriority", 0.0F);
        setField(term9035, term9035.getClass(), "surfaceManager", null);
        setElement(term8989, 2, term9035);
        setIntField(term9038, term9038.getClass(), "imageType", 0);
        setField(term9038, term9038.getClass(), "colorModel", null);
        setField(term9038, term9038.getClass(), "raster", null);
        setField(term9038, term9038.getClass(), "osis", null);
        setField(term9038, term9038.getClass(), "properties", null);
        setFloatField(term9038, term9038.getClass(), "accelerationPriority", 0.0F);
        setField(term9038, term9038.getClass(), "surfaceManager", null);
        setElement(term8989, 3, term9038);
        setField(term8982, term8982.getClass(), "images", term8989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVelocity", argTypes, term8982, args);
    }

};


