package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ImageInstruction_paintSilhouette_17996864020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716838;

    public ImageInstruction_paintSilhouette_17996864020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716838 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term716840 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term716849 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term716858 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term716867 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term716868 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term716869 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term716872 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term716838, term716838.getClass(), "imageType", 1025260913);
        setField(term716838, term716838.getClass(), "colorModel", null);
        setField(term716840, term716840.getClass(), "sampleModel", null);
        setField(term716840, term716840.getClass(), "dataBuffer", null);
        setIntField(term716840, term716840.getClass(), "minX", -1129732398);
        setIntField(term716840, term716840.getClass(), "minY", 1551564487);
        setIntField(term716840, term716840.getClass(), "width", 155830867);
        setIntField(term716840, term716840.getClass(), "height", -1682606072);
        setIntField(term716840, term716840.getClass(), "sampleModelTranslateX", 976267550);
        setIntField(term716840, term716840.getClass(), "sampleModelTranslateY", 1139190313);
        setIntField(term716840, term716840.getClass(), "numBands", 1247868105);
        setIntField(term716840, term716840.getClass(), "numDataElements", 1326171837);
        setField(term716849, term716849.getClass(), "sampleModel", null);
        setField(term716849, term716849.getClass(), "dataBuffer", null);
        setIntField(term716849, term716849.getClass(), "minX", 377087217);
        setIntField(term716849, term716849.getClass(), "minY", 1321305146);
        setIntField(term716849, term716849.getClass(), "width", 1916226838);
        setIntField(term716849, term716849.getClass(), "height", 2065861434);
        setIntField(term716849, term716849.getClass(), "sampleModelTranslateX", -2007928618);
        setIntField(term716849, term716849.getClass(), "sampleModelTranslateY", 571650613);
        setIntField(term716849, term716849.getClass(), "numBands", -881782446);
        setIntField(term716849, term716849.getClass(), "numDataElements", 907791487);
        setField(term716858, term716858.getClass(), "sampleModel", null);
        setField(term716858, term716858.getClass(), "dataBuffer", null);
        setIntField(term716858, term716858.getClass(), "minX", 0);
        setIntField(term716858, term716858.getClass(), "minY", 0);
        setIntField(term716858, term716858.getClass(), "width", 0);
        setIntField(term716858, term716858.getClass(), "height", 0);
        setIntField(term716858, term716858.getClass(), "sampleModelTranslateX", 0);
        setIntField(term716858, term716858.getClass(), "sampleModelTranslateY", 0);
        setIntField(term716858, term716858.getClass(), "numBands", 0);
        setIntField(term716858, term716858.getClass(), "numDataElements", 0);
        setField(term716858, term716858.getClass(), "parent", null);
        setField(term716849, term716849.getClass(), "parent", term716858);
        setField(term716840, term716840.getClass(), "parent", term716849);
        setField(term716838, term716838.getClass(), "raster", term716840);
        setField(term716838, term716838.getClass(), "osis", null);
        setIntField(term716869, term716869.getClass(), "hash", 742496202);
        setField(term716869, term716869.getClass(), "key", "");
        setField(term716869, term716869.getClass(), "value", term716872);
        setField(term716869, term716869.getClass(), "next", null);
        setElement(term716868, 8, term716869);
        setField(term716867, term716867.getClass(), "table", term716868);
        setIntField(term716867, term716867.getClass(), "count", 1);
        setIntField(term716867, term716867.getClass(), "threshold", 8);
        setFloatField(term716867, term716867.getClass(), "loadFactor", 0.75F);
        setIntField(term716867, term716867.getClass(), "modCount", 1);
        setField(term716867, term716867.getClass(), "keySet", null);
        setField(term716867, term716867.getClass(), "entrySet", null);
        setField(term716867, term716867.getClass(), "values", null);
        setField(term716838, term716838.getClass(), "properties", term716867);
        setFloatField(term716838, term716838.getClass(), "accelerationPriority", 0.30926234F);
        setField(term716838, term716838.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term716838;
        args[1] = "tKmXjbvRxD";
        args[2] = "EDFcQkFpFV";
        callMethod(klass, "paintSilhouette", argTypes, null, args);
    }

};


