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

public class PopupPanel_getImage_21690640211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36705;

    public PopupPanel_getImage_21690640211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36705 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term36730 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36732 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36741 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36750 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term36759 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36760 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36761 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36768 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term36770 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term36779 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term36780 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term36781 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term36789 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term36705, term36705.getClass(), "text", "lgQkrXANyI");
        setField(term36705, term36705.getClass(), "title", "MeTmRZXErV");
        setIntField(term36730, term36730.getClass(), "imageType", -860680764);
        setField(term36730, term36730.getClass(), "colorModel", null);
        setField(term36732, term36732.getClass(), "sampleModel", null);
        setField(term36732, term36732.getClass(), "dataBuffer", null);
        setIntField(term36732, term36732.getClass(), "minX", -963198667);
        setIntField(term36732, term36732.getClass(), "minY", -1007935918);
        setIntField(term36732, term36732.getClass(), "width", 1485731037);
        setIntField(term36732, term36732.getClass(), "height", 1304396087);
        setIntField(term36732, term36732.getClass(), "sampleModelTranslateX", 1782600602);
        setIntField(term36732, term36732.getClass(), "sampleModelTranslateY", -185892708);
        setIntField(term36732, term36732.getClass(), "numBands", -203163250);
        setIntField(term36732, term36732.getClass(), "numDataElements", 498473526);
        setField(term36741, term36741.getClass(), "sampleModel", null);
        setField(term36741, term36741.getClass(), "dataBuffer", null);
        setIntField(term36741, term36741.getClass(), "minX", 1186917020);
        setIntField(term36741, term36741.getClass(), "minY", 1670041824);
        setIntField(term36741, term36741.getClass(), "width", 2140388634);
        setIntField(term36741, term36741.getClass(), "height", 21095258);
        setIntField(term36741, term36741.getClass(), "sampleModelTranslateX", -1793997256);
        setIntField(term36741, term36741.getClass(), "sampleModelTranslateY", -1271598018);
        setIntField(term36741, term36741.getClass(), "numBands", 157967613);
        setIntField(term36741, term36741.getClass(), "numDataElements", 811839399);
        setField(term36750, term36750.getClass(), "sampleModel", null);
        setField(term36750, term36750.getClass(), "dataBuffer", null);
        setIntField(term36750, term36750.getClass(), "minX", 0);
        setIntField(term36750, term36750.getClass(), "minY", 0);
        setIntField(term36750, term36750.getClass(), "width", 0);
        setIntField(term36750, term36750.getClass(), "height", 0);
        setIntField(term36750, term36750.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36750, term36750.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36750, term36750.getClass(), "numBands", 0);
        setIntField(term36750, term36750.getClass(), "numDataElements", 0);
        setField(term36750, term36750.getClass(), "parent", null);
        setField(term36741, term36741.getClass(), "parent", term36750);
        setField(term36732, term36732.getClass(), "parent", term36741);
        setField(term36730, term36730.getClass(), "raster", term36732);
        setField(term36730, term36730.getClass(), "osis", null);
        setIntField(term36761, term36761.getClass(), "hash", -572064806);
        setField(term36761, term36761.getClass(), "key", null);
        setField(term36761, term36761.getClass(), "value", null);
        setField(term36761, term36761.getClass(), "next", null);
        setElement(term36760, 8, term36761);
        setField(term36759, term36759.getClass(), "table", term36760);
        setIntField(term36759, term36759.getClass(), "count", 1);
        setIntField(term36759, term36759.getClass(), "threshold", 8);
        setFloatField(term36759, term36759.getClass(), "loadFactor", 0.75F);
        setIntField(term36759, term36759.getClass(), "modCount", 1);
        setField(term36759, term36759.getClass(), "keySet", null);
        setField(term36759, term36759.getClass(), "entrySet", null);
        setField(term36759, term36759.getClass(), "values", null);
        setField(term36730, term36730.getClass(), "properties", term36759);
        setFloatField(term36730, term36730.getClass(), "accelerationPriority", 0.8809657F);
        setField(term36730, term36730.getClass(), "surfaceManager", null);
        setField(term36705, term36705.getClass(), "image", term36730);
        setIntField(term36768, term36768.getClass(), "imageType", -1485826786);
        setField(term36768, term36768.getClass(), "colorModel", null);
        setField(term36770, term36770.getClass(), "sampleModel", null);
        setField(term36770, term36770.getClass(), "dataBuffer", null);
        setIntField(term36770, term36770.getClass(), "minX", 0);
        setIntField(term36770, term36770.getClass(), "minY", 0);
        setIntField(term36770, term36770.getClass(), "width", 0);
        setIntField(term36770, term36770.getClass(), "height", 0);
        setIntField(term36770, term36770.getClass(), "sampleModelTranslateX", 0);
        setIntField(term36770, term36770.getClass(), "sampleModelTranslateY", 0);
        setIntField(term36770, term36770.getClass(), "numBands", 0);
        setIntField(term36770, term36770.getClass(), "numDataElements", 0);
        setField(term36770, term36770.getClass(), "parent", null);
        setField(term36768, term36768.getClass(), "raster", term36770);
        setField(term36768, term36768.getClass(), "osis", null);
        setIntField(term36781, term36781.getClass(), "hash", 197459153);
        setField(term36781, term36781.getClass(), "key", null);
        setField(term36781, term36781.getClass(), "value", null);
        setField(term36781, term36781.getClass(), "next", null);
        setElement(term36780, 1, term36781);
        setField(term36779, term36779.getClass(), "table", term36780);
        setIntField(term36779, term36779.getClass(), "count", 1);
        setIntField(term36779, term36779.getClass(), "threshold", 8);
        setFloatField(term36779, term36779.getClass(), "loadFactor", 0.75F);
        setIntField(term36779, term36779.getClass(), "modCount", 1);
        setField(term36779, term36779.getClass(), "keySet", null);
        setField(term36779, term36779.getClass(), "entrySet", null);
        setField(term36779, term36779.getClass(), "values", null);
        setField(term36768, term36768.getClass(), "properties", term36779);
        setFloatField(term36768, term36768.getClass(), "accelerationPriority", 0.0F);
        setField(term36768, term36768.getClass(), "surfaceManager", null);
        setField(term36705, term36705.getClass(), "scaledImage", term36768);
        setBooleanField(term36705, term36705.getClass(), "dismissed", true);
        setField(term36789, term36789.getClass(), "combatShipList", null);
        setIntField(term36789, term36789.getClass(), "shipIndex", 0);
        setIntField(term36789, term36789.getClass(), "cursorX", 0);
        setIntField(term36789, term36789.getClass(), "cursorY", 0);
        setIntField(term36789, term36789.getClass(), "componentUse", 0);
        setField(term36789, term36789.getClass(), "animation", null);
        setField(term36789, term36789.getClass(), "attackerFleet", null);
        setField(term36789, term36789.getClass(), "defenderFleet", null);
        setField(term36789, term36789.getClass(), "starbaseFleet", null);
        setField(term36789, term36789.getClass(), "winner", null);
        setField(term36789, term36789.getClass(), "attackerInfo", null);
        setField(term36789, term36789.getClass(), "defenderInfo", null);
        setField(term36789, term36789.getClass(), "planet", null);
        setIntField(term36789, term36789.getClass(), "totalRounds", 0);
        setIntField(term36789, term36789.getClass(), "roundsNoDamge", 0);
        setBooleanField(term36789, term36789.getClass(), "endCombatHandled", false);
        setField(term36789, term36789.getClass(), "wormHole", null);
        setIntField(term36789, term36789.getClass(), "timerForWormHole", 0);
        setBooleanField(term36789, term36789.getClass(), "defenderEscaped", false);
        setBooleanField(term36789, term36789.getClass(), "attackerEscaped", false);
        setField(term36789, term36789.getClass(), "escapePosition", null);
        setField(term36789, term36789.getClass(), "combatEvent", null);
        setIntField(term36789, term36789.getClass(), "defenderMilitaryValue", 0);
        setIntField(term36789, term36789.getClass(), "attackerMilitaryValue", 0);
        setField(term36789, term36789.getClass(), "leaderKilledNews", null);
        setField(term36789, term36789.getClass(), "orbitalDestroyedNews", null);
        setField(term36789, term36789.getClass(), "leaderInCombat", null);
        setBooleanField(term36789, term36789.getClass(), "attackerPrivateer", false);
        setBooleanField(term36789, term36789.getClass(), "defenderPrivateer", false);
        setBooleanField(term36789, term36789.getClass(), "orbitalInCombat", false);
        setIntField(term36789, term36789.getClass(), "starYear", 0);
        setBooleanField(term36789, term36789.getClass(), "worthOfWarHero", false);
        setField(term36705, term36705.getClass(), "combat", term36789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage", argTypes, term36705, args);
    }

};


