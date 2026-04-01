package org.openRealmOfStars.gui.labels;

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
import static org.openRealmOfStars.gui.labels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class ImageLabel_init_6182983110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404;
     Object term444;

    public ImageLabel_init_6182983110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term404 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term406 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term415 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term424 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term433 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term434 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term435 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term438 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term404, term404.getClass(), "imageType", 579005622);
        setField(term404, term404.getClass(), "colorModel", null);
        setField(term406, term406.getClass(), "sampleModel", null);
        setField(term406, term406.getClass(), "dataBuffer", null);
        setIntField(term406, term406.getClass(), "minX", -14890619);
        setIntField(term406, term406.getClass(), "minY", 1632125673);
        setIntField(term406, term406.getClass(), "width", 454281060);
        setIntField(term406, term406.getClass(), "height", -1786399638);
        setIntField(term406, term406.getClass(), "sampleModelTranslateX", 2055867847);
        setIntField(term406, term406.getClass(), "sampleModelTranslateY", -1048298087);
        setIntField(term406, term406.getClass(), "numBands", 292681826);
        setIntField(term406, term406.getClass(), "numDataElements", 458147407);
        setField(term415, term415.getClass(), "sampleModel", null);
        setField(term415, term415.getClass(), "dataBuffer", null);
        setIntField(term415, term415.getClass(), "minX", -184153539);
        setIntField(term415, term415.getClass(), "minY", 493620644);
        setIntField(term415, term415.getClass(), "width", 1328271830);
        setIntField(term415, term415.getClass(), "height", 1596070772);
        setIntField(term415, term415.getClass(), "sampleModelTranslateX", 97029295);
        setIntField(term415, term415.getClass(), "sampleModelTranslateY", -1371869594);
        setIntField(term415, term415.getClass(), "numBands", -2095575670);
        setIntField(term415, term415.getClass(), "numDataElements", 1225272962);
        setField(term424, term424.getClass(), "sampleModel", null);
        setField(term424, term424.getClass(), "dataBuffer", null);
        setIntField(term424, term424.getClass(), "minX", 0);
        setIntField(term424, term424.getClass(), "minY", 0);
        setIntField(term424, term424.getClass(), "width", 0);
        setIntField(term424, term424.getClass(), "height", 0);
        setIntField(term424, term424.getClass(), "sampleModelTranslateX", 0);
        setIntField(term424, term424.getClass(), "sampleModelTranslateY", 0);
        setIntField(term424, term424.getClass(), "numBands", 0);
        setIntField(term424, term424.getClass(), "numDataElements", 0);
        setField(term424, term424.getClass(), "parent", null);
        setField(term415, term415.getClass(), "parent", term424);
        setField(term406, term406.getClass(), "parent", term415);
        setField(term404, term404.getClass(), "raster", term406);
        setField(term404, term404.getClass(), "osis", null);
        setIntField(term435, term435.getClass(), "hash", 1581343183);
        setField(term435, term435.getClass(), "key", "");
        setField(term435, term435.getClass(), "value", term438);
        setField(term435, term435.getClass(), "next", null);
        setElement(term434, 2, term435);
        setField(term433, term433.getClass(), "table", term434);
        setIntField(term433, term433.getClass(), "count", 1);
        setIntField(term433, term433.getClass(), "threshold", 8);
        setFloatField(term433, term433.getClass(), "loadFactor", 0.75F);
        setIntField(term433, term433.getClass(), "modCount", 1);
        setField(term433, term433.getClass(), "keySet", null);
        setField(term433, term433.getClass(), "entrySet", null);
        setField(term433, term433.getClass(), "values", null);
        setField(term404, term404.getClass(), "properties", term433);
        setFloatField(term404, term404.getClass(), "accelerationPriority", 0.5446086F);
        setField(term404, term404.getClass(), "surfaceManager", null);
        term444 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term404;
        args[1] = term444;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


