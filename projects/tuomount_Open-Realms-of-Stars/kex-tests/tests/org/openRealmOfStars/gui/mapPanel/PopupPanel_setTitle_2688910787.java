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

public class PopupPanel_setTitle_2688910787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36118;

    public PopupPanel_setTitle_2688910787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36118 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term36143 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36145 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36154 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36163 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36172 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36173 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36174 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36181 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36183 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36192 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36193 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36194 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36202 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term36118, term36118.getClass(), "text", "GPSEWEDSTo");
        setField(term36118, term36118.getClass(), "title", "RCOqfVsRHt");
        setIntField(term36143, term36143.getClass(), "imageType", -890538258);
        setField(term36143, term36143.getClass(), "colorModel", null);
        setField(term36145, term36145.getClass(), "sampleModel", null);
        setField(term36145, term36145.getClass(), "dataBuffer", null);
        setIntField(term36145, term36145.getClass(), "minX", -1085899912);
        setIntField(term36145, term36145.getClass(), "minY", -1458980236);
        setIntField(term36145, term36145.getClass(), "width", 890505372);
        setIntField(term36145, term36145.getClass(), "height", 2044137055);
        setIntField(term36145, term36145.getClass(), "sampleModelTranslateX", -1452324619);
        setIntField(term36145, term36145.getClass(), "sampleModelTranslateY", -1121709274);
        setIntField(term36145, term36145.getClass(), "numBands", -532304223);
        setIntField(term36145, term36145.getClass(), "numDataElements", 666218293);
        setField(term36154, term36154.getClass(), "sampleModel", null);
        setField(term36154, term36154.getClass(), "dataBuffer", null);
        setIntField(term36154, term36154.getClass(), "minX", 1737876343);
        setIntField(term36154, term36154.getClass(), "minY", -897937940);
        setIntField(term36154, term36154.getClass(), "width", 1523261232);
        setIntField(term36154, term36154.getClass(), "height", -428988337);
        setIntField(term36154, term36154.getClass(), "sampleModelTranslateX", 48047085);
        setIntField(term36154, term36154.getClass(), "sampleModelTranslateY", 1902784843);
        setIntField(term36154, term36154.getClass(), "numBands", 2021136615);
        setIntField(term36154, term36154.getClass(), "numDataElements", 1778570695);
        setField(term36163, term36163.getClass(), "sampleModel", null);
        setField(term36163, term36163.getClass(), "dataBuffer", null);
        setIntField(term36163, term36163.getClass(), "minX", 0);
        setIntField(term36163, term36163.getClass(), "minY", 0);
        setIntField(term36163, term36163.getClass(), "width", 0);
        setIntField(term36163, term36163.getClass(), "height", 0);
        setIntField(term36163, term36163.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36163, term36163.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36163, term36163.getClass(), "numBands", 0);
        setIntField(term36163, term36163.getClass(), "numDataElements", 0);
        setField(term36163, term36163.getClass(), "parent", null);
        setField(term36154, term36154.getClass(), "parent", term36163);
        setField(term36145, term36145.getClass(), "parent", term36154);
        setField(term36143, term36143.getClass(), "raster", term36145);
        setField(term36143, term36143.getClass(), "osis", null);
        setIntField(term36174, term36174.getClass(), "hash", -599211726);
        setField(term36174, term36174.getClass(), "key", null);
        setField(term36174, term36174.getClass(), "value", null);
        setField(term36174, term36174.getClass(), "next", null);
        setElement(term36173, 10, term36174);
        setField(term36172, term36172.getClass(), "table", term36173);
        setIntField(term36172, term36172.getClass(), "count", 1);
        setIntField(term36172, term36172.getClass(), "threshold", 8);
        setFloatField(term36172, term36172.getClass(), "loadFactor", 0.75F);
        setIntField(term36172, term36172.getClass(), "modCount", 1);
        setField(term36172, term36172.getClass(), "keySet", null);
        setField(term36172, term36172.getClass(), "entrySet", null);
        setField(term36172, term36172.getClass(), "values", null);
        setField(term36143, term36143.getClass(), "properties", term36172);
        setFloatField(term36143, term36143.getClass(), "accelerationPriority", 0.8747868F);
        setField(term36143, term36143.getClass(), "surfaceManager", null);
        setField(term36118, term36118.getClass(), "image", term36143);
        setIntField(term36181, term36181.getClass(), "imageType", -1619435313);
        setField(term36181, term36181.getClass(), "colorModel", null);
        setField(term36183, term36183.getClass(), "sampleModel", null);
        setField(term36183, term36183.getClass(), "dataBuffer", null);
        setIntField(term36183, term36183.getClass(), "minX", 0);
        setIntField(term36183, term36183.getClass(), "minY", 0);
        setIntField(term36183, term36183.getClass(), "width", 0);
        setIntField(term36183, term36183.getClass(), "height", 0);
        setIntField(term36183, term36183.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36183, term36183.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36183, term36183.getClass(), "numBands", 0);
        setIntField(term36183, term36183.getClass(), "numDataElements", 0);
        setField(term36183, term36183.getClass(), "parent", null);
        setField(term36181, term36181.getClass(), "raster", term36183);
        setField(term36181, term36181.getClass(), "osis", null);
        setIntField(term36194, term36194.getClass(), "hash", -472479957);
        setField(term36194, term36194.getClass(), "key", null);
        setField(term36194, term36194.getClass(), "value", null);
        setField(term36194, term36194.getClass(), "next", null);
        setElement(term36193, 9, term36194);
        setField(term36192, term36192.getClass(), "table", term36193);
        setIntField(term36192, term36192.getClass(), "count", 1);
        setIntField(term36192, term36192.getClass(), "threshold", 8);
        setFloatField(term36192, term36192.getClass(), "loadFactor", 0.75F);
        setIntField(term36192, term36192.getClass(), "modCount", 1);
        setField(term36192, term36192.getClass(), "keySet", null);
        setField(term36192, term36192.getClass(), "entrySet", null);
        setField(term36192, term36192.getClass(), "values", null);
        setField(term36181, term36181.getClass(), "properties", term36192);
        setFloatField(term36181, term36181.getClass(), "accelerationPriority", 0.0F);
        setField(term36181, term36181.getClass(), "surfaceManager", null);
        setField(term36118, term36118.getClass(), "scaledImage", term36181);
        setBooleanField(term36118, term36118.getClass(), "dismissed", true);
        setField(term36202, term36202.getClass(), "combatShipList", null);
        setIntField(term36202, term36202.getClass(), "shipIndex", 0);
        setIntField(term36202, term36202.getClass(), "cursorX", 0);
        setIntField(term36202, term36202.getClass(), "cursorY", 0);
        setIntField(term36202, term36202.getClass(), "componentUse", 0);
        setField(term36202, term36202.getClass(), "animation", null);
        setField(term36202, term36202.getClass(), "attackerFleet", null);
        setField(term36202, term36202.getClass(), "defenderFleet", null);
        setField(term36202, term36202.getClass(), "starbaseFleet", null);
        setField(term36202, term36202.getClass(), "winner", null);
        setField(term36202, term36202.getClass(), "attackerInfo", null);
        setField(term36202, term36202.getClass(), "defenderInfo", null);
        setField(term36202, term36202.getClass(), "planet", null);
        setIntField(term36202, term36202.getClass(), "totalRounds", 0);
        setIntField(term36202, term36202.getClass(), "roundsNoDamge", 0);
        setBooleanField(term36202, term36202.getClass(), "endCombatHandled", false);
        setField(term36202, term36202.getClass(), "wormHole", null);
        setIntField(term36202, term36202.getClass(), "timerForWormHole", 0);
        setBooleanField(term36202, term36202.getClass(), "defenderEscaped", false);
        setBooleanField(term36202, term36202.getClass(), "attackerEscaped", false);
        setField(term36202, term36202.getClass(), "escapePosition", null);
        setField(term36202, term36202.getClass(), "combatEvent", null);
        setIntField(term36202, term36202.getClass(), "defenderMilitaryValue", 0);
        setIntField(term36202, term36202.getClass(), "attackerMilitaryValue", 0);
        setField(term36202, term36202.getClass(), "leaderKilledNews", null);
        setField(term36202, term36202.getClass(), "orbitalDestroyedNews", null);
        setField(term36202, term36202.getClass(), "leaderInCombat", null);
        setBooleanField(term36202, term36202.getClass(), "attackerPrivateer", false);
        setBooleanField(term36202, term36202.getClass(), "defenderPrivateer", false);
        setBooleanField(term36202, term36202.getClass(), "orbitalInCombat", false);
        setIntField(term36202, term36202.getClass(), "starYear", 0);
        setBooleanField(term36202, term36202.getClass(), "worthOfWarHero", false);
        setField(term36118, term36118.getClass(), "combat", term36202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vOVuNSCCLe";
        callMethod(klass, "setTitle", argTypes, term36118, args);
    }

};


