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

public class AnimatedImage_getMaxFrames_17331148773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term784;

    public AnimatedImage_getMaxFrames_17331148773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term787 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term789 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term798 = newInstance(Class.forName("java.util.Hashtable"));
        setIntField(term787, term787.getClass(), "imageType", -749861210);
        setField(term787, term787.getClass(), "colorModel", null);
        setField(term789, term789.getClass(), "sampleModel", null);
        setField(term789, term789.getClass(), "dataBuffer", null);
        setIntField(term789, term789.getClass(), "minX", 1694224101);
        setIntField(term789, term789.getClass(), "minY", 937859191);
        setIntField(term789, term789.getClass(), "width", -916584829);
        setIntField(term789, term789.getClass(), "height", -2131181468);
        setIntField(term789, term789.getClass(), "sampleModelTranslateX", 282916351);
        setIntField(term789, term789.getClass(), "sampleModelTranslateY", 880977281);
        setIntField(term789, term789.getClass(), "numBands", 371943306);
        setIntField(term789, term789.getClass(), "numDataElements", 982388293);
        setField(term789, term789.getClass(), "parent", null);
        setField(term787, term787.getClass(), "raster", term789);
        setField(term787, term787.getClass(), "osis", null);
        setField(term798, term798.getClass(), "table", null);
        setIntField(term798, term798.getClass(), "count", 1);
        setIntField(term798, term798.getClass(), "threshold", 8);
        setFloatField(term798, term798.getClass(), "loadFactor", 0.75F);
        setIntField(term798, term798.getClass(), "modCount", 1);
        setField(term798, term798.getClass(), "keySet", null);
        setField(term798, term798.getClass(), "entrySet", null);
        setField(term798, term798.getClass(), "values", null);
        setField(term787, term787.getClass(), "properties", term798);
        setFloatField(term787, term787.getClass(), "accelerationPriority", 0.40176582F);
        setField(term787, term787.getClass(), "surfaceManager", null);
        Object term804 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term806 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term815 = newInstance(Class.forName("java.util.Hashtable"));
        setIntField(term804, term804.getClass(), "imageType", -860131894);
        setField(term804, term804.getClass(), "colorModel", null);
        setField(term806, term806.getClass(), "sampleModel", null);
        setField(term806, term806.getClass(), "dataBuffer", null);
        setIntField(term806, term806.getClass(), "minX", 0);
        setIntField(term806, term806.getClass(), "minY", 0);
        setIntField(term806, term806.getClass(), "width", 0);
        setIntField(term806, term806.getClass(), "height", 0);
        setIntField(term806, term806.getClass(), "sampleModelTranslateX", 0);
        setIntField(term806, term806.getClass(), "sampleModelTranslateY", 0);
        setIntField(term806, term806.getClass(), "numBands", 0);
        setIntField(term806, term806.getClass(), "numDataElements", 0);
        setField(term806, term806.getClass(), "parent", null);
        setField(term804, term804.getClass(), "raster", term806);
        setField(term804, term804.getClass(), "osis", null);
        setField(term815, term815.getClass(), "table", null);
        setIntField(term815, term815.getClass(), "count", 1);
        setIntField(term815, term815.getClass(), "threshold", 8);
        setFloatField(term815, term815.getClass(), "loadFactor", 0.75F);
        setIntField(term815, term815.getClass(), "modCount", 1);
        setField(term815, term815.getClass(), "keySet", null);
        setField(term815, term815.getClass(), "entrySet", null);
        setField(term815, term815.getClass(), "values", null);
        setField(term804, term804.getClass(), "properties", term815);
        setFloatField(term804, term804.getClass(), "accelerationPriority", 0.0F);
        setField(term804, term804.getClass(), "surfaceManager", null);
        Object term821 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term821, term821.getClass(), "imageType", 0);
        setField(term821, term821.getClass(), "colorModel", null);
        setField(term821, term821.getClass(), "raster", null);
        setField(term821, term821.getClass(), "osis", null);
        setField(term821, term821.getClass(), "properties", null);
        setFloatField(term821, term821.getClass(), "accelerationPriority", 0.0F);
        setField(term821, term821.getClass(), "surfaceManager", null);
        ArrayList term785 = new ArrayList();
        ((ArrayList) term785).add(term787);
        ((ArrayList) term785).add(term804);
        ((ArrayList) term785).add(term821);
        term784 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setField(term784, term784.getClass(), "animations", term785);
        setIntField(term784, term784.getClass(), "frame", 1045547089);
        setIntField(term784, term784.getClass(), "sizeX", -1122880881);
        setIntField(term784, term784.getClass(), "sizeY", -542712742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxFrames", argTypes, term784, args);
    }

};


