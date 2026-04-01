package org.openRealmOfStars.gui.mapPanel;

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
import static org.openRealmOfStars.gui.mapPanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Minimap_getDrawPointX_8102983845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39883;

    public Minimap_getDrawPointX_8102983845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39883 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        Object[] term39887 = (Object[]) newArray("java.awt.image.BufferedImage", 4);
        Object term39888 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39890 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term39899 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term39908 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term39909 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39915 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39917 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term39926 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term39927 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39933 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39936 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39941 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term39883, term39883.getClass(), "size", -1606698075);
        setIntField(term39883, term39883.getClass(), "sectorsToShow", 90996421);
        setIntField(term39883, term39883.getClass(), "sectorSize", -1805802783);
        setIntField(term39888, term39888.getClass(), "imageType", -529831900);
        setField(term39888, term39888.getClass(), "colorModel", null);
        setField(term39890, term39890.getClass(), "sampleModel", null);
        setField(term39890, term39890.getClass(), "dataBuffer", null);
        setIntField(term39890, term39890.getClass(), "minX", 1574493440);
        setIntField(term39890, term39890.getClass(), "minY", 1854694585);
        setIntField(term39890, term39890.getClass(), "width", -1260562836);
        setIntField(term39890, term39890.getClass(), "height", 694100722);
        setIntField(term39890, term39890.getClass(), "sampleModelTranslateX", -680529431);
        setIntField(term39890, term39890.getClass(), "sampleModelTranslateY", 212698793);
        setIntField(term39890, term39890.getClass(), "numBands", 1169519385);
        setIntField(term39890, term39890.getClass(), "numDataElements", 1846078344);
        setField(term39899, term39899.getClass(), "sampleModel", null);
        setField(term39899, term39899.getClass(), "dataBuffer", null);
        setIntField(term39899, term39899.getClass(), "minX", 1692543802);
        setIntField(term39899, term39899.getClass(), "minY", 376341151);
        setIntField(term39899, term39899.getClass(), "width", -1607267243);
        setIntField(term39899, term39899.getClass(), "height", 1641377218);
        setIntField(term39899, term39899.getClass(), "sampleModelTranslateX", 1235375204);
        setIntField(term39899, term39899.getClass(), "sampleModelTranslateY", 258334639);
        setIntField(term39899, term39899.getClass(), "numBands", 1432187207);
        setIntField(term39899, term39899.getClass(), "numDataElements", -91068927);
        setField(term39899, term39899.getClass(), "parent", null);
        setField(term39890, term39890.getClass(), "parent", term39899);
        setField(term39888, term39888.getClass(), "raster", term39890);
        setField(term39888, term39888.getClass(), "osis", null);
        setField(term39908, term39908.getClass(), "table", term39909);
        setIntField(term39908, term39908.getClass(), "count", 1);
        setIntField(term39908, term39908.getClass(), "threshold", 8);
        setFloatField(term39908, term39908.getClass(), "loadFactor", 0.75F);
        setIntField(term39908, term39908.getClass(), "modCount", 1);
        setField(term39908, term39908.getClass(), "keySet", null);
        setField(term39908, term39908.getClass(), "entrySet", null);
        setField(term39908, term39908.getClass(), "values", null);
        setField(term39888, term39888.getClass(), "properties", term39908);
        setFloatField(term39888, term39888.getClass(), "accelerationPriority", 0.44298923F);
        setField(term39888, term39888.getClass(), "surfaceManager", null);
        setElement(term39887, 0, term39888);
        setIntField(term39915, term39915.getClass(), "imageType", 385297023);
        setField(term39915, term39915.getClass(), "colorModel", null);
        setField(term39917, term39917.getClass(), "sampleModel", null);
        setField(term39917, term39917.getClass(), "dataBuffer", null);
        setIntField(term39917, term39917.getClass(), "minX", 0);
        setIntField(term39917, term39917.getClass(), "minY", 0);
        setIntField(term39917, term39917.getClass(), "width", 0);
        setIntField(term39917, term39917.getClass(), "height", 0);
        setIntField(term39917, term39917.getClass(), "sampleModelTranslateX", 0);
        setIntField(term39917, term39917.getClass(), "sampleModelTranslateY", 0);
        setIntField(term39917, term39917.getClass(), "numBands", 0);
        setIntField(term39917, term39917.getClass(), "numDataElements", 0);
        setField(term39917, term39917.getClass(), "parent", null);
        setField(term39915, term39915.getClass(), "raster", term39917);
        setField(term39915, term39915.getClass(), "osis", null);
        setField(term39926, term39926.getClass(), "table", term39927);
        setIntField(term39926, term39926.getClass(), "count", 1);
        setIntField(term39926, term39926.getClass(), "threshold", 8);
        setFloatField(term39926, term39926.getClass(), "loadFactor", 0.75F);
        setIntField(term39926, term39926.getClass(), "modCount", 1);
        setField(term39926, term39926.getClass(), "keySet", null);
        setField(term39926, term39926.getClass(), "entrySet", null);
        setField(term39926, term39926.getClass(), "values", null);
        setField(term39915, term39915.getClass(), "properties", term39926);
        setFloatField(term39915, term39915.getClass(), "accelerationPriority", 0.0F);
        setField(term39915, term39915.getClass(), "surfaceManager", null);
        setElement(term39887, 1, term39915);
        setIntField(term39933, term39933.getClass(), "imageType", 0);
        setField(term39933, term39933.getClass(), "colorModel", null);
        setField(term39933, term39933.getClass(), "raster", null);
        setField(term39933, term39933.getClass(), "osis", null);
        setField(term39933, term39933.getClass(), "properties", null);
        setFloatField(term39933, term39933.getClass(), "accelerationPriority", 0.0F);
        setField(term39933, term39933.getClass(), "surfaceManager", null);
        setElement(term39887, 2, term39933);
        setIntField(term39936, term39936.getClass(), "imageType", 0);
        setField(term39936, term39936.getClass(), "colorModel", null);
        setField(term39936, term39936.getClass(), "raster", null);
        setField(term39936, term39936.getClass(), "osis", null);
        setField(term39936, term39936.getClass(), "properties", null);
        setFloatField(term39936, term39936.getClass(), "accelerationPriority", 0.0F);
        setField(term39936, term39936.getClass(), "surfaceManager", null);
        setElement(term39887, 3, term39936);
        setField(term39883, term39883.getClass(), "images", term39887);
        setIntField(term39883, term39883.getClass(), "showImage", -1703642288);
        setIntField(term39883, term39883.getClass(), "drawImage", 2075139747);
        setIntField(term39941, term39941.getClass(), "maxX", 0);
        setIntField(term39941, term39941.getClass(), "maxY", 0);
        setField(term39941, term39941.getClass(), "tiles", null);
        setField(term39941, term39941.getClass(), "tileInfo", null);
        setField(term39941, term39941.getClass(), "culture", null);
        setIntField(term39941, term39941.getClass(), "cursorX", 0);
        setIntField(term39941, term39941.getClass(), "cursorY", 0);
        setIntField(term39941, term39941.getClass(), "drawX", 0);
        setIntField(term39941, term39941.getClass(), "drawY", 0);
        setField(term39941, term39941.getClass(), "sunList", null);
        setField(term39941, term39941.getClass(), "planetList", null);
        setField(term39941, term39941.getClass(), "ascensionPlanetCoordinate", null);
        setField(term39941, term39941.getClass(), "players", null);
        setIntField(term39941, term39941.getClass(), "turn", 0);
        setField(term39941, term39941.getClass(), "fleetTiles", null);
        setIntField(term39941, term39941.getClass(), "aiTurnNumber", 0);
        setField(term39941, term39941.getClass(), "aiFleet", null);
        setField(term39941, term39941.getClass(), "newsCorpData", null);
        setBooleanField(term39941, term39941.getClass(), "debug", false);
        setIntField(term39941, term39941.getClass(), "scoreVictoryTurn", 0);
        setIntField(term39941, term39941.getClass(), "scoreConquer", 0);
        setIntField(term39941, term39941.getClass(), "scoreCulture", 0);
        setIntField(term39941, term39941.getClass(), "scoreResearch", 0);
        setIntField(term39941, term39941.getClass(), "scoreDiplomacy", 0);
        setIntField(term39941, term39941.getClass(), "scorePopulation", 0);
        setField(term39941, term39941.getClass(), "history", null);
        setField(term39941, term39941.getClass(), "votes", null);
        setBooleanField(term39941, term39941.getClass(), "gameEnd", false);
        setBooleanField(term39941, term39941.getClass(), "humanLost", false);
        setField(term39941, term39941.getClass(), "pirateDifficulty", null);
        setField(term39941, term39941.getClass(), "karmaEvents", null);
        setField(term39941, term39941.getClass(), "ascensionEvents", null);
        setBooleanField(term39941, term39941.getClass(), "tutorialEnabled", false);
        setField(term39941, term39941.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term39941, term39941.getClass(), "allNewsEnabled", false);
        setBooleanField(term39941, term39941.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term39941, term39941.getClass(), "forceRedraw", false);
        setIntField(term39941, term39941.getClass(), "zoomLevel", 0);
        setBooleanField(term39941, term39941.getClass(), "generateFullGame", false);
        setField(term39883, term39883.getClass(), "map", term39941);
        setIntField(term39883, term39883.getClass(), "topX", 2092881418);
        setIntField(term39883, term39883.getClass(), "topY", 1732410866);
        setIntField(term39883, term39883.getClass(), "drawX", 1084102599);
        setIntField(term39883, term39883.getClass(), "drawY", -1743503755);
        setBooleanField(term39883, term39883.getClass(), "needsUpdate", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDrawPointX", argTypes, term39883, args);
    }

};


