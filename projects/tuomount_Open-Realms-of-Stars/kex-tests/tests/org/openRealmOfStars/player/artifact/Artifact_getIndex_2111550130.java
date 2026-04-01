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

public class Artifact_getIndex_2111550130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Artifact_getIndex_2111550130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term163 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term162 = ((Class) term163).getDeclaredField((String) "DEFENSE");
        ((Field) term162).setAccessible(true);
        Object enum0 = ((Field) term162).get((Object) null);
        term1 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term27 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term28 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term30 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term39 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term48 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term49 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term1, term1.getClass(), "index", 568599855);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "artifactType", enum0);
        setIntField(term1, term1.getClass(), "oneTimeTechBonus", 1162663216);
        setIntField(term28, term28.getClass(), "imageType", 1484323161);
        setField(term28, term28.getClass(), "colorModel", null);
        setField(term30, term30.getClass(), "sampleModel", null);
        setField(term30, term30.getClass(), "dataBuffer", null);
        setIntField(term30, term30.getClass(), "minX", 391863371);
        setIntField(term30, term30.getClass(), "minY", -1922583790);
        setIntField(term30, term30.getClass(), "width", -616727354);
        setIntField(term30, term30.getClass(), "height", -1955890973);
        setIntField(term30, term30.getClass(), "sampleModelTranslateX", -2038273078);
        setIntField(term30, term30.getClass(), "sampleModelTranslateY", 1227103734);
        setIntField(term30, term30.getClass(), "numBands", -1339778481);
        setIntField(term30, term30.getClass(), "numDataElements", 1725571209);
        setField(term39, term39.getClass(), "sampleModel", null);
        setField(term39, term39.getClass(), "dataBuffer", null);
        setIntField(term39, term39.getClass(), "minX", -522618178);
        setIntField(term39, term39.getClass(), "minY", 1134449235);
        setIntField(term39, term39.getClass(), "width", -883034806);
        setIntField(term39, term39.getClass(), "height", 1585847225);
        setIntField(term39, term39.getClass(), "sampleModelTranslateX", 597278769);
        setIntField(term39, term39.getClass(), "sampleModelTranslateY", -1685132342);
        setIntField(term39, term39.getClass(), "numBands", -1456670397);
        setIntField(term39, term39.getClass(), "numDataElements", 1622346318);
        setField(term39, term39.getClass(), "parent", null);
        setField(term30, term30.getClass(), "parent", term39);
        setField(term28, term28.getClass(), "raster", term30);
        setField(term28, term28.getClass(), "osis", null);
        setField(term48, term48.getClass(), "table", term49);
        setIntField(term48, term48.getClass(), "count", 1);
        setIntField(term48, term48.getClass(), "threshold", 8);
        setFloatField(term48, term48.getClass(), "loadFactor", 0.75F);
        setIntField(term48, term48.getClass(), "modCount", 1);
        setField(term48, term48.getClass(), "keySet", null);
        setField(term48, term48.getClass(), "entrySet", null);
        setField(term48, term48.getClass(), "values", null);
        setField(term28, term28.getClass(), "properties", term48);
        setFloatField(term28, term28.getClass(), "accelerationPriority", 0.13238746F);
        setField(term28, term28.getClass(), "surfaceManager", null);
        setField(term27, term27.getClass(), "img", term28);
        setField(term27, term27.getClass(), "name", "MuLcgQHgqz");
        setIntField(term27, term27.getClass(), "index", -655067527);
        setField(term1, term1.getClass(), "icon", term27);
        setField(term1, term1.getClass(), "description", "xxtlPwDYFs");
        setBooleanField(term1, term1.getClass(), "unique", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndex", argTypes, term1, args);
    }

};


