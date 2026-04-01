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

public class PopupPanel_dismiss_162358849515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37245;

    public PopupPanel_dismiss_162358849515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37245 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term37270 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term37272 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term37281 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term37290 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term37299 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term37300 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term37301 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term37308 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term37310 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term37319 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term37320 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term37321 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term37329 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term37245, term37245.getClass(), "text", "pFAfANnxup");
        setField(term37245, term37245.getClass(), "title", "FbSIUZyBXZ");
        setIntField(term37270, term37270.getClass(), "imageType", -1156002984);
        setField(term37270, term37270.getClass(), "colorModel", null);
        setField(term37272, term37272.getClass(), "sampleModel", null);
        setField(term37272, term37272.getClass(), "dataBuffer", null);
        setIntField(term37272, term37272.getClass(), "minX", 1676254730);
        setIntField(term37272, term37272.getClass(), "minY", -1661200819);
        setIntField(term37272, term37272.getClass(), "width", -235039141);
        setIntField(term37272, term37272.getClass(), "height", -1414233013);
        setIntField(term37272, term37272.getClass(), "sampleModelTranslateX", -1174440096);
        setIntField(term37272, term37272.getClass(), "sampleModelTranslateY", -679614653);
        setIntField(term37272, term37272.getClass(), "numBands", -561851867);
        setIntField(term37272, term37272.getClass(), "numDataElements", -1809928454);
        setField(term37281, term37281.getClass(), "sampleModel", null);
        setField(term37281, term37281.getClass(), "dataBuffer", null);
        setIntField(term37281, term37281.getClass(), "minX", -191639503);
        setIntField(term37281, term37281.getClass(), "minY", -1563700756);
        setIntField(term37281, term37281.getClass(), "width", -208314837);
        setIntField(term37281, term37281.getClass(), "height", 697841387);
        setIntField(term37281, term37281.getClass(), "sampleModelTranslateX", -1749591213);
        setIntField(term37281, term37281.getClass(), "sampleModelTranslateY", 1703093401);
        setIntField(term37281, term37281.getClass(), "numBands", 47607734);
        setIntField(term37281, term37281.getClass(), "numDataElements", 1717232691);
        setField(term37290, term37290.getClass(), "sampleModel", null);
        setField(term37290, term37290.getClass(), "dataBuffer", null);
        setIntField(term37290, term37290.getClass(), "minX", 0);
        setIntField(term37290, term37290.getClass(), "minY", 0);
        setIntField(term37290, term37290.getClass(), "width", 0);
        setIntField(term37290, term37290.getClass(), "height", 0);
        setIntField(term37290, term37290.getClass(), "sampleModelTranslateX", 0);
        setIntField(term37290, term37290.getClass(), "sampleModelTranslateY", 0);
        setIntField(term37290, term37290.getClass(), "numBands", 0);
        setIntField(term37290, term37290.getClass(), "numDataElements", 0);
        setField(term37290, term37290.getClass(), "parent", null);
        setField(term37281, term37281.getClass(), "parent", term37290);
        setField(term37272, term37272.getClass(), "parent", term37281);
        setField(term37270, term37270.getClass(), "raster", term37272);
        setField(term37270, term37270.getClass(), "osis", null);
        setIntField(term37301, term37301.getClass(), "hash", -104378544);
        setField(term37301, term37301.getClass(), "key", null);
        setField(term37301, term37301.getClass(), "value", null);
        setField(term37301, term37301.getClass(), "next", null);
        setElement(term37300, 7, term37301);
        setField(term37299, term37299.getClass(), "table", term37300);
        setIntField(term37299, term37299.getClass(), "count", 1);
        setIntField(term37299, term37299.getClass(), "threshold", 8);
        setFloatField(term37299, term37299.getClass(), "loadFactor", 0.75F);
        setIntField(term37299, term37299.getClass(), "modCount", 1);
        setField(term37299, term37299.getClass(), "keySet", null);
        setField(term37299, term37299.getClass(), "entrySet", null);
        setField(term37299, term37299.getClass(), "values", null);
        setField(term37270, term37270.getClass(), "properties", term37299);
        setFloatField(term37270, term37270.getClass(), "accelerationPriority", 0.15897971F);
        setField(term37270, term37270.getClass(), "surfaceManager", null);
        setField(term37245, term37245.getClass(), "image", term37270);
        setIntField(term37308, term37308.getClass(), "imageType", -1408678076);
        setField(term37308, term37308.getClass(), "colorModel", null);
        setField(term37310, term37310.getClass(), "sampleModel", null);
        setField(term37310, term37310.getClass(), "dataBuffer", null);
        setIntField(term37310, term37310.getClass(), "minX", 0);
        setIntField(term37310, term37310.getClass(), "minY", 0);
        setIntField(term37310, term37310.getClass(), "width", 0);
        setIntField(term37310, term37310.getClass(), "height", 0);
        setIntField(term37310, term37310.getClass(), "sampleModelTranslateX", 0);
        setIntField(term37310, term37310.getClass(), "sampleModelTranslateY", 0);
        setIntField(term37310, term37310.getClass(), "numBands", 0);
        setIntField(term37310, term37310.getClass(), "numDataElements", 0);
        setField(term37310, term37310.getClass(), "parent", null);
        setField(term37308, term37308.getClass(), "raster", term37310);
        setField(term37308, term37308.getClass(), "osis", null);
        setIntField(term37321, term37321.getClass(), "hash", -549432378);
        setField(term37321, term37321.getClass(), "key", null);
        setField(term37321, term37321.getClass(), "value", null);
        setField(term37321, term37321.getClass(), "next", null);
        setElement(term37320, 2, term37321);
        setField(term37319, term37319.getClass(), "table", term37320);
        setIntField(term37319, term37319.getClass(), "count", 1);
        setIntField(term37319, term37319.getClass(), "threshold", 8);
        setFloatField(term37319, term37319.getClass(), "loadFactor", 0.75F);
        setIntField(term37319, term37319.getClass(), "modCount", 1);
        setField(term37319, term37319.getClass(), "keySet", null);
        setField(term37319, term37319.getClass(), "entrySet", null);
        setField(term37319, term37319.getClass(), "values", null);
        setField(term37308, term37308.getClass(), "properties", term37319);
        setFloatField(term37308, term37308.getClass(), "accelerationPriority", 0.0F);
        setField(term37308, term37308.getClass(), "surfaceManager", null);
        setField(term37245, term37245.getClass(), "scaledImage", term37308);
        setBooleanField(term37245, term37245.getClass(), "dismissed", true);
        setField(term37329, term37329.getClass(), "combatShipList", null);
        setIntField(term37329, term37329.getClass(), "shipIndex", 0);
        setIntField(term37329, term37329.getClass(), "cursorX", 0);
        setIntField(term37329, term37329.getClass(), "cursorY", 0);
        setIntField(term37329, term37329.getClass(), "componentUse", 0);
        setField(term37329, term37329.getClass(), "animation", null);
        setField(term37329, term37329.getClass(), "attackerFleet", null);
        setField(term37329, term37329.getClass(), "defenderFleet", null);
        setField(term37329, term37329.getClass(), "starbaseFleet", null);
        setField(term37329, term37329.getClass(), "winner", null);
        setField(term37329, term37329.getClass(), "attackerInfo", null);
        setField(term37329, term37329.getClass(), "defenderInfo", null);
        setField(term37329, term37329.getClass(), "planet", null);
        setIntField(term37329, term37329.getClass(), "totalRounds", 0);
        setIntField(term37329, term37329.getClass(), "roundsNoDamge", 0);
        setBooleanField(term37329, term37329.getClass(), "endCombatHandled", false);
        setField(term37329, term37329.getClass(), "wormHole", null);
        setIntField(term37329, term37329.getClass(), "timerForWormHole", 0);
        setBooleanField(term37329, term37329.getClass(), "defenderEscaped", false);
        setBooleanField(term37329, term37329.getClass(), "attackerEscaped", false);
        setField(term37329, term37329.getClass(), "escapePosition", null);
        setField(term37329, term37329.getClass(), "combatEvent", null);
        setIntField(term37329, term37329.getClass(), "defenderMilitaryValue", 0);
        setIntField(term37329, term37329.getClass(), "attackerMilitaryValue", 0);
        setField(term37329, term37329.getClass(), "leaderKilledNews", null);
        setField(term37329, term37329.getClass(), "orbitalDestroyedNews", null);
        setField(term37329, term37329.getClass(), "leaderInCombat", null);
        setBooleanField(term37329, term37329.getClass(), "attackerPrivateer", false);
        setBooleanField(term37329, term37329.getClass(), "defenderPrivateer", false);
        setBooleanField(term37329, term37329.getClass(), "orbitalInCombat", false);
        setIntField(term37329, term37329.getClass(), "starYear", 0);
        setBooleanField(term37329, term37329.getClass(), "worthOfWarHero", false);
        setField(term37245, term37245.getClass(), "combat", term37329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dismiss", argTypes, term37245, args);
    }

};


