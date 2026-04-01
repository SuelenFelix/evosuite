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

public class Artifact_isUnique_1592994611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4332;

    public Artifact_isUnique_1592994611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4424 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term4423 = ((Class) term4424).getDeclaredField((String) "FACILITY");
        ((Field) term4423).setAccessible(true);
        Object enum11 = ((Field) term4423).get((Object) null);
        term4332 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term4359 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term4360 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term4362 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term4371 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term4380 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term4381 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term4332, term4332.getClass(), "index", -860131894);
        setField(term4332, term4332.getClass(), "name", "BndsHwAFMv");
        setField(term4332, term4332.getClass(), "artifactType", enum11);
        setIntField(term4332, term4332.getClass(), "oneTimeTechBonus", -1022990421);
        setIntField(term4360, term4360.getClass(), "imageType", 1045547089);
        setField(term4360, term4360.getClass(), "colorModel", null);
        setField(term4362, term4362.getClass(), "sampleModel", null);
        setField(term4362, term4362.getClass(), "dataBuffer", null);
        setIntField(term4362, term4362.getClass(), "minX", -1122880881);
        setIntField(term4362, term4362.getClass(), "minY", -542712742);
        setIntField(term4362, term4362.getClass(), "width", -1254072822);
        setIntField(term4362, term4362.getClass(), "height", -1111249833);
        setIntField(term4362, term4362.getClass(), "sampleModelTranslateX", -1692331299);
        setIntField(term4362, term4362.getClass(), "sampleModelTranslateY", 479531250);
        setIntField(term4362, term4362.getClass(), "numBands", 1320570890);
        setIntField(term4362, term4362.getClass(), "numDataElements", -130649791);
        setField(term4371, term4371.getClass(), "sampleModel", null);
        setField(term4371, term4371.getClass(), "dataBuffer", null);
        setIntField(term4371, term4371.getClass(), "minX", 534834644);
        setIntField(term4371, term4371.getClass(), "minY", 1959097203);
        setIntField(term4371, term4371.getClass(), "width", -209654048);
        setIntField(term4371, term4371.getClass(), "height", 477625804);
        setIntField(term4371, term4371.getClass(), "sampleModelTranslateX", 252575029);
        setIntField(term4371, term4371.getClass(), "sampleModelTranslateY", 57189932);
        setIntField(term4371, term4371.getClass(), "numBands", 1460722225);
        setIntField(term4371, term4371.getClass(), "numDataElements", 1743224434);
        setField(term4371, term4371.getClass(), "parent", null);
        setField(term4362, term4362.getClass(), "parent", term4371);
        setField(term4360, term4360.getClass(), "raster", term4362);
        setField(term4360, term4360.getClass(), "osis", null);
        setField(term4380, term4380.getClass(), "table", term4381);
        setIntField(term4380, term4380.getClass(), "count", 1);
        setIntField(term4380, term4380.getClass(), "threshold", 8);
        setFloatField(term4380, term4380.getClass(), "loadFactor", 0.75F);
        setIntField(term4380, term4380.getClass(), "modCount", 1);
        setField(term4380, term4380.getClass(), "keySet", null);
        setField(term4380, term4380.getClass(), "entrySet", null);
        setField(term4380, term4380.getClass(), "values", null);
        setField(term4360, term4360.getClass(), "properties", term4380);
        setFloatField(term4360, term4360.getClass(), "accelerationPriority", 0.8783184F);
        setField(term4360, term4360.getClass(), "surfaceManager", null);
        setField(term4359, term4359.getClass(), "img", term4360);
        setField(term4359, term4359.getClass(), "name", "tShwQLRGNe");
        setIntField(term4359, term4359.getClass(), "index", 1008080511);
        setField(term4332, term4332.getClass(), "icon", term4359);
        setField(term4332, term4332.getClass(), "description", "LvtrsXUliU");
        setBooleanField(term4332, term4332.getClass(), "unique", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUnique", argTypes, term4332, args);
    }

};


