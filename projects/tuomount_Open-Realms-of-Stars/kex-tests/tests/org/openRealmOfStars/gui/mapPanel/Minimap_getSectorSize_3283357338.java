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

public class Minimap_getSectorSize_3283357338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40699;

    public Minimap_getSectorSize_3283357338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40699 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        Object[] term40703 = (Object[]) newArray("java.awt.image.BufferedImage", 4);
        Object term40704 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term40706 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term40715 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term40724 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term40725 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term40731 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term40733 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term40742 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term40743 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term40749 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term40752 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term40757 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term40699, term40699.getClass(), "size", -217226756);
        setIntField(term40699, term40699.getClass(), "sectorsToShow", 1608000247);
        setIntField(term40699, term40699.getClass(), "sectorSize", 1354560887);
        setIntField(term40704, term40704.getClass(), "imageType", -749474542);
        setField(term40704, term40704.getClass(), "colorModel", null);
        setField(term40706, term40706.getClass(), "sampleModel", null);
        setField(term40706, term40706.getClass(), "dataBuffer", null);
        setIntField(term40706, term40706.getClass(), "minX", -47907780);
        setIntField(term40706, term40706.getClass(), "minY", 1131462369);
        setIntField(term40706, term40706.getClass(), "width", -1161206731);
        setIntField(term40706, term40706.getClass(), "height", -992847709);
        setIntField(term40706, term40706.getClass(), "sampleModelTranslateX", 1125156671);
        setIntField(term40706, term40706.getClass(), "sampleModelTranslateY", 1203107925);
        setIntField(term40706, term40706.getClass(), "numBands", 1825448944);
        setIntField(term40706, term40706.getClass(), "numDataElements", 1769496642);
        setField(term40715, term40715.getClass(), "sampleModel", null);
        setField(term40715, term40715.getClass(), "dataBuffer", null);
        setIntField(term40715, term40715.getClass(), "minX", -947460705);
        setIntField(term40715, term40715.getClass(), "minY", -1435758764);
        setIntField(term40715, term40715.getClass(), "width", 752858379);
        setIntField(term40715, term40715.getClass(), "height", -370819357);
        setIntField(term40715, term40715.getClass(), "sampleModelTranslateX", -71819242);
        setIntField(term40715, term40715.getClass(), "sampleModelTranslateY", 1268893136);
        setIntField(term40715, term40715.getClass(), "numBands", -1472700822);
        setIntField(term40715, term40715.getClass(), "numDataElements", 1626670889);
        setField(term40715, term40715.getClass(), "parent", null);
        setField(term40706, term40706.getClass(), "parent", term40715);
        setField(term40704, term40704.getClass(), "raster", term40706);
        setField(term40704, term40704.getClass(), "osis", null);
        setField(term40724, term40724.getClass(), "table", term40725);
        setIntField(term40724, term40724.getClass(), "count", 1);
        setIntField(term40724, term40724.getClass(), "threshold", 8);
        setFloatField(term40724, term40724.getClass(), "loadFactor", 0.75F);
        setIntField(term40724, term40724.getClass(), "modCount", 1);
        setField(term40724, term40724.getClass(), "keySet", null);
        setField(term40724, term40724.getClass(), "entrySet", null);
        setField(term40724, term40724.getClass(), "values", null);
        setField(term40704, term40704.getClass(), "properties", term40724);
        setFloatField(term40704, term40704.getClass(), "accelerationPriority", 0.10126144F);
        setField(term40704, term40704.getClass(), "surfaceManager", null);
        setElement(term40703, 0, term40704);
        setIntField(term40731, term40731.getClass(), "imageType", 407708341);
        setField(term40731, term40731.getClass(), "colorModel", null);
        setField(term40733, term40733.getClass(), "sampleModel", null);
        setField(term40733, term40733.getClass(), "dataBuffer", null);
        setIntField(term40733, term40733.getClass(), "minX", 0);
        setIntField(term40733, term40733.getClass(), "minY", 0);
        setIntField(term40733, term40733.getClass(), "width", 0);
        setIntField(term40733, term40733.getClass(), "height", 0);
        setIntField(term40733, term40733.getClass(), "sampleModelTranslateX", 0);
        setIntField(term40733, term40733.getClass(), "sampleModelTranslateY", 0);
        setIntField(term40733, term40733.getClass(), "numBands", 0);
        setIntField(term40733, term40733.getClass(), "numDataElements", 0);
        setField(term40733, term40733.getClass(), "parent", null);
        setField(term40731, term40731.getClass(), "raster", term40733);
        setField(term40731, term40731.getClass(), "osis", null);
        setField(term40742, term40742.getClass(), "table", term40743);
        setIntField(term40742, term40742.getClass(), "count", 1);
        setIntField(term40742, term40742.getClass(), "threshold", 8);
        setFloatField(term40742, term40742.getClass(), "loadFactor", 0.75F);
        setIntField(term40742, term40742.getClass(), "modCount", 1);
        setField(term40742, term40742.getClass(), "keySet", null);
        setField(term40742, term40742.getClass(), "entrySet", null);
        setField(term40742, term40742.getClass(), "values", null);
        setField(term40731, term40731.getClass(), "properties", term40742);
        setFloatField(term40731, term40731.getClass(), "accelerationPriority", 0.0F);
        setField(term40731, term40731.getClass(), "surfaceManager", null);
        setElement(term40703, 1, term40731);
        setIntField(term40749, term40749.getClass(), "imageType", 0);
        setField(term40749, term40749.getClass(), "colorModel", null);
        setField(term40749, term40749.getClass(), "raster", null);
        setField(term40749, term40749.getClass(), "osis", null);
        setField(term40749, term40749.getClass(), "properties", null);
        setFloatField(term40749, term40749.getClass(), "accelerationPriority", 0.0F);
        setField(term40749, term40749.getClass(), "surfaceManager", null);
        setElement(term40703, 2, term40749);
        setIntField(term40752, term40752.getClass(), "imageType", 0);
        setField(term40752, term40752.getClass(), "colorModel", null);
        setField(term40752, term40752.getClass(), "raster", null);
        setField(term40752, term40752.getClass(), "osis", null);
        setField(term40752, term40752.getClass(), "properties", null);
        setFloatField(term40752, term40752.getClass(), "accelerationPriority", 0.0F);
        setField(term40752, term40752.getClass(), "surfaceManager", null);
        setElement(term40703, 3, term40752);
        setField(term40699, term40699.getClass(), "images", term40703);
        setIntField(term40699, term40699.getClass(), "showImage", -1490696181);
        setIntField(term40699, term40699.getClass(), "drawImage", 623717232);
        setIntField(term40757, term40757.getClass(), "maxX", 0);
        setIntField(term40757, term40757.getClass(), "maxY", 0);
        setField(term40757, term40757.getClass(), "tiles", null);
        setField(term40757, term40757.getClass(), "tileInfo", null);
        setField(term40757, term40757.getClass(), "culture", null);
        setIntField(term40757, term40757.getClass(), "cursorX", 0);
        setIntField(term40757, term40757.getClass(), "cursorY", 0);
        setIntField(term40757, term40757.getClass(), "drawX", 0);
        setIntField(term40757, term40757.getClass(), "drawY", 0);
        setField(term40757, term40757.getClass(), "sunList", null);
        setField(term40757, term40757.getClass(), "planetList", null);
        setField(term40757, term40757.getClass(), "ascensionPlanetCoordinate", null);
        setField(term40757, term40757.getClass(), "players", null);
        setIntField(term40757, term40757.getClass(), "turn", 0);
        setField(term40757, term40757.getClass(), "fleetTiles", null);
        setIntField(term40757, term40757.getClass(), "aiTurnNumber", 0);
        setField(term40757, term40757.getClass(), "aiFleet", null);
        setField(term40757, term40757.getClass(), "newsCorpData", null);
        setBooleanField(term40757, term40757.getClass(), "debug", false);
        setIntField(term40757, term40757.getClass(), "scoreVictoryTurn", 0);
        setIntField(term40757, term40757.getClass(), "scoreConquer", 0);
        setIntField(term40757, term40757.getClass(), "scoreCulture", 0);
        setIntField(term40757, term40757.getClass(), "scoreResearch", 0);
        setIntField(term40757, term40757.getClass(), "scoreDiplomacy", 0);
        setIntField(term40757, term40757.getClass(), "scorePopulation", 0);
        setField(term40757, term40757.getClass(), "history", null);
        setField(term40757, term40757.getClass(), "votes", null);
        setBooleanField(term40757, term40757.getClass(), "gameEnd", false);
        setBooleanField(term40757, term40757.getClass(), "humanLost", false);
        setField(term40757, term40757.getClass(), "pirateDifficulty", null);
        setField(term40757, term40757.getClass(), "karmaEvents", null);
        setField(term40757, term40757.getClass(), "ascensionEvents", null);
        setBooleanField(term40757, term40757.getClass(), "tutorialEnabled", false);
        setField(term40757, term40757.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term40757, term40757.getClass(), "allNewsEnabled", false);
        setBooleanField(term40757, term40757.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term40757, term40757.getClass(), "forceRedraw", false);
        setIntField(term40757, term40757.getClass(), "zoomLevel", 0);
        setBooleanField(term40757, term40757.getClass(), "generateFullGame", false);
        setField(term40699, term40699.getClass(), "map", term40757);
        setIntField(term40699, term40699.getClass(), "topX", -1413291732);
        setIntField(term40699, term40699.getClass(), "topY", 203264365);
        setIntField(term40699, term40699.getClass(), "drawX", -1066281036);
        setIntField(term40699, term40699.getClass(), "drawY", 30837706);
        setBooleanField(term40699, term40699.getClass(), "needsUpdate", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectorSize", argTypes, term40699, args);
    }

};


