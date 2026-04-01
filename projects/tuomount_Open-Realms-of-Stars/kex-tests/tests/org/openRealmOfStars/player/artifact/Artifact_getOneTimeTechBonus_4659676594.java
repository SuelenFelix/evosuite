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

public class Artifact_getOneTimeTechBonus_4659676594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1541;

    public Artifact_getOneTimeTechBonus_4659676594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1633 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term1632 = ((Class) term1633).getDeclaredField((String) "FACILITY");
        ((Field) term1632).setAccessible(true);
        Object enum4 = ((Field) term1632).get((Object) null);
        term1541 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term1568 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term1569 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1571 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1580 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1589 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1590 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term1541, term1541.getClass(), "index", 1225272962);
        setField(term1541, term1541.getClass(), "name", "LQFpaHEwXR");
        setField(term1541, term1541.getClass(), "artifactType", enum4);
        setIntField(term1541, term1541.getClass(), "oneTimeTechBonus", 1324040357);
        setIntField(term1569, term1569.getClass(), "imageType", -1588772968);
        setField(term1569, term1569.getClass(), "colorModel", null);
        setField(term1571, term1571.getClass(), "sampleModel", null);
        setField(term1571, term1571.getClass(), "dataBuffer", null);
        setIntField(term1571, term1571.getClass(), "minX", -93135961);
        setIntField(term1571, term1571.getClass(), "minY", -112921587);
        setIntField(term1571, term1571.getClass(), "width", 933028652);
        setIntField(term1571, term1571.getClass(), "height", 287287233);
        setIntField(term1571, term1571.getClass(), "sampleModelTranslateX", 962840079);
        setIntField(term1571, term1571.getClass(), "sampleModelTranslateY", 1540719661);
        setIntField(term1571, term1571.getClass(), "numBands", 1265463001);
        setIntField(term1571, term1571.getClass(), "numDataElements", 335112684);
        setField(term1580, term1580.getClass(), "sampleModel", null);
        setField(term1580, term1580.getClass(), "dataBuffer", null);
        setIntField(term1580, term1580.getClass(), "minX", 1551099402);
        setIntField(term1580, term1580.getClass(), "minY", -2027534003);
        setIntField(term1580, term1580.getClass(), "width", 1063420942);
        setIntField(term1580, term1580.getClass(), "height", 1375330971);
        setIntField(term1580, term1580.getClass(), "sampleModelTranslateX", -478195677);
        setIntField(term1580, term1580.getClass(), "sampleModelTranslateY", 972867650);
        setIntField(term1580, term1580.getClass(), "numBands", 1655935355);
        setIntField(term1580, term1580.getClass(), "numDataElements", -481533957);
        setField(term1580, term1580.getClass(), "parent", null);
        setField(term1571, term1571.getClass(), "parent", term1580);
        setField(term1569, term1569.getClass(), "raster", term1571);
        setField(term1569, term1569.getClass(), "osis", null);
        setField(term1589, term1589.getClass(), "table", term1590);
        setIntField(term1589, term1589.getClass(), "count", 1);
        setIntField(term1589, term1589.getClass(), "threshold", 8);
        setFloatField(term1589, term1589.getClass(), "loadFactor", 0.75F);
        setIntField(term1589, term1589.getClass(), "modCount", 1);
        setField(term1589, term1589.getClass(), "keySet", null);
        setField(term1589, term1589.getClass(), "entrySet", null);
        setField(term1589, term1589.getClass(), "values", null);
        setField(term1569, term1569.getClass(), "properties", term1589);
        setFloatField(term1569, term1569.getClass(), "accelerationPriority", 0.09123778F);
        setField(term1569, term1569.getClass(), "surfaceManager", null);
        setField(term1568, term1568.getClass(), "img", term1569);
        setField(term1568, term1568.getClass(), "name", "aJlieCFVtF");
        setIntField(term1568, term1568.getClass(), "index", -1465035361);
        setField(term1541, term1541.getClass(), "icon", term1568);
        setField(term1541, term1541.getClass(), "description", "ZiaGIbnzTs");
        setBooleanField(term1541, term1541.getClass(), "unique", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOneTimeTechBonus", argTypes, term1541, args);
    }

};


