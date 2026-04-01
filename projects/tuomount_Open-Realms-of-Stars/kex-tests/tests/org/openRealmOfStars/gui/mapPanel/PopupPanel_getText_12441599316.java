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

public class PopupPanel_getText_12441599316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35996;

    public PopupPanel_getText_12441599316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35996 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term36021 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36023 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36032 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36041 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36050 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36051 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36052 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36059 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36061 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36070 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36071 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36072 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36080 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term35996, term35996.getClass(), "text", "jnwVnmKAFv");
        setField(term35996, term35996.getClass(), "title", "TXyHhqeCjR");
        setIntField(term36021, term36021.getClass(), "imageType", -689879283);
        setField(term36021, term36021.getClass(), "colorModel", null);
        setField(term36023, term36023.getClass(), "sampleModel", null);
        setField(term36023, term36023.getClass(), "dataBuffer", null);
        setIntField(term36023, term36023.getClass(), "minX", 1985432430);
        setIntField(term36023, term36023.getClass(), "minY", -1769933499);
        setIntField(term36023, term36023.getClass(), "width", -1510932472);
        setIntField(term36023, term36023.getClass(), "height", 1970654816);
        setIntField(term36023, term36023.getClass(), "sampleModelTranslateX", 1354781442);
        setIntField(term36023, term36023.getClass(), "sampleModelTranslateY", -393590701);
        setIntField(term36023, term36023.getClass(), "numBands", 86344574);
        setIntField(term36023, term36023.getClass(), "numDataElements", -829441157);
        setField(term36032, term36032.getClass(), "sampleModel", null);
        setField(term36032, term36032.getClass(), "dataBuffer", null);
        setIntField(term36032, term36032.getClass(), "minX", -1489991025);
        setIntField(term36032, term36032.getClass(), "minY", -1542979444);
        setIntField(term36032, term36032.getClass(), "width", -1130401612);
        setIntField(term36032, term36032.getClass(), "height", -316771104);
        setIntField(term36032, term36032.getClass(), "sampleModelTranslateX", -1374527319);
        setIntField(term36032, term36032.getClass(), "sampleModelTranslateY", -1735276919);
        setIntField(term36032, term36032.getClass(), "numBands", -712023865);
        setIntField(term36032, term36032.getClass(), "numDataElements", 613256157);
        setField(term36041, term36041.getClass(), "sampleModel", null);
        setField(term36041, term36041.getClass(), "dataBuffer", null);
        setIntField(term36041, term36041.getClass(), "minX", 0);
        setIntField(term36041, term36041.getClass(), "minY", 0);
        setIntField(term36041, term36041.getClass(), "width", 0);
        setIntField(term36041, term36041.getClass(), "height", 0);
        setIntField(term36041, term36041.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36041, term36041.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36041, term36041.getClass(), "numBands", 0);
        setIntField(term36041, term36041.getClass(), "numDataElements", 0);
        setField(term36041, term36041.getClass(), "parent", null);
        setField(term36032, term36032.getClass(), "parent", term36041);
        setField(term36023, term36023.getClass(), "parent", term36032);
        setField(term36021, term36021.getClass(), "raster", term36023);
        setField(term36021, term36021.getClass(), "osis", null);
        setIntField(term36052, term36052.getClass(), "hash", -1535098322);
        setField(term36052, term36052.getClass(), "key", null);
        setField(term36052, term36052.getClass(), "value", null);
        setField(term36052, term36052.getClass(), "next", null);
        setElement(term36051, 3, term36052);
        setField(term36050, term36050.getClass(), "table", term36051);
        setIntField(term36050, term36050.getClass(), "count", 1);
        setIntField(term36050, term36050.getClass(), "threshold", 8);
        setFloatField(term36050, term36050.getClass(), "loadFactor", 0.75F);
        setIntField(term36050, term36050.getClass(), "modCount", 1);
        setField(term36050, term36050.getClass(), "keySet", null);
        setField(term36050, term36050.getClass(), "entrySet", null);
        setField(term36050, term36050.getClass(), "values", null);
        setField(term36021, term36021.getClass(), "properties", term36050);
        setFloatField(term36021, term36021.getClass(), "accelerationPriority", 0.8582456F);
        setField(term36021, term36021.getClass(), "surfaceManager", null);
        setField(term35996, term35996.getClass(), "image", term36021);
        setIntField(term36059, term36059.getClass(), "imageType", 1798354517);
        setField(term36059, term36059.getClass(), "colorModel", null);
        setField(term36061, term36061.getClass(), "sampleModel", null);
        setField(term36061, term36061.getClass(), "dataBuffer", null);
        setIntField(term36061, term36061.getClass(), "minX", 0);
        setIntField(term36061, term36061.getClass(), "minY", 0);
        setIntField(term36061, term36061.getClass(), "width", 0);
        setIntField(term36061, term36061.getClass(), "height", 0);
        setIntField(term36061, term36061.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36061, term36061.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36061, term36061.getClass(), "numBands", 0);
        setIntField(term36061, term36061.getClass(), "numDataElements", 0);
        setField(term36061, term36061.getClass(), "parent", null);
        setField(term36059, term36059.getClass(), "raster", term36061);
        setField(term36059, term36059.getClass(), "osis", null);
        setIntField(term36072, term36072.getClass(), "hash", -1324495927);
        setField(term36072, term36072.getClass(), "key", null);
        setField(term36072, term36072.getClass(), "value", null);
        setField(term36072, term36072.getClass(), "next", null);
        setElement(term36071, 6, term36072);
        setField(term36070, term36070.getClass(), "table", term36071);
        setIntField(term36070, term36070.getClass(), "count", 1);
        setIntField(term36070, term36070.getClass(), "threshold", 8);
        setFloatField(term36070, term36070.getClass(), "loadFactor", 0.75F);
        setIntField(term36070, term36070.getClass(), "modCount", 1);
        setField(term36070, term36070.getClass(), "keySet", null);
        setField(term36070, term36070.getClass(), "entrySet", null);
        setField(term36070, term36070.getClass(), "values", null);
        setField(term36059, term36059.getClass(), "properties", term36070);
        setFloatField(term36059, term36059.getClass(), "accelerationPriority", 0.0F);
        setField(term36059, term36059.getClass(), "surfaceManager", null);
        setField(term35996, term35996.getClass(), "scaledImage", term36059);
        setBooleanField(term35996, term35996.getClass(), "dismissed", false);
        setField(term36080, term36080.getClass(), "combatShipList", null);
        setIntField(term36080, term36080.getClass(), "shipIndex", 0);
        setIntField(term36080, term36080.getClass(), "cursorX", 0);
        setIntField(term36080, term36080.getClass(), "cursorY", 0);
        setIntField(term36080, term36080.getClass(), "componentUse", 0);
        setField(term36080, term36080.getClass(), "animation", null);
        setField(term36080, term36080.getClass(), "attackerFleet", null);
        setField(term36080, term36080.getClass(), "defenderFleet", null);
        setField(term36080, term36080.getClass(), "starbaseFleet", null);
        setField(term36080, term36080.getClass(), "winner", null);
        setField(term36080, term36080.getClass(), "attackerInfo", null);
        setField(term36080, term36080.getClass(), "defenderInfo", null);
        setField(term36080, term36080.getClass(), "planet", null);
        setIntField(term36080, term36080.getClass(), "totalRounds", 0);
        setIntField(term36080, term36080.getClass(), "roundsNoDamge", 0);
        setBooleanField(term36080, term36080.getClass(), "endCombatHandled", false);
        setField(term36080, term36080.getClass(), "wormHole", null);
        setIntField(term36080, term36080.getClass(), "timerForWormHole", 0);
        setBooleanField(term36080, term36080.getClass(), "defenderEscaped", false);
        setBooleanField(term36080, term36080.getClass(), "attackerEscaped", false);
        setField(term36080, term36080.getClass(), "escapePosition", null);
        setField(term36080, term36080.getClass(), "combatEvent", null);
        setIntField(term36080, term36080.getClass(), "defenderMilitaryValue", 0);
        setIntField(term36080, term36080.getClass(), "attackerMilitaryValue", 0);
        setField(term36080, term36080.getClass(), "leaderKilledNews", null);
        setField(term36080, term36080.getClass(), "orbitalDestroyedNews", null);
        setField(term36080, term36080.getClass(), "leaderInCombat", null);
        setBooleanField(term36080, term36080.getClass(), "attackerPrivateer", false);
        setBooleanField(term36080, term36080.getClass(), "defenderPrivateer", false);
        setBooleanField(term36080, term36080.getClass(), "orbitalInCombat", false);
        setIntField(term36080, term36080.getClass(), "starYear", 0);
        setBooleanField(term36080, term36080.getClass(), "worthOfWarHero", false);
        setField(term35996, term35996.getClass(), "combat", term36080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term35996, args);
    }

};


