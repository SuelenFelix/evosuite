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

public class Artifact_getFullDescription_67413184510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3953;

    public Artifact_getFullDescription_67413184510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4043 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term4042 = ((Class) term4043).getDeclaredField((String) "ENERGY");
        ((Field) term4042).setAccessible(true);
        Object enum10 = ((Field) term4042).get((Object) null);
        term3953 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term3978 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term3979 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term3981 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term3990 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term3999 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term4000 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term3953, term3953.getClass(), "index", -1347358701);
        setField(term3953, term3953.getClass(), "name", "wSQxaModmm");
        setField(term3953, term3953.getClass(), "artifactType", enum10);
        setIntField(term3953, term3953.getClass(), "oneTimeTechBonus", 806595993);
        setIntField(term3979, term3979.getClass(), "imageType", 548228925);
        setField(term3979, term3979.getClass(), "colorModel", null);
        setField(term3981, term3981.getClass(), "sampleModel", null);
        setField(term3981, term3981.getClass(), "dataBuffer", null);
        setIntField(term3981, term3981.getClass(), "minX", -749861210);
        setIntField(term3981, term3981.getClass(), "minY", 1694224101);
        setIntField(term3981, term3981.getClass(), "width", 937859191);
        setIntField(term3981, term3981.getClass(), "height", -916584829);
        setIntField(term3981, term3981.getClass(), "sampleModelTranslateX", -2131181468);
        setIntField(term3981, term3981.getClass(), "sampleModelTranslateY", 282916351);
        setIntField(term3981, term3981.getClass(), "numBands", 880977281);
        setIntField(term3981, term3981.getClass(), "numDataElements", 371943306);
        setField(term3990, term3990.getClass(), "sampleModel", null);
        setField(term3990, term3990.getClass(), "dataBuffer", null);
        setIntField(term3990, term3990.getClass(), "minX", 982388293);
        setIntField(term3990, term3990.getClass(), "minY", -159494544);
        setIntField(term3990, term3990.getClass(), "width", -75206835);
        setIntField(term3990, term3990.getClass(), "height", -1618206977);
        setIntField(term3990, term3990.getClass(), "sampleModelTranslateX", -1747406163);
        setIntField(term3990, term3990.getClass(), "sampleModelTranslateY", 388157121);
        setIntField(term3990, term3990.getClass(), "numBands", 1684998508);
        setIntField(term3990, term3990.getClass(), "numDataElements", -1476644457);
        setField(term3990, term3990.getClass(), "parent", null);
        setField(term3981, term3981.getClass(), "parent", term3990);
        setField(term3979, term3979.getClass(), "raster", term3981);
        setField(term3979, term3979.getClass(), "osis", null);
        setField(term3999, term3999.getClass(), "table", term4000);
        setIntField(term3999, term3999.getClass(), "count", 1);
        setIntField(term3999, term3999.getClass(), "threshold", 8);
        setFloatField(term3999, term3999.getClass(), "loadFactor", 0.75F);
        setIntField(term3999, term3999.getClass(), "modCount", 1);
        setField(term3999, term3999.getClass(), "keySet", null);
        setField(term3999, term3999.getClass(), "entrySet", null);
        setField(term3999, term3999.getClass(), "values", null);
        setField(term3979, term3979.getClass(), "properties", term3999);
        setFloatField(term3979, term3979.getClass(), "accelerationPriority", 0.40176582F);
        setField(term3979, term3979.getClass(), "surfaceManager", null);
        setField(term3978, term3978.getClass(), "img", term3979);
        setField(term3978, term3978.getClass(), "name", "gGSMzuGICf");
        setIntField(term3978, term3978.getClass(), "index", -1146679443);
        setField(term3953, term3953.getClass(), "icon", term3978);
        setField(term3953, term3953.getClass(), "description", "hxCBltsObl");
        setBooleanField(term3953, term3953.getClass(), "unique", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullDescription", argTypes, term3953, args);
    }

};


