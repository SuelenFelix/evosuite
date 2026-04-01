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
import java.lang.Boolean;

public class Artifact_setUnique_149282028012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4719;
     Object term4799;

    public Artifact_setUnique_149282028012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4812 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term4811 = ((Class) term4812).getDeclaredField((String) "DEFENSE");
        ((Field) term4811).setAccessible(true);
        Object enum12 = ((Field) term4811).get((Object) null);
        term4719 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term4745 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term4746 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term4748 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term4757 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term4766 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term4767 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term4719, term4719.getClass(), "index", 1935707624);
        setField(term4719, term4719.getClass(), "name", "xLbjWUgOIL");
        setField(term4719, term4719.getClass(), "artifactType", enum12);
        setIntField(term4719, term4719.getClass(), "oneTimeTechBonus", 1507074215);
        setIntField(term4746, term4746.getClass(), "imageType", -282881827);
        setField(term4746, term4746.getClass(), "colorModel", null);
        setField(term4748, term4748.getClass(), "sampleModel", null);
        setField(term4748, term4748.getClass(), "dataBuffer", null);
        setIntField(term4748, term4748.getClass(), "minX", -1183353915);
        setIntField(term4748, term4748.getClass(), "minY", -420030135);
        setIntField(term4748, term4748.getClass(), "width", 267763294);
        setIntField(term4748, term4748.getClass(), "height", -1497710478);
        setIntField(term4748, term4748.getClass(), "sampleModelTranslateX", 49950830);
        setIntField(term4748, term4748.getClass(), "sampleModelTranslateY", -525257914);
        setIntField(term4748, term4748.getClass(), "numBands", 147209682);
        setIntField(term4748, term4748.getClass(), "numDataElements", 34470066);
        setField(term4757, term4757.getClass(), "sampleModel", null);
        setField(term4757, term4757.getClass(), "dataBuffer", null);
        setIntField(term4757, term4757.getClass(), "minX", 2058711405);
        setIntField(term4757, term4757.getClass(), "minY", 1743683601);
        setIntField(term4757, term4757.getClass(), "width", -945116798);
        setIntField(term4757, term4757.getClass(), "height", 1593461795);
        setIntField(term4757, term4757.getClass(), "sampleModelTranslateX", 515182546);
        setIntField(term4757, term4757.getClass(), "sampleModelTranslateY", -936895502);
        setIntField(term4757, term4757.getClass(), "numBands", -129547140);
        setIntField(term4757, term4757.getClass(), "numDataElements", 199287428);
        setField(term4757, term4757.getClass(), "parent", null);
        setField(term4748, term4748.getClass(), "parent", term4757);
        setField(term4746, term4746.getClass(), "raster", term4748);
        setField(term4746, term4746.getClass(), "osis", null);
        setField(term4766, term4766.getClass(), "table", term4767);
        setIntField(term4766, term4766.getClass(), "count", 1);
        setIntField(term4766, term4766.getClass(), "threshold", 8);
        setFloatField(term4766, term4766.getClass(), "loadFactor", 0.75F);
        setIntField(term4766, term4766.getClass(), "modCount", 1);
        setField(term4766, term4766.getClass(), "keySet", null);
        setField(term4766, term4766.getClass(), "entrySet", null);
        setField(term4766, term4766.getClass(), "values", null);
        setField(term4746, term4746.getClass(), "properties", term4766);
        setFloatField(term4746, term4746.getClass(), "accelerationPriority", 0.26413453F);
        setField(term4746, term4746.getClass(), "surfaceManager", null);
        setField(term4745, term4745.getClass(), "img", term4746);
        setField(term4745, term4745.getClass(), "name", "nGKItKLYNC");
        setIntField(term4745, term4745.getClass(), "index", -376422566);
        setField(term4719, term4719.getClass(), "icon", term4745);
        setField(term4719, term4719.getClass(), "description", "UiUYnPrcCi");
        setBooleanField(term4719, term4719.getClass(), "unique", true);
        term4799 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4799;
        callMethod(klass, "setUnique", argTypes, term4719, args);
    }

};


