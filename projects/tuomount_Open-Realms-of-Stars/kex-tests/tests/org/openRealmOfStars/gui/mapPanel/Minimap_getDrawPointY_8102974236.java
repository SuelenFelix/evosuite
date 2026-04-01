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

public class Minimap_getDrawPointY_8102974236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39970;

    public Minimap_getDrawPointY_8102974236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39970 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        Object[] term39974 = (Object[]) newArray("java.awt.image.BufferedImage", 3);
        Object term39975 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39977 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term39986 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term39995 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term39996 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term40002 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term40004 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term40013 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term40014 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term40020 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term40025 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term39970, term39970.getClass(), "size", 1641342112);
        setIntField(term39970, term39970.getClass(), "sectorsToShow", -1551790945);
        setIntField(term39970, term39970.getClass(), "sectorSize", 2039538484);
        setIntField(term39975, term39975.getClass(), "imageType", 1235736068);
        setField(term39975, term39975.getClass(), "colorModel", null);
        setField(term39977, term39977.getClass(), "sampleModel", null);
        setField(term39977, term39977.getClass(), "dataBuffer", null);
        setIntField(term39977, term39977.getClass(), "minX", 329424176);
        setIntField(term39977, term39977.getClass(), "minY", -1897199214);
        setIntField(term39977, term39977.getClass(), "width", -1016478729);
        setIntField(term39977, term39977.getClass(), "height", -206889003);
        setIntField(term39977, term39977.getClass(), "sampleModelTranslateX", 638046409);
        setIntField(term39977, term39977.getClass(), "sampleModelTranslateY", 427274898);
        setIntField(term39977, term39977.getClass(), "numBands", -1654552020);
        setIntField(term39977, term39977.getClass(), "numDataElements", -1049546692);
        setField(term39986, term39986.getClass(), "sampleModel", null);
        setField(term39986, term39986.getClass(), "dataBuffer", null);
        setIntField(term39986, term39986.getClass(), "minX", 1397781598);
        setIntField(term39986, term39986.getClass(), "minY", -44720365);
        setIntField(term39986, term39986.getClass(), "width", 1963632911);
        setIntField(term39986, term39986.getClass(), "height", -1100497683);
        setIntField(term39986, term39986.getClass(), "sampleModelTranslateX", 155423433);
        setIntField(term39986, term39986.getClass(), "sampleModelTranslateY", -815471632);
        setIntField(term39986, term39986.getClass(), "numBands", -1469668708);
        setIntField(term39986, term39986.getClass(), "numDataElements", 1796950482);
        setField(term39986, term39986.getClass(), "parent", null);
        setField(term39977, term39977.getClass(), "parent", term39986);
        setField(term39975, term39975.getClass(), "raster", term39977);
        setField(term39975, term39975.getClass(), "osis", null);
        setField(term39995, term39995.getClass(), "table", term39996);
        setIntField(term39995, term39995.getClass(), "count", 1);
        setIntField(term39995, term39995.getClass(), "threshold", 8);
        setFloatField(term39995, term39995.getClass(), "loadFactor", 0.75F);
        setIntField(term39995, term39995.getClass(), "modCount", 1);
        setField(term39995, term39995.getClass(), "keySet", null);
        setField(term39995, term39995.getClass(), "entrySet", null);
        setField(term39995, term39995.getClass(), "values", null);
        setField(term39975, term39975.getClass(), "properties", term39995);
        setFloatField(term39975, term39975.getClass(), "accelerationPriority", 0.21062022F);
        setField(term39975, term39975.getClass(), "surfaceManager", null);
        setElement(term39974, 0, term39975);
        setIntField(term40002, term40002.getClass(), "imageType", 657342039);
        setField(term40002, term40002.getClass(), "colorModel", null);
        setField(term40004, term40004.getClass(), "sampleModel", null);
        setField(term40004, term40004.getClass(), "dataBuffer", null);
        setIntField(term40004, term40004.getClass(), "minX", 0);
        setIntField(term40004, term40004.getClass(), "minY", 0);
        setIntField(term40004, term40004.getClass(), "width", 0);
        setIntField(term40004, term40004.getClass(), "height", 0);
        setIntField(term40004, term40004.getClass(), "sampleModelTranslateX", 0);
        setIntField(term40004, term40004.getClass(), "sampleModelTranslateY", 0);
        setIntField(term40004, term40004.getClass(), "numBands", 0);
        setIntField(term40004, term40004.getClass(), "numDataElements", 0);
        setField(term40004, term40004.getClass(), "parent", null);
        setField(term40002, term40002.getClass(), "raster", term40004);
        setField(term40002, term40002.getClass(), "osis", null);
        setField(term40013, term40013.getClass(), "table", term40014);
        setIntField(term40013, term40013.getClass(), "count", 1);
        setIntField(term40013, term40013.getClass(), "threshold", 8);
        setFloatField(term40013, term40013.getClass(), "loadFactor", 0.75F);
        setIntField(term40013, term40013.getClass(), "modCount", 1);
        setField(term40013, term40013.getClass(), "keySet", null);
        setField(term40013, term40013.getClass(), "entrySet", null);
        setField(term40013, term40013.getClass(), "values", null);
        setField(term40002, term40002.getClass(), "properties", term40013);
        setFloatField(term40002, term40002.getClass(), "accelerationPriority", 0.0F);
        setField(term40002, term40002.getClass(), "surfaceManager", null);
        setElement(term39974, 1, term40002);
        setIntField(term40020, term40020.getClass(), "imageType", 0);
        setField(term40020, term40020.getClass(), "colorModel", null);
        setField(term40020, term40020.getClass(), "raster", null);
        setField(term40020, term40020.getClass(), "osis", null);
        setField(term40020, term40020.getClass(), "properties", null);
        setFloatField(term40020, term40020.getClass(), "accelerationPriority", 0.0F);
        setField(term40020, term40020.getClass(), "surfaceManager", null);
        setElement(term39974, 2, term40020);
        setField(term39970, term39970.getClass(), "images", term39974);
        setIntField(term39970, term39970.getClass(), "showImage", 1871761182);
        setIntField(term39970, term39970.getClass(), "drawImage", 233983728);
        setIntField(term40025, term40025.getClass(), "maxX", 0);
        setIntField(term40025, term40025.getClass(), "maxY", 0);
        setField(term40025, term40025.getClass(), "tiles", null);
        setField(term40025, term40025.getClass(), "tileInfo", null);
        setField(term40025, term40025.getClass(), "culture", null);
        setIntField(term40025, term40025.getClass(), "cursorX", 0);
        setIntField(term40025, term40025.getClass(), "cursorY", 0);
        setIntField(term40025, term40025.getClass(), "drawX", 0);
        setIntField(term40025, term40025.getClass(), "drawY", 0);
        setField(term40025, term40025.getClass(), "sunList", null);
        setField(term40025, term40025.getClass(), "planetList", null);
        setField(term40025, term40025.getClass(), "ascensionPlanetCoordinate", null);
        setField(term40025, term40025.getClass(), "players", null);
        setIntField(term40025, term40025.getClass(), "turn", 0);
        setField(term40025, term40025.getClass(), "fleetTiles", null);
        setIntField(term40025, term40025.getClass(), "aiTurnNumber", 0);
        setField(term40025, term40025.getClass(), "aiFleet", null);
        setField(term40025, term40025.getClass(), "newsCorpData", null);
        setBooleanField(term40025, term40025.getClass(), "debug", false);
        setIntField(term40025, term40025.getClass(), "scoreVictoryTurn", 0);
        setIntField(term40025, term40025.getClass(), "scoreConquer", 0);
        setIntField(term40025, term40025.getClass(), "scoreCulture", 0);
        setIntField(term40025, term40025.getClass(), "scoreResearch", 0);
        setIntField(term40025, term40025.getClass(), "scoreDiplomacy", 0);
        setIntField(term40025, term40025.getClass(), "scorePopulation", 0);
        setField(term40025, term40025.getClass(), "history", null);
        setField(term40025, term40025.getClass(), "votes", null);
        setBooleanField(term40025, term40025.getClass(), "gameEnd", false);
        setBooleanField(term40025, term40025.getClass(), "humanLost", false);
        setField(term40025, term40025.getClass(), "pirateDifficulty", null);
        setField(term40025, term40025.getClass(), "karmaEvents", null);
        setField(term40025, term40025.getClass(), "ascensionEvents", null);
        setBooleanField(term40025, term40025.getClass(), "tutorialEnabled", false);
        setField(term40025, term40025.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term40025, term40025.getClass(), "allNewsEnabled", false);
        setBooleanField(term40025, term40025.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term40025, term40025.getClass(), "forceRedraw", false);
        setIntField(term40025, term40025.getClass(), "zoomLevel", 0);
        setBooleanField(term40025, term40025.getClass(), "generateFullGame", false);
        setField(term39970, term39970.getClass(), "map", term40025);
        setIntField(term39970, term39970.getClass(), "topX", -1650132476);
        setIntField(term39970, term39970.getClass(), "topY", 1719680265);
        setIntField(term39970, term39970.getClass(), "drawX", -1890898783);
        setIntField(term39970, term39970.getClass(), "drawY", 1357632911);
        setBooleanField(term39970, term39970.getClass(), "needsUpdate", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDrawPointY", argTypes, term39970, args);
    }

};


