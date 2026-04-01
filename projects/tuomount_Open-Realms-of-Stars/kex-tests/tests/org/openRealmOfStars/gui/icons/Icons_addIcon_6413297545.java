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

public class Icons_addIcon_6413297545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public Icons_addIcon_6413297545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term28 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term30 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term39 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term48 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term57 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term58 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term59 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term28, term28.getClass(), "imageType", 1484323161);
        setField(term28, term28.getClass(), "colorModel", null);
        setField(term30, term30.getClass(), "sampleModel", null);
        setField(term30, term30.getClass(), "dataBuffer", null);
        setIntField(term30, term30.getClass(), "minX", 391863371);
        setIntField(term30, term30.getClass(), "minY", -1922583790);
        setIntField(term30, term30.getClass(), "width", -616727354);
        setIntField(term30, term30.getClass(), "height", -1955890973);
        setIntField(term30, term30.getClass(), "sampleModelTranslateX", -2038273078);
        setIntField(term30, term30.getClass(), "sampleModelTranslateY", 1227103734);
        setIntField(term30, term30.getClass(), "numBands", -1339778481);
        setIntField(term30, term30.getClass(), "numDataElements", 1725571209);
        setField(term39, term39.getClass(), "sampleModel", null);
        setField(term39, term39.getClass(), "dataBuffer", null);
        setIntField(term39, term39.getClass(), "minX", -522618178);
        setIntField(term39, term39.getClass(), "minY", 1134449235);
        setIntField(term39, term39.getClass(), "width", -883034806);
        setIntField(term39, term39.getClass(), "height", 1585847225);
        setIntField(term39, term39.getClass(), "sampleModelTranslateX", 597278769);
        setIntField(term39, term39.getClass(), "sampleModelTranslateY", -1685132342);
        setIntField(term39, term39.getClass(), "numBands", -1456670397);
        setIntField(term39, term39.getClass(), "numDataElements", 1622346318);
        setField(term48, term48.getClass(), "sampleModel", null);
        setField(term48, term48.getClass(), "dataBuffer", null);
        setIntField(term48, term48.getClass(), "minX", 0);
        setIntField(term48, term48.getClass(), "minY", 0);
        setIntField(term48, term48.getClass(), "width", 0);
        setIntField(term48, term48.getClass(), "height", 0);
        setIntField(term48, term48.getClass(), "sampleModelTranslateX", 0);
        setIntField(term48, term48.getClass(), "sampleModelTranslateY", 0);
        setIntField(term48, term48.getClass(), "numBands", 0);
        setIntField(term48, term48.getClass(), "numDataElements", 0);
        setField(term48, term48.getClass(), "parent", null);
        setField(term39, term39.getClass(), "parent", term48);
        setField(term30, term30.getClass(), "parent", term39);
        setField(term28, term28.getClass(), "raster", term30);
        setField(term28, term28.getClass(), "osis", null);
        setIntField(term59, term59.getClass(), "hash", -1311954585);
        setField(term59, term59.getClass(), "key", null);
        setField(term59, term59.getClass(), "value", null);
        setField(term59, term59.getClass(), "next", null);
        setElement(term58, 6, term59);
        setField(term57, term57.getClass(), "table", term58);
        setIntField(term57, term57.getClass(), "count", 1);
        setIntField(term57, term57.getClass(), "threshold", 8);
        setFloatField(term57, term57.getClass(), "loadFactor", 0.75F);
        setIntField(term57, term57.getClass(), "modCount", 1);
        setField(term57, term57.getClass(), "keySet", null);
        setField(term57, term57.getClass(), "entrySet", null);
        setField(term57, term57.getClass(), "values", null);
        setField(term28, term28.getClass(), "properties", term57);
        setFloatField(term28, term28.getClass(), "accelerationPriority", 0.13238746F);
        setField(term28, term28.getClass(), "surfaceManager", null);
        setField(term27, term27.getClass(), "img", term28);
        setField(term27, term27.getClass(), "name", "MuLcgQHgqz");
        setIntField(term27, term27.getClass(), "index", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.Icons");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Object[] args = new Object[1];
        args[0] = term27;
        callMethod(klass, "addIcon", argTypes, null, args);
    }

};


