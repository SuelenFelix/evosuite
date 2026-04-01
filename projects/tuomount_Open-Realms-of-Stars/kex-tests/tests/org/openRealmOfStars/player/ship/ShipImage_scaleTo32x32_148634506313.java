package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ShipImage_scaleTo32x32_148634506313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942314;

    public ShipImage_scaleTo32x32_148634506313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942314 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term942316 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term942325 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term942334 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term942343 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term942344 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term942345 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term942348 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term942314, term942314.getClass(), "imageType", 2044593829);
        setField(term942314, term942314.getClass(), "colorModel", null);
        setField(term942316, term942316.getClass(), "sampleModel", null);
        setField(term942316, term942316.getClass(), "dataBuffer", null);
        setIntField(term942316, term942316.getClass(), "minX", -655326794);
        setIntField(term942316, term942316.getClass(), "minY", -509232651);
        setIntField(term942316, term942316.getClass(), "width", -1127502560);
        setIntField(term942316, term942316.getClass(), "height", -884054864);
        setIntField(term942316, term942316.getClass(), "sampleModelTranslateX", -865980110);
        setIntField(term942316, term942316.getClass(), "sampleModelTranslateY", -2028050005);
        setIntField(term942316, term942316.getClass(), "numBands", 2025229906);
        setIntField(term942316, term942316.getClass(), "numDataElements", 2111957025);
        setField(term942325, term942325.getClass(), "sampleModel", null);
        setField(term942325, term942325.getClass(), "dataBuffer", null);
        setIntField(term942325, term942325.getClass(), "minX", -112933518);
        setIntField(term942325, term942325.getClass(), "minY", 1937155744);
        setIntField(term942325, term942325.getClass(), "width", -388385111);
        setIntField(term942325, term942325.getClass(), "height", -2054633894);
        setIntField(term942325, term942325.getClass(), "sampleModelTranslateX", 710316222);
        setIntField(term942325, term942325.getClass(), "sampleModelTranslateY", 1812306411);
        setIntField(term942325, term942325.getClass(), "numBands", -1705950169);
        setIntField(term942325, term942325.getClass(), "numDataElements", -1216002612);
        setField(term942334, term942334.getClass(), "sampleModel", null);
        setField(term942334, term942334.getClass(), "dataBuffer", null);
        setIntField(term942334, term942334.getClass(), "minX", 0);
        setIntField(term942334, term942334.getClass(), "minY", 0);
        setIntField(term942334, term942334.getClass(), "width", 0);
        setIntField(term942334, term942334.getClass(), "height", 0);
        setIntField(term942334, term942334.getClass(), "sampleModelTranslateX", 0);
        setIntField(term942334, term942334.getClass(), "sampleModelTranslateY", 0);
        setIntField(term942334, term942334.getClass(), "numBands", 0);
        setIntField(term942334, term942334.getClass(), "numDataElements", 0);
        setField(term942334, term942334.getClass(), "parent", null);
        setField(term942325, term942325.getClass(), "parent", term942334);
        setField(term942316, term942316.getClass(), "parent", term942325);
        setField(term942314, term942314.getClass(), "raster", term942316);
        setField(term942314, term942314.getClass(), "osis", null);
        setIntField(term942345, term942345.getClass(), "hash", 896870574);
        setField(term942345, term942345.getClass(), "key", "");
        setField(term942345, term942345.getClass(), "value", term942348);
        setField(term942345, term942345.getClass(), "next", null);
        setElement(term942344, 6, term942345);
        setField(term942343, term942343.getClass(), "table", term942344);
        setIntField(term942343, term942343.getClass(), "count", 1);
        setIntField(term942343, term942343.getClass(), "threshold", 8);
        setFloatField(term942343, term942343.getClass(), "loadFactor", 0.75F);
        setIntField(term942343, term942343.getClass(), "modCount", 1);
        setField(term942343, term942343.getClass(), "keySet", null);
        setField(term942343, term942343.getClass(), "entrySet", null);
        setField(term942343, term942343.getClass(), "values", null);
        setField(term942314, term942314.getClass(), "properties", term942343);
        setFloatField(term942314, term942314.getClass(), "accelerationPriority", 0.9200632F);
        setField(term942314, term942314.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipImage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = term942314;
        callMethod(klass, "scaleTo32x32", argTypes, null, args);
    }

};


