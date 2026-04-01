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

public class PopupPanel_setText_13309307975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35852;

    public PopupPanel_setText_13309307975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35852 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        Object term35877 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term35879 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term35888 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term35897 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term35906 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term35907 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term35908 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term35915 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term35917 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term35926 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term35927 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term35928 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term35936 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term35852, term35852.getClass(), "text", "RDnkgWkcbz");
        setField(term35852, term35852.getClass(), "title", "IBpaxltauX");
        setIntField(term35877, term35877.getClass(), "imageType", 950385621);
        setField(term35877, term35877.getClass(), "colorModel", null);
        setField(term35879, term35879.getClass(), "sampleModel", null);
        setField(term35879, term35879.getClass(), "dataBuffer", null);
        setIntField(term35879, term35879.getClass(), "minX", -232352320);
        setIntField(term35879, term35879.getClass(), "minY", -232333014);
        setIntField(term35879, term35879.getClass(), "width", -139694079);
        setIntField(term35879, term35879.getClass(), "height", -1602072035);
        setIntField(term35879, term35879.getClass(), "sampleModelTranslateX", 1902624392);
        setIntField(term35879, term35879.getClass(), "sampleModelTranslateY", 904607217);
        setIntField(term35879, term35879.getClass(), "numBands", 434914590);
        setIntField(term35879, term35879.getClass(), "numDataElements", 1983756621);
        setField(term35888, term35888.getClass(), "sampleModel", null);
        setField(term35888, term35888.getClass(), "dataBuffer", null);
        setIntField(term35888, term35888.getClass(), "minX", -2134711835);
        setIntField(term35888, term35888.getClass(), "minY", -1641244494);
        setIntField(term35888, term35888.getClass(), "width", 1124282188);
        setIntField(term35888, term35888.getClass(), "height", -489441521);
        setIntField(term35888, term35888.getClass(), "sampleModelTranslateX", 225873732);
        setIntField(term35888, term35888.getClass(), "sampleModelTranslateY", 529879356);
        setIntField(term35888, term35888.getClass(), "numBands", 18072182);
        setIntField(term35888, term35888.getClass(), "numDataElements", 1544768934);
        setField(term35897, term35897.getClass(), "sampleModel", null);
        setField(term35897, term35897.getClass(), "dataBuffer", null);
        setIntField(term35897, term35897.getClass(), "minX", 0);
        setIntField(term35897, term35897.getClass(), "minY", 0);
        setIntField(term35897, term35897.getClass(), "width", 0);
        setIntField(term35897, term35897.getClass(), "height", 0);
        setIntField(term35897, term35897.getClass(), "sampleModelTranslateX", 0);
        setIntField(term35897, term35897.getClass(), "sampleModelTranslateY", 0);
        setIntField(term35897, term35897.getClass(), "numBands", 0);
        setIntField(term35897, term35897.getClass(), "numDataElements", 0);
        setField(term35897, term35897.getClass(), "parent", null);
        setField(term35888, term35888.getClass(), "parent", term35897);
        setField(term35879, term35879.getClass(), "parent", term35888);
        setField(term35877, term35877.getClass(), "raster", term35879);
        setField(term35877, term35877.getClass(), "osis", null);
        setIntField(term35908, term35908.getClass(), "hash", 491281173);
        setField(term35908, term35908.getClass(), "key", null);
        setField(term35908, term35908.getClass(), "value", null);
        setField(term35908, term35908.getClass(), "next", null);
        setElement(term35907, 9, term35908);
        setField(term35906, term35906.getClass(), "table", term35907);
        setIntField(term35906, term35906.getClass(), "count", 1);
        setIntField(term35906, term35906.getClass(), "threshold", 8);
        setFloatField(term35906, term35906.getClass(), "loadFactor", 0.75F);
        setIntField(term35906, term35906.getClass(), "modCount", 1);
        setField(term35906, term35906.getClass(), "keySet", null);
        setField(term35906, term35906.getClass(), "entrySet", null);
        setField(term35906, term35906.getClass(), "values", null);
        setField(term35877, term35877.getClass(), "properties", term35906);
        setFloatField(term35877, term35877.getClass(), "accelerationPriority", 0.42429137F);
        setField(term35877, term35877.getClass(), "surfaceManager", null);
        setField(term35852, term35852.getClass(), "image", term35877);
        setIntField(term35915, term35915.getClass(), "imageType", -819372164);
        setField(term35915, term35915.getClass(), "colorModel", null);
        setField(term35917, term35917.getClass(), "sampleModel", null);
        setField(term35917, term35917.getClass(), "dataBuffer", null);
        setIntField(term35917, term35917.getClass(), "minX", 0);
        setIntField(term35917, term35917.getClass(), "minY", 0);
        setIntField(term35917, term35917.getClass(), "width", 0);
        setIntField(term35917, term35917.getClass(), "height", 0);
        setIntField(term35917, term35917.getClass(), "sampleModelTranslateX", 0);
        setIntField(term35917, term35917.getClass(), "sampleModelTranslateY", 0);
        setIntField(term35917, term35917.getClass(), "numBands", 0);
        setIntField(term35917, term35917.getClass(), "numDataElements", 0);
        setField(term35917, term35917.getClass(), "parent", null);
        setField(term35915, term35915.getClass(), "raster", term35917);
        setField(term35915, term35915.getClass(), "osis", null);
        setIntField(term35928, term35928.getClass(), "hash", 243454832);
        setField(term35928, term35928.getClass(), "key", null);
        setField(term35928, term35928.getClass(), "value", null);
        setField(term35928, term35928.getClass(), "next", null);
        setElement(term35927, 5, term35928);
        setField(term35926, term35926.getClass(), "table", term35927);
        setIntField(term35926, term35926.getClass(), "count", 1);
        setIntField(term35926, term35926.getClass(), "threshold", 8);
        setFloatField(term35926, term35926.getClass(), "loadFactor", 0.75F);
        setIntField(term35926, term35926.getClass(), "modCount", 1);
        setField(term35926, term35926.getClass(), "keySet", null);
        setField(term35926, term35926.getClass(), "entrySet", null);
        setField(term35926, term35926.getClass(), "values", null);
        setField(term35915, term35915.getClass(), "properties", term35926);
        setFloatField(term35915, term35915.getClass(), "accelerationPriority", 0.0F);
        setField(term35915, term35915.getClass(), "surfaceManager", null);
        setField(term35852, term35852.getClass(), "scaledImage", term35915);
        setBooleanField(term35852, term35852.getClass(), "dismissed", false);
        setField(term35936, term35936.getClass(), "combatShipList", null);
        setIntField(term35936, term35936.getClass(), "shipIndex", 0);
        setIntField(term35936, term35936.getClass(), "cursorX", 0);
        setIntField(term35936, term35936.getClass(), "cursorY", 0);
        setIntField(term35936, term35936.getClass(), "componentUse", 0);
        setField(term35936, term35936.getClass(), "animation", null);
        setField(term35936, term35936.getClass(), "attackerFleet", null);
        setField(term35936, term35936.getClass(), "defenderFleet", null);
        setField(term35936, term35936.getClass(), "starbaseFleet", null);
        setField(term35936, term35936.getClass(), "winner", null);
        setField(term35936, term35936.getClass(), "attackerInfo", null);
        setField(term35936, term35936.getClass(), "defenderInfo", null);
        setField(term35936, term35936.getClass(), "planet", null);
        setIntField(term35936, term35936.getClass(), "totalRounds", 0);
        setIntField(term35936, term35936.getClass(), "roundsNoDamge", 0);
        setBooleanField(term35936, term35936.getClass(), "endCombatHandled", false);
        setField(term35936, term35936.getClass(), "wormHole", null);
        setIntField(term35936, term35936.getClass(), "timerForWormHole", 0);
        setBooleanField(term35936, term35936.getClass(), "defenderEscaped", false);
        setBooleanField(term35936, term35936.getClass(), "attackerEscaped", false);
        setField(term35936, term35936.getClass(), "escapePosition", null);
        setField(term35936, term35936.getClass(), "combatEvent", null);
        setIntField(term35936, term35936.getClass(), "defenderMilitaryValue", 0);
        setIntField(term35936, term35936.getClass(), "attackerMilitaryValue", 0);
        setField(term35936, term35936.getClass(), "leaderKilledNews", null);
        setField(term35936, term35936.getClass(), "orbitalDestroyedNews", null);
        setField(term35936, term35936.getClass(), "leaderInCombat", null);
        setBooleanField(term35936, term35936.getClass(), "attackerPrivateer", false);
        setBooleanField(term35936, term35936.getClass(), "defenderPrivateer", false);
        setBooleanField(term35936, term35936.getClass(), "orbitalInCombat", false);
        setIntField(term35936, term35936.getClass(), "starYear", 0);
        setBooleanField(term35936, term35936.getClass(), "worthOfWarHero", false);
        setField(term35852, term35852.getClass(), "combat", term35936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VVNNlAePXF";
        callMethod(klass, "setText", argTypes, term35852, args);
    }

};


