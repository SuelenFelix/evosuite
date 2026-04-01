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

public class Icon16x16_getName_15603079822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323;

    public Icon16x16_getName_15603079822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term324 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term326 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term335 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term344 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term353 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term354 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term355 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term324, term324.getClass(), "imageType", -112921587);
        setField(term324, term324.getClass(), "colorModel", null);
        setField(term326, term326.getClass(), "sampleModel", null);
        setField(term326, term326.getClass(), "dataBuffer", null);
        setIntField(term326, term326.getClass(), "minX", 933028652);
        setIntField(term326, term326.getClass(), "minY", 287287233);
        setIntField(term326, term326.getClass(), "width", 962840079);
        setIntField(term326, term326.getClass(), "height", 1540719661);
        setIntField(term326, term326.getClass(), "sampleModelTranslateX", 1265463001);
        setIntField(term326, term326.getClass(), "sampleModelTranslateY", 335112684);
        setIntField(term326, term326.getClass(), "numBands", 1551099402);
        setIntField(term326, term326.getClass(), "numDataElements", -2027534003);
        setField(term335, term335.getClass(), "sampleModel", null);
        setField(term335, term335.getClass(), "dataBuffer", null);
        setIntField(term335, term335.getClass(), "minX", 1063420942);
        setIntField(term335, term335.getClass(), "minY", 1375330971);
        setIntField(term335, term335.getClass(), "width", -478195677);
        setIntField(term335, term335.getClass(), "height", 972867650);
        setIntField(term335, term335.getClass(), "sampleModelTranslateX", 1655935355);
        setIntField(term335, term335.getClass(), "sampleModelTranslateY", -481533957);
        setIntField(term335, term335.getClass(), "numBands", 1240914516);
        setIntField(term335, term335.getClass(), "numDataElements", -1465035361);
        setField(term344, term344.getClass(), "sampleModel", null);
        setField(term344, term344.getClass(), "dataBuffer", null);
        setIntField(term344, term344.getClass(), "minX", 0);
        setIntField(term344, term344.getClass(), "minY", 0);
        setIntField(term344, term344.getClass(), "width", 0);
        setIntField(term344, term344.getClass(), "height", 0);
        setIntField(term344, term344.getClass(), "sampleModelTranslateX", 0);
        setIntField(term344, term344.getClass(), "sampleModelTranslateY", 0);
        setIntField(term344, term344.getClass(), "numBands", 0);
        setIntField(term344, term344.getClass(), "numDataElements", 0);
        setField(term344, term344.getClass(), "parent", null);
        setField(term335, term335.getClass(), "parent", term344);
        setField(term326, term326.getClass(), "parent", term335);
        setField(term324, term324.getClass(), "raster", term326);
        setField(term324, term324.getClass(), "osis", null);
        setIntField(term355, term355.getClass(), "hash", -1771471902);
        setField(term355, term355.getClass(), "key", null);
        setField(term355, term355.getClass(), "value", null);
        setField(term355, term355.getClass(), "next", null);
        setElement(term354, 0, term355);
        setField(term353, term353.getClass(), "table", term354);
        setIntField(term353, term353.getClass(), "count", 1);
        setIntField(term353, term353.getClass(), "threshold", 8);
        setFloatField(term353, term353.getClass(), "loadFactor", 0.75F);
        setIntField(term353, term353.getClass(), "modCount", 1);
        setField(term353, term353.getClass(), "keySet", null);
        setField(term353, term353.getClass(), "entrySet", null);
        setField(term353, term353.getClass(), "values", null);
        setField(term324, term324.getClass(), "properties", term353);
        setFloatField(term324, term324.getClass(), "accelerationPriority", 0.09123778F);
        setField(term324, term324.getClass(), "surfaceManager", null);
        setField(term323, term323.getClass(), "img", term324);
        setField(term323, term323.getClass(), "name", "uuaPigETmJ");
        setIntField(term323, term323.getClass(), "index", -1547384488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term323, args);
    }

};


