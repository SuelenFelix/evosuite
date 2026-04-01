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

public class ShipImage_scaleTo16x16_114807573714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942354;

    public ShipImage_scaleTo16x16_114807573714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942354 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term942356 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term942365 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term942374 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term942383 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term942384 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term942385 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term942388 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term942354, term942354.getClass(), "imageType", -978440695);
        setField(term942354, term942354.getClass(), "colorModel", null);
        setField(term942356, term942356.getClass(), "sampleModel", null);
        setField(term942356, term942356.getClass(), "dataBuffer", null);
        setIntField(term942356, term942356.getClass(), "minX", 525509738);
        setIntField(term942356, term942356.getClass(), "minY", -168692748);
        setIntField(term942356, term942356.getClass(), "width", -97183233);
        setIntField(term942356, term942356.getClass(), "height", 1216788465);
        setIntField(term942356, term942356.getClass(), "sampleModelTranslateX", -706246095);
        setIntField(term942356, term942356.getClass(), "sampleModelTranslateY", -1818179960);
        setIntField(term942356, term942356.getClass(), "numBands", -107692590);
        setIntField(term942356, term942356.getClass(), "numDataElements", -517366427);
        setField(term942365, term942365.getClass(), "sampleModel", null);
        setField(term942365, term942365.getClass(), "dataBuffer", null);
        setIntField(term942365, term942365.getClass(), "minX", 170145566);
        setIntField(term942365, term942365.getClass(), "minY", -1540449299);
        setIntField(term942365, term942365.getClass(), "width", 280307957);
        setIntField(term942365, term942365.getClass(), "height", -147223414);
        setIntField(term942365, term942365.getClass(), "sampleModelTranslateX", 718413245);
        setIntField(term942365, term942365.getClass(), "sampleModelTranslateY", -1981165845);
        setIntField(term942365, term942365.getClass(), "numBands", -1046395755);
        setIntField(term942365, term942365.getClass(), "numDataElements", -1774643014);
        setField(term942374, term942374.getClass(), "sampleModel", null);
        setField(term942374, term942374.getClass(), "dataBuffer", null);
        setIntField(term942374, term942374.getClass(), "minX", 0);
        setIntField(term942374, term942374.getClass(), "minY", 0);
        setIntField(term942374, term942374.getClass(), "width", 0);
        setIntField(term942374, term942374.getClass(), "height", 0);
        setIntField(term942374, term942374.getClass(), "sampleModelTranslateX", 0);
        setIntField(term942374, term942374.getClass(), "sampleModelTranslateY", 0);
        setIntField(term942374, term942374.getClass(), "numBands", 0);
        setIntField(term942374, term942374.getClass(), "numDataElements", 0);
        setField(term942374, term942374.getClass(), "parent", null);
        setField(term942365, term942365.getClass(), "parent", term942374);
        setField(term942356, term942356.getClass(), "parent", term942365);
        setField(term942354, term942354.getClass(), "raster", term942356);
        setField(term942354, term942354.getClass(), "osis", null);
        setIntField(term942385, term942385.getClass(), "hash", -816276015);
        setField(term942385, term942385.getClass(), "key", "");
        setField(term942385, term942385.getClass(), "value", term942388);
        setField(term942385, term942385.getClass(), "next", null);
        setElement(term942384, 8, term942385);
        setField(term942383, term942383.getClass(), "table", term942384);
        setIntField(term942383, term942383.getClass(), "count", 1);
        setIntField(term942383, term942383.getClass(), "threshold", 8);
        setFloatField(term942383, term942383.getClass(), "loadFactor", 0.75F);
        setIntField(term942383, term942383.getClass(), "modCount", 1);
        setField(term942383, term942383.getClass(), "keySet", null);
        setField(term942383, term942383.getClass(), "entrySet", null);
        setField(term942383, term942383.getClass(), "values", null);
        setField(term942354, term942354.getClass(), "properties", term942383);
        setFloatField(term942354, term942354.getClass(), "accelerationPriority", 0.025133014F);
        setField(term942354, term942354.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipImage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = term942354;
        callMethod(klass, "scaleTo16x16", argTypes, null, args);
    }

};


