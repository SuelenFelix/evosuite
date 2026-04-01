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

public class Tile_getAnimationIndex_179840862610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718;

    public Tile_getAnimationIndex_179840862610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term718 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term719 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term721 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term730 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term739 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term748 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term749 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term750 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term719, term719.getClass(), "imageType", -1667990367);
        setField(term719, term719.getClass(), "colorModel", null);
        setField(term721, term721.getClass(), "sampleModel", null);
        setField(term721, term721.getClass(), "dataBuffer", null);
        setIntField(term721, term721.getClass(), "minX", -1214628358);
        setIntField(term721, term721.getClass(), "minY", 1102721075);
        setIntField(term721, term721.getClass(), "width", -426764678);
        setIntField(term721, term721.getClass(), "height", -1222614956);
        setIntField(term721, term721.getClass(), "sampleModelTranslateX", -1870495012);
        setIntField(term721, term721.getClass(), "sampleModelTranslateY", -1310015129);
        setIntField(term721, term721.getClass(), "numBands", -2104981311);
        setIntField(term721, term721.getClass(), "numDataElements", -571169753);
        setField(term730, term730.getClass(), "sampleModel", null);
        setField(term730, term730.getClass(), "dataBuffer", null);
        setIntField(term730, term730.getClass(), "minX", 318591690);
        setIntField(term730, term730.getClass(), "minY", -165587447);
        setIntField(term730, term730.getClass(), "width", -1347358701);
        setIntField(term730, term730.getClass(), "height", 806595993);
        setIntField(term730, term730.getClass(), "sampleModelTranslateX", 548228925);
        setIntField(term730, term730.getClass(), "sampleModelTranslateY", -749861210);
        setIntField(term730, term730.getClass(), "numBands", 1694224101);
        setIntField(term730, term730.getClass(), "numDataElements", 937859191);
        setField(term739, term739.getClass(), "sampleModel", null);
        setField(term739, term739.getClass(), "dataBuffer", null);
        setIntField(term739, term739.getClass(), "minX", 0);
        setIntField(term739, term739.getClass(), "minY", 0);
        setIntField(term739, term739.getClass(), "width", 0);
        setIntField(term739, term739.getClass(), "height", 0);
        setIntField(term739, term739.getClass(), "sampleModelTranslateX", 0);
        setIntField(term739, term739.getClass(), "sampleModelTranslateY", 0);
        setIntField(term739, term739.getClass(), "numBands", 0);
        setIntField(term739, term739.getClass(), "numDataElements", 0);
        setField(term739, term739.getClass(), "parent", null);
        setField(term730, term730.getClass(), "parent", term739);
        setField(term721, term721.getClass(), "parent", term730);
        setField(term719, term719.getClass(), "raster", term721);
        setField(term719, term719.getClass(), "osis", null);
        setIntField(term750, term750.getClass(), "hash", 1217572167);
        setField(term750, term750.getClass(), "key", null);
        setField(term750, term750.getClass(), "value", null);
        setField(term750, term750.getClass(), "next", null);
        setElement(term749, 9, term750);
        setField(term748, term748.getClass(), "table", term749);
        setIntField(term748, term748.getClass(), "count", 1);
        setIntField(term748, term748.getClass(), "threshold", 8);
        setFloatField(term748, term748.getClass(), "loadFactor", 0.75F);
        setIntField(term748, term748.getClass(), "modCount", 1);
        setField(term748, term748.getClass(), "keySet", null);
        setField(term748, term748.getClass(), "entrySet", null);
        setField(term748, term748.getClass(), "values", null);
        setField(term719, term719.getClass(), "properties", term748);
        setFloatField(term719, term719.getClass(), "accelerationPriority", 0.6880585F);
        setField(term719, term719.getClass(), "surfaceManager", null);
        setField(term718, term718.getClass(), "img", term719);
        setField(term718, term718.getClass(), "name", "BYqFIqCKAV");
        setIntField(term718, term718.getClass(), "tileIndex", -2131181468);
        setIntField(term718, term718.getClass(), "nextAnimIndex", 282916351);
        setField(term718, term718.getClass(), "tileDescription", "vrQLuWIDJX");
        setIntField(term718, term718.getClass(), "zoomLevel", 880977281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnimationIndex", argTypes, term718, args);
    }

};


