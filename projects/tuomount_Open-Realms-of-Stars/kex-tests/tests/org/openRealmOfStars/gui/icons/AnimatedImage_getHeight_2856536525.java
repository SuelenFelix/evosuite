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

public class AnimatedImage_getHeight_2856536525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;

    public AnimatedImage_getHeight_2856536525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term880 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term882 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term891 = newInstance(Class.forName("java.util.Hashtable"));
        setIntField(term880, term880.getClass(), "imageType", 49950830);
        setField(term880, term880.getClass(), "colorModel", null);
        setField(term882, term882.getClass(), "sampleModel", null);
        setField(term882, term882.getClass(), "dataBuffer", null);
        setIntField(term882, term882.getClass(), "minX", -525257914);
        setIntField(term882, term882.getClass(), "minY", 147209682);
        setIntField(term882, term882.getClass(), "width", 34470066);
        setIntField(term882, term882.getClass(), "height", 2058711405);
        setIntField(term882, term882.getClass(), "sampleModelTranslateX", 1743683601);
        setIntField(term882, term882.getClass(), "sampleModelTranslateY", -945116798);
        setIntField(term882, term882.getClass(), "numBands", 1593461795);
        setIntField(term882, term882.getClass(), "numDataElements", 515182546);
        setField(term882, term882.getClass(), "parent", null);
        setField(term880, term880.getClass(), "raster", term882);
        setField(term880, term880.getClass(), "osis", null);
        setField(term891, term891.getClass(), "table", null);
        setIntField(term891, term891.getClass(), "count", 1);
        setIntField(term891, term891.getClass(), "threshold", 8);
        setFloatField(term891, term891.getClass(), "loadFactor", 0.75F);
        setIntField(term891, term891.getClass(), "modCount", 1);
        setField(term891, term891.getClass(), "keySet", null);
        setField(term891, term891.getClass(), "entrySet", null);
        setField(term891, term891.getClass(), "values", null);
        setField(term880, term880.getClass(), "properties", term891);
        setFloatField(term880, term880.getClass(), "accelerationPriority", 0.26413453F);
        setField(term880, term880.getClass(), "surfaceManager", null);
        ArrayList term878 = new ArrayList();
        ((ArrayList) term878).add(term880);
        term877 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setField(term877, term877.getClass(), "animations", term878);
        setIntField(term877, term877.getClass(), "frame", 1236004505);
        setIntField(term877, term877.getClass(), "sizeX", 1050765721);
        setIntField(term877, term877.getClass(), "sizeY", 474518942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeight", argTypes, term877, args);
    }

};


