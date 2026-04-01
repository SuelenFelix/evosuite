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
import java.lang.Object;
import java.lang.Integer;

public class Icon16x16_init_10778266430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191;
     Object term231;
     Object term233;

    public Icon16x16_init_10778266430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term193 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term202 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term211 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term220 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term221 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term222 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term225 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term191, term191.getClass(), "imageType", 865208305);
        setField(term191, term191.getClass(), "colorModel", null);
        setField(term193, term193.getClass(), "sampleModel", null);
        setField(term193, term193.getClass(), "dataBuffer", null);
        setIntField(term193, term193.getClass(), "minX", -1275173084);
        setIntField(term193, term193.getClass(), "minY", -244121226);
        setIntField(term193, term193.getClass(), "width", -203030934);
        setIntField(term193, term193.getClass(), "height", -1179120542);
        setIntField(term193, term193.getClass(), "sampleModelTranslateX", -73683645);
        setIntField(term193, term193.getClass(), "sampleModelTranslateY", -226514366);
        setIntField(term193, term193.getClass(), "numBands", 1193880199);
        setIntField(term193, term193.getClass(), "numDataElements", -1087774327);
        setField(term202, term202.getClass(), "sampleModel", null);
        setField(term202, term202.getClass(), "dataBuffer", null);
        setIntField(term202, term202.getClass(), "minX", -1530420153);
        setIntField(term202, term202.getClass(), "minY", -469968304);
        setIntField(term202, term202.getClass(), "width", -1145578966);
        setIntField(term202, term202.getClass(), "height", 679763016);
        setIntField(term202, term202.getClass(), "sampleModelTranslateX", 1962444399);
        setIntField(term202, term202.getClass(), "sampleModelTranslateY", 767834723);
        setIntField(term202, term202.getClass(), "numBands", -602026508);
        setIntField(term202, term202.getClass(), "numDataElements", -157887805);
        setField(term211, term211.getClass(), "sampleModel", null);
        setField(term211, term211.getClass(), "dataBuffer", null);
        setIntField(term211, term211.getClass(), "minX", 0);
        setIntField(term211, term211.getClass(), "minY", 0);
        setIntField(term211, term211.getClass(), "width", 0);
        setIntField(term211, term211.getClass(), "height", 0);
        setIntField(term211, term211.getClass(), "sampleModelTranslateX", 0);
        setIntField(term211, term211.getClass(), "sampleModelTranslateY", 0);
        setIntField(term211, term211.getClass(), "numBands", 0);
        setIntField(term211, term211.getClass(), "numDataElements", 0);
        setField(term211, term211.getClass(), "parent", null);
        setField(term202, term202.getClass(), "parent", term211);
        setField(term193, term193.getClass(), "parent", term202);
        setField(term191, term191.getClass(), "raster", term193);
        setField(term191, term191.getClass(), "osis", null);
        setIntField(term222, term222.getClass(), "hash", 1755263599);
        setField(term222, term222.getClass(), "key", "");
        setField(term222, term222.getClass(), "value", term225);
        setField(term222, term222.getClass(), "next", null);
        setElement(term221, 1, term222);
        setField(term220, term220.getClass(), "table", term221);
        setIntField(term220, term220.getClass(), "count", 1);
        setIntField(term220, term220.getClass(), "threshold", 8);
        setFloatField(term220, term220.getClass(), "loadFactor", 0.75F);
        setIntField(term220, term220.getClass(), "modCount", 1);
        setField(term220, term220.getClass(), "keySet", null);
        setField(term220, term220.getClass(), "entrySet", null);
        setField(term220, term220.getClass(), "values", null);
        setField(term191, term191.getClass(), "properties", term220);
        setFloatField(term191, term191.getClass(), "accelerationPriority", 0.2707036F);
        setField(term191, term191.getClass(), "surfaceManager", null);
        term231 = new Integer(-817164822);
        term233 = new Integer(-1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term191;
        args[1] = term231;
        args[2] = term233;
        args[3] = "MjGYSRKTNF";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


