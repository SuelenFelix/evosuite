package org.openRealmOfStars.player.artifact;

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
import static org.openRealmOfStars.player.artifact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Artifact_setIcon_999037697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2708;
     Object term2789;

    public Artifact_setIcon_999037697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2852 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term2851 = ((Class) term2852).getDeclaredField((String) "FACILITY");
        ((Field) term2851).setAccessible(true);
        Object enum7 = ((Field) term2851).get((Object) null);
        term2708 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term2735 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term2736 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2738 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2747 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2756 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2757 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term2708, term2708.getClass(), "index", 480137250);
        setField(term2708, term2708.getClass(), "name", "vrQLuWIDJX");
        setField(term2708, term2708.getClass(), "artifactType", enum7);
        setIntField(term2708, term2708.getClass(), "oneTimeTechBonus", -341152642);
        setIntField(term2736, term2736.getClass(), "imageType", -2015854073);
        setField(term2736, term2736.getClass(), "colorModel", null);
        setField(term2738, term2738.getClass(), "sampleModel", null);
        setField(term2738, term2738.getClass(), "dataBuffer", null);
        setIntField(term2738, term2738.getClass(), "minX", 538259104);
        setIntField(term2738, term2738.getClass(), "minY", 96566506);
        setIntField(term2738, term2738.getClass(), "width", -343325701);
        setIntField(term2738, term2738.getClass(), "height", 107945604);
        setIntField(term2738, term2738.getClass(), "sampleModelTranslateX", -1963464809);
        setIntField(term2738, term2738.getClass(), "sampleModelTranslateY", 71190297);
        setIntField(term2738, term2738.getClass(), "numBands", 1202361360);
        setIntField(term2738, term2738.getClass(), "numDataElements", -2015048153);
        setField(term2747, term2747.getClass(), "sampleModel", null);
        setField(term2747, term2747.getClass(), "dataBuffer", null);
        setIntField(term2747, term2747.getClass(), "minX", -2063457669);
        setIntField(term2747, term2747.getClass(), "minY", -1222006000);
        setIntField(term2747, term2747.getClass(), "width", 2095798786);
        setIntField(term2747, term2747.getClass(), "height", -1565502840);
        setIntField(term2747, term2747.getClass(), "sampleModelTranslateX", 344323424);
        setIntField(term2747, term2747.getClass(), "sampleModelTranslateY", 9726679);
        setIntField(term2747, term2747.getClass(), "numBands", -25637976);
        setIntField(term2747, term2747.getClass(), "numDataElements", 1555897383);
        setField(term2747, term2747.getClass(), "parent", null);
        setField(term2738, term2738.getClass(), "parent", term2747);
        setField(term2736, term2736.getClass(), "raster", term2738);
        setField(term2736, term2736.getClass(), "osis", null);
        setField(term2756, term2756.getClass(), "table", term2757);
        setIntField(term2756, term2756.getClass(), "count", 1);
        setIntField(term2756, term2756.getClass(), "threshold", 8);
        setFloatField(term2756, term2756.getClass(), "loadFactor", 0.75F);
        setIntField(term2756, term2756.getClass(), "modCount", 1);
        setField(term2756, term2756.getClass(), "keySet", null);
        setField(term2756, term2756.getClass(), "entrySet", null);
        setField(term2756, term2756.getClass(), "values", null);
        setField(term2736, term2736.getClass(), "properties", term2756);
        setFloatField(term2736, term2736.getClass(), "accelerationPriority", 0.5446086F);
        setField(term2736, term2736.getClass(), "surfaceManager", null);
        setField(term2735, term2735.getClass(), "img", term2736);
        setField(term2735, term2735.getClass(), "name", "OclPbYPkcH");
        setIntField(term2735, term2735.getClass(), "index", 158873461);
        setField(term2708, term2708.getClass(), "icon", term2735);
        setField(term2708, term2708.getClass(), "description", "IoAlmYsBwc");
        setBooleanField(term2708, term2708.getClass(), "unique", true);
        term2789 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term2790 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2792 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2801 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2810 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2819 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2820 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2821 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term2790, term2790.getClass(), "imageType", -430151637);
        setField(term2790, term2790.getClass(), "colorModel", null);
        setField(term2792, term2792.getClass(), "sampleModel", null);
        setField(term2792, term2792.getClass(), "dataBuffer", null);
        setIntField(term2792, term2792.getClass(), "minX", -1697741339);
        setIntField(term2792, term2792.getClass(), "minY", 98922530);
        setIntField(term2792, term2792.getClass(), "width", -1388471422);
        setIntField(term2792, term2792.getClass(), "height", -1498296052);
        setIntField(term2792, term2792.getClass(), "sampleModelTranslateX", 2098647989);
        setIntField(term2792, term2792.getClass(), "sampleModelTranslateY", 1598895173);
        setIntField(term2792, term2792.getClass(), "numBands", 1830648570);
        setIntField(term2792, term2792.getClass(), "numDataElements", -227365013);
        setField(term2801, term2801.getClass(), "sampleModel", null);
        setField(term2801, term2801.getClass(), "dataBuffer", null);
        setIntField(term2801, term2801.getClass(), "minX", 11724947);
        setIntField(term2801, term2801.getClass(), "minY", 1953277050);
        setIntField(term2801, term2801.getClass(), "width", 1283079251);
        setIntField(term2801, term2801.getClass(), "height", -523949691);
        setIntField(term2801, term2801.getClass(), "sampleModelTranslateX", 1398204340);
        setIntField(term2801, term2801.getClass(), "sampleModelTranslateY", 229204365);
        setIntField(term2801, term2801.getClass(), "numBands", -461771056);
        setIntField(term2801, term2801.getClass(), "numDataElements", -243422082);
        setField(term2810, term2810.getClass(), "sampleModel", null);
        setField(term2810, term2810.getClass(), "dataBuffer", null);
        setIntField(term2810, term2810.getClass(), "minX", 0);
        setIntField(term2810, term2810.getClass(), "minY", 0);
        setIntField(term2810, term2810.getClass(), "width", 0);
        setIntField(term2810, term2810.getClass(), "height", 0);
        setIntField(term2810, term2810.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2810, term2810.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2810, term2810.getClass(), "numBands", 0);
        setIntField(term2810, term2810.getClass(), "numDataElements", 0);
        setField(term2810, term2810.getClass(), "parent", null);
        setField(term2801, term2801.getClass(), "parent", term2810);
        setField(term2792, term2792.getClass(), "parent", term2801);
        setField(term2790, term2790.getClass(), "raster", term2792);
        setField(term2790, term2790.getClass(), "osis", null);
        setIntField(term2821, term2821.getClass(), "hash", 1718827582);
        setField(term2821, term2821.getClass(), "key", null);
        setField(term2821, term2821.getClass(), "value", null);
        setField(term2821, term2821.getClass(), "next", null);
        setElement(term2820, 10, term2821);
        setField(term2819, term2819.getClass(), "table", term2820);
        setIntField(term2819, term2819.getClass(), "count", 1);
        setIntField(term2819, term2819.getClass(), "threshold", 8);
        setFloatField(term2819, term2819.getClass(), "loadFactor", 0.75F);
        setIntField(term2819, term2819.getClass(), "modCount", 1);
        setField(term2819, term2819.getClass(), "keySet", null);
        setField(term2819, term2819.getClass(), "entrySet", null);
        setField(term2819, term2819.getClass(), "values", null);
        setField(term2790, term2790.getClass(), "properties", term2819);
        setFloatField(term2790, term2790.getClass(), "accelerationPriority", 0.5254275F);
        setField(term2790, term2790.getClass(), "surfaceManager", null);
        setField(term2789, term2789.getClass(), "img", term2790);
        setField(term2789, term2789.getClass(), "name", "OWDIEULEFu");
        setIntField(term2789, term2789.getClass(), "index", -1002370457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Object[] args = new Object[1];
        args[0] = term2789;
        callMethod(klass, "setIcon", argTypes, term2708, args);
    }

};


