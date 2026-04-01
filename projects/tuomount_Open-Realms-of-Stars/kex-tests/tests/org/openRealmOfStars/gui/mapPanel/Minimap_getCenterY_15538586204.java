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

public class Minimap_getCenterY_15538586204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39802;

    public Minimap_getCenterY_15538586204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39802 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        Object[] term39806 = (Object[]) newArray("java.awt.image.BufferedImage", 2);
        Object term39807 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39809 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term39818 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term39827 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term39828 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39834 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term39836 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term39845 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term39846 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39854 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term39802, term39802.getClass(), "size", -91240911);
        setIntField(term39802, term39802.getClass(), "sectorsToShow", -321227954);
        setIntField(term39802, term39802.getClass(), "sectorSize", 373810833);
        setIntField(term39807, term39807.getClass(), "imageType", -215979293);
        setField(term39807, term39807.getClass(), "colorModel", null);
        setField(term39809, term39809.getClass(), "sampleModel", null);
        setField(term39809, term39809.getClass(), "dataBuffer", null);
        setIntField(term39809, term39809.getClass(), "minX", -19567889);
        setIntField(term39809, term39809.getClass(), "minY", 693500318);
        setIntField(term39809, term39809.getClass(), "width", 1702404702);
        setIntField(term39809, term39809.getClass(), "height", 1141592999);
        setIntField(term39809, term39809.getClass(), "sampleModelTranslateX", 848113442);
        setIntField(term39809, term39809.getClass(), "sampleModelTranslateY", 793974213);
        setIntField(term39809, term39809.getClass(), "numBands", 722546287);
        setIntField(term39809, term39809.getClass(), "numDataElements", -2060284160);
        setField(term39818, term39818.getClass(), "sampleModel", null);
        setField(term39818, term39818.getClass(), "dataBuffer", null);
        setIntField(term39818, term39818.getClass(), "minX", -568450686);
        setIntField(term39818, term39818.getClass(), "minY", 1314660281);
        setIntField(term39818, term39818.getClass(), "width", -126399768);
        setIntField(term39818, term39818.getClass(), "height", 318982923);
        setIntField(term39818, term39818.getClass(), "sampleModelTranslateX", -154210001);
        setIntField(term39818, term39818.getClass(), "sampleModelTranslateY", 621910137);
        setIntField(term39818, term39818.getClass(), "numBands", 241533020);
        setIntField(term39818, term39818.getClass(), "numDataElements", 2081679151);
        setField(term39818, term39818.getClass(), "parent", null);
        setField(term39809, term39809.getClass(), "parent", term39818);
        setField(term39807, term39807.getClass(), "raster", term39809);
        setField(term39807, term39807.getClass(), "osis", null);
        setField(term39827, term39827.getClass(), "table", term39828);
        setIntField(term39827, term39827.getClass(), "count", 1);
        setIntField(term39827, term39827.getClass(), "threshold", 8);
        setFloatField(term39827, term39827.getClass(), "loadFactor", 0.75F);
        setIntField(term39827, term39827.getClass(), "modCount", 1);
        setField(term39827, term39827.getClass(), "keySet", null);
        setField(term39827, term39827.getClass(), "entrySet", null);
        setField(term39827, term39827.getClass(), "values", null);
        setField(term39807, term39807.getClass(), "properties", term39827);
        setFloatField(term39807, term39807.getClass(), "accelerationPriority", 0.62698853F);
        setField(term39807, term39807.getClass(), "surfaceManager", null);
        setElement(term39806, 0, term39807);
        setIntField(term39834, term39834.getClass(), "imageType", -434230943);
        setField(term39834, term39834.getClass(), "colorModel", null);
        setField(term39836, term39836.getClass(), "sampleModel", null);
        setField(term39836, term39836.getClass(), "dataBuffer", null);
        setIntField(term39836, term39836.getClass(), "minX", 0);
        setIntField(term39836, term39836.getClass(), "minY", 0);
        setIntField(term39836, term39836.getClass(), "width", 0);
        setIntField(term39836, term39836.getClass(), "height", 0);
        setIntField(term39836, term39836.getClass(), "sampleModelTranslateX", 0);
        setIntField(term39836, term39836.getClass(), "sampleModelTranslateY", 0);
        setIntField(term39836, term39836.getClass(), "numBands", 0);
        setIntField(term39836, term39836.getClass(), "numDataElements", 0);
        setField(term39836, term39836.getClass(), "parent", null);
        setField(term39834, term39834.getClass(), "raster", term39836);
        setField(term39834, term39834.getClass(), "osis", null);
        setField(term39845, term39845.getClass(), "table", term39846);
        setIntField(term39845, term39845.getClass(), "count", 1);
        setIntField(term39845, term39845.getClass(), "threshold", 8);
        setFloatField(term39845, term39845.getClass(), "loadFactor", 0.75F);
        setIntField(term39845, term39845.getClass(), "modCount", 1);
        setField(term39845, term39845.getClass(), "keySet", null);
        setField(term39845, term39845.getClass(), "entrySet", null);
        setField(term39845, term39845.getClass(), "values", null);
        setField(term39834, term39834.getClass(), "properties", term39845);
        setFloatField(term39834, term39834.getClass(), "accelerationPriority", 0.0F);
        setField(term39834, term39834.getClass(), "surfaceManager", null);
        setElement(term39806, 1, term39834);
        setField(term39802, term39802.getClass(), "images", term39806);
        setIntField(term39802, term39802.getClass(), "showImage", 548468113);
        setIntField(term39802, term39802.getClass(), "drawImage", 1701819905);
        setIntField(term39854, term39854.getClass(), "maxX", 0);
        setIntField(term39854, term39854.getClass(), "maxY", 0);
        setField(term39854, term39854.getClass(), "tiles", null);
        setField(term39854, term39854.getClass(), "tileInfo", null);
        setField(term39854, term39854.getClass(), "culture", null);
        setIntField(term39854, term39854.getClass(), "cursorX", 0);
        setIntField(term39854, term39854.getClass(), "cursorY", 0);
        setIntField(term39854, term39854.getClass(), "drawX", 0);
        setIntField(term39854, term39854.getClass(), "drawY", 0);
        setField(term39854, term39854.getClass(), "sunList", null);
        setField(term39854, term39854.getClass(), "planetList", null);
        setField(term39854, term39854.getClass(), "ascensionPlanetCoordinate", null);
        setField(term39854, term39854.getClass(), "players", null);
        setIntField(term39854, term39854.getClass(), "turn", 0);
        setField(term39854, term39854.getClass(), "fleetTiles", null);
        setIntField(term39854, term39854.getClass(), "aiTurnNumber", 0);
        setField(term39854, term39854.getClass(), "aiFleet", null);
        setField(term39854, term39854.getClass(), "newsCorpData", null);
        setBooleanField(term39854, term39854.getClass(), "debug", false);
        setIntField(term39854, term39854.getClass(), "scoreVictoryTurn", 0);
        setIntField(term39854, term39854.getClass(), "scoreConquer", 0);
        setIntField(term39854, term39854.getClass(), "scoreCulture", 0);
        setIntField(term39854, term39854.getClass(), "scoreResearch", 0);
        setIntField(term39854, term39854.getClass(), "scoreDiplomacy", 0);
        setIntField(term39854, term39854.getClass(), "scorePopulation", 0);
        setField(term39854, term39854.getClass(), "history", null);
        setField(term39854, term39854.getClass(), "votes", null);
        setBooleanField(term39854, term39854.getClass(), "gameEnd", false);
        setBooleanField(term39854, term39854.getClass(), "humanLost", false);
        setField(term39854, term39854.getClass(), "pirateDifficulty", null);
        setField(term39854, term39854.getClass(), "karmaEvents", null);
        setField(term39854, term39854.getClass(), "ascensionEvents", null);
        setBooleanField(term39854, term39854.getClass(), "tutorialEnabled", false);
        setField(term39854, term39854.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term39854, term39854.getClass(), "allNewsEnabled", false);
        setBooleanField(term39854, term39854.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term39854, term39854.getClass(), "forceRedraw", false);
        setIntField(term39854, term39854.getClass(), "zoomLevel", 0);
        setBooleanField(term39854, term39854.getClass(), "generateFullGame", false);
        setField(term39802, term39802.getClass(), "map", term39854);
        setIntField(term39802, term39802.getClass(), "topX", 1721418943);
        setIntField(term39802, term39802.getClass(), "topY", -111082612);
        setIntField(term39802, term39802.getClass(), "drawX", 1253334988);
        setIntField(term39802, term39802.getClass(), "drawY", 1086709736);
        setBooleanField(term39802, term39802.getClass(), "needsUpdate", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenterY", argTypes, term39802, args);
    }

};


