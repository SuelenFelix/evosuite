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

public class PopupPanel_getTitle_1547773388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36262;

    public PopupPanel_getTitle_1547773388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36262 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term36287 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36289 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36298 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36307 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36316 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36317 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36318 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36325 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36327 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36336 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36337 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36338 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36346 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term36262, term36262.getClass(), "text", "fzeqPnzpnt");
        setField(term36262, term36262.getClass(), "title", "RxbhrFBjkO");
        setIntField(term36287, term36287.getClass(), "imageType", 1512541853);
        setField(term36287, term36287.getClass(), "colorModel", null);
        setField(term36289, term36289.getClass(), "sampleModel", null);
        setField(term36289, term36289.getClass(), "dataBuffer", null);
        setIntField(term36289, term36289.getClass(), "minX", -965421502);
        setIntField(term36289, term36289.getClass(), "minY", 1319026002);
        setIntField(term36289, term36289.getClass(), "width", -1368173231);
        setIntField(term36289, term36289.getClass(), "height", 1956006038);
        setIntField(term36289, term36289.getClass(), "sampleModelTranslateX", -1062304878);
        setIntField(term36289, term36289.getClass(), "sampleModelTranslateY", -1377876610);
        setIntField(term36289, term36289.getClass(), "numBands", -1456184732);
        setIntField(term36289, term36289.getClass(), "numDataElements", 1689228897);
        setField(term36298, term36298.getClass(), "sampleModel", null);
        setField(term36298, term36298.getClass(), "dataBuffer", null);
        setIntField(term36298, term36298.getClass(), "minX", 892205855);
        setIntField(term36298, term36298.getClass(), "minY", 1955560079);
        setIntField(term36298, term36298.getClass(), "width", -1330529019);
        setIntField(term36298, term36298.getClass(), "height", 237134844);
        setIntField(term36298, term36298.getClass(), "sampleModelTranslateX", 2076413861);
        setIntField(term36298, term36298.getClass(), "sampleModelTranslateY", 66817373);
        setIntField(term36298, term36298.getClass(), "numBands", 1459628013);
        setIntField(term36298, term36298.getClass(), "numDataElements", -1641507499);
        setField(term36307, term36307.getClass(), "sampleModel", null);
        setField(term36307, term36307.getClass(), "dataBuffer", null);
        setIntField(term36307, term36307.getClass(), "minX", 0);
        setIntField(term36307, term36307.getClass(), "minY", 0);
        setIntField(term36307, term36307.getClass(), "width", 0);
        setIntField(term36307, term36307.getClass(), "height", 0);
        setIntField(term36307, term36307.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36307, term36307.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36307, term36307.getClass(), "numBands", 0);
        setIntField(term36307, term36307.getClass(), "numDataElements", 0);
        setField(term36307, term36307.getClass(), "parent", null);
        setField(term36298, term36298.getClass(), "parent", term36307);
        setField(term36289, term36289.getClass(), "parent", term36298);
        setField(term36287, term36287.getClass(), "raster", term36289);
        setField(term36287, term36287.getClass(), "osis", null);
        setIntField(term36318, term36318.getClass(), "hash", 406523463);
        setField(term36318, term36318.getClass(), "key", null);
        setField(term36318, term36318.getClass(), "value", null);
        setField(term36318, term36318.getClass(), "next", null);
        setElement(term36317, 5, term36318);
        setField(term36316, term36316.getClass(), "table", term36317);
        setIntField(term36316, term36316.getClass(), "count", 1);
        setIntField(term36316, term36316.getClass(), "threshold", 8);
        setFloatField(term36316, term36316.getClass(), "loadFactor", 0.75F);
        setIntField(term36316, term36316.getClass(), "modCount", 1);
        setField(term36316, term36316.getClass(), "keySet", null);
        setField(term36316, term36316.getClass(), "entrySet", null);
        setField(term36316, term36316.getClass(), "values", null);
        setField(term36287, term36287.getClass(), "properties", term36316);
        setFloatField(term36287, term36287.getClass(), "accelerationPriority", 0.061434507F);
        setField(term36287, term36287.getClass(), "surfaceManager", null);
        setField(term36262, term36262.getClass(), "image", term36287);
        setIntField(term36325, term36325.getClass(), "imageType", -1527326823);
        setField(term36325, term36325.getClass(), "colorModel", null);
        setField(term36327, term36327.getClass(), "sampleModel", null);
        setField(term36327, term36327.getClass(), "dataBuffer", null);
        setIntField(term36327, term36327.getClass(), "minX", 0);
        setIntField(term36327, term36327.getClass(), "minY", 0);
        setIntField(term36327, term36327.getClass(), "width", 0);
        setIntField(term36327, term36327.getClass(), "height", 0);
        setIntField(term36327, term36327.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36327, term36327.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36327, term36327.getClass(), "numBands", 0);
        setIntField(term36327, term36327.getClass(), "numDataElements", 0);
        setField(term36327, term36327.getClass(), "parent", null);
        setField(term36325, term36325.getClass(), "raster", term36327);
        setField(term36325, term36325.getClass(), "osis", null);
        setIntField(term36338, term36338.getClass(), "hash", 1197894541);
        setField(term36338, term36338.getClass(), "key", null);
        setField(term36338, term36338.getClass(), "value", null);
        setField(term36338, term36338.getClass(), "next", null);
        setElement(term36337, 8, term36338);
        setField(term36336, term36336.getClass(), "table", term36337);
        setIntField(term36336, term36336.getClass(), "count", 1);
        setIntField(term36336, term36336.getClass(), "threshold", 8);
        setFloatField(term36336, term36336.getClass(), "loadFactor", 0.75F);
        setIntField(term36336, term36336.getClass(), "modCount", 1);
        setField(term36336, term36336.getClass(), "keySet", null);
        setField(term36336, term36336.getClass(), "entrySet", null);
        setField(term36336, term36336.getClass(), "values", null);
        setField(term36325, term36325.getClass(), "properties", term36336);
        setFloatField(term36325, term36325.getClass(), "accelerationPriority", 0.0F);
        setField(term36325, term36325.getClass(), "surfaceManager", null);
        setField(term36262, term36262.getClass(), "scaledImage", term36325);
        setBooleanField(term36262, term36262.getClass(), "dismissed", true);
        setField(term36346, term36346.getClass(), "combatShipList", null);
        setIntField(term36346, term36346.getClass(), "shipIndex", 0);
        setIntField(term36346, term36346.getClass(), "cursorX", 0);
        setIntField(term36346, term36346.getClass(), "cursorY", 0);
        setIntField(term36346, term36346.getClass(), "componentUse", 0);
        setField(term36346, term36346.getClass(), "animation", null);
        setField(term36346, term36346.getClass(), "attackerFleet", null);
        setField(term36346, term36346.getClass(), "defenderFleet", null);
        setField(term36346, term36346.getClass(), "starbaseFleet", null);
        setField(term36346, term36346.getClass(), "winner", null);
        setField(term36346, term36346.getClass(), "attackerInfo", null);
        setField(term36346, term36346.getClass(), "defenderInfo", null);
        setField(term36346, term36346.getClass(), "planet", null);
        setIntField(term36346, term36346.getClass(), "totalRounds", 0);
        setIntField(term36346, term36346.getClass(), "roundsNoDamge", 0);
        setBooleanField(term36346, term36346.getClass(), "endCombatHandled", false);
        setField(term36346, term36346.getClass(), "wormHole", null);
        setIntField(term36346, term36346.getClass(), "timerForWormHole", 0);
        setBooleanField(term36346, term36346.getClass(), "defenderEscaped", false);
        setBooleanField(term36346, term36346.getClass(), "attackerEscaped", false);
        setField(term36346, term36346.getClass(), "escapePosition", null);
        setField(term36346, term36346.getClass(), "combatEvent", null);
        setIntField(term36346, term36346.getClass(), "defenderMilitaryValue", 0);
        setIntField(term36346, term36346.getClass(), "attackerMilitaryValue", 0);
        setField(term36346, term36346.getClass(), "leaderKilledNews", null);
        setField(term36346, term36346.getClass(), "orbitalDestroyedNews", null);
        setField(term36346, term36346.getClass(), "leaderInCombat", null);
        setBooleanField(term36346, term36346.getClass(), "attackerPrivateer", false);
        setBooleanField(term36346, term36346.getClass(), "defenderPrivateer", false);
        setBooleanField(term36346, term36346.getClass(), "orbitalInCombat", false);
        setIntField(term36346, term36346.getClass(), "starYear", 0);
        setBooleanField(term36346, term36346.getClass(), "worthOfWarHero", false);
        setField(term36262, term36262.getClass(), "combat", term36346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term36262, args);
    }

};


