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

public class Artifact_getArtifactType_3088408593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1146;

    public Artifact_getArtifactType_3088408593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1240 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term1239 = ((Class) term1240).getDeclaredField((String) "ELECTRONIC");
        ((Field) term1239).setAccessible(true);
        Object enum3 = ((Field) term1239).get((Object) null);
        term1146 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term1175 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term1176 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1178 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1187 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1196 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1197 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term1146, term1146.getClass(), "index", -157887805);
        setField(term1146, term1146.getClass(), "name", "RMFIsYGgne");
        setField(term1146, term1146.getClass(), "artifactType", enum3);
        setIntField(term1146, term1146.getClass(), "oneTimeTechBonus", 1876565163);
        setIntField(term1176, term1176.getClass(), "imageType", -817164822);
        setField(term1176, term1176.getClass(), "colorModel", null);
        setField(term1178, term1178.getClass(), "sampleModel", null);
        setField(term1178, term1178.getClass(), "dataBuffer", null);
        setIntField(term1178, term1178.getClass(), "minX", -1016503459);
        setIntField(term1178, term1178.getClass(), "minY", -1968847291);
        setIntField(term1178, term1178.getClass(), "width", 579005622);
        setIntField(term1178, term1178.getClass(), "height", -14890619);
        setIntField(term1178, term1178.getClass(), "sampleModelTranslateX", 1632125673);
        setIntField(term1178, term1178.getClass(), "sampleModelTranslateY", 454281060);
        setIntField(term1178, term1178.getClass(), "numBands", -1786399638);
        setIntField(term1178, term1178.getClass(), "numDataElements", 2055867847);
        setField(term1187, term1187.getClass(), "sampleModel", null);
        setField(term1187, term1187.getClass(), "dataBuffer", null);
        setIntField(term1187, term1187.getClass(), "minX", -1048298087);
        setIntField(term1187, term1187.getClass(), "minY", 292681826);
        setIntField(term1187, term1187.getClass(), "width", 458147407);
        setIntField(term1187, term1187.getClass(), "height", -184153539);
        setIntField(term1187, term1187.getClass(), "sampleModelTranslateX", 493620644);
        setIntField(term1187, term1187.getClass(), "sampleModelTranslateY", 1328271830);
        setIntField(term1187, term1187.getClass(), "numBands", 1596070772);
        setIntField(term1187, term1187.getClass(), "numDataElements", 97029295);
        setField(term1187, term1187.getClass(), "parent", null);
        setField(term1178, term1178.getClass(), "parent", term1187);
        setField(term1176, term1176.getClass(), "raster", term1178);
        setField(term1176, term1176.getClass(), "osis", null);
        setField(term1196, term1196.getClass(), "table", term1197);
        setIntField(term1196, term1196.getClass(), "count", 1);
        setIntField(term1196, term1196.getClass(), "threshold", 8);
        setFloatField(term1196, term1196.getClass(), "loadFactor", 0.75F);
        setIntField(term1196, term1196.getClass(), "modCount", 1);
        setField(term1196, term1196.getClass(), "keySet", null);
        setField(term1196, term1196.getClass(), "entrySet", null);
        setField(term1196, term1196.getClass(), "values", null);
        setField(term1176, term1176.getClass(), "properties", term1196);
        setFloatField(term1176, term1176.getClass(), "accelerationPriority", 0.3455959F);
        setField(term1176, term1176.getClass(), "surfaceManager", null);
        setField(term1175, term1175.getClass(), "img", term1176);
        setField(term1175, term1175.getClass(), "name", "uuaPigETmJ");
        setIntField(term1175, term1175.getClass(), "index", -2095575670);
        setField(term1146, term1146.getClass(), "icon", term1175);
        setField(term1146, term1146.getClass(), "description", "MxlszYVzRf");
        setBooleanField(term1146, term1146.getClass(), "unique", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtifactType", argTypes, term1146, args);
    }

};


