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

public class Tile_init_5394056931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term122;

    public Tile_init_5394056931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term84 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term93 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term102 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term111 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term112 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term113 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term116 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term82, term82.getClass(), "imageType", -6029667);
        setField(term82, term82.getClass(), "colorModel", null);
        setField(term84, term84.getClass(), "sampleModel", null);
        setField(term84, term84.getClass(), "dataBuffer", null);
        setIntField(term84, term84.getClass(), "minX", -2068769794);
        setIntField(term84, term84.getClass(), "minY", -117576464);
        setIntField(term84, term84.getClass(), "width", -1007160944);
        setIntField(term84, term84.getClass(), "height", 1135664017);
        setIntField(term84, term84.getClass(), "sampleModelTranslateX", 590364439);
        setIntField(term84, term84.getClass(), "sampleModelTranslateY", 865208305);
        setIntField(term84, term84.getClass(), "numBands", -1275173084);
        setIntField(term84, term84.getClass(), "numDataElements", -244121226);
        setField(term93, term93.getClass(), "sampleModel", null);
        setField(term93, term93.getClass(), "dataBuffer", null);
        setIntField(term93, term93.getClass(), "minX", -203030934);
        setIntField(term93, term93.getClass(), "minY", -1179120542);
        setIntField(term93, term93.getClass(), "width", -73683645);
        setIntField(term93, term93.getClass(), "height", -226514366);
        setIntField(term93, term93.getClass(), "sampleModelTranslateX", 1193880199);
        setIntField(term93, term93.getClass(), "sampleModelTranslateY", -1087774327);
        setIntField(term93, term93.getClass(), "numBands", -1530420153);
        setIntField(term93, term93.getClass(), "numDataElements", -469968304);
        setField(term102, term102.getClass(), "sampleModel", null);
        setField(term102, term102.getClass(), "dataBuffer", null);
        setIntField(term102, term102.getClass(), "minX", 0);
        setIntField(term102, term102.getClass(), "minY", 0);
        setIntField(term102, term102.getClass(), "width", 0);
        setIntField(term102, term102.getClass(), "height", 0);
        setIntField(term102, term102.getClass(), "sampleModelTranslateX", 0);
        setIntField(term102, term102.getClass(), "sampleModelTranslateY", 0);
        setIntField(term102, term102.getClass(), "numBands", 0);
        setIntField(term102, term102.getClass(), "numDataElements", 0);
        setField(term102, term102.getClass(), "parent", null);
        setField(term93, term93.getClass(), "parent", term102);
        setField(term84, term84.getClass(), "parent", term93);
        setField(term82, term82.getClass(), "raster", term84);
        setField(term82, term82.getClass(), "osis", null);
        setIntField(term113, term113.getClass(), "hash", 1033560433);
        setField(term113, term113.getClass(), "key", "");
        setField(term113, term113.getClass(), "value", term116);
        setField(term113, term113.getClass(), "next", null);
        setElement(term112, 4, term113);
        setField(term111, term111.getClass(), "table", term112);
        setIntField(term111, term111.getClass(), "count", 1);
        setIntField(term111, term111.getClass(), "threshold", 8);
        setFloatField(term111, term111.getClass(), "loadFactor", 0.75F);
        setIntField(term111, term111.getClass(), "modCount", 1);
        setField(term111, term111.getClass(), "keySet", null);
        setField(term111, term111.getClass(), "entrySet", null);
        setField(term111, term111.getClass(), "values", null);
        setField(term82, term82.getClass(), "properties", term111);
        setFloatField(term82, term82.getClass(), "accelerationPriority", 0.2707036F);
        setField(term82, term82.getClass(), "surfaceManager", null);
        term122 = new Integer(679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term82;
        args[1] = term122;
        args[2] = "xxtlPwDYFs";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


