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

public class Minimap_getCenterX_15538576593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39712;

    public Minimap_getCenterX_15538576593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39712 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        Object[] term39716 = (Object[]) newArray("java.awt.image.BufferedImage", 5);
        Object term39717 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39719 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term39728 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term39737 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term39738 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39744 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39746 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term39755 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term39756 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39762 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39765 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39768 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39773 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term39712, term39712.getClass(), "size", -1458890291);
        setIntField(term39712, term39712.getClass(), "sectorsToShow", 1016087323);
        setIntField(term39712, term39712.getClass(), "sectorSize", 1957748979);
        setIntField(term39717, term39717.getClass(), "imageType", -1290093259);
        setField(term39717, term39717.getClass(), "colorModel", null);
        setField(term39719, term39719.getClass(), "sampleModel", null);
        setField(term39719, term39719.getClass(), "dataBuffer", null);
        setIntField(term39719, term39719.getClass(), "minX", -1200934890);
        setIntField(term39719, term39719.getClass(), "minY", 1765633108);
        setIntField(term39719, term39719.getClass(), "width", 1312888741);
        setIntField(term39719, term39719.getClass(), "height", -1443680397);
        setIntField(term39719, term39719.getClass(), "sampleModelTranslateX", -1331169079);
        setIntField(term39719, term39719.getClass(), "sampleModelTranslateY", 1109050836);
        setIntField(term39719, term39719.getClass(), "numBands", 1978065000);
        setIntField(term39719, term39719.getClass(), "numDataElements", -2121133707);
        setField(term39728, term39728.getClass(), "sampleModel", null);
        setField(term39728, term39728.getClass(), "dataBuffer", null);
        setIntField(term39728, term39728.getClass(), "minX", -1005498887);
        setIntField(term39728, term39728.getClass(), "minY", 1329150584);
        setIntField(term39728, term39728.getClass(), "width", -1825382367);
        setIntField(term39728, term39728.getClass(), "height", -1791371074);
        setIntField(term39728, term39728.getClass(), "sampleModelTranslateX", -1151122332);
        setIntField(term39728, term39728.getClass(), "sampleModelTranslateY", 953387911);
        setIntField(term39728, term39728.getClass(), "numBands", -1550025613);
        setIntField(term39728, term39728.getClass(), "numDataElements", 814617314);
        setField(term39728, term39728.getClass(), "parent", null);
        setField(term39719, term39719.getClass(), "parent", term39728);
        setField(term39717, term39717.getClass(), "raster", term39719);
        setField(term39717, term39717.getClass(), "osis", null);
        setField(term39737, term39737.getClass(), "table", term39738);
        setIntField(term39737, term39737.getClass(), "count", 1);
        setIntField(term39737, term39737.getClass(), "threshold", 8);
        setFloatField(term39737, term39737.getClass(), "loadFactor", 0.75F);
        setIntField(term39737, term39737.getClass(), "modCount", 1);
        setField(term39737, term39737.getClass(), "keySet", null);
        setField(term39737, term39737.getClass(), "entrySet", null);
        setField(term39737, term39737.getClass(), "values", null);
        setField(term39717, term39717.getClass(), "properties", term39737);
        setFloatField(term39717, term39717.getClass(), "accelerationPriority", 0.96747494F);
        setField(term39717, term39717.getClass(), "surfaceManager", null);
        setElement(term39716, 0, term39717);
        setIntField(term39744, term39744.getClass(), "imageType", 1317020952);
        setField(term39744, term39744.getClass(), "colorModel", null);
        setField(term39746, term39746.getClass(), "sampleModel", null);
        setField(term39746, term39746.getClass(), "dataBuffer", null);
        setIntField(term39746, term39746.getClass(), "minX", 0);
        setIntField(term39746, term39746.getClass(), "minY", 0);
        setIntField(term39746, term39746.getClass(), "width", 0);
        setIntField(term39746, term39746.getClass(), "height", 0);
        setIntField(term39746, term39746.getClass(), "sampleModelTranslateX", 0);
        setIntField(term39746, term39746.getClass(), "sampleModelTranslateY", 0);
        setIntField(term39746, term39746.getClass(), "numBands", 0);
        setIntField(term39746, term39746.getClass(), "numDataElements", 0);
        setField(term39746, term39746.getClass(), "parent", null);
        setField(term39744, term39744.getClass(), "raster", term39746);
        setField(term39744, term39744.getClass(), "osis", null);
        setField(term39755, term39755.getClass(), "table", term39756);
        setIntField(term39755, term39755.getClass(), "count", 1);
        setIntField(term39755, term39755.getClass(), "threshold", 8);
        setFloatField(term39755, term39755.getClass(), "loadFactor", 0.75F);
        setIntField(term39755, term39755.getClass(), "modCount", 1);
        setField(term39755, term39755.getClass(), "keySet", null);
        setField(term39755, term39755.getClass(), "entrySet", null);
        setField(term39755, term39755.getClass(), "values", null);
        setField(term39744, term39744.getClass(), "properties", term39755);
        setFloatField(term39744, term39744.getClass(), "accelerationPriority", 0.0F);
        setField(term39744, term39744.getClass(), "surfaceManager", null);
        setElement(term39716, 1, term39744);
        setIntField(term39762, term39762.getClass(), "imageType", 0);
        setField(term39762, term39762.getClass(), "colorModel", null);
        setField(term39762, term39762.getClass(), "raster", null);
        setField(term39762, term39762.getClass(), "osis", null);
        setField(term39762, term39762.getClass(), "properties", null);
        setFloatField(term39762, term39762.getClass(), "accelerationPriority", 0.0F);
        setField(term39762, term39762.getClass(), "surfaceManager", null);
        setElement(term39716, 2, term39762);
        setIntField(term39765, term39765.getClass(), "imageType", 0);
        setField(term39765, term39765.getClass(), "colorModel", null);
        setField(term39765, term39765.getClass(), "raster", null);
        setField(term39765, term39765.getClass(), "osis", null);
        setField(term39765, term39765.getClass(), "properties", null);
        setFloatField(term39765, term39765.getClass(), "accelerationPriority", 0.0F);
        setField(term39765, term39765.getClass(), "surfaceManager", null);
        setElement(term39716, 3, term39765);
        setIntField(term39768, term39768.getClass(), "imageType", 0);
        setField(term39768, term39768.getClass(), "colorModel", null);
        setField(term39768, term39768.getClass(), "raster", null);
        setField(term39768, term39768.getClass(), "osis", null);
        setField(term39768, term39768.getClass(), "properties", null);
        setFloatField(term39768, term39768.getClass(), "accelerationPriority", 0.0F);
        setField(term39768, term39768.getClass(), "surfaceManager", null);
        setElement(term39716, 4, term39768);
        setField(term39712, term39712.getClass(), "images", term39716);
        setIntField(term39712, term39712.getClass(), "showImage", -355505521);
        setIntField(term39712, term39712.getClass(), "drawImage", 1227316523);
        setIntField(term39773, term39773.getClass(), "maxX", 0);
        setIntField(term39773, term39773.getClass(), "maxY", 0);
        setField(term39773, term39773.getClass(), "tiles", null);
        setField(term39773, term39773.getClass(), "tileInfo", null);
        setField(term39773, term39773.getClass(), "culture", null);
        setIntField(term39773, term39773.getClass(), "cursorX", 0);
        setIntField(term39773, term39773.getClass(), "cursorY", 0);
        setIntField(term39773, term39773.getClass(), "drawX", 0);
        setIntField(term39773, term39773.getClass(), "drawY", 0);
        setField(term39773, term39773.getClass(), "sunList", null);
        setField(term39773, term39773.getClass(), "planetList", null);
        setField(term39773, term39773.getClass(), "ascensionPlanetCoordinate", null);
        setField(term39773, term39773.getClass(), "players", null);
        setIntField(term39773, term39773.getClass(), "turn", 0);
        setField(term39773, term39773.getClass(), "fleetTiles", null);
        setIntField(term39773, term39773.getClass(), "aiTurnNumber", 0);
        setField(term39773, term39773.getClass(), "aiFleet", null);
        setField(term39773, term39773.getClass(), "newsCorpData", null);
        setBooleanField(term39773, term39773.getClass(), "debug", false);
        setIntField(term39773, term39773.getClass(), "scoreVictoryTurn", 0);
        setIntField(term39773, term39773.getClass(), "scoreConquer", 0);
        setIntField(term39773, term39773.getClass(), "scoreCulture", 0);
        setIntField(term39773, term39773.getClass(), "scoreResearch", 0);
        setIntField(term39773, term39773.getClass(), "scoreDiplomacy", 0);
        setIntField(term39773, term39773.getClass(), "scorePopulation", 0);
        setField(term39773, term39773.getClass(), "history", null);
        setField(term39773, term39773.getClass(), "votes", null);
        setBooleanField(term39773, term39773.getClass(), "gameEnd", false);
        setBooleanField(term39773, term39773.getClass(), "humanLost", false);
        setField(term39773, term39773.getClass(), "pirateDifficulty", null);
        setField(term39773, term39773.getClass(), "karmaEvents", null);
        setField(term39773, term39773.getClass(), "ascensionEvents", null);
        setBooleanField(term39773, term39773.getClass(), "tutorialEnabled", false);
        setField(term39773, term39773.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term39773, term39773.getClass(), "allNewsEnabled", false);
        setBooleanField(term39773, term39773.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term39773, term39773.getClass(), "forceRedraw", false);
        setIntField(term39773, term39773.getClass(), "zoomLevel", 0);
        setBooleanField(term39773, term39773.getClass(), "generateFullGame", false);
        setField(term39712, term39712.getClass(), "map", term39773);
        setIntField(term39712, term39712.getClass(), "topX", -58633039);
        setIntField(term39712, term39712.getClass(), "topY", 448061908);
        setIntField(term39712, term39712.getClass(), "drawX", -1268483887);
        setIntField(term39712, term39712.getClass(), "drawY", -1929689681);
        setBooleanField(term39712, term39712.getClass(), "needsUpdate", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenterX", argTypes, term39712, args);
    }

};


