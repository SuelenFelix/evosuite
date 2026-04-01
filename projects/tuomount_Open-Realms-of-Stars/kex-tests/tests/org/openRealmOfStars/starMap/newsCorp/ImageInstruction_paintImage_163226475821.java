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

public class ImageInstruction_paintImage_163226475821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716922;

    public ImageInstruction_paintImage_163226475821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716922 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term716924 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term716933 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term716942 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term716951 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term716952 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term716953 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term716956 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term716922, term716922.getClass(), "imageType", 1033933467);
        setField(term716922, term716922.getClass(), "colorModel", null);
        setField(term716924, term716924.getClass(), "sampleModel", null);
        setField(term716924, term716924.getClass(), "dataBuffer", null);
        setIntField(term716924, term716924.getClass(), "minX", 647803716);
        setIntField(term716924, term716924.getClass(), "minY", -1019417321);
        setIntField(term716924, term716924.getClass(), "width", 1076301679);
        setIntField(term716924, term716924.getClass(), "height", 1132298382);
        setIntField(term716924, term716924.getClass(), "sampleModelTranslateX", -1307608280);
        setIntField(term716924, term716924.getClass(), "sampleModelTranslateY", -1161031540);
        setIntField(term716924, term716924.getClass(), "numBands", 111906379);
        setIntField(term716924, term716924.getClass(), "numDataElements", -1823672225);
        setField(term716933, term716933.getClass(), "sampleModel", null);
        setField(term716933, term716933.getClass(), "dataBuffer", null);
        setIntField(term716933, term716933.getClass(), "minX", 1168315058);
        setIntField(term716933, term716933.getClass(), "minY", 878306332);
        setIntField(term716933, term716933.getClass(), "width", -825111405);
        setIntField(term716933, term716933.getClass(), "height", 1474163044);
        setIntField(term716933, term716933.getClass(), "sampleModelTranslateX", -2121122733);
        setIntField(term716933, term716933.getClass(), "sampleModelTranslateY", 571653804);
        setIntField(term716933, term716933.getClass(), "numBands", -164270853);
        setIntField(term716933, term716933.getClass(), "numDataElements", -1305444081);
        setField(term716942, term716942.getClass(), "sampleModel", null);
        setField(term716942, term716942.getClass(), "dataBuffer", null);
        setIntField(term716942, term716942.getClass(), "minX", 0);
        setIntField(term716942, term716942.getClass(), "minY", 0);
        setIntField(term716942, term716942.getClass(), "width", 0);
        setIntField(term716942, term716942.getClass(), "height", 0);
        setIntField(term716942, term716942.getClass(), "sampleModelTranslateX", 0);
        setIntField(term716942, term716942.getClass(), "sampleModelTranslateY", 0);
        setIntField(term716942, term716942.getClass(), "numBands", 0);
        setIntField(term716942, term716942.getClass(), "numDataElements", 0);
        setField(term716942, term716942.getClass(), "parent", null);
        setField(term716933, term716933.getClass(), "parent", term716942);
        setField(term716924, term716924.getClass(), "parent", term716933);
        setField(term716922, term716922.getClass(), "raster", term716924);
        setField(term716922, term716922.getClass(), "osis", null);
        setIntField(term716953, term716953.getClass(), "hash", 36670539);
        setField(term716953, term716953.getClass(), "key", "");
        setField(term716953, term716953.getClass(), "value", term716956);
        setField(term716953, term716953.getClass(), "next", null);
        setElement(term716952, 4, term716953);
        setField(term716951, term716951.getClass(), "table", term716952);
        setIntField(term716951, term716951.getClass(), "count", 1);
        setIntField(term716951, term716951.getClass(), "threshold", 8);
        setFloatField(term716951, term716951.getClass(), "loadFactor", 0.75F);
        setIntField(term716951, term716951.getClass(), "modCount", 1);
        setField(term716951, term716951.getClass(), "keySet", null);
        setField(term716951, term716951.getClass(), "entrySet", null);
        setField(term716951, term716951.getClass(), "values", null);
        setField(term716922, term716922.getClass(), "properties", term716951);
        setFloatField(term716922, term716922.getClass(), "accelerationPriority", 0.37161416F);
        setField(term716922, term716922.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term716922;
        args[1] = "KQymWyVowH";
        callMethod(klass, "paintImage", argTypes, null, args);
    }

};


