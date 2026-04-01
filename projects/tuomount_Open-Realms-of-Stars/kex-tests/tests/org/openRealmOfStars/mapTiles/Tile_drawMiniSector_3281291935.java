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

public class Tile_drawMiniSector_3281291935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240;
     Object term306;
     Object term346;
     Object term348;
     Object term350;

    public Tile_drawMiniSector_3281291935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term241 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term243 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term252 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term261 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term270 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term271 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term272 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term241, term241.getClass(), "imageType", -93135961);
        setField(term241, term241.getClass(), "colorModel", null);
        setField(term243, term243.getClass(), "sampleModel", null);
        setField(term243, term243.getClass(), "dataBuffer", null);
        setIntField(term243, term243.getClass(), "minX", -112921587);
        setIntField(term243, term243.getClass(), "minY", 933028652);
        setIntField(term243, term243.getClass(), "width", 287287233);
        setIntField(term243, term243.getClass(), "height", 962840079);
        setIntField(term243, term243.getClass(), "sampleModelTranslateX", 1540719661);
        setIntField(term243, term243.getClass(), "sampleModelTranslateY", 1265463001);
        setIntField(term243, term243.getClass(), "numBands", 335112684);
        setIntField(term243, term243.getClass(), "numDataElements", 1551099402);
        setField(term252, term252.getClass(), "sampleModel", null);
        setField(term252, term252.getClass(), "dataBuffer", null);
        setIntField(term252, term252.getClass(), "minX", -2027534003);
        setIntField(term252, term252.getClass(), "minY", 1063420942);
        setIntField(term252, term252.getClass(), "width", 1375330971);
        setIntField(term252, term252.getClass(), "height", -478195677);
        setIntField(term252, term252.getClass(), "sampleModelTranslateX", 972867650);
        setIntField(term252, term252.getClass(), "sampleModelTranslateY", 1655935355);
        setIntField(term252, term252.getClass(), "numBands", -481533957);
        setIntField(term252, term252.getClass(), "numDataElements", 1240914516);
        setField(term261, term261.getClass(), "sampleModel", null);
        setField(term261, term261.getClass(), "dataBuffer", null);
        setIntField(term261, term261.getClass(), "minX", 0);
        setIntField(term261, term261.getClass(), "minY", 0);
        setIntField(term261, term261.getClass(), "width", 0);
        setIntField(term261, term261.getClass(), "height", 0);
        setIntField(term261, term261.getClass(), "sampleModelTranslateX", 0);
        setIntField(term261, term261.getClass(), "sampleModelTranslateY", 0);
        setIntField(term261, term261.getClass(), "numBands", 0);
        setIntField(term261, term261.getClass(), "numDataElements", 0);
        setField(term261, term261.getClass(), "parent", null);
        setField(term252, term252.getClass(), "parent", term261);
        setField(term243, term243.getClass(), "parent", term252);
        setField(term241, term241.getClass(), "raster", term243);
        setField(term241, term241.getClass(), "osis", null);
        setIntField(term272, term272.getClass(), "hash", -1540085777);
        setField(term272, term272.getClass(), "key", null);
        setField(term272, term272.getClass(), "value", null);
        setField(term272, term272.getClass(), "next", null);
        setElement(term271, 3, term272);
        setField(term270, term270.getClass(), "table", term271);
        setIntField(term270, term270.getClass(), "count", 1);
        setIntField(term270, term270.getClass(), "threshold", 8);
        setFloatField(term270, term270.getClass(), "loadFactor", 0.75F);
        setIntField(term270, term270.getClass(), "modCount", 1);
        setField(term270, term270.getClass(), "keySet", null);
        setField(term270, term270.getClass(), "entrySet", null);
        setField(term270, term270.getClass(), "values", null);
        setField(term241, term241.getClass(), "properties", term270);
        setFloatField(term241, term241.getClass(), "accelerationPriority", 0.09123778F);
        setField(term241, term241.getClass(), "surfaceManager", null);
        setField(term240, term240.getClass(), "img", term241);
        setField(term240, term240.getClass(), "name", "hRNSzYYIrc");
        setIntField(term240, term240.getClass(), "tileIndex", 1090617576);
        setIntField(term240, term240.getClass(), "nextAnimIndex", -1547384488);
        setField(term240, term240.getClass(), "tileDescription", "RMFIsYGgne");
        setIntField(term240, term240.getClass(), "zoomLevel", 1442160736);
        term306 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term308 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term317 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term326 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term335 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term336 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term337 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term340 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term306, term306.getClass(), "imageType", 1114000454);
        setField(term306, term306.getClass(), "colorModel", null);
        setField(term308, term308.getClass(), "sampleModel", null);
        setField(term308, term308.getClass(), "dataBuffer", null);
        setIntField(term308, term308.getClass(), "minX", -556405712);
        setIntField(term308, term308.getClass(), "minY", -1772434990);
        setIntField(term308, term308.getClass(), "width", -1845499264);
        setIntField(term308, term308.getClass(), "height", -505439934);
        setIntField(term308, term308.getClass(), "sampleModelTranslateX", -344842608);
        setIntField(term308, term308.getClass(), "sampleModelTranslateY", 941650513);
        setIntField(term308, term308.getClass(), "numBands", 444029505);
        setIntField(term308, term308.getClass(), "numDataElements", -1034506028);
        setField(term317, term317.getClass(), "sampleModel", null);
        setField(term317, term317.getClass(), "dataBuffer", null);
        setIntField(term317, term317.getClass(), "minX", -1263114719);
        setIntField(term317, term317.getClass(), "minY", -894662986);
        setIntField(term317, term317.getClass(), "width", 304775596);
        setIntField(term317, term317.getClass(), "height", -1347665717);
        setIntField(term317, term317.getClass(), "sampleModelTranslateX", -1888585309);
        setIntField(term317, term317.getClass(), "sampleModelTranslateY", 683666002);
        setIntField(term317, term317.getClass(), "numBands", 1596213415);
        setIntField(term317, term317.getClass(), "numDataElements", -268815336);
        setField(term326, term326.getClass(), "sampleModel", null);
        setField(term326, term326.getClass(), "dataBuffer", null);
        setIntField(term326, term326.getClass(), "minX", 0);
        setIntField(term326, term326.getClass(), "minY", 0);
        setIntField(term326, term326.getClass(), "width", 0);
        setIntField(term326, term326.getClass(), "height", 0);
        setIntField(term326, term326.getClass(), "sampleModelTranslateX", 0);
        setIntField(term326, term326.getClass(), "sampleModelTranslateY", 0);
        setIntField(term326, term326.getClass(), "numBands", 0);
        setIntField(term326, term326.getClass(), "numDataElements", 0);
        setField(term326, term326.getClass(), "parent", null);
        setField(term317, term317.getClass(), "parent", term326);
        setField(term308, term308.getClass(), "parent", term317);
        setField(term306, term306.getClass(), "raster", term308);
        setField(term306, term306.getClass(), "osis", null);
        setIntField(term337, term337.getClass(), "hash", -1771471902);
        setField(term337, term337.getClass(), "key", "");
        setField(term337, term337.getClass(), "value", term340);
        setField(term337, term337.getClass(), "next", null);
        setElement(term336, 0, term337);
        setField(term335, term335.getClass(), "table", term336);
        setIntField(term335, term335.getClass(), "count", 1);
        setIntField(term335, term335.getClass(), "threshold", 8);
        setFloatField(term335, term335.getClass(), "loadFactor", 0.75F);
        setIntField(term335, term335.getClass(), "modCount", 1);
        setField(term335, term335.getClass(), "keySet", null);
        setField(term335, term335.getClass(), "entrySet", null);
        setField(term335, term335.getClass(), "values", null);
        setField(term306, term306.getClass(), "properties", term335);
        setFloatField(term306, term306.getClass(), "accelerationPriority", 0.5523636F);
        setField(term306, term306.getClass(), "surfaceManager", null);
        term346 = new Integer(-663691365);
        term348 = new Integer(339854490);
        term350 = new Integer(-615654495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term306;
        args[1] = term346;
        args[2] = term348;
        args[3] = term350;
        callMethod(klass, "drawMiniSector", argTypes, term240, args);
    }

};


