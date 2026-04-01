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

public class Tile_setIndex_19529526249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630;
     Object term696;

    public Tile_setIndex_19529526249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term630 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term631 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term633 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term642 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term651 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term660 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term661 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term662 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term631, term631.getClass(), "imageType", -2066804303);
        setField(term631, term631.getClass(), "colorModel", null);
        setField(term633, term633.getClass(), "sampleModel", null);
        setField(term633, term633.getClass(), "dataBuffer", null);
        setIntField(term633, term633.getClass(), "minX", -1731761810);
        setIntField(term633, term633.getClass(), "minY", 197109649);
        setIntField(term633, term633.getClass(), "width", -1239406390);
        setIntField(term633, term633.getClass(), "height", 1557431527);
        setIntField(term633, term633.getClass(), "sampleModelTranslateX", -1504890659);
        setIntField(term633, term633.getClass(), "sampleModelTranslateY", 1358829571);
        setIntField(term633, term633.getClass(), "numBands", 991356662);
        setIntField(term633, term633.getClass(), "numDataElements", -506958186);
        setField(term642, term642.getClass(), "sampleModel", null);
        setField(term642, term642.getClass(), "dataBuffer", null);
        setIntField(term642, term642.getClass(), "minX", -507387516);
        setIntField(term642, term642.getClass(), "minY", -1970452551);
        setIntField(term642, term642.getClass(), "width", -1896376975);
        setIntField(term642, term642.getClass(), "height", 729658803);
        setIntField(term642, term642.getClass(), "sampleModelTranslateX", 114754804);
        setIntField(term642, term642.getClass(), "sampleModelTranslateY", 1687361082);
        setIntField(term642, term642.getClass(), "numBands", 584893196);
        setIntField(term642, term642.getClass(), "numDataElements", 497269071);
        setField(term651, term651.getClass(), "sampleModel", null);
        setField(term651, term651.getClass(), "dataBuffer", null);
        setIntField(term651, term651.getClass(), "minX", 0);
        setIntField(term651, term651.getClass(), "minY", 0);
        setIntField(term651, term651.getClass(), "width", 0);
        setIntField(term651, term651.getClass(), "height", 0);
        setIntField(term651, term651.getClass(), "sampleModelTranslateX", 0);
        setIntField(term651, term651.getClass(), "sampleModelTranslateY", 0);
        setIntField(term651, term651.getClass(), "numBands", 0);
        setIntField(term651, term651.getClass(), "numDataElements", 0);
        setField(term651, term651.getClass(), "parent", null);
        setField(term642, term642.getClass(), "parent", term651);
        setField(term633, term633.getClass(), "parent", term642);
        setField(term631, term631.getClass(), "raster", term633);
        setField(term631, term631.getClass(), "osis", null);
        setIntField(term662, term662.getClass(), "hash", -1071239264);
        setField(term662, term662.getClass(), "key", null);
        setField(term662, term662.getClass(), "value", null);
        setField(term662, term662.getClass(), "next", null);
        setElement(term661, 6, term662);
        setField(term660, term660.getClass(), "table", term661);
        setIntField(term660, term660.getClass(), "count", 1);
        setIntField(term660, term660.getClass(), "threshold", 8);
        setFloatField(term660, term660.getClass(), "loadFactor", 0.75F);
        setIntField(term660, term660.getClass(), "modCount", 1);
        setField(term660, term660.getClass(), "keySet", null);
        setField(term660, term660.getClass(), "entrySet", null);
        setField(term660, term660.getClass(), "values", null);
        setField(term631, term631.getClass(), "properties", term660);
        setFloatField(term631, term631.getClass(), "accelerationPriority", 0.2857073F);
        setField(term631, term631.getClass(), "surfaceManager", null);
        setField(term630, term630.getClass(), "img", term631);
        setField(term630, term630.getClass(), "name", "RkybSrpybU");
        setIntField(term630, term630.getClass(), "tileIndex", -1882480155);
        setIntField(term630, term630.getClass(), "nextAnimIndex", -1410220680);
        setField(term630, term630.getClass(), "tileDescription", "xOEqzGAmDU");
        setIntField(term630, term630.getClass(), "zoomLevel", 389427431);
        term696 = new Integer(-1945706126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term696;
        callMethod(klass, "setIndex", argTypes, term630, args);
    }

};


