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

public class PopupPanel_splitText_184746169712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36827;
     Object term36929;
     Object term36931;

    public PopupPanel_splitText_184746169712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36827 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term36852 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36854 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36863 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36872 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36881 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36882 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36883 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36890 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36892 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36901 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36902 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36903 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36911 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term36827, term36827.getClass(), "text", "hulYxtowxw");
        setField(term36827, term36827.getClass(), "title", "GNEmuHPNcU");
        setIntField(term36852, term36852.getClass(), "imageType", 148394188);
        setField(term36852, term36852.getClass(), "colorModel", null);
        setField(term36854, term36854.getClass(), "sampleModel", null);
        setField(term36854, term36854.getClass(), "dataBuffer", null);
        setIntField(term36854, term36854.getClass(), "minX", 504525721);
        setIntField(term36854, term36854.getClass(), "minY", 1835568392);
        setIntField(term36854, term36854.getClass(), "width", 457470807);
        setIntField(term36854, term36854.getClass(), "height", -994742871);
        setIntField(term36854, term36854.getClass(), "sampleModelTranslateX", -222412326);
        setIntField(term36854, term36854.getClass(), "sampleModelTranslateY", -299497261);
        setIntField(term36854, term36854.getClass(), "numBands", -23054366);
        setIntField(term36854, term36854.getClass(), "numDataElements", 153009426);
        setField(term36863, term36863.getClass(), "sampleModel", null);
        setField(term36863, term36863.getClass(), "dataBuffer", null);
        setIntField(term36863, term36863.getClass(), "minX", 185751892);
        setIntField(term36863, term36863.getClass(), "minY", 1068256001);
        setIntField(term36863, term36863.getClass(), "width", 1139078354);
        setIntField(term36863, term36863.getClass(), "height", -691164974);
        setIntField(term36863, term36863.getClass(), "sampleModelTranslateX", -761675396);
        setIntField(term36863, term36863.getClass(), "sampleModelTranslateY", -1954860951);
        setIntField(term36863, term36863.getClass(), "numBands", -2078879114);
        setIntField(term36863, term36863.getClass(), "numDataElements", -1186882318);
        setField(term36872, term36872.getClass(), "sampleModel", null);
        setField(term36872, term36872.getClass(), "dataBuffer", null);
        setIntField(term36872, term36872.getClass(), "minX", 0);
        setIntField(term36872, term36872.getClass(), "minY", 0);
        setIntField(term36872, term36872.getClass(), "width", 0);
        setIntField(term36872, term36872.getClass(), "height", 0);
        setIntField(term36872, term36872.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36872, term36872.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36872, term36872.getClass(), "numBands", 0);
        setIntField(term36872, term36872.getClass(), "numDataElements", 0);
        setField(term36872, term36872.getClass(), "parent", null);
        setField(term36863, term36863.getClass(), "parent", term36872);
        setField(term36854, term36854.getClass(), "parent", term36863);
        setField(term36852, term36852.getClass(), "raster", term36854);
        setField(term36852, term36852.getClass(), "osis", null);
        setIntField(term36883, term36883.getClass(), "hash", -2143131324);
        setField(term36883, term36883.getClass(), "key", null);
        setField(term36883, term36883.getClass(), "value", null);
        setField(term36883, term36883.getClass(), "next", null);
        setElement(term36882, 9, term36883);
        setField(term36881, term36881.getClass(), "table", term36882);
        setIntField(term36881, term36881.getClass(), "count", 1);
        setIntField(term36881, term36881.getClass(), "threshold", 8);
        setFloatField(term36881, term36881.getClass(), "loadFactor", 0.75F);
        setIntField(term36881, term36881.getClass(), "modCount", 1);
        setField(term36881, term36881.getClass(), "keySet", null);
        setField(term36881, term36881.getClass(), "entrySet", null);
        setField(term36881, term36881.getClass(), "values", null);
        setField(term36852, term36852.getClass(), "properties", term36881);
        setFloatField(term36852, term36852.getClass(), "accelerationPriority", 0.18361723F);
        setField(term36852, term36852.getClass(), "surfaceManager", null);
        setField(term36827, term36827.getClass(), "image", term36852);
        setIntField(term36890, term36890.getClass(), "imageType", -705176810);
        setField(term36890, term36890.getClass(), "colorModel", null);
        setField(term36892, term36892.getClass(), "sampleModel", null);
        setField(term36892, term36892.getClass(), "dataBuffer", null);
        setIntField(term36892, term36892.getClass(), "minX", 0);
        setIntField(term36892, term36892.getClass(), "minY", 0);
        setIntField(term36892, term36892.getClass(), "width", 0);
        setIntField(term36892, term36892.getClass(), "height", 0);
        setIntField(term36892, term36892.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36892, term36892.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36892, term36892.getClass(), "numBands", 0);
        setIntField(term36892, term36892.getClass(), "numDataElements", 0);
        setField(term36892, term36892.getClass(), "parent", null);
        setField(term36890, term36890.getClass(), "raster", term36892);
        setField(term36890, term36890.getClass(), "osis", null);
        setIntField(term36903, term36903.getClass(), "hash", 662887287);
        setField(term36903, term36903.getClass(), "key", null);
        setField(term36903, term36903.getClass(), "value", null);
        setField(term36903, term36903.getClass(), "next", null);
        setElement(term36902, 7, term36903);
        setField(term36901, term36901.getClass(), "table", term36902);
        setIntField(term36901, term36901.getClass(), "count", 1);
        setIntField(term36901, term36901.getClass(), "threshold", 8);
        setFloatField(term36901, term36901.getClass(), "loadFactor", 0.75F);
        setIntField(term36901, term36901.getClass(), "modCount", 1);
        setField(term36901, term36901.getClass(), "keySet", null);
        setField(term36901, term36901.getClass(), "entrySet", null);
        setField(term36901, term36901.getClass(), "values", null);
        setField(term36890, term36890.getClass(), "properties", term36901);
        setFloatField(term36890, term36890.getClass(), "accelerationPriority", 0.0F);
        setField(term36890, term36890.getClass(), "surfaceManager", null);
        setField(term36827, term36827.getClass(), "scaledImage", term36890);
        setBooleanField(term36827, term36827.getClass(), "dismissed", true);
        setField(term36911, term36911.getClass(), "combatShipList", null);
        setIntField(term36911, term36911.getClass(), "shipIndex", 0);
        setIntField(term36911, term36911.getClass(), "cursorX", 0);
        setIntField(term36911, term36911.getClass(), "cursorY", 0);
        setIntField(term36911, term36911.getClass(), "componentUse", 0);
        setField(term36911, term36911.getClass(), "animation", null);
        setField(term36911, term36911.getClass(), "attackerFleet", null);
        setField(term36911, term36911.getClass(), "defenderFleet", null);
        setField(term36911, term36911.getClass(), "starbaseFleet", null);
        setField(term36911, term36911.getClass(), "winner", null);
        setField(term36911, term36911.getClass(), "attackerInfo", null);
        setField(term36911, term36911.getClass(), "defenderInfo", null);
        setField(term36911, term36911.getClass(), "planet", null);
        setIntField(term36911, term36911.getClass(), "totalRounds", 0);
        setIntField(term36911, term36911.getClass(), "roundsNoDamge", 0);
        setBooleanField(term36911, term36911.getClass(), "endCombatHandled", false);
        setField(term36911, term36911.getClass(), "wormHole", null);
        setIntField(term36911, term36911.getClass(), "timerForWormHole", 0);
        setBooleanField(term36911, term36911.getClass(), "defenderEscaped", false);
        setBooleanField(term36911, term36911.getClass(), "attackerEscaped", false);
        setField(term36911, term36911.getClass(), "escapePosition", null);
        setField(term36911, term36911.getClass(), "combatEvent", null);
        setIntField(term36911, term36911.getClass(), "defenderMilitaryValue", 0);
        setIntField(term36911, term36911.getClass(), "attackerMilitaryValue", 0);
        setField(term36911, term36911.getClass(), "leaderKilledNews", null);
        setField(term36911, term36911.getClass(), "orbitalDestroyedNews", null);
        setField(term36911, term36911.getClass(), "leaderInCombat", null);
        setBooleanField(term36911, term36911.getClass(), "attackerPrivateer", false);
        setBooleanField(term36911, term36911.getClass(), "defenderPrivateer", false);
        setBooleanField(term36911, term36911.getClass(), "orbitalInCombat", false);
        setIntField(term36911, term36911.getClass(), "starYear", 0);
        setBooleanField(term36911, term36911.getClass(), "worthOfWarHero", false);
        setField(term36827, term36827.getClass(), "combat", term36911);
        term36929 = new Integer(303007547);
        term36931 = new Integer(1498738343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term36929;
        args[1] = term36931;
        callMethod(klass, "splitText", argTypes, term36827, args);
    }

};


