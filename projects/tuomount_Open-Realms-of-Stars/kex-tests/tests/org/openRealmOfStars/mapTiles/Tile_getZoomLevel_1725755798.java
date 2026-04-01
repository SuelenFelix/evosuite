package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tile_getZoomLevel_1725755798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544;

    public Tile_getZoomLevel_1725755798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term545 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term547 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term556 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term565 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term574 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term575 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term576 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term545, term545.getClass(), "imageType", 2098647989);
        setField(term545, term545.getClass(), "colorModel", null);
        setField(term547, term547.getClass(), "sampleModel", null);
        setField(term547, term547.getClass(), "dataBuffer", null);
        setIntField(term547, term547.getClass(), "minX", 1598895173);
        setIntField(term547, term547.getClass(), "minY", 1830648570);
        setIntField(term547, term547.getClass(), "width", -227365013);
        setIntField(term547, term547.getClass(), "height", 11724947);
        setIntField(term547, term547.getClass(), "sampleModelTranslateX", 1953277050);
        setIntField(term547, term547.getClass(), "sampleModelTranslateY", 1283079251);
        setIntField(term547, term547.getClass(), "numBands", -523949691);
        setIntField(term547, term547.getClass(), "numDataElements", 1398204340);
        setField(term556, term556.getClass(), "sampleModel", null);
        setField(term556, term556.getClass(), "dataBuffer", null);
        setIntField(term556, term556.getClass(), "minX", 229204365);
        setIntField(term556, term556.getClass(), "minY", -461771056);
        setIntField(term556, term556.getClass(), "width", -243422082);
        setIntField(term556, term556.getClass(), "height", 1384592638);
        setIntField(term556, term556.getClass(), "sampleModelTranslateX", -1002370457);
        setIntField(term556, term556.getClass(), "sampleModelTranslateY", -2014576105);
        setIntField(term556, term556.getClass(), "numBands", 1296895584);
        setIntField(term556, term556.getClass(), "numDataElements", 628918458);
        setField(term565, term565.getClass(), "sampleModel", null);
        setField(term565, term565.getClass(), "dataBuffer", null);
        setIntField(term565, term565.getClass(), "minX", 0);
        setIntField(term565, term565.getClass(), "minY", 0);
        setIntField(term565, term565.getClass(), "width", 0);
        setIntField(term565, term565.getClass(), "height", 0);
        setIntField(term565, term565.getClass(), "sampleModelTranslateX", 0);
        setIntField(term565, term565.getClass(), "sampleModelTranslateY", 0);
        setIntField(term565, term565.getClass(), "numBands", 0);
        setIntField(term565, term565.getClass(), "numDataElements", 0);
        setField(term565, term565.getClass(), "parent", null);
        setField(term556, term556.getClass(), "parent", term565);
        setField(term547, term547.getClass(), "parent", term556);
        setField(term545, term545.getClass(), "raster", term547);
        setField(term545, term545.getClass(), "osis", null);
        setIntField(term576, term576.getClass(), "hash", 530902505);
        setField(term576, term576.getClass(), "key", null);
        setField(term576, term576.getClass(), "value", null);
        setField(term576, term576.getClass(), "next", null);
        setElement(term575, 1, term576);
        setField(term574, term574.getClass(), "table", term575);
        setIntField(term574, term574.getClass(), "count", 1);
        setIntField(term574, term574.getClass(), "threshold", 8);
        setFloatField(term574, term574.getClass(), "loadFactor", 0.75F);
        setIntField(term574, term574.getClass(), "modCount", 1);
        setField(term574, term574.getClass(), "keySet", null);
        setField(term574, term574.getClass(), "entrySet", null);
        setField(term574, term574.getClass(), "values", null);
        setField(term545, term545.getClass(), "properties", term574);
        setFloatField(term545, term545.getClass(), "accelerationPriority", 0.5254275F);
        setField(term545, term545.getClass(), "surfaceManager", null);
        setField(term544, term544.getClass(), "img", term545);
        setField(term544, term544.getClass(), "name", "HyxfbSQYBe");
        setIntField(term544, term544.getClass(), "tileIndex", 1041916673);
        setIntField(term544, term544.getClass(), "nextAnimIndex", -601863069);
        setField(term544, term544.getClass(), "tileDescription", "pCTimMblYc");
        setIntField(term544, term544.getClass(), "zoomLevel", 663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevel", argTypes, term544, args);
    }

};


