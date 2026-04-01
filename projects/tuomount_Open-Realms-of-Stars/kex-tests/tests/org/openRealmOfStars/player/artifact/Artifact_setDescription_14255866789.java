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

public class Artifact_setDescription_14255866789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3544;

    public Artifact_setDescription_14255866789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3648 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term3647 = ((Class) term3648).getDeclaredField((String) "FACILITY");
        ((Field) term3647).setAccessible(true);
        Object enum9 = ((Field) term3647).get((Object) null);
        term3544 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term3571 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term3572 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term3574 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term3583 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term3592 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term3593 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term3544, term3544.getClass(), "index", 114754804);
        setField(term3544, term3544.getClass(), "name", "Ghbwtircqb");
        setField(term3544, term3544.getClass(), "artifactType", enum9);
        setIntField(term3544, term3544.getClass(), "oneTimeTechBonus", 1687361082);
        setIntField(term3572, term3572.getClass(), "imageType", 584893196);
        setField(term3572, term3572.getClass(), "colorModel", null);
        setField(term3574, term3574.getClass(), "sampleModel", null);
        setField(term3574, term3574.getClass(), "dataBuffer", null);
        setIntField(term3574, term3574.getClass(), "minX", 497269071);
        setIntField(term3574, term3574.getClass(), "minY", -1899301124);
        setIntField(term3574, term3574.getClass(), "width", -1882480155);
        setIntField(term3574, term3574.getClass(), "height", -1410220680);
        setIntField(term3574, term3574.getClass(), "sampleModelTranslateX", 389427431);
        setIntField(term3574, term3574.getClass(), "sampleModelTranslateY", -1945706126);
        setIntField(term3574, term3574.getClass(), "numBands", 1152356969);
        setIntField(term3574, term3574.getClass(), "numDataElements", -1667990367);
        setField(term3583, term3583.getClass(), "sampleModel", null);
        setField(term3583, term3583.getClass(), "dataBuffer", null);
        setIntField(term3583, term3583.getClass(), "minX", -1214628358);
        setIntField(term3583, term3583.getClass(), "minY", 1102721075);
        setIntField(term3583, term3583.getClass(), "width", -426764678);
        setIntField(term3583, term3583.getClass(), "height", -1222614956);
        setIntField(term3583, term3583.getClass(), "sampleModelTranslateX", -1870495012);
        setIntField(term3583, term3583.getClass(), "sampleModelTranslateY", -1310015129);
        setIntField(term3583, term3583.getClass(), "numBands", -2104981311);
        setIntField(term3583, term3583.getClass(), "numDataElements", -571169753);
        setField(term3583, term3583.getClass(), "parent", null);
        setField(term3574, term3574.getClass(), "parent", term3583);
        setField(term3572, term3572.getClass(), "raster", term3574);
        setField(term3572, term3572.getClass(), "osis", null);
        setField(term3592, term3592.getClass(), "table", term3593);
        setIntField(term3592, term3592.getClass(), "count", 1);
        setIntField(term3592, term3592.getClass(), "threshold", 8);
        setFloatField(term3592, term3592.getClass(), "loadFactor", 0.75F);
        setIntField(term3592, term3592.getClass(), "modCount", 1);
        setField(term3592, term3592.getClass(), "keySet", null);
        setField(term3592, term3592.getClass(), "entrySet", null);
        setField(term3592, term3592.getClass(), "values", null);
        setField(term3572, term3572.getClass(), "properties", term3592);
        setFloatField(term3572, term3572.getClass(), "accelerationPriority", 0.6880585F);
        setField(term3572, term3572.getClass(), "surfaceManager", null);
        setField(term3571, term3571.getClass(), "img", term3572);
        setField(term3571, term3571.getClass(), "name", "IDCWpPLRkE");
        setIntField(term3571, term3571.getClass(), "index", -165587447);
        setField(term3544, term3544.getClass(), "icon", term3571);
        setField(term3544, term3544.getClass(), "description", "nyiiPDVjAc");
        setBooleanField(term3544, term3544.getClass(), "unique", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aKnKipADSo";
        callMethod(klass, "setDescription", argTypes, term3544, args);
    }

};


