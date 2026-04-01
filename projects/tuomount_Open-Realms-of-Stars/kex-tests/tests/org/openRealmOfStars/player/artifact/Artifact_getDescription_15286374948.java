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

public class Artifact_getDescription_15286374948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3157;

    public Artifact_getDescription_15286374948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3249 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term3248 = ((Class) term3249).getDeclaredField((String) "FACILITY");
        ((Field) term3248).setAccessible(true);
        Object enum8 = ((Field) term3248).get((Object) null);
        term3157 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term3184 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term3185 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term3187 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term3196 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term3205 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term3206 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term3157, term3157.getClass(), "index", -2014576105);
        setField(term3157, term3157.getClass(), "name", "dWRymuLBtr");
        setField(term3157, term3157.getClass(), "artifactType", enum8);
        setIntField(term3157, term3157.getClass(), "oneTimeTechBonus", 1296895584);
        setIntField(term3185, term3185.getClass(), "imageType", 628918458);
        setField(term3185, term3185.getClass(), "colorModel", null);
        setField(term3187, term3187.getClass(), "sampleModel", null);
        setField(term3187, term3187.getClass(), "dataBuffer", null);
        setIntField(term3187, term3187.getClass(), "minX", -1274456137);
        setIntField(term3187, term3187.getClass(), "minY", 1041916673);
        setIntField(term3187, term3187.getClass(), "width", -601863069);
        setIntField(term3187, term3187.getClass(), "height", 663292551);
        setIntField(term3187, term3187.getClass(), "sampleModelTranslateX", -1885090354);
        setIntField(term3187, term3187.getClass(), "sampleModelTranslateY", -2066804303);
        setIntField(term3187, term3187.getClass(), "numBands", -1731761810);
        setIntField(term3187, term3187.getClass(), "numDataElements", 197109649);
        setField(term3196, term3196.getClass(), "sampleModel", null);
        setField(term3196, term3196.getClass(), "dataBuffer", null);
        setIntField(term3196, term3196.getClass(), "minX", -1239406390);
        setIntField(term3196, term3196.getClass(), "minY", 1557431527);
        setIntField(term3196, term3196.getClass(), "width", -1504890659);
        setIntField(term3196, term3196.getClass(), "height", 1358829571);
        setIntField(term3196, term3196.getClass(), "sampleModelTranslateX", 991356662);
        setIntField(term3196, term3196.getClass(), "sampleModelTranslateY", -506958186);
        setIntField(term3196, term3196.getClass(), "numBands", -507387516);
        setIntField(term3196, term3196.getClass(), "numDataElements", -1970452551);
        setField(term3196, term3196.getClass(), "parent", null);
        setField(term3187, term3187.getClass(), "parent", term3196);
        setField(term3185, term3185.getClass(), "raster", term3187);
        setField(term3185, term3185.getClass(), "osis", null);
        setField(term3205, term3205.getClass(), "table", term3206);
        setIntField(term3205, term3205.getClass(), "count", 1);
        setIntField(term3205, term3205.getClass(), "threshold", 8);
        setFloatField(term3205, term3205.getClass(), "loadFactor", 0.75F);
        setIntField(term3205, term3205.getClass(), "modCount", 1);
        setField(term3205, term3205.getClass(), "keySet", null);
        setField(term3205, term3205.getClass(), "entrySet", null);
        setField(term3205, term3205.getClass(), "values", null);
        setField(term3185, term3185.getClass(), "properties", term3205);
        setFloatField(term3185, term3185.getClass(), "accelerationPriority", 0.2857073F);
        setField(term3185, term3185.getClass(), "surfaceManager", null);
        setField(term3184, term3184.getClass(), "img", term3185);
        setField(term3184, term3184.getClass(), "name", "SbAoxhfrkn");
        setIntField(term3184, term3184.getClass(), "index", 729658803);
        setField(term3157, term3157.getClass(), "icon", term3184);
        setField(term3157, term3157.getClass(), "description", "kuTXqwMtDB");
        setBooleanField(term3157, term3157.getClass(), "unique", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term3157, args);
    }

};


