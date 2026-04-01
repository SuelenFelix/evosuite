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
import java.lang.Integer;

public class Minimap_updateMapX_109269911311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41027;
     Object term41108;

    public Minimap_updateMapX_109269911311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41027 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        Object[] term41031 = (Object[]) newArray("java.awt.image.BufferedImage", 2);
        Object term41032 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term41034 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term41043 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term41052 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term41053 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term41059 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term41061 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term41070 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term41071 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term41079 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term41027, term41027.getClass(), "size", 218346781);
        setIntField(term41027, term41027.getClass(), "sectorsToShow", -984660976);
        setIntField(term41027, term41027.getClass(), "sectorSize", -1419341969);
        setIntField(term41032, term41032.getClass(), "imageType", -89522625);
        setField(term41032, term41032.getClass(), "colorModel", null);
        setField(term41034, term41034.getClass(), "sampleModel", null);
        setField(term41034, term41034.getClass(), "dataBuffer", null);
        setIntField(term41034, term41034.getClass(), "minX", 1475906894);
        setIntField(term41034, term41034.getClass(), "minY", -2004794532);
        setIntField(term41034, term41034.getClass(), "width", 1232958763);
        setIntField(term41034, term41034.getClass(), "height", -1702132549);
        setIntField(term41034, term41034.getClass(), "sampleModelTranslateX", -1786136772);
        setIntField(term41034, term41034.getClass(), "sampleModelTranslateY", -1510967747);
        setIntField(term41034, term41034.getClass(), "numBands", -2014792457);
        setIntField(term41034, term41034.getClass(), "numDataElements", 1957633116);
        setField(term41043, term41043.getClass(), "sampleModel", null);
        setField(term41043, term41043.getClass(), "dataBuffer", null);
        setIntField(term41043, term41043.getClass(), "minX", 1428598210);
        setIntField(term41043, term41043.getClass(), "minY", 1071776561);
        setIntField(term41043, term41043.getClass(), "width", 1846399918);
        setIntField(term41043, term41043.getClass(), "height", 35388821);
        setIntField(term41043, term41043.getClass(), "sampleModelTranslateX", -598803400);
        setIntField(term41043, term41043.getClass(), "sampleModelTranslateY", 25560022);
        setIntField(term41043, term41043.getClass(), "numBands", -1090136985);
        setIntField(term41043, term41043.getClass(), "numDataElements", -355574894);
        setField(term41043, term41043.getClass(), "parent", null);
        setField(term41034, term41034.getClass(), "parent", term41043);
        setField(term41032, term41032.getClass(), "raster", term41034);
        setField(term41032, term41032.getClass(), "osis", null);
        setField(term41052, term41052.getClass(), "table", term41053);
        setIntField(term41052, term41052.getClass(), "count", 1);
        setIntField(term41052, term41052.getClass(), "threshold", 8);
        setFloatField(term41052, term41052.getClass(), "loadFactor", 0.75F);
        setIntField(term41052, term41052.getClass(), "modCount", 1);
        setField(term41052, term41052.getClass(), "keySet", null);
        setField(term41052, term41052.getClass(), "entrySet", null);
        setField(term41052, term41052.getClass(), "values", null);
        setField(term41032, term41032.getClass(), "properties", term41052);
        setFloatField(term41032, term41032.getClass(), "accelerationPriority", 0.0042077303F);
        setField(term41032, term41032.getClass(), "surfaceManager", null);
        setElement(term41031, 0, term41032);
        setIntField(term41059, term41059.getClass(), "imageType", 1697296048);
        setField(term41059, term41059.getClass(), "colorModel", null);
        setField(term41061, term41061.getClass(), "sampleModel", null);
        setField(term41061, term41061.getClass(), "dataBuffer", null);
        setIntField(term41061, term41061.getClass(), "minX", 0);
        setIntField(term41061, term41061.getClass(), "minY", 0);
        setIntField(term41061, term41061.getClass(), "width", 0);
        setIntField(term41061, term41061.getClass(), "height", 0);
        setIntField(term41061, term41061.getClass(), "sampleModelTranslateX", 0);
        setIntField(term41061, term41061.getClass(), "sampleModelTranslateY", 0);
        setIntField(term41061, term41061.getClass(), "numBands", 0);
        setIntField(term41061, term41061.getClass(), "numDataElements", 0);
        setField(term41061, term41061.getClass(), "parent", null);
        setField(term41059, term41059.getClass(), "raster", term41061);
        setField(term41059, term41059.getClass(), "osis", null);
        setField(term41070, term41070.getClass(), "table", term41071);
        setIntField(term41070, term41070.getClass(), "count", 1);
        setIntField(term41070, term41070.getClass(), "threshold", 8);
        setFloatField(term41070, term41070.getClass(), "loadFactor", 0.75F);
        setIntField(term41070, term41070.getClass(), "modCount", 1);
        setField(term41070, term41070.getClass(), "keySet", null);
        setField(term41070, term41070.getClass(), "entrySet", null);
        setField(term41070, term41070.getClass(), "values", null);
        setField(term41059, term41059.getClass(), "properties", term41070);
        setFloatField(term41059, term41059.getClass(), "accelerationPriority", 0.0F);
        setField(term41059, term41059.getClass(), "surfaceManager", null);
        setElement(term41031, 1, term41059);
        setField(term41027, term41027.getClass(), "images", term41031);
        setIntField(term41027, term41027.getClass(), "showImage", 1238707613);
        setIntField(term41027, term41027.getClass(), "drawImage", 1961351136);
        setIntField(term41079, term41079.getClass(), "maxX", 0);
        setIntField(term41079, term41079.getClass(), "maxY", 0);
        setField(term41079, term41079.getClass(), "tiles", null);
        setField(term41079, term41079.getClass(), "tileInfo", null);
        setField(term41079, term41079.getClass(), "culture", null);
        setIntField(term41079, term41079.getClass(), "cursorX", 0);
        setIntField(term41079, term41079.getClass(), "cursorY", 0);
        setIntField(term41079, term41079.getClass(), "drawX", 0);
        setIntField(term41079, term41079.getClass(), "drawY", 0);
        setField(term41079, term41079.getClass(), "sunList", null);
        setField(term41079, term41079.getClass(), "planetList", null);
        setField(term41079, term41079.getClass(), "ascensionPlanetCoordinate", null);
        setField(term41079, term41079.getClass(), "players", null);
        setIntField(term41079, term41079.getClass(), "turn", 0);
        setField(term41079, term41079.getClass(), "fleetTiles", null);
        setIntField(term41079, term41079.getClass(), "aiTurnNumber", 0);
        setField(term41079, term41079.getClass(), "aiFleet", null);
        setField(term41079, term41079.getClass(), "newsCorpData", null);
        setBooleanField(term41079, term41079.getClass(), "debug", false);
        setIntField(term41079, term41079.getClass(), "scoreVictoryTurn", 0);
        setIntField(term41079, term41079.getClass(), "scoreConquer", 0);
        setIntField(term41079, term41079.getClass(), "scoreCulture", 0);
        setIntField(term41079, term41079.getClass(), "scoreResearch", 0);
        setIntField(term41079, term41079.getClass(), "scoreDiplomacy", 0);
        setIntField(term41079, term41079.getClass(), "scorePopulation", 0);
        setField(term41079, term41079.getClass(), "history", null);
        setField(term41079, term41079.getClass(), "votes", null);
        setBooleanField(term41079, term41079.getClass(), "gameEnd", false);
        setBooleanField(term41079, term41079.getClass(), "humanLost", false);
        setField(term41079, term41079.getClass(), "pirateDifficulty", null);
        setField(term41079, term41079.getClass(), "karmaEvents", null);
        setField(term41079, term41079.getClass(), "ascensionEvents", null);
        setBooleanField(term41079, term41079.getClass(), "tutorialEnabled", false);
        setField(term41079, term41079.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term41079, term41079.getClass(), "allNewsEnabled", false);
        setBooleanField(term41079, term41079.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term41079, term41079.getClass(), "forceRedraw", false);
        setIntField(term41079, term41079.getClass(), "zoomLevel", 0);
        setBooleanField(term41079, term41079.getClass(), "generateFullGame", false);
        setField(term41027, term41027.getClass(), "map", term41079);
        setIntField(term41027, term41027.getClass(), "topX", -1546528470);
        setIntField(term41027, term41027.getClass(), "topY", -1518971561);
        setIntField(term41027, term41027.getClass(), "drawX", 1513663171);
        setIntField(term41027, term41027.getClass(), "drawY", 1527034193);
        setBooleanField(term41027, term41027.getClass(), "needsUpdate", true);
        term41108 = new Integer(1309545946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term41108;
        callMethod(klass, "updateMapX", argTypes, term41027, args);
    }

};


