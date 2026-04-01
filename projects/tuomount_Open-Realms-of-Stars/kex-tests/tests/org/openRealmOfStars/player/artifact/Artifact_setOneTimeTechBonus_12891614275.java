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
import java.lang.Integer;

public class Artifact_setOneTimeTechBonus_12891614275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1928;
     Object term2008;

    public Artifact_setOneTimeTechBonus_12891614275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2021 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term2020 = ((Class) term2021).getDeclaredField((String) "DEFENSE");
        ((Field) term2020).setAccessible(true);
        Object enum5 = ((Field) term2020).get((Object) null);
        term1928 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term1954 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term1955 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1957 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1966 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1975 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1976 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term1928, term1928.getClass(), "index", 1090617576);
        setField(term1928, term1928.getClass(), "name", "tbcdzjIfER");
        setField(term1928, term1928.getClass(), "artifactType", enum5);
        setIntField(term1928, term1928.getClass(), "oneTimeTechBonus", -1547384488);
        setIntField(term1955, term1955.getClass(), "imageType", 1442160736);
        setField(term1955, term1955.getClass(), "colorModel", null);
        setField(term1957, term1957.getClass(), "sampleModel", null);
        setField(term1957, term1957.getClass(), "dataBuffer", null);
        setIntField(term1957, term1957.getClass(), "minX", 1114000454);
        setIntField(term1957, term1957.getClass(), "minY", -556405712);
        setIntField(term1957, term1957.getClass(), "width", -1772434990);
        setIntField(term1957, term1957.getClass(), "height", -1845499264);
        setIntField(term1957, term1957.getClass(), "sampleModelTranslateX", -505439934);
        setIntField(term1957, term1957.getClass(), "sampleModelTranslateY", -344842608);
        setIntField(term1957, term1957.getClass(), "numBands", 941650513);
        setIntField(term1957, term1957.getClass(), "numDataElements", 444029505);
        setField(term1966, term1966.getClass(), "sampleModel", null);
        setField(term1966, term1966.getClass(), "dataBuffer", null);
        setIntField(term1966, term1966.getClass(), "minX", -1034506028);
        setIntField(term1966, term1966.getClass(), "minY", -1263114719);
        setIntField(term1966, term1966.getClass(), "width", -894662986);
        setIntField(term1966, term1966.getClass(), "height", 304775596);
        setIntField(term1966, term1966.getClass(), "sampleModelTranslateX", -1347665717);
        setIntField(term1966, term1966.getClass(), "sampleModelTranslateY", -1888585309);
        setIntField(term1966, term1966.getClass(), "numBands", 683666002);
        setIntField(term1966, term1966.getClass(), "numDataElements", 1596213415);
        setField(term1966, term1966.getClass(), "parent", null);
        setField(term1957, term1957.getClass(), "parent", term1966);
        setField(term1955, term1955.getClass(), "raster", term1957);
        setField(term1955, term1955.getClass(), "osis", null);
        setField(term1975, term1975.getClass(), "table", term1976);
        setIntField(term1975, term1975.getClass(), "count", 1);
        setIntField(term1975, term1975.getClass(), "threshold", 8);
        setFloatField(term1975, term1975.getClass(), "loadFactor", 0.75F);
        setIntField(term1975, term1975.getClass(), "modCount", 1);
        setField(term1975, term1975.getClass(), "keySet", null);
        setField(term1975, term1975.getClass(), "entrySet", null);
        setField(term1975, term1975.getClass(), "values", null);
        setField(term1955, term1955.getClass(), "properties", term1975);
        setFloatField(term1955, term1955.getClass(), "accelerationPriority", 0.5523636F);
        setField(term1955, term1955.getClass(), "surfaceManager", null);
        setField(term1954, term1954.getClass(), "img", term1955);
        setField(term1954, term1954.getClass(), "name", "pCTimMblYc");
        setIntField(term1954, term1954.getClass(), "index", -1210583429);
        setField(term1928, term1928.getClass(), "icon", term1954);
        setField(term1928, term1928.getClass(), "description", "hNxWaHcfhY");
        setBooleanField(term1928, term1928.getClass(), "unique", true);
        term2008 = new Integer(-663691365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2008;
        callMethod(klass, "setOneTimeTechBonus", argTypes, term1928, args);
    }

};


