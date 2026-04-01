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

public class ImageInstruction_paintBackground_20072044517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716564;

    public ImageInstruction_paintBackground_20072044517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716564 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term716566 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term716575 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term716584 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term716593 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term716594 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term716595 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term716598 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term716564, term716564.getClass(), "imageType", -1104624794);
        setField(term716564, term716564.getClass(), "colorModel", null);
        setField(term716566, term716566.getClass(), "sampleModel", null);
        setField(term716566, term716566.getClass(), "dataBuffer", null);
        setIntField(term716566, term716566.getClass(), "minX", -1908896748);
        setIntField(term716566, term716566.getClass(), "minY", 601943126);
        setIntField(term716566, term716566.getClass(), "width", -835169173);
        setIntField(term716566, term716566.getClass(), "height", 290103455);
        setIntField(term716566, term716566.getClass(), "sampleModelTranslateX", 1195811567);
        setIntField(term716566, term716566.getClass(), "sampleModelTranslateY", -27327249);
        setIntField(term716566, term716566.getClass(), "numBands", -1426279079);
        setIntField(term716566, term716566.getClass(), "numDataElements", -1943627351);
        setField(term716575, term716575.getClass(), "sampleModel", null);
        setField(term716575, term716575.getClass(), "dataBuffer", null);
        setIntField(term716575, term716575.getClass(), "minX", 515767271);
        setIntField(term716575, term716575.getClass(), "minY", -1738856787);
        setIntField(term716575, term716575.getClass(), "width", 1613718471);
        setIntField(term716575, term716575.getClass(), "height", -2058157264);
        setIntField(term716575, term716575.getClass(), "sampleModelTranslateX", 644409299);
        setIntField(term716575, term716575.getClass(), "sampleModelTranslateY", -1065597049);
        setIntField(term716575, term716575.getClass(), "numBands", -1481804326);
        setIntField(term716575, term716575.getClass(), "numDataElements", 1256316882);
        setField(term716584, term716584.getClass(), "sampleModel", null);
        setField(term716584, term716584.getClass(), "dataBuffer", null);
        setIntField(term716584, term716584.getClass(), "minX", 0);
        setIntField(term716584, term716584.getClass(), "minY", 0);
        setIntField(term716584, term716584.getClass(), "width", 0);
        setIntField(term716584, term716584.getClass(), "height", 0);
        setIntField(term716584, term716584.getClass(), "sampleModelTranslateX", 0);
        setIntField(term716584, term716584.getClass(), "sampleModelTranslateY", 0);
        setIntField(term716584, term716584.getClass(), "numBands", 0);
        setIntField(term716584, term716584.getClass(), "numDataElements", 0);
        setField(term716584, term716584.getClass(), "parent", null);
        setField(term716575, term716575.getClass(), "parent", term716584);
        setField(term716566, term716566.getClass(), "parent", term716575);
        setField(term716564, term716564.getClass(), "raster", term716566);
        setField(term716564, term716564.getClass(), "osis", null);
        setIntField(term716595, term716595.getClass(), "hash", -109899172);
        setField(term716595, term716595.getClass(), "key", "");
        setField(term716595, term716595.getClass(), "value", term716598);
        setField(term716595, term716595.getClass(), "next", null);
        setElement(term716594, 4, term716595);
        setField(term716593, term716593.getClass(), "table", term716594);
        setIntField(term716593, term716593.getClass(), "count", 1);
        setIntField(term716593, term716593.getClass(), "threshold", 8);
        setFloatField(term716593, term716593.getClass(), "loadFactor", 0.75F);
        setIntField(term716593, term716593.getClass(), "modCount", 1);
        setField(term716593, term716593.getClass(), "keySet", null);
        setField(term716593, term716593.getClass(), "entrySet", null);
        setField(term716593, term716593.getClass(), "values", null);
        setField(term716564, term716564.getClass(), "properties", term716593);
        setFloatField(term716564, term716564.getClass(), "accelerationPriority", 0.10667074F);
        setField(term716564, term716564.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term716564;
        args[1] = "czlXgLapSi";
        callMethod(klass, "paintBackground", argTypes, null, args);
    }

};


