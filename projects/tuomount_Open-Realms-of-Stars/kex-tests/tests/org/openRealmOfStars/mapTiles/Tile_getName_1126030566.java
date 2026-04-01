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

public class Tile_getName_1126030566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372;

    public Tile_getName_1126030566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term372 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term373 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term375 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term384 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term393 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term402 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term403 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term404 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term373, term373.getClass(), "imageType", -341962980);
        setField(term373, term373.getClass(), "colorModel", null);
        setField(term375, term375.getClass(), "sampleModel", null);
        setField(term375, term375.getClass(), "dataBuffer", null);
        setIntField(term375, term375.getClass(), "minX", 1532716628);
        setIntField(term375, term375.getClass(), "minY", -1801760683);
        setIntField(term375, term375.getClass(), "width", 1141317871);
        setIntField(term375, term375.getClass(), "height", 890669485);
        setIntField(term375, term375.getClass(), "sampleModelTranslateX", 691577392);
        setIntField(term375, term375.getClass(), "sampleModelTranslateY", -893623680);
        setIntField(term375, term375.getClass(), "numBands", -1963434938);
        setIntField(term375, term375.getClass(), "numDataElements", 906181092);
        setField(term384, term384.getClass(), "sampleModel", null);
        setField(term384, term384.getClass(), "dataBuffer", null);
        setIntField(term384, term384.getClass(), "minX", 1045657203);
        setIntField(term384, term384.getClass(), "minY", 1386130016);
        setIntField(term384, term384.getClass(), "width", 1072005683);
        setIntField(term384, term384.getClass(), "height", 1861318859);
        setIntField(term384, term384.getClass(), "sampleModelTranslateX", 1474524152);
        setIntField(term384, term384.getClass(), "sampleModelTranslateY", 568954359);
        setIntField(term384, term384.getClass(), "numBands", 53410913);
        setIntField(term384, term384.getClass(), "numDataElements", -375014958);
        setField(term393, term393.getClass(), "sampleModel", null);
        setField(term393, term393.getClass(), "dataBuffer", null);
        setIntField(term393, term393.getClass(), "minX", 0);
        setIntField(term393, term393.getClass(), "minY", 0);
        setIntField(term393, term393.getClass(), "width", 0);
        setIntField(term393, term393.getClass(), "height", 0);
        setIntField(term393, term393.getClass(), "sampleModelTranslateX", 0);
        setIntField(term393, term393.getClass(), "sampleModelTranslateY", 0);
        setIntField(term393, term393.getClass(), "numBands", 0);
        setIntField(term393, term393.getClass(), "numDataElements", 0);
        setField(term393, term393.getClass(), "parent", null);
        setField(term384, term384.getClass(), "parent", term393);
        setField(term375, term375.getClass(), "parent", term384);
        setField(term373, term373.getClass(), "raster", term375);
        setField(term373, term373.getClass(), "osis", null);
        setIntField(term404, term404.getClass(), "hash", 102033401);
        setField(term404, term404.getClass(), "key", null);
        setField(term404, term404.getClass(), "value", null);
        setField(term404, term404.getClass(), "next", null);
        setElement(term403, 8, term404);
        setField(term402, term402.getClass(), "table", term403);
        setIntField(term402, term402.getClass(), "count", 1);
        setIntField(term402, term402.getClass(), "threshold", 8);
        setFloatField(term402, term402.getClass(), "loadFactor", 0.75F);
        setIntField(term402, term402.getClass(), "modCount", 1);
        setField(term402, term402.getClass(), "keySet", null);
        setField(term402, term402.getClass(), "entrySet", null);
        setField(term402, term402.getClass(), "values", null);
        setField(term373, term373.getClass(), "properties", term402);
        setFloatField(term373, term373.getClass(), "accelerationPriority", 0.8564069F);
        setField(term373, term373.getClass(), "surfaceManager", null);
        setField(term372, term372.getClass(), "img", term373);
        setField(term372, term372.getClass(), "name", "MxlszYVzRf");
        setIntField(term372, term372.getClass(), "tileIndex", 480137250);
        setIntField(term372, term372.getClass(), "nextAnimIndex", -341152642);
        setField(term372, term372.getClass(), "tileDescription", "LQFpaHEwXR");
        setIntField(term372, term372.getClass(), "zoomLevel", -2015854073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term372, args);
    }

};


