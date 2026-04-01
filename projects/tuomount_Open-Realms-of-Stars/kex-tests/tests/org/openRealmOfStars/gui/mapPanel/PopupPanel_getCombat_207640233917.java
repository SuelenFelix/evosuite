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

public class PopupPanel_getCombat_207640233917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37489;

    public PopupPanel_getCombat_207640233917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37489 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term37514 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term37516 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term37525 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term37534 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term37543 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term37544 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term37545 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term37552 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term37554 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term37563 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term37564 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term37565 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term37573 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term37489, term37489.getClass(), "text", "IEYhJmgCVd");
        setField(term37489, term37489.getClass(), "title", "KSJeYkkvpk");
        setIntField(term37514, term37514.getClass(), "imageType", 1762934060);
        setField(term37514, term37514.getClass(), "colorModel", null);
        setField(term37516, term37516.getClass(), "sampleModel", null);
        setField(term37516, term37516.getClass(), "dataBuffer", null);
        setIntField(term37516, term37516.getClass(), "minX", -859828739);
        setIntField(term37516, term37516.getClass(), "minY", 1986855642);
        setIntField(term37516, term37516.getClass(), "width", 1280322790);
        setIntField(term37516, term37516.getClass(), "height", -1702209203);
        setIntField(term37516, term37516.getClass(), "sampleModelTranslateX", -1592307668);
        setIntField(term37516, term37516.getClass(), "sampleModelTranslateY", -203832871);
        setIntField(term37516, term37516.getClass(), "numBands", 1151963130);
        setIntField(term37516, term37516.getClass(), "numDataElements", -1855819749);
        setField(term37525, term37525.getClass(), "sampleModel", null);
        setField(term37525, term37525.getClass(), "dataBuffer", null);
        setIntField(term37525, term37525.getClass(), "minX", 1059048043);
        setIntField(term37525, term37525.getClass(), "minY", 537273345);
        setIntField(term37525, term37525.getClass(), "width", -346107257);
        setIntField(term37525, term37525.getClass(), "height", -1577393360);
        setIntField(term37525, term37525.getClass(), "sampleModelTranslateX", 1112256038);
        setIntField(term37525, term37525.getClass(), "sampleModelTranslateY", -441333794);
        setIntField(term37525, term37525.getClass(), "numBands", 1504698817);
        setIntField(term37525, term37525.getClass(), "numDataElements", -2018333791);
        setField(term37534, term37534.getClass(), "sampleModel", null);
        setField(term37534, term37534.getClass(), "dataBuffer", null);
        setIntField(term37534, term37534.getClass(), "minX", 0);
        setIntField(term37534, term37534.getClass(), "minY", 0);
        setIntField(term37534, term37534.getClass(), "width", 0);
        setIntField(term37534, term37534.getClass(), "height", 0);
        setIntField(term37534, term37534.getClass(), "sampleModelTranslateX", 0);
        setIntField(term37534, term37534.getClass(), "sampleModelTranslateY", 0);
        setIntField(term37534, term37534.getClass(), "numBands", 0);
        setIntField(term37534, term37534.getClass(), "numDataElements", 0);
        setField(term37534, term37534.getClass(), "parent", null);
        setField(term37525, term37525.getClass(), "parent", term37534);
        setField(term37516, term37516.getClass(), "parent", term37525);
        setField(term37514, term37514.getClass(), "raster", term37516);
        setField(term37514, term37514.getClass(), "osis", null);
        setIntField(term37545, term37545.getClass(), "hash", -1192832130);
        setField(term37545, term37545.getClass(), "key", null);
        setField(term37545, term37545.getClass(), "value", null);
        setField(term37545, term37545.getClass(), "next", null);
        setElement(term37544, 7, term37545);
        setField(term37543, term37543.getClass(), "table", term37544);
        setIntField(term37543, term37543.getClass(), "count", 1);
        setIntField(term37543, term37543.getClass(), "threshold", 8);
        setFloatField(term37543, term37543.getClass(), "loadFactor", 0.75F);
        setIntField(term37543, term37543.getClass(), "modCount", 1);
        setField(term37543, term37543.getClass(), "keySet", null);
        setField(term37543, term37543.getClass(), "entrySet", null);
        setField(term37543, term37543.getClass(), "values", null);
        setField(term37514, term37514.getClass(), "properties", term37543);
        setFloatField(term37514, term37514.getClass(), "accelerationPriority", 0.22127885F);
        setField(term37514, term37514.getClass(), "surfaceManager", null);
        setField(term37489, term37489.getClass(), "image", term37514);
        setIntField(term37552, term37552.getClass(), "imageType", -824369460);
        setField(term37552, term37552.getClass(), "colorModel", null);
        setField(term37554, term37554.getClass(), "sampleModel", null);
        setField(term37554, term37554.getClass(), "dataBuffer", null);
        setIntField(term37554, term37554.getClass(), "minX", 0);
        setIntField(term37554, term37554.getClass(), "minY", 0);
        setIntField(term37554, term37554.getClass(), "width", 0);
        setIntField(term37554, term37554.getClass(), "height", 0);
        setIntField(term37554, term37554.getClass(), "sampleModelTranslateX", 0);
        setIntField(term37554, term37554.getClass(), "sampleModelTranslateY", 0);
        setIntField(term37554, term37554.getClass(), "numBands", 0);
        setIntField(term37554, term37554.getClass(), "numDataElements", 0);
        setField(term37554, term37554.getClass(), "parent", null);
        setField(term37552, term37552.getClass(), "raster", term37554);
        setField(term37552, term37552.getClass(), "osis", null);
        setIntField(term37565, term37565.getClass(), "hash", -1197823378);
        setField(term37565, term37565.getClass(), "key", null);
        setField(term37565, term37565.getClass(), "value", null);
        setField(term37565, term37565.getClass(), "next", null);
        setElement(term37564, 9, term37565);
        setField(term37563, term37563.getClass(), "table", term37564);
        setIntField(term37563, term37563.getClass(), "count", 1);
        setIntField(term37563, term37563.getClass(), "threshold", 8);
        setFloatField(term37563, term37563.getClass(), "loadFactor", 0.75F);
        setIntField(term37563, term37563.getClass(), "modCount", 1);
        setField(term37563, term37563.getClass(), "keySet", null);
        setField(term37563, term37563.getClass(), "entrySet", null);
        setField(term37563, term37563.getClass(), "values", null);
        setField(term37552, term37552.getClass(), "properties", term37563);
        setFloatField(term37552, term37552.getClass(), "accelerationPriority", 0.0F);
        setField(term37552, term37552.getClass(), "surfaceManager", null);
        setField(term37489, term37489.getClass(), "scaledImage", term37552);
        setBooleanField(term37489, term37489.getClass(), "dismissed", false);
        setField(term37573, term37573.getClass(), "combatShipList", null);
        setIntField(term37573, term37573.getClass(), "shipIndex", 0);
        setIntField(term37573, term37573.getClass(), "cursorX", 0);
        setIntField(term37573, term37573.getClass(), "cursorY", 0);
        setIntField(term37573, term37573.getClass(), "componentUse", 0);
        setField(term37573, term37573.getClass(), "animation", null);
        setField(term37573, term37573.getClass(), "attackerFleet", null);
        setField(term37573, term37573.getClass(), "defenderFleet", null);
        setField(term37573, term37573.getClass(), "starbaseFleet", null);
        setField(term37573, term37573.getClass(), "winner", null);
        setField(term37573, term37573.getClass(), "attackerInfo", null);
        setField(term37573, term37573.getClass(), "defenderInfo", null);
        setField(term37573, term37573.getClass(), "planet", null);
        setIntField(term37573, term37573.getClass(), "totalRounds", 0);
        setIntField(term37573, term37573.getClass(), "roundsNoDamge", 0);
        setBooleanField(term37573, term37573.getClass(), "endCombatHandled", false);
        setField(term37573, term37573.getClass(), "wormHole", null);
        setIntField(term37573, term37573.getClass(), "timerForWormHole", 0);
        setBooleanField(term37573, term37573.getClass(), "defenderEscaped", false);
        setBooleanField(term37573, term37573.getClass(), "attackerEscaped", false);
        setField(term37573, term37573.getClass(), "escapePosition", null);
        setField(term37573, term37573.getClass(), "combatEvent", null);
        setIntField(term37573, term37573.getClass(), "defenderMilitaryValue", 0);
        setIntField(term37573, term37573.getClass(), "attackerMilitaryValue", 0);
        setField(term37573, term37573.getClass(), "leaderKilledNews", null);
        setField(term37573, term37573.getClass(), "orbitalDestroyedNews", null);
        setField(term37573, term37573.getClass(), "leaderInCombat", null);
        setBooleanField(term37573, term37573.getClass(), "attackerPrivateer", false);
        setBooleanField(term37573, term37573.getClass(), "defenderPrivateer", false);
        setBooleanField(term37573, term37573.getClass(), "orbitalInCombat", false);
        setIntField(term37573, term37573.getClass(), "starYear", 0);
        setBooleanField(term37573, term37573.getClass(), "worthOfWarHero", false);
        setField(term37489, term37489.getClass(), "combat", term37573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCombat", argTypes, term37489, args);
    }

};


