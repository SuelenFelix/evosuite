package org.openRealmOfStars.starMap.planet.enums;

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
import static org.openRealmOfStars.starMap.planet.enums.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class PlanetTypes_init_14409921665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17424;
     Object term17426;
     Object enum52;
     Object term17496;
     Object term17498;

    public PlanetTypes_init_14409921665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17424 = new Integer(-1955890973);
        term17426 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term17428 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term17437 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term17446 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term17455 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term17456 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term17457 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17460 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term17426, term17426.getClass(), "imageType", -2038273078);
        setField(term17426, term17426.getClass(), "colorModel", null);
        setField(term17428, term17428.getClass(), "sampleModel", null);
        setField(term17428, term17428.getClass(), "dataBuffer", null);
        setIntField(term17428, term17428.getClass(), "minX", 1227103734);
        setIntField(term17428, term17428.getClass(), "minY", -1339778481);
        setIntField(term17428, term17428.getClass(), "width", 1725571209);
        setIntField(term17428, term17428.getClass(), "height", -522618178);
        setIntField(term17428, term17428.getClass(), "sampleModelTranslateX", 1134449235);
        setIntField(term17428, term17428.getClass(), "sampleModelTranslateY", -883034806);
        setIntField(term17428, term17428.getClass(), "numBands", 1585847225);
        setIntField(term17428, term17428.getClass(), "numDataElements", 597278769);
        setField(term17437, term17437.getClass(), "sampleModel", null);
        setField(term17437, term17437.getClass(), "dataBuffer", null);
        setIntField(term17437, term17437.getClass(), "minX", -1685132342);
        setIntField(term17437, term17437.getClass(), "minY", -1456670397);
        setIntField(term17437, term17437.getClass(), "width", 1622346318);
        setIntField(term17437, term17437.getClass(), "height", 1048535127);
        setIntField(term17437, term17437.getClass(), "sampleModelTranslateX", -655067527);
        setIntField(term17437, term17437.getClass(), "sampleModelTranslateY", -6029667);
        setIntField(term17437, term17437.getClass(), "numBands", -2068769794);
        setIntField(term17437, term17437.getClass(), "numDataElements", -117576464);
        setField(term17446, term17446.getClass(), "sampleModel", null);
        setField(term17446, term17446.getClass(), "dataBuffer", null);
        setIntField(term17446, term17446.getClass(), "minX", 0);
        setIntField(term17446, term17446.getClass(), "minY", 0);
        setIntField(term17446, term17446.getClass(), "width", 0);
        setIntField(term17446, term17446.getClass(), "height", 0);
        setIntField(term17446, term17446.getClass(), "sampleModelTranslateX", 0);
        setIntField(term17446, term17446.getClass(), "sampleModelTranslateY", 0);
        setIntField(term17446, term17446.getClass(), "numBands", 0);
        setIntField(term17446, term17446.getClass(), "numDataElements", 0);
        setField(term17446, term17446.getClass(), "parent", null);
        setField(term17437, term17437.getClass(), "parent", term17446);
        setField(term17428, term17428.getClass(), "parent", term17437);
        setField(term17426, term17426.getClass(), "raster", term17428);
        setField(term17426, term17426.getClass(), "osis", null);
        setIntField(term17457, term17457.getClass(), "hash", 513416123);
        setField(term17457, term17457.getClass(), "key", "");
        setField(term17457, term17457.getClass(), "value", term17460);
        setField(term17457, term17457.getClass(), "next", null);
        setElement(term17456, 0, term17457);
        setField(term17455, term17455.getClass(), "table", term17456);
        setIntField(term17455, term17455.getClass(), "count", 1);
        setIntField(term17455, term17455.getClass(), "threshold", 8);
        setFloatField(term17455, term17455.getClass(), "loadFactor", 0.75F);
        setIntField(term17455, term17455.getClass(), "modCount", 1);
        setField(term17455, term17455.getClass(), "keySet", null);
        setField(term17455, term17455.getClass(), "entrySet", null);
        setField(term17455, term17455.getClass(), "values", null);
        setField(term17426, term17426.getClass(), "properties", term17455);
        setFloatField(term17426, term17426.getClass(), "accelerationPriority", 0.13238746F);
        setField(term17426, term17426.getClass(), "surfaceManager", null);
        Class<? extends Object> term17635 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WorldType");
        Field term17634 = ((Class) term17635).getDeclaredField((String) "ARTIFICALWORLD");
        ((Field) term17634).setAccessible(true);
        enum52 = ((Field) term17634).get((Object) null);
        term17496 = new Boolean(true);
        term17498 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.enums.PlanetTypes");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.awt.image.BufferedImage");
        argTypes[4] = Class.forName("org.openRealmOfStars.starMap.planet.enums.WorldType");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = boolean.class;
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = term17424;
        args[1] = term17426;
        args[2] = enum52;
        args[3] = "NRdvgJlhkX";
        args[4] = term17496;
        args[5] = term17498;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


