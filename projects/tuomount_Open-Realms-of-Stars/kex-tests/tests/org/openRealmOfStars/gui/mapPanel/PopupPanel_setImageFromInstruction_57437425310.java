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

public class PopupPanel_setImageFromInstruction_57437425310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36546;
     Object term36648;

    public PopupPanel_setImageFromInstruction_57437425310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36546 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term36571 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36573 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36582 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36591 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36600 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36601 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36602 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36609 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36611 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36620 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36621 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36622 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36630 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term36546, term36546.getClass(), "text", "dAldIGYAXV");
        setField(term36546, term36546.getClass(), "title", "mLwibAPEsa");
        setIntField(term36571, term36571.getClass(), "imageType", -382652403);
        setField(term36571, term36571.getClass(), "colorModel", null);
        setField(term36573, term36573.getClass(), "sampleModel", null);
        setField(term36573, term36573.getClass(), "dataBuffer", null);
        setIntField(term36573, term36573.getClass(), "minX", -2126539433);
        setIntField(term36573, term36573.getClass(), "minY", 196952878);
        setIntField(term36573, term36573.getClass(), "width", 802673242);
        setIntField(term36573, term36573.getClass(), "height", -1808638031);
        setIntField(term36573, term36573.getClass(), "sampleModelTranslateX", -1514240086);
        setIntField(term36573, term36573.getClass(), "sampleModelTranslateY", 2052244839);
        setIntField(term36573, term36573.getClass(), "numBands", -1763480506);
        setIntField(term36573, term36573.getClass(), "numDataElements", -1541297110);
        setField(term36582, term36582.getClass(), "sampleModel", null);
        setField(term36582, term36582.getClass(), "dataBuffer", null);
        setIntField(term36582, term36582.getClass(), "minX", -1581464804);
        setIntField(term36582, term36582.getClass(), "minY", -1954937310);
        setIntField(term36582, term36582.getClass(), "width", -460657407);
        setIntField(term36582, term36582.getClass(), "height", 941003590);
        setIntField(term36582, term36582.getClass(), "sampleModelTranslateX", -1825624890);
        setIntField(term36582, term36582.getClass(), "sampleModelTranslateY", 413214164);
        setIntField(term36582, term36582.getClass(), "numBands", 355911655);
        setIntField(term36582, term36582.getClass(), "numDataElements", 1811833766);
        setField(term36591, term36591.getClass(), "sampleModel", null);
        setField(term36591, term36591.getClass(), "dataBuffer", null);
        setIntField(term36591, term36591.getClass(), "minX", 0);
        setIntField(term36591, term36591.getClass(), "minY", 0);
        setIntField(term36591, term36591.getClass(), "width", 0);
        setIntField(term36591, term36591.getClass(), "height", 0);
        setIntField(term36591, term36591.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36591, term36591.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36591, term36591.getClass(), "numBands", 0);
        setIntField(term36591, term36591.getClass(), "numDataElements", 0);
        setField(term36591, term36591.getClass(), "parent", null);
        setField(term36582, term36582.getClass(), "parent", term36591);
        setField(term36573, term36573.getClass(), "parent", term36582);
        setField(term36571, term36571.getClass(), "raster", term36573);
        setField(term36571, term36571.getClass(), "osis", null);
        setIntField(term36602, term36602.getClass(), "hash", 1830545547);
        setField(term36602, term36602.getClass(), "key", null);
        setField(term36602, term36602.getClass(), "value", null);
        setField(term36602, term36602.getClass(), "next", null);
        setElement(term36601, 6, term36602);
        setField(term36600, term36600.getClass(), "table", term36601);
        setIntField(term36600, term36600.getClass(), "count", 1);
        setIntField(term36600, term36600.getClass(), "threshold", 8);
        setFloatField(term36600, term36600.getClass(), "loadFactor", 0.75F);
        setIntField(term36600, term36600.getClass(), "modCount", 1);
        setField(term36600, term36600.getClass(), "keySet", null);
        setField(term36600, term36600.getClass(), "entrySet", null);
        setField(term36600, term36600.getClass(), "values", null);
        setField(term36571, term36571.getClass(), "properties", term36600);
        setFloatField(term36571, term36571.getClass(), "accelerationPriority", 0.6689965F);
        setField(term36571, term36571.getClass(), "surfaceManager", null);
        setField(term36546, term36546.getClass(), "image", term36571);
        setIntField(term36609, term36609.getClass(), "imageType", -1784072578);
        setField(term36609, term36609.getClass(), "colorModel", null);
        setField(term36611, term36611.getClass(), "sampleModel", null);
        setField(term36611, term36611.getClass(), "dataBuffer", null);
        setIntField(term36611, term36611.getClass(), "minX", 0);
        setIntField(term36611, term36611.getClass(), "minY", 0);
        setIntField(term36611, term36611.getClass(), "width", 0);
        setIntField(term36611, term36611.getClass(), "height", 0);
        setIntField(term36611, term36611.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36611, term36611.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36611, term36611.getClass(), "numBands", 0);
        setIntField(term36611, term36611.getClass(), "numDataElements", 0);
        setField(term36611, term36611.getClass(), "parent", null);
        setField(term36609, term36609.getClass(), "raster", term36611);
        setField(term36609, term36609.getClass(), "osis", null);
        setIntField(term36622, term36622.getClass(), "hash", 25663126);
        setField(term36622, term36622.getClass(), "key", null);
        setField(term36622, term36622.getClass(), "value", null);
        setField(term36622, term36622.getClass(), "next", null);
        setElement(term36621, 5, term36622);
        setField(term36620, term36620.getClass(), "table", term36621);
        setIntField(term36620, term36620.getClass(), "count", 1);
        setIntField(term36620, term36620.getClass(), "threshold", 8);
        setFloatField(term36620, term36620.getClass(), "loadFactor", 0.75F);
        setIntField(term36620, term36620.getClass(), "modCount", 1);
        setField(term36620, term36620.getClass(), "keySet", null);
        setField(term36620, term36620.getClass(), "entrySet", null);
        setField(term36620, term36620.getClass(), "values", null);
        setField(term36609, term36609.getClass(), "properties", term36620);
        setFloatField(term36609, term36609.getClass(), "accelerationPriority", 0.0F);
        setField(term36609, term36609.getClass(), "surfaceManager", null);
        setField(term36546, term36546.getClass(), "scaledImage", term36609);
        setBooleanField(term36546, term36546.getClass(), "dismissed", false);
        setField(term36630, term36630.getClass(), "combatShipList", null);
        setIntField(term36630, term36630.getClass(), "shipIndex", 0);
        setIntField(term36630, term36630.getClass(), "cursorX", 0);
        setIntField(term36630, term36630.getClass(), "cursorY", 0);
        setIntField(term36630, term36630.getClass(), "componentUse", 0);
        setField(term36630, term36630.getClass(), "animation", null);
        setField(term36630, term36630.getClass(), "attackerFleet", null);
        setField(term36630, term36630.getClass(), "defenderFleet", null);
        setField(term36630, term36630.getClass(), "starbaseFleet", null);
        setField(term36630, term36630.getClass(), "winner", null);
        setField(term36630, term36630.getClass(), "attackerInfo", null);
        setField(term36630, term36630.getClass(), "defenderInfo", null);
        setField(term36630, term36630.getClass(), "planet", null);
        setIntField(term36630, term36630.getClass(), "totalRounds", 0);
        setIntField(term36630, term36630.getClass(), "roundsNoDamge", 0);
        setBooleanField(term36630, term36630.getClass(), "endCombatHandled", false);
        setField(term36630, term36630.getClass(), "wormHole", null);
        setIntField(term36630, term36630.getClass(), "timerForWormHole", 0);
        setBooleanField(term36630, term36630.getClass(), "defenderEscaped", false);
        setBooleanField(term36630, term36630.getClass(), "attackerEscaped", false);
        setField(term36630, term36630.getClass(), "escapePosition", null);
        setField(term36630, term36630.getClass(), "combatEvent", null);
        setIntField(term36630, term36630.getClass(), "defenderMilitaryValue", 0);
        setIntField(term36630, term36630.getClass(), "attackerMilitaryValue", 0);
        setField(term36630, term36630.getClass(), "leaderKilledNews", null);
        setField(term36630, term36630.getClass(), "orbitalDestroyedNews", null);
        setField(term36630, term36630.getClass(), "leaderInCombat", null);
        setBooleanField(term36630, term36630.getClass(), "attackerPrivateer", false);
        setBooleanField(term36630, term36630.getClass(), "defenderPrivateer", false);
        setBooleanField(term36630, term36630.getClass(), "orbitalInCombat", false);
        setIntField(term36630, term36630.getClass(), "starYear", 0);
        setBooleanField(term36630, term36630.getClass(), "worthOfWarHero", false);
        setField(term36546, term36546.getClass(), "combat", term36630);
        term36648 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction"));
        Object term36649 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term36650 = (byte[]) newByteArray(16);
        setField(term36649, term36649.getClass(), "value", term36650);
        setByteField(term36649, term36649.getClass(), "coder", (byte) 0);
        setIntField(term36649, term36649.getClass(), "count", 0);
        setField(term36648, term36648.getClass(), "sb", term36649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Object[] args = new Object[1];
        args[0] = term36648;
        callMethod(klass, "setImageFromInstruction", argTypes, term36546, args);
    }

};


