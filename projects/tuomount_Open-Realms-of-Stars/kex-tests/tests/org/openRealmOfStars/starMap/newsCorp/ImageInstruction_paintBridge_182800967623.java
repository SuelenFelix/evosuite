package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ImageInstruction_paintBridge_182800967623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717068;

    public ImageInstruction_paintBridge_182800967623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717068 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term717070 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term717079 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term717088 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term717097 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term717098 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term717099 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term717102 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term717068, term717068.getClass(), "imageType", -1838993761);
        setField(term717068, term717068.getClass(), "colorModel", null);
        setField(term717070, term717070.getClass(), "sampleModel", null);
        setField(term717070, term717070.getClass(), "dataBuffer", null);
        setIntField(term717070, term717070.getClass(), "minX", -1031059056);
        setIntField(term717070, term717070.getClass(), "minY", 974683425);
        setIntField(term717070, term717070.getClass(), "width", 641822467);
        setIntField(term717070, term717070.getClass(), "height", -1872489289);
        setIntField(term717070, term717070.getClass(), "sampleModelTranslateX", 1184593185);
        setIntField(term717070, term717070.getClass(), "sampleModelTranslateY", -2146103227);
        setIntField(term717070, term717070.getClass(), "numBands", -41981877);
        setIntField(term717070, term717070.getClass(), "numDataElements", 1068311383);
        setField(term717079, term717079.getClass(), "sampleModel", null);
        setField(term717079, term717079.getClass(), "dataBuffer", null);
        setIntField(term717079, term717079.getClass(), "minX", 411636515);
        setIntField(term717079, term717079.getClass(), "minY", -606302219);
        setIntField(term717079, term717079.getClass(), "width", 1571772499);
        setIntField(term717079, term717079.getClass(), "height", 58748297);
        setIntField(term717079, term717079.getClass(), "sampleModelTranslateX", -2026652455);
        setIntField(term717079, term717079.getClass(), "sampleModelTranslateY", 1377742875);
        setIntField(term717079, term717079.getClass(), "numBands", 440743051);
        setIntField(term717079, term717079.getClass(), "numDataElements", 1230595174);
        setField(term717088, term717088.getClass(), "sampleModel", null);
        setField(term717088, term717088.getClass(), "dataBuffer", null);
        setIntField(term717088, term717088.getClass(), "minX", 0);
        setIntField(term717088, term717088.getClass(), "minY", 0);
        setIntField(term717088, term717088.getClass(), "width", 0);
        setIntField(term717088, term717088.getClass(), "height", 0);
        setIntField(term717088, term717088.getClass(), "sampleModelTranslateX", 0);
        setIntField(term717088, term717088.getClass(), "sampleModelTranslateY", 0);
        setIntField(term717088, term717088.getClass(), "numBands", 0);
        setIntField(term717088, term717088.getClass(), "numDataElements", 0);
        setField(term717088, term717088.getClass(), "parent", null);
        setField(term717079, term717079.getClass(), "parent", term717088);
        setField(term717070, term717070.getClass(), "parent", term717079);
        setField(term717068, term717068.getClass(), "raster", term717070);
        setField(term717068, term717068.getClass(), "osis", null);
        setIntField(term717099, term717099.getClass(), "hash", 9233371);
        setField(term717099, term717099.getClass(), "key", "");
        setField(term717099, term717099.getClass(), "value", term717102);
        setField(term717099, term717099.getClass(), "next", null);
        setElement(term717098, 4, term717099);
        setField(term717097, term717097.getClass(), "table", term717098);
        setIntField(term717097, term717097.getClass(), "count", 1);
        setIntField(term717097, term717097.getClass(), "threshold", 8);
        setFloatField(term717097, term717097.getClass(), "loadFactor", 0.75F);
        setIntField(term717097, term717097.getClass(), "modCount", 1);
        setField(term717097, term717097.getClass(), "keySet", null);
        setField(term717097, term717097.getClass(), "entrySet", null);
        setField(term717097, term717097.getClass(), "values", null);
        setField(term717068, term717068.getClass(), "properties", term717097);
        setFloatField(term717068, term717068.getClass(), "accelerationPriority", 0.6805867F);
        setField(term717068, term717068.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term717068;
        args[1] = "wBCTRRwngG";
        callMethod(klass, "paintBridge", argTypes, null, args);
    }

};


