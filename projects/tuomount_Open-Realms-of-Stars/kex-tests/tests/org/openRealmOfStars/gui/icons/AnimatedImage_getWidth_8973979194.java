package org.openRealmOfStars.gui.icons;

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
import static org.openRealmOfStars.gui.icons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class AnimatedImage_getWidth_8973979194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term829;

    public AnimatedImage_getWidth_8973979194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term832 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term834 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term843 = newInstance(Class.forName("java.util.Hashtable"));
        setIntField(term832, term832.getClass(), "imageType", -1254072822);
        setField(term832, term832.getClass(), "colorModel", null);
        setField(term834, term834.getClass(), "sampleModel", null);
        setField(term834, term834.getClass(), "dataBuffer", null);
        setIntField(term834, term834.getClass(), "minX", -1111249833);
        setIntField(term834, term834.getClass(), "minY", -1692331299);
        setIntField(term834, term834.getClass(), "width", 479531250);
        setIntField(term834, term834.getClass(), "height", 1320570890);
        setIntField(term834, term834.getClass(), "sampleModelTranslateX", -130649791);
        setIntField(term834, term834.getClass(), "sampleModelTranslateY", 534834644);
        setIntField(term834, term834.getClass(), "numBands", 1959097203);
        setIntField(term834, term834.getClass(), "numDataElements", -209654048);
        setField(term834, term834.getClass(), "parent", null);
        setField(term832, term832.getClass(), "raster", term834);
        setField(term832, term832.getClass(), "osis", null);
        setField(term843, term843.getClass(), "table", null);
        setIntField(term843, term843.getClass(), "count", 1);
        setIntField(term843, term843.getClass(), "threshold", 8);
        setFloatField(term843, term843.getClass(), "loadFactor", 0.75F);
        setIntField(term843, term843.getClass(), "modCount", 1);
        setField(term843, term843.getClass(), "keySet", null);
        setField(term843, term843.getClass(), "entrySet", null);
        setField(term843, term843.getClass(), "values", null);
        setField(term832, term832.getClass(), "properties", term843);
        setFloatField(term832, term832.getClass(), "accelerationPriority", 0.8783184F);
        setField(term832, term832.getClass(), "surfaceManager", null);
        Object term849 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term851 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term860 = newInstance(Class.forName("java.util.Hashtable"));
        setIntField(term849, term849.getClass(), "imageType", -282881827);
        setField(term849, term849.getClass(), "colorModel", null);
        setField(term851, term851.getClass(), "sampleModel", null);
        setField(term851, term851.getClass(), "dataBuffer", null);
        setIntField(term851, term851.getClass(), "minX", 0);
        setIntField(term851, term851.getClass(), "minY", 0);
        setIntField(term851, term851.getClass(), "width", 0);
        setIntField(term851, term851.getClass(), "height", 0);
        setIntField(term851, term851.getClass(), "sampleModelTranslateX", 0);
        setIntField(term851, term851.getClass(), "sampleModelTranslateY", 0);
        setIntField(term851, term851.getClass(), "numBands", 0);
        setIntField(term851, term851.getClass(), "numDataElements", 0);
        setField(term851, term851.getClass(), "parent", null);
        setField(term849, term849.getClass(), "raster", term851);
        setField(term849, term849.getClass(), "osis", null);
        setField(term860, term860.getClass(), "table", null);
        setIntField(term860, term860.getClass(), "count", 1);
        setIntField(term860, term860.getClass(), "threshold", 8);
        setFloatField(term860, term860.getClass(), "loadFactor", 0.75F);
        setIntField(term860, term860.getClass(), "modCount", 1);
        setField(term860, term860.getClass(), "keySet", null);
        setField(term860, term860.getClass(), "entrySet", null);
        setField(term860, term860.getClass(), "values", null);
        setField(term849, term849.getClass(), "properties", term860);
        setFloatField(term849, term849.getClass(), "accelerationPriority", 0.0F);
        setField(term849, term849.getClass(), "surfaceManager", null);
        Object term866 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term866, term866.getClass(), "imageType", 0);
        setField(term866, term866.getClass(), "colorModel", null);
        setField(term866, term866.getClass(), "raster", null);
        setField(term866, term866.getClass(), "osis", null);
        setField(term866, term866.getClass(), "properties", null);
        setFloatField(term866, term866.getClass(), "accelerationPriority", 0.0F);
        setField(term866, term866.getClass(), "surfaceManager", null);
        Object term869 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term869, term869.getClass(), "imageType", 0);
        setField(term869, term869.getClass(), "colorModel", null);
        setField(term869, term869.getClass(), "raster", null);
        setField(term869, term869.getClass(), "osis", null);
        setField(term869, term869.getClass(), "properties", null);
        setFloatField(term869, term869.getClass(), "accelerationPriority", 0.0F);
        setField(term869, term869.getClass(), "surfaceManager", null);
        ArrayList term830 = new ArrayList();
        ((ArrayList) term830).add(term832);
        ((ArrayList) term830).add(term849);
        ((ArrayList) term830).add(term866);
        ((ArrayList) term830).add(term869);
        term829 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setField(term829, term829.getClass(), "animations", term830);
        setIntField(term829, term829.getClass(), "frame", -420030135);
        setIntField(term829, term829.getClass(), "sizeX", 267763294);
        setIntField(term829, term829.getClass(), "sizeY", -1497710478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWidth", argTypes, term829, args);
    }

};


