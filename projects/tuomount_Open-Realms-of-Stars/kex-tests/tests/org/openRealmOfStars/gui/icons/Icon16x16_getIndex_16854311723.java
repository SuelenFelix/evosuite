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

public class Icon16x16_getIndex_16854311723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385;

    public Icon16x16_getIndex_16854311723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term386 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term388 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term397 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term406 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term415 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term416 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term417 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term386, term386.getClass(), "imageType", 1442160736);
        setField(term386, term386.getClass(), "colorModel", null);
        setField(term388, term388.getClass(), "sampleModel", null);
        setField(term388, term388.getClass(), "dataBuffer", null);
        setIntField(term388, term388.getClass(), "minX", 1114000454);
        setIntField(term388, term388.getClass(), "minY", -556405712);
        setIntField(term388, term388.getClass(), "width", -1772434990);
        setIntField(term388, term388.getClass(), "height", -1845499264);
        setIntField(term388, term388.getClass(), "sampleModelTranslateX", -505439934);
        setIntField(term388, term388.getClass(), "sampleModelTranslateY", -344842608);
        setIntField(term388, term388.getClass(), "numBands", 941650513);
        setIntField(term388, term388.getClass(), "numDataElements", 444029505);
        setField(term397, term397.getClass(), "sampleModel", null);
        setField(term397, term397.getClass(), "dataBuffer", null);
        setIntField(term397, term397.getClass(), "minX", -1034506028);
        setIntField(term397, term397.getClass(), "minY", -1263114719);
        setIntField(term397, term397.getClass(), "width", -894662986);
        setIntField(term397, term397.getClass(), "height", 304775596);
        setIntField(term397, term397.getClass(), "sampleModelTranslateX", -1347665717);
        setIntField(term397, term397.getClass(), "sampleModelTranslateY", -1888585309);
        setIntField(term397, term397.getClass(), "numBands", 683666002);
        setIntField(term397, term397.getClass(), "numDataElements", 1596213415);
        setField(term406, term406.getClass(), "sampleModel", null);
        setField(term406, term406.getClass(), "dataBuffer", null);
        setIntField(term406, term406.getClass(), "minX", 0);
        setIntField(term406, term406.getClass(), "minY", 0);
        setIntField(term406, term406.getClass(), "width", 0);
        setIntField(term406, term406.getClass(), "height", 0);
        setIntField(term406, term406.getClass(), "sampleModelTranslateX", 0);
        setIntField(term406, term406.getClass(), "sampleModelTranslateY", 0);
        setIntField(term406, term406.getClass(), "numBands", 0);
        setIntField(term406, term406.getClass(), "numDataElements", 0);
        setField(term406, term406.getClass(), "parent", null);
        setField(term397, term397.getClass(), "parent", term406);
        setField(term388, term388.getClass(), "parent", term397);
        setField(term386, term386.getClass(), "raster", term388);
        setField(term386, term386.getClass(), "osis", null);
        setIntField(term417, term417.getClass(), "hash", 1708453609);
        setField(term417, term417.getClass(), "key", null);
        setField(term417, term417.getClass(), "value", null);
        setField(term417, term417.getClass(), "next", null);
        setElement(term416, 5, term417);
        setField(term415, term415.getClass(), "table", term416);
        setIntField(term415, term415.getClass(), "count", 1);
        setIntField(term415, term415.getClass(), "threshold", 8);
        setFloatField(term415, term415.getClass(), "loadFactor", 0.75F);
        setIntField(term415, term415.getClass(), "modCount", 1);
        setField(term415, term415.getClass(), "keySet", null);
        setField(term415, term415.getClass(), "entrySet", null);
        setField(term415, term415.getClass(), "values", null);
        setField(term386, term386.getClass(), "properties", term415);
        setFloatField(term386, term386.getClass(), "accelerationPriority", 0.5523636F);
        setField(term386, term386.getClass(), "surfaceManager", null);
        setField(term385, term385.getClass(), "img", term386);
        setField(term385, term385.getClass(), "name", "LQFpaHEwXR");
        setIntField(term385, term385.getClass(), "index", -1210583429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndex", argTypes, term385, args);
    }

};


