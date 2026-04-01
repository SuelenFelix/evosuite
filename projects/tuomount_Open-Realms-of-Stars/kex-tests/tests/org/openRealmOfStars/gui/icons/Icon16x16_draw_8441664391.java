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

public class Icon16x16_draw_8441664391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;
     Object term309;
     Object term311;

    public Icon16x16_draw_8441664391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term258 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term260 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term269 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term278 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term287 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term288 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term289 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term258, term258.getClass(), "imageType", -1968847291);
        setField(term258, term258.getClass(), "colorModel", null);
        setField(term260, term260.getClass(), "sampleModel", null);
        setField(term260, term260.getClass(), "dataBuffer", null);
        setIntField(term260, term260.getClass(), "minX", 579005622);
        setIntField(term260, term260.getClass(), "minY", -14890619);
        setIntField(term260, term260.getClass(), "width", 1632125673);
        setIntField(term260, term260.getClass(), "height", 454281060);
        setIntField(term260, term260.getClass(), "sampleModelTranslateX", -1786399638);
        setIntField(term260, term260.getClass(), "sampleModelTranslateY", 2055867847);
        setIntField(term260, term260.getClass(), "numBands", -1048298087);
        setIntField(term260, term260.getClass(), "numDataElements", 292681826);
        setField(term269, term269.getClass(), "sampleModel", null);
        setField(term269, term269.getClass(), "dataBuffer", null);
        setIntField(term269, term269.getClass(), "minX", 458147407);
        setIntField(term269, term269.getClass(), "minY", -184153539);
        setIntField(term269, term269.getClass(), "width", 493620644);
        setIntField(term269, term269.getClass(), "height", 1328271830);
        setIntField(term269, term269.getClass(), "sampleModelTranslateX", 1596070772);
        setIntField(term269, term269.getClass(), "sampleModelTranslateY", 97029295);
        setIntField(term269, term269.getClass(), "numBands", -1371869594);
        setIntField(term269, term269.getClass(), "numDataElements", -2095575670);
        setField(term278, term278.getClass(), "sampleModel", null);
        setField(term278, term278.getClass(), "dataBuffer", null);
        setIntField(term278, term278.getClass(), "minX", 0);
        setIntField(term278, term278.getClass(), "minY", 0);
        setIntField(term278, term278.getClass(), "width", 0);
        setIntField(term278, term278.getClass(), "height", 0);
        setIntField(term278, term278.getClass(), "sampleModelTranslateX", 0);
        setIntField(term278, term278.getClass(), "sampleModelTranslateY", 0);
        setIntField(term278, term278.getClass(), "numBands", 0);
        setIntField(term278, term278.getClass(), "numDataElements", 0);
        setField(term278, term278.getClass(), "parent", null);
        setField(term269, term269.getClass(), "parent", term278);
        setField(term260, term260.getClass(), "parent", term269);
        setField(term258, term258.getClass(), "raster", term260);
        setField(term258, term258.getClass(), "osis", null);
        setIntField(term289, term289.getClass(), "hash", 1581343183);
        setField(term289, term289.getClass(), "key", null);
        setField(term289, term289.getClass(), "value", null);
        setField(term289, term289.getClass(), "next", null);
        setElement(term288, 2, term289);
        setField(term287, term287.getClass(), "table", term288);
        setIntField(term287, term287.getClass(), "count", 1);
        setIntField(term287, term287.getClass(), "threshold", 8);
        setFloatField(term287, term287.getClass(), "loadFactor", 0.75F);
        setIntField(term287, term287.getClass(), "modCount", 1);
        setField(term287, term287.getClass(), "keySet", null);
        setField(term287, term287.getClass(), "entrySet", null);
        setField(term287, term287.getClass(), "values", null);
        setField(term258, term258.getClass(), "properties", term287);
        setFloatField(term258, term258.getClass(), "accelerationPriority", 0.3455959F);
        setField(term258, term258.getClass(), "surfaceManager", null);
        setField(term257, term257.getClass(), "img", term258);
        setField(term257, term257.getClass(), "name", "RMFIsYGgne");
        setIntField(term257, term257.getClass(), "index", 1324040357);
        term309 = new Integer(-1588772968);
        term311 = new Integer(-93135961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term309;
        args[2] = term311;
        callMethod(klass, "draw", argTypes, term257, args);
    }

};


