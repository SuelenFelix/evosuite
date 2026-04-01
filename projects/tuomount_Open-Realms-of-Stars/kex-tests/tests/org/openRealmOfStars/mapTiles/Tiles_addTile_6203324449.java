package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Tiles_addTile_6203324449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3788;
     Object term3828;
     Object term3830;
     Object term3832;
     Object term3858;

    public Tiles_addTile_6203324449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3788 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term3790 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term3799 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term3808 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term3817 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term3818 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term3819 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term3822 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term3788, term3788.getClass(), "imageType", -271094506);
        setField(term3788, term3788.getClass(), "colorModel", null);
        setField(term3790, term3790.getClass(), "sampleModel", null);
        setField(term3790, term3790.getClass(), "dataBuffer", null);
        setIntField(term3790, term3790.getClass(), "minX", 455632030);
        setIntField(term3790, term3790.getClass(), "minY", -1632929393);
        setIntField(term3790, term3790.getClass(), "width", -431440129);
        setIntField(term3790, term3790.getClass(), "height", -763576148);
        setIntField(term3790, term3790.getClass(), "sampleModelTranslateX", 1568948514);
        setIntField(term3790, term3790.getClass(), "sampleModelTranslateY", -1511130237);
        setIntField(term3790, term3790.getClass(), "numBands", 452088587);
        setIntField(term3790, term3790.getClass(), "numDataElements", -1630069454);
        setField(term3799, term3799.getClass(), "sampleModel", null);
        setField(term3799, term3799.getClass(), "dataBuffer", null);
        setIntField(term3799, term3799.getClass(), "minX", 1499735894);
        setIntField(term3799, term3799.getClass(), "minY", 716486048);
        setIntField(term3799, term3799.getClass(), "width", -466708718);
        setIntField(term3799, term3799.getClass(), "height", 1038029515);
        setIntField(term3799, term3799.getClass(), "sampleModelTranslateX", 1137154606);
        setIntField(term3799, term3799.getClass(), "sampleModelTranslateY", -100681578);
        setIntField(term3799, term3799.getClass(), "numBands", 296568835);
        setIntField(term3799, term3799.getClass(), "numDataElements", 1431951992);
        setField(term3808, term3808.getClass(), "sampleModel", null);
        setField(term3808, term3808.getClass(), "dataBuffer", null);
        setIntField(term3808, term3808.getClass(), "minX", 0);
        setIntField(term3808, term3808.getClass(), "minY", 0);
        setIntField(term3808, term3808.getClass(), "width", 0);
        setIntField(term3808, term3808.getClass(), "height", 0);
        setIntField(term3808, term3808.getClass(), "sampleModelTranslateX", 0);
        setIntField(term3808, term3808.getClass(), "sampleModelTranslateY", 0);
        setIntField(term3808, term3808.getClass(), "numBands", 0);
        setIntField(term3808, term3808.getClass(), "numDataElements", 0);
        setField(term3808, term3808.getClass(), "parent", null);
        setField(term3799, term3799.getClass(), "parent", term3808);
        setField(term3790, term3790.getClass(), "parent", term3799);
        setField(term3788, term3788.getClass(), "raster", term3790);
        setField(term3788, term3788.getClass(), "osis", null);
        setIntField(term3819, term3819.getClass(), "hash", -449184961);
        setField(term3819, term3819.getClass(), "key", "");
        setField(term3819, term3819.getClass(), "value", term3822);
        setField(term3819, term3819.getClass(), "next", null);
        setElement(term3818, 8, term3819);
        setField(term3817, term3817.getClass(), "table", term3818);
        setIntField(term3817, term3817.getClass(), "count", 1);
        setIntField(term3817, term3817.getClass(), "threshold", 8);
        setFloatField(term3817, term3817.getClass(), "loadFactor", 0.75F);
        setIntField(term3817, term3817.getClass(), "modCount", 1);
        setField(term3817, term3817.getClass(), "keySet", null);
        setField(term3817, term3817.getClass(), "entrySet", null);
        setField(term3817, term3817.getClass(), "values", null);
        setField(term3788, term3788.getClass(), "properties", term3817);
        setFloatField(term3788, term3788.getClass(), "accelerationPriority", 0.9828442F);
        setField(term3788, term3788.getClass(), "surfaceManager", null);
        term3828 = new Integer(-896473214);
        term3830 = new Integer(401203924);
        term3832 = new Integer(-1212399479);
        term3858 = new Integer(2107679041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tiles");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = term3788;
        args[1] = term3828;
        args[2] = term3830;
        args[3] = term3832;
        args[4] = "swZVeJAxjt";
        args[5] = "xOcJIiQQDu";
        args[6] = term3858;
        callMethod(klass, "addTile", argTypes, null, args);
    }

};


