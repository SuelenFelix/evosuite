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

public class IconLabel_init_3570371242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31035;

    public IconLabel_init_3570371242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31035 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term31036 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term31038 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term31047 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term31056 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term31065 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term31066 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term31067 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term31036, term31036.getClass(), "imageType", -1365904757);
        setField(term31036, term31036.getClass(), "colorModel", null);
        setField(term31038, term31038.getClass(), "sampleModel", null);
        setField(term31038, term31038.getClass(), "dataBuffer", null);
        setIntField(term31038, term31038.getClass(), "minX", -1487263349);
        setIntField(term31038, term31038.getClass(), "minY", -1009732764);
        setIntField(term31038, term31038.getClass(), "width", 950783153);
        setIntField(term31038, term31038.getClass(), "height", -801175078);
        setIntField(term31038, term31038.getClass(), "sampleModelTranslateX", 2085098404);
        setIntField(term31038, term31038.getClass(), "sampleModelTranslateY", -684064427);
        setIntField(term31038, term31038.getClass(), "numBands", -1981080836);
        setIntField(term31038, term31038.getClass(), "numDataElements", -176676344);
        setField(term31047, term31047.getClass(), "sampleModel", null);
        setField(term31047, term31047.getClass(), "dataBuffer", null);
        setIntField(term31047, term31047.getClass(), "minX", 1949009312);
        setIntField(term31047, term31047.getClass(), "minY", -432054743);
        setIntField(term31047, term31047.getClass(), "width", -859726380);
        setIntField(term31047, term31047.getClass(), "height", -1498422654);
        setIntField(term31047, term31047.getClass(), "sampleModelTranslateX", -1499829233);
        setIntField(term31047, term31047.getClass(), "sampleModelTranslateY", -888855662);
        setIntField(term31047, term31047.getClass(), "numBands", -1483966656);
        setIntField(term31047, term31047.getClass(), "numDataElements", -334260786);
        setField(term31056, term31056.getClass(), "sampleModel", null);
        setField(term31056, term31056.getClass(), "dataBuffer", null);
        setIntField(term31056, term31056.getClass(), "minX", 0);
        setIntField(term31056, term31056.getClass(), "minY", 0);
        setIntField(term31056, term31056.getClass(), "width", 0);
        setIntField(term31056, term31056.getClass(), "height", 0);
        setIntField(term31056, term31056.getClass(), "sampleModelTranslateX", 0);
        setIntField(term31056, term31056.getClass(), "sampleModelTranslateY", 0);
        setIntField(term31056, term31056.getClass(), "numBands", 0);
        setIntField(term31056, term31056.getClass(), "numDataElements", 0);
        setField(term31056, term31056.getClass(), "parent", null);
        setField(term31047, term31047.getClass(), "parent", term31056);
        setField(term31038, term31038.getClass(), "parent", term31047);
        setField(term31036, term31036.getClass(), "raster", term31038);
        setField(term31036, term31036.getClass(), "osis", null);
        setIntField(term31067, term31067.getClass(), "hash", -1456504926);
        setField(term31067, term31067.getClass(), "key", null);
        setField(term31067, term31067.getClass(), "value", null);
        setField(term31067, term31067.getClass(), "next", null);
        setElement(term31066, 5, term31067);
        setField(term31065, term31065.getClass(), "table", term31066);
        setIntField(term31065, term31065.getClass(), "count", 1);
        setIntField(term31065, term31065.getClass(), "threshold", 8);
        setFloatField(term31065, term31065.getClass(), "loadFactor", 0.75F);
        setIntField(term31065, term31065.getClass(), "modCount", 1);
        setField(term31065, term31065.getClass(), "keySet", null);
        setField(term31065, term31065.getClass(), "entrySet", null);
        setField(term31065, term31065.getClass(), "values", null);
        setField(term31036, term31036.getClass(), "properties", term31065);
        setFloatField(term31036, term31036.getClass(), "accelerationPriority", 0.71142817F);
        setField(term31036, term31036.getClass(), "surfaceManager", null);
        setField(term31035, term31035.getClass(), "img", term31036);
        setField(term31035, term31035.getClass(), "name", "jDFNSuvZqm");
        setIntField(term31035, term31035.getClass(), "index", -214452542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.IconLabel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Component");
        argTypes[1] = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term31035;
        args[2] = "pLvkKHqNYX";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


