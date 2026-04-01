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

public class Minimap_setDrawPoint_14481620681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38976;
     Object term39060;
     Object term39062;

    public Minimap_setDrawPoint_14481620681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38976 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        Object[] term38980 = (Object[]) newArray("java.awt.image.BufferedImage", 3);
        Object term38981 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term38983 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term38992 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term39001 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term39002 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39008 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39010 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term39019 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term39020 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39026 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39031 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term38976, term38976.getClass(), "size", -132005524);
        setIntField(term38976, term38976.getClass(), "sectorsToShow", -1235127374);
        setIntField(term38976, term38976.getClass(), "sectorSize", -2077814162);
        setIntField(term38981, term38981.getClass(), "imageType", 444514470);
        setField(term38981, term38981.getClass(), "colorModel", null);
        setField(term38983, term38983.getClass(), "sampleModel", null);
        setField(term38983, term38983.getClass(), "dataBuffer", null);
        setIntField(term38983, term38983.getClass(), "minX", -147055177);
        setIntField(term38983, term38983.getClass(), "minY", 1979044375);
        setIntField(term38983, term38983.getClass(), "width", 961252909);
        setIntField(term38983, term38983.getClass(), "height", 1455842357);
        setIntField(term38983, term38983.getClass(), "sampleModelTranslateX", 1349806561);
        setIntField(term38983, term38983.getClass(), "sampleModelTranslateY", 923905351);
        setIntField(term38983, term38983.getClass(), "numBands", 428360161);
        setIntField(term38983, term38983.getClass(), "numDataElements", 631528579);
        setField(term38992, term38992.getClass(), "sampleModel", null);
        setField(term38992, term38992.getClass(), "dataBuffer", null);
        setIntField(term38992, term38992.getClass(), "minX", -1652091834);
        setIntField(term38992, term38992.getClass(), "minY", -282021579);
        setIntField(term38992, term38992.getClass(), "width", -1652588127);
        setIntField(term38992, term38992.getClass(), "height", -1902823385);
        setIntField(term38992, term38992.getClass(), "sampleModelTranslateX", -784924879);
        setIntField(term38992, term38992.getClass(), "sampleModelTranslateY", -1062027102);
        setIntField(term38992, term38992.getClass(), "numBands", 1763217806);
        setIntField(term38992, term38992.getClass(), "numDataElements", 1644949396);
        setField(term38992, term38992.getClass(), "parent", null);
        setField(term38983, term38983.getClass(), "parent", term38992);
        setField(term38981, term38981.getClass(), "raster", term38983);
        setField(term38981, term38981.getClass(), "osis", null);
        setField(term39001, term39001.getClass(), "table", term39002);
        setIntField(term39001, term39001.getClass(), "count", 1);
        setIntField(term39001, term39001.getClass(), "threshold", 8);
        setFloatField(term39001, term39001.getClass(), "loadFactor", 0.75F);
        setIntField(term39001, term39001.getClass(), "modCount", 1);
        setField(term39001, term39001.getClass(), "keySet", null);
        setField(term39001, term39001.getClass(), "entrySet", null);
        setField(term39001, term39001.getClass(), "values", null);
        setField(term38981, term38981.getClass(), "properties", term39001);
        setFloatField(term38981, term38981.getClass(), "accelerationPriority", 0.9459012F);
        setField(term38981, term38981.getClass(), "surfaceManager", null);
        setElement(term38980, 0, term38981);
        setIntField(term39008, term39008.getClass(), "imageType", 522440332);
        setField(term39008, term39008.getClass(), "colorModel", null);
        setField(term39010, term39010.getClass(), "sampleModel", null);
        setField(term39010, term39010.getClass(), "dataBuffer", null);
        setIntField(term39010, term39010.getClass(), "minX", 0);
        setIntField(term39010, term39010.getClass(), "minY", 0);
        setIntField(term39010, term39010.getClass(), "width", 0);
        setIntField(term39010, term39010.getClass(), "height", 0);
        setIntField(term39010, term39010.getClass(), "sampleModelTranslateX", 0);
        setIntField(term39010, term39010.getClass(), "sampleModelTranslateY", 0);
        setIntField(term39010, term39010.getClass(), "numBands", 0);
        setIntField(term39010, term39010.getClass(), "numDataElements", 0);
        setField(term39010, term39010.getClass(), "parent", null);
        setField(term39008, term39008.getClass(), "raster", term39010);
        setField(term39008, term39008.getClass(), "osis", null);
        setField(term39019, term39019.getClass(), "table", term39020);
        setIntField(term39019, term39019.getClass(), "count", 1);
        setIntField(term39019, term39019.getClass(), "threshold", 8);
        setFloatField(term39019, term39019.getClass(), "loadFactor", 0.75F);
        setIntField(term39019, term39019.getClass(), "modCount", 1);
        setField(term39019, term39019.getClass(), "keySet", null);
        setField(term39019, term39019.getClass(), "entrySet", null);
        setField(term39019, term39019.getClass(), "values", null);
        setField(term39008, term39008.getClass(), "properties", term39019);
        setFloatField(term39008, term39008.getClass(), "accelerationPriority", 0.0F);
        setField(term39008, term39008.getClass(), "surfaceManager", null);
        setElement(term38980, 1, term39008);
        setIntField(term39026, term39026.getClass(), "imageType", 0);
        setField(term39026, term39026.getClass(), "colorModel", null);
        setField(term39026, term39026.getClass(), "raster", null);
        setField(term39026, term39026.getClass(), "osis", null);
        setField(term39026, term39026.getClass(), "properties", null);
        setFloatField(term39026, term39026.getClass(), "accelerationPriority", 0.0F);
        setField(term39026, term39026.getClass(), "surfaceManager", null);
        setElement(term38980, 2, term39026);
        setField(term38976, term38976.getClass(), "images", term38980);
        setIntField(term38976, term38976.getClass(), "showImage", 82353584);
        setIntField(term38976, term38976.getClass(), "drawImage", -758778797);
        setIntField(term39031, term39031.getClass(), "maxX", 0);
        setIntField(term39031, term39031.getClass(), "maxY", 0);
        setField(term39031, term39031.getClass(), "tiles", null);
        setField(term39031, term39031.getClass(), "tileInfo", null);
        setField(term39031, term39031.getClass(), "culture", null);
        setIntField(term39031, term39031.getClass(), "cursorX", 0);
        setIntField(term39031, term39031.getClass(), "cursorY", 0);
        setIntField(term39031, term39031.getClass(), "drawX", 0);
        setIntField(term39031, term39031.getClass(), "drawY", 0);
        setField(term39031, term39031.getClass(), "sunList", null);
        setField(term39031, term39031.getClass(), "planetList", null);
        setField(term39031, term39031.getClass(), "ascensionPlanetCoordinate", null);
        setField(term39031, term39031.getClass(), "players", null);
        setIntField(term39031, term39031.getClass(), "turn", 0);
        setField(term39031, term39031.getClass(), "fleetTiles", null);
        setIntField(term39031, term39031.getClass(), "aiTurnNumber", 0);
        setField(term39031, term39031.getClass(), "aiFleet", null);
        setField(term39031, term39031.getClass(), "newsCorpData", null);
        setBooleanField(term39031, term39031.getClass(), "debug", false);
        setIntField(term39031, term39031.getClass(), "scoreVictoryTurn", 0);
        setIntField(term39031, term39031.getClass(), "scoreConquer", 0);
        setIntField(term39031, term39031.getClass(), "scoreCulture", 0);
        setIntField(term39031, term39031.getClass(), "scoreResearch", 0);
        setIntField(term39031, term39031.getClass(), "scoreDiplomacy", 0);
        setIntField(term39031, term39031.getClass(), "scorePopulation", 0);
        setField(term39031, term39031.getClass(), "history", null);
        setField(term39031, term39031.getClass(), "votes", null);
        setBooleanField(term39031, term39031.getClass(), "gameEnd", false);
        setBooleanField(term39031, term39031.getClass(), "humanLost", false);
        setField(term39031, term39031.getClass(), "pirateDifficulty", null);
        setField(term39031, term39031.getClass(), "karmaEvents", null);
        setField(term39031, term39031.getClass(), "ascensionEvents", null);
        setBooleanField(term39031, term39031.getClass(), "tutorialEnabled", false);
        setField(term39031, term39031.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term39031, term39031.getClass(), "allNewsEnabled", false);
        setBooleanField(term39031, term39031.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term39031, term39031.getClass(), "forceRedraw", false);
        setIntField(term39031, term39031.getClass(), "zoomLevel", 0);
        setBooleanField(term39031, term39031.getClass(), "generateFullGame", false);
        setField(term38976, term38976.getClass(), "map", term39031);
        setIntField(term38976, term38976.getClass(), "topX", 765680355);
        setIntField(term38976, term38976.getClass(), "topY", -1012090049);
        setIntField(term38976, term38976.getClass(), "drawX", -2025214553);
        setIntField(term38976, term38976.getClass(), "drawY", -154750730);
        setBooleanField(term38976, term38976.getClass(), "needsUpdate", false);
        term39060 = new Integer(-2047179134);
        term39062 = new Integer(44908093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term39060;
        args[1] = term39062;
        callMethod(klass, "setDrawPoint", argTypes, term38976, args);
    }

};


