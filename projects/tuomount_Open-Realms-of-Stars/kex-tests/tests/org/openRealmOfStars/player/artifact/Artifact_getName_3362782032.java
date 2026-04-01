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

public class Artifact_getName_3362782032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term767;

    public Artifact_getName_3362782032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term857 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term856 = ((Class) term857).getDeclaredField((String) "ENERGY");
        ((Field) term856).setAccessible(true);
        Object enum2 = ((Field) term856).get((Object) null);
        term767 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term792 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term793 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term795 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term804 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term813 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term814 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term767, term767.getClass(), "index", -2068769794);
        setField(term767, term767.getClass(), "name", "EGtDIRbSSb");
        setField(term767, term767.getClass(), "artifactType", enum2);
        setIntField(term767, term767.getClass(), "oneTimeTechBonus", -117576464);
        setIntField(term793, term793.getClass(), "imageType", -1007160944);
        setField(term793, term793.getClass(), "colorModel", null);
        setField(term795, term795.getClass(), "sampleModel", null);
        setField(term795, term795.getClass(), "dataBuffer", null);
        setIntField(term795, term795.getClass(), "minX", 1135664017);
        setIntField(term795, term795.getClass(), "minY", 590364439);
        setIntField(term795, term795.getClass(), "width", 865208305);
        setIntField(term795, term795.getClass(), "height", -1275173084);
        setIntField(term795, term795.getClass(), "sampleModelTranslateX", -244121226);
        setIntField(term795, term795.getClass(), "sampleModelTranslateY", -203030934);
        setIntField(term795, term795.getClass(), "numBands", -1179120542);
        setIntField(term795, term795.getClass(), "numDataElements", -73683645);
        setField(term804, term804.getClass(), "sampleModel", null);
        setField(term804, term804.getClass(), "dataBuffer", null);
        setIntField(term804, term804.getClass(), "minX", -226514366);
        setIntField(term804, term804.getClass(), "minY", 1193880199);
        setIntField(term804, term804.getClass(), "width", -1087774327);
        setIntField(term804, term804.getClass(), "height", -1530420153);
        setIntField(term804, term804.getClass(), "sampleModelTranslateX", -469968304);
        setIntField(term804, term804.getClass(), "sampleModelTranslateY", -1145578966);
        setIntField(term804, term804.getClass(), "numBands", 679763016);
        setIntField(term804, term804.getClass(), "numDataElements", 1962444399);
        setField(term804, term804.getClass(), "parent", null);
        setField(term795, term795.getClass(), "parent", term804);
        setField(term793, term793.getClass(), "raster", term795);
        setField(term793, term793.getClass(), "osis", null);
        setField(term813, term813.getClass(), "table", term814);
        setIntField(term813, term813.getClass(), "count", 1);
        setIntField(term813, term813.getClass(), "threshold", 8);
        setFloatField(term813, term813.getClass(), "loadFactor", 0.75F);
        setIntField(term813, term813.getClass(), "modCount", 1);
        setField(term813, term813.getClass(), "keySet", null);
        setField(term813, term813.getClass(), "entrySet", null);
        setField(term813, term813.getClass(), "values", null);
        setField(term793, term793.getClass(), "properties", term813);
        setFloatField(term793, term793.getClass(), "accelerationPriority", 0.2707036F);
        setField(term793, term793.getClass(), "surfaceManager", null);
        setField(term792, term792.getClass(), "img", term793);
        setField(term792, term792.getClass(), "name", "MjGYSRKTNF");
        setIntField(term792, term792.getClass(), "index", -602026508);
        setField(term767, term767.getClass(), "icon", term792);
        setField(term767, term767.getClass(), "description", "hRNSzYYIrc");
        setBooleanField(term767, term767.getClass(), "unique", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term767, args);
    }

};


