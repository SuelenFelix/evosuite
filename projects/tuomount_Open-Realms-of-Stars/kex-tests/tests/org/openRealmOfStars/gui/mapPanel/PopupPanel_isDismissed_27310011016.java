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

public class PopupPanel_isDismissed_27310011016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37367;

    public PopupPanel_isDismissed_27310011016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37367 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term37392 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term37394 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term37403 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term37412 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term37421 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term37422 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term37423 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term37430 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term37432 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term37441 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term37442 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term37443 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term37451 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term37367, term37367.getClass(), "text", "lBOokzEPfe");
        setField(term37367, term37367.getClass(), "title", "dtGZCsKXbW");
        setIntField(term37392, term37392.getClass(), "imageType", -376722373);
        setField(term37392, term37392.getClass(), "colorModel", null);
        setField(term37394, term37394.getClass(), "sampleModel", null);
        setField(term37394, term37394.getClass(), "dataBuffer", null);
        setIntField(term37394, term37394.getClass(), "minX", 1180687854);
        setIntField(term37394, term37394.getClass(), "minY", 328631288);
        setIntField(term37394, term37394.getClass(), "width", -1631415805);
        setIntField(term37394, term37394.getClass(), "height", 1073400519);
        setIntField(term37394, term37394.getClass(), "sampleModelTranslateX", -2025555268);
        setIntField(term37394, term37394.getClass(), "sampleModelTranslateY", -746950289);
        setIntField(term37394, term37394.getClass(), "numBands", -137577510);
        setIntField(term37394, term37394.getClass(), "numDataElements", 719185716);
        setField(term37403, term37403.getClass(), "sampleModel", null);
        setField(term37403, term37403.getClass(), "dataBuffer", null);
        setIntField(term37403, term37403.getClass(), "minX", 1624820010);
        setIntField(term37403, term37403.getClass(), "minY", -831921156);
        setIntField(term37403, term37403.getClass(), "width", -2085566906);
        setIntField(term37403, term37403.getClass(), "height", 1773193728);
        setIntField(term37403, term37403.getClass(), "sampleModelTranslateX", -1341357647);
        setIntField(term37403, term37403.getClass(), "sampleModelTranslateY", 138447019);
        setIntField(term37403, term37403.getClass(), "numBands", 114915275);
        setIntField(term37403, term37403.getClass(), "numDataElements", 338519695);
        setField(term37412, term37412.getClass(), "sampleModel", null);
        setField(term37412, term37412.getClass(), "dataBuffer", null);
        setIntField(term37412, term37412.getClass(), "minX", 0);
        setIntField(term37412, term37412.getClass(), "minY", 0);
        setIntField(term37412, term37412.getClass(), "width", 0);
        setIntField(term37412, term37412.getClass(), "height", 0);
        setIntField(term37412, term37412.getClass(), "sampleModelTranslateX", 0);
        setIntField(term37412, term37412.getClass(), "sampleModelTranslateY", 0);
        setIntField(term37412, term37412.getClass(), "numBands", 0);
        setIntField(term37412, term37412.getClass(), "numDataElements", 0);
        setField(term37412, term37412.getClass(), "parent", null);
        setField(term37403, term37403.getClass(), "parent", term37412);
        setField(term37394, term37394.getClass(), "parent", term37403);
        setField(term37392, term37392.getClass(), "raster", term37394);
        setField(term37392, term37392.getClass(), "osis", null);
        setIntField(term37423, term37423.getClass(), "hash", -2043623195);
        setField(term37423, term37423.getClass(), "key", null);
        setField(term37423, term37423.getClass(), "value", null);
        setField(term37423, term37423.getClass(), "next", null);
        setElement(term37422, 4, term37423);
        setField(term37421, term37421.getClass(), "table", term37422);
        setIntField(term37421, term37421.getClass(), "count", 1);
        setIntField(term37421, term37421.getClass(), "threshold", 8);
        setFloatField(term37421, term37421.getClass(), "loadFactor", 0.75F);
        setIntField(term37421, term37421.getClass(), "modCount", 1);
        setField(term37421, term37421.getClass(), "keySet", null);
        setField(term37421, term37421.getClass(), "entrySet", null);
        setField(term37421, term37421.getClass(), "values", null);
        setField(term37392, term37392.getClass(), "properties", term37421);
        setFloatField(term37392, term37392.getClass(), "accelerationPriority", 0.7455431F);
        setField(term37392, term37392.getClass(), "surfaceManager", null);
        setField(term37367, term37367.getClass(), "image", term37392);
        setIntField(term37430, term37430.getClass(), "imageType", -1231122778);
        setField(term37430, term37430.getClass(), "colorModel", null);
        setField(term37432, term37432.getClass(), "sampleModel", null);
        setField(term37432, term37432.getClass(), "dataBuffer", null);
        setIntField(term37432, term37432.getClass(), "minX", 0);
        setIntField(term37432, term37432.getClass(), "minY", 0);
        setIntField(term37432, term37432.getClass(), "width", 0);
        setIntField(term37432, term37432.getClass(), "height", 0);
        setIntField(term37432, term37432.getClass(), "sampleModelTranslateX", 0);
        setIntField(term37432, term37432.getClass(), "sampleModelTranslateY", 0);
        setIntField(term37432, term37432.getClass(), "numBands", 0);
        setIntField(term37432, term37432.getClass(), "numDataElements", 0);
        setField(term37432, term37432.getClass(), "parent", null);
        setField(term37430, term37430.getClass(), "raster", term37432);
        setField(term37430, term37430.getClass(), "osis", null);
        setIntField(term37443, term37443.getClass(), "hash", 808332242);
        setField(term37443, term37443.getClass(), "key", null);
        setField(term37443, term37443.getClass(), "value", null);
        setField(term37443, term37443.getClass(), "next", null);
        setElement(term37442, 3, term37443);
        setField(term37441, term37441.getClass(), "table", term37442);
        setIntField(term37441, term37441.getClass(), "count", 1);
        setIntField(term37441, term37441.getClass(), "threshold", 8);
        setFloatField(term37441, term37441.getClass(), "loadFactor", 0.75F);
        setIntField(term37441, term37441.getClass(), "modCount", 1);
        setField(term37441, term37441.getClass(), "keySet", null);
        setField(term37441, term37441.getClass(), "entrySet", null);
        setField(term37441, term37441.getClass(), "values", null);
        setField(term37430, term37430.getClass(), "properties", term37441);
        setFloatField(term37430, term37430.getClass(), "accelerationPriority", 0.0F);
        setField(term37430, term37430.getClass(), "surfaceManager", null);
        setField(term37367, term37367.getClass(), "scaledImage", term37430);
        setBooleanField(term37367, term37367.getClass(), "dismissed", false);
        setField(term37451, term37451.getClass(), "combatShipList", null);
        setIntField(term37451, term37451.getClass(), "shipIndex", 0);
        setIntField(term37451, term37451.getClass(), "cursorX", 0);
        setIntField(term37451, term37451.getClass(), "cursorY", 0);
        setIntField(term37451, term37451.getClass(), "componentUse", 0);
        setField(term37451, term37451.getClass(), "animation", null);
        setField(term37451, term37451.getClass(), "attackerFleet", null);
        setField(term37451, term37451.getClass(), "defenderFleet", null);
        setField(term37451, term37451.getClass(), "starbaseFleet", null);
        setField(term37451, term37451.getClass(), "winner", null);
        setField(term37451, term37451.getClass(), "attackerInfo", null);
        setField(term37451, term37451.getClass(), "defenderInfo", null);
        setField(term37451, term37451.getClass(), "planet", null);
        setIntField(term37451, term37451.getClass(), "totalRounds", 0);
        setIntField(term37451, term37451.getClass(), "roundsNoDamge", 0);
        setBooleanField(term37451, term37451.getClass(), "endCombatHandled", false);
        setField(term37451, term37451.getClass(), "wormHole", null);
        setIntField(term37451, term37451.getClass(), "timerForWormHole", 0);
        setBooleanField(term37451, term37451.getClass(), "defenderEscaped", false);
        setBooleanField(term37451, term37451.getClass(), "attackerEscaped", false);
        setField(term37451, term37451.getClass(), "escapePosition", null);
        setField(term37451, term37451.getClass(), "combatEvent", null);
        setIntField(term37451, term37451.getClass(), "defenderMilitaryValue", 0);
        setIntField(term37451, term37451.getClass(), "attackerMilitaryValue", 0);
        setField(term37451, term37451.getClass(), "leaderKilledNews", null);
        setField(term37451, term37451.getClass(), "orbitalDestroyedNews", null);
        setField(term37451, term37451.getClass(), "leaderInCombat", null);
        setBooleanField(term37451, term37451.getClass(), "attackerPrivateer", false);
        setBooleanField(term37451, term37451.getClass(), "defenderPrivateer", false);
        setBooleanField(term37451, term37451.getClass(), "orbitalInCombat", false);
        setIntField(term37451, term37451.getClass(), "starYear", 0);
        setBooleanField(term37451, term37451.getClass(), "worthOfWarHero", false);
        setField(term37367, term37367.getClass(), "combat", term37451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDismissed", argTypes, term37367, args);
    }

};


