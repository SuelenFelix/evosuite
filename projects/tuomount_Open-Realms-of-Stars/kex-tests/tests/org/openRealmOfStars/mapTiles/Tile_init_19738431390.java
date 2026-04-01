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
import java.lang.Integer;

public class Tile_init_19738431390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term54;
     Object term56;
     Object term58;

    public Tile_init_19738431390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term16 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term25 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term34 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term43 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term44 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term45 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term48 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term14, term14.getClass(), "imageType", 568599855);
        setField(term14, term14.getClass(), "colorModel", null);
        setField(term16, term16.getClass(), "sampleModel", null);
        setField(term16, term16.getClass(), "dataBuffer", null);
        setIntField(term16, term16.getClass(), "minX", 1162663216);
        setIntField(term16, term16.getClass(), "minY", 1484323161);
        setIntField(term16, term16.getClass(), "width", 391863371);
        setIntField(term16, term16.getClass(), "height", -1922583790);
        setIntField(term16, term16.getClass(), "sampleModelTranslateX", -616727354);
        setIntField(term16, term16.getClass(), "sampleModelTranslateY", -1955890973);
        setIntField(term16, term16.getClass(), "numBands", -2038273078);
        setIntField(term16, term16.getClass(), "numDataElements", 1227103734);
        setField(term25, term25.getClass(), "sampleModel", null);
        setField(term25, term25.getClass(), "dataBuffer", null);
        setIntField(term25, term25.getClass(), "minX", -1339778481);
        setIntField(term25, term25.getClass(), "minY", 1725571209);
        setIntField(term25, term25.getClass(), "width", -522618178);
        setIntField(term25, term25.getClass(), "height", 1134449235);
        setIntField(term25, term25.getClass(), "sampleModelTranslateX", -883034806);
        setIntField(term25, term25.getClass(), "sampleModelTranslateY", 1585847225);
        setIntField(term25, term25.getClass(), "numBands", 597278769);
        setIntField(term25, term25.getClass(), "numDataElements", -1685132342);
        setField(term34, term34.getClass(), "sampleModel", null);
        setField(term34, term34.getClass(), "dataBuffer", null);
        setIntField(term34, term34.getClass(), "minX", 0);
        setIntField(term34, term34.getClass(), "minY", 0);
        setIntField(term34, term34.getClass(), "width", 0);
        setIntField(term34, term34.getClass(), "height", 0);
        setIntField(term34, term34.getClass(), "sampleModelTranslateX", 0);
        setIntField(term34, term34.getClass(), "sampleModelTranslateY", 0);
        setIntField(term34, term34.getClass(), "numBands", 0);
        setIntField(term34, term34.getClass(), "numDataElements", 0);
        setField(term34, term34.getClass(), "parent", null);
        setField(term25, term25.getClass(), "parent", term34);
        setField(term16, term16.getClass(), "parent", term25);
        setField(term14, term14.getClass(), "raster", term16);
        setField(term14, term14.getClass(), "osis", null);
        setIntField(term45, term45.getClass(), "hash", 1804259474);
        setField(term45, term45.getClass(), "key", "");
        setField(term45, term45.getClass(), "value", term48);
        setField(term45, term45.getClass(), "next", null);
        setElement(term44, 6, term45);
        setField(term43, term43.getClass(), "table", term44);
        setIntField(term43, term43.getClass(), "count", 1);
        setIntField(term43, term43.getClass(), "threshold", 8);
        setFloatField(term43, term43.getClass(), "loadFactor", 0.75F);
        setIntField(term43, term43.getClass(), "modCount", 1);
        setField(term43, term43.getClass(), "keySet", null);
        setField(term43, term43.getClass(), "entrySet", null);
        setField(term43, term43.getClass(), "values", null);
        setField(term14, term14.getClass(), "properties", term43);
        setFloatField(term14, term14.getClass(), "accelerationPriority", 0.13238746F);
        setField(term14, term14.getClass(), "surfaceManager", null);
        term54 = new Integer(1622346318);
        term56 = new Integer(1048535127);
        term58 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term14;
        args[1] = term54;
        args[2] = term56;
        args[3] = term58;
        args[4] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


