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

public class PopupPanel_drawGradientBorder_198679291013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36953;
     Object term37055;
     Object term37057;
     Object term37059;
     Object term37061;

    public PopupPanel_drawGradientBorder_198679291013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36953 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term36978 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36980 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36989 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36998 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term37007 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term37008 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term37009 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term37016 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term37018 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term37027 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term37028 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term37029 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term37037 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term36953, term36953.getClass(), "text", "ITRRYiuDwH");
        setField(term36953, term36953.getClass(), "title", "llRfwANcVF");
        setIntField(term36978, term36978.getClass(), "imageType", -1635571857);
        setField(term36978, term36978.getClass(), "colorModel", null);
        setField(term36980, term36980.getClass(), "sampleModel", null);
        setField(term36980, term36980.getClass(), "dataBuffer", null);
        setIntField(term36980, term36980.getClass(), "minX", 1407309162);
        setIntField(term36980, term36980.getClass(), "minY", -534033672);
        setIntField(term36980, term36980.getClass(), "width", -1162790806);
        setIntField(term36980, term36980.getClass(), "height", -1264595049);
        setIntField(term36980, term36980.getClass(), "sampleModelTranslateX", -2058884635);
        setIntField(term36980, term36980.getClass(), "sampleModelTranslateY", 1064185088);
        setIntField(term36980, term36980.getClass(), "numBands", -1249782654);
        setIntField(term36980, term36980.getClass(), "numDataElements", 399302934);
        setField(term36989, term36989.getClass(), "sampleModel", null);
        setField(term36989, term36989.getClass(), "dataBuffer", null);
        setIntField(term36989, term36989.getClass(), "minX", -1823255084);
        setIntField(term36989, term36989.getClass(), "minY", 793345010);
        setIntField(term36989, term36989.getClass(), "width", -2092117838);
        setIntField(term36989, term36989.getClass(), "height", 1524590776);
        setIntField(term36989, term36989.getClass(), "sampleModelTranslateX", 1523896653);
        setIntField(term36989, term36989.getClass(), "sampleModelTranslateY", -1731921726);
        setIntField(term36989, term36989.getClass(), "numBands", 919994471);
        setIntField(term36989, term36989.getClass(), "numDataElements", 183531701);
        setField(term36998, term36998.getClass(), "sampleModel", null);
        setField(term36998, term36998.getClass(), "dataBuffer", null);
        setIntField(term36998, term36998.getClass(), "minX", 0);
        setIntField(term36998, term36998.getClass(), "minY", 0);
        setIntField(term36998, term36998.getClass(), "width", 0);
        setIntField(term36998, term36998.getClass(), "height", 0);
        setIntField(term36998, term36998.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36998, term36998.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36998, term36998.getClass(), "numBands", 0);
        setIntField(term36998, term36998.getClass(), "numDataElements", 0);
        setField(term36998, term36998.getClass(), "parent", null);
        setField(term36989, term36989.getClass(), "parent", term36998);
        setField(term36980, term36980.getClass(), "parent", term36989);
        setField(term36978, term36978.getClass(), "raster", term36980);
        setField(term36978, term36978.getClass(), "osis", null);
        setIntField(term37009, term37009.getClass(), "hash", 1438057604);
        setField(term37009, term37009.getClass(), "key", null);
        setField(term37009, term37009.getClass(), "value", null);
        setField(term37009, term37009.getClass(), "next", null);
        setElement(term37008, 5, term37009);
        setField(term37007, term37007.getClass(), "table", term37008);
        setIntField(term37007, term37007.getClass(), "count", 1);
        setIntField(term37007, term37007.getClass(), "threshold", 8);
        setFloatField(term37007, term37007.getClass(), "loadFactor", 0.75F);
        setIntField(term37007, term37007.getClass(), "modCount", 1);
        setField(term37007, term37007.getClass(), "keySet", null);
        setField(term37007, term37007.getClass(), "entrySet", null);
        setField(term37007, term37007.getClass(), "values", null);
        setField(term36978, term36978.getClass(), "properties", term37007);
        setFloatField(term36978, term36978.getClass(), "accelerationPriority", 0.3329633F);
        setField(term36978, term36978.getClass(), "surfaceManager", null);
        setField(term36953, term36953.getClass(), "image", term36978);
        setIntField(term37016, term37016.getClass(), "imageType", 1876738932);
        setField(term37016, term37016.getClass(), "colorModel", null);
        setField(term37018, term37018.getClass(), "sampleModel", null);
        setField(term37018, term37018.getClass(), "dataBuffer", null);
        setIntField(term37018, term37018.getClass(), "minX", 0);
        setIntField(term37018, term37018.getClass(), "minY", 0);
        setIntField(term37018, term37018.getClass(), "width", 0);
        setIntField(term37018, term37018.getClass(), "height", 0);
        setIntField(term37018, term37018.getClass(), "sampleModelTranslateX", 0);
        setIntField(term37018, term37018.getClass(), "sampleModelTranslateY", 0);
        setIntField(term37018, term37018.getClass(), "numBands", 0);
        setIntField(term37018, term37018.getClass(), "numDataElements", 0);
        setField(term37018, term37018.getClass(), "parent", null);
        setField(term37016, term37016.getClass(), "raster", term37018);
        setField(term37016, term37016.getClass(), "osis", null);
        setIntField(term37029, term37029.getClass(), "hash", 1730150123);
        setField(term37029, term37029.getClass(), "key", null);
        setField(term37029, term37029.getClass(), "value", null);
        setField(term37029, term37029.getClass(), "next", null);
        setElement(term37028, 9, term37029);
        setField(term37027, term37027.getClass(), "table", term37028);
        setIntField(term37027, term37027.getClass(), "count", 1);
        setIntField(term37027, term37027.getClass(), "threshold", 8);
        setFloatField(term37027, term37027.getClass(), "loadFactor", 0.75F);
        setIntField(term37027, term37027.getClass(), "modCount", 1);
        setField(term37027, term37027.getClass(), "keySet", null);
        setField(term37027, term37027.getClass(), "entrySet", null);
        setField(term37027, term37027.getClass(), "values", null);
        setField(term37016, term37016.getClass(), "properties", term37027);
        setFloatField(term37016, term37016.getClass(), "accelerationPriority", 0.0F);
        setField(term37016, term37016.getClass(), "surfaceManager", null);
        setField(term36953, term36953.getClass(), "scaledImage", term37016);
        setBooleanField(term36953, term36953.getClass(), "dismissed", true);
        setField(term37037, term37037.getClass(), "combatShipList", null);
        setIntField(term37037, term37037.getClass(), "shipIndex", 0);
        setIntField(term37037, term37037.getClass(), "cursorX", 0);
        setIntField(term37037, term37037.getClass(), "cursorY", 0);
        setIntField(term37037, term37037.getClass(), "componentUse", 0);
        setField(term37037, term37037.getClass(), "animation", null);
        setField(term37037, term37037.getClass(), "attackerFleet", null);
        setField(term37037, term37037.getClass(), "defenderFleet", null);
        setField(term37037, term37037.getClass(), "starbaseFleet", null);
        setField(term37037, term37037.getClass(), "winner", null);
        setField(term37037, term37037.getClass(), "attackerInfo", null);
        setField(term37037, term37037.getClass(), "defenderInfo", null);
        setField(term37037, term37037.getClass(), "planet", null);
        setIntField(term37037, term37037.getClass(), "totalRounds", 0);
        setIntField(term37037, term37037.getClass(), "roundsNoDamge", 0);
        setBooleanField(term37037, term37037.getClass(), "endCombatHandled", false);
        setField(term37037, term37037.getClass(), "wormHole", null);
        setIntField(term37037, term37037.getClass(), "timerForWormHole", 0);
        setBooleanField(term37037, term37037.getClass(), "defenderEscaped", false);
        setBooleanField(term37037, term37037.getClass(), "attackerEscaped", false);
        setField(term37037, term37037.getClass(), "escapePosition", null);
        setField(term37037, term37037.getClass(), "combatEvent", null);
        setIntField(term37037, term37037.getClass(), "defenderMilitaryValue", 0);
        setIntField(term37037, term37037.getClass(), "attackerMilitaryValue", 0);
        setField(term37037, term37037.getClass(), "leaderKilledNews", null);
        setField(term37037, term37037.getClass(), "orbitalDestroyedNews", null);
        setField(term37037, term37037.getClass(), "leaderInCombat", null);
        setBooleanField(term37037, term37037.getClass(), "attackerPrivateer", false);
        setBooleanField(term37037, term37037.getClass(), "defenderPrivateer", false);
        setBooleanField(term37037, term37037.getClass(), "orbitalInCombat", false);
        setIntField(term37037, term37037.getClass(), "starYear", 0);
        setBooleanField(term37037, term37037.getClass(), "worthOfWarHero", false);
        setField(term36953, term36953.getClass(), "combat", term37037);
        term37055 = new Integer(-1549603566);
        term37057 = new Integer(1077223540);
        term37059 = new Integer(-1823813592);
        term37061 = new Integer(-1644358555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term37055;
        args[2] = term37057;
        args[3] = term37059;
        args[4] = term37061;
        callMethod(klass, "drawGradientBorder", argTypes, term36953, args);
    }

};


