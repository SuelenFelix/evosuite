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

public class Artifact_getIcon_14841936916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2313;

    public Artifact_getIcon_14841936916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2407 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term2406 = ((Class) term2407).getDeclaredField((String) "ELECTRONIC");
        ((Field) term2406).setAccessible(true);
        Object enum6 = ((Field) term2406).get((Object) null);
        term2313 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term2342 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term2343 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2345 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2354 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2363 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2364 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term2313, term2313.getClass(), "index", 339854490);
        setField(term2313, term2313.getClass(), "name", "RkybSrpybU");
        setField(term2313, term2313.getClass(), "artifactType", enum6);
        setIntField(term2313, term2313.getClass(), "oneTimeTechBonus", -615654495);
        setIntField(term2343, term2343.getClass(), "imageType", -1476117762);
        setField(term2343, term2343.getClass(), "colorModel", null);
        setField(term2345, term2345.getClass(), "sampleModel", null);
        setField(term2345, term2345.getClass(), "dataBuffer", null);
        setIntField(term2345, term2345.getClass(), "minX", -341962980);
        setIntField(term2345, term2345.getClass(), "minY", 1532716628);
        setIntField(term2345, term2345.getClass(), "width", -1801760683);
        setIntField(term2345, term2345.getClass(), "height", 1141317871);
        setIntField(term2345, term2345.getClass(), "sampleModelTranslateX", 890669485);
        setIntField(term2345, term2345.getClass(), "sampleModelTranslateY", 691577392);
        setIntField(term2345, term2345.getClass(), "numBands", -893623680);
        setIntField(term2345, term2345.getClass(), "numDataElements", -1963434938);
        setField(term2354, term2354.getClass(), "sampleModel", null);
        setField(term2354, term2354.getClass(), "dataBuffer", null);
        setIntField(term2354, term2354.getClass(), "minX", 906181092);
        setIntField(term2354, term2354.getClass(), "minY", 1045657203);
        setIntField(term2354, term2354.getClass(), "width", 1386130016);
        setIntField(term2354, term2354.getClass(), "height", 1072005683);
        setIntField(term2354, term2354.getClass(), "sampleModelTranslateX", 1861318859);
        setIntField(term2354, term2354.getClass(), "sampleModelTranslateY", 1474524152);
        setIntField(term2354, term2354.getClass(), "numBands", 568954359);
        setIntField(term2354, term2354.getClass(), "numDataElements", 53410913);
        setField(term2354, term2354.getClass(), "parent", null);
        setField(term2345, term2345.getClass(), "parent", term2354);
        setField(term2343, term2343.getClass(), "raster", term2345);
        setField(term2343, term2343.getClass(), "osis", null);
        setField(term2363, term2363.getClass(), "table", term2364);
        setIntField(term2363, term2363.getClass(), "count", 1);
        setIntField(term2363, term2363.getClass(), "threshold", 8);
        setFloatField(term2363, term2363.getClass(), "loadFactor", 0.75F);
        setIntField(term2363, term2363.getClass(), "modCount", 1);
        setField(term2363, term2363.getClass(), "keySet", null);
        setField(term2363, term2363.getClass(), "entrySet", null);
        setField(term2363, term2363.getClass(), "values", null);
        setField(term2343, term2343.getClass(), "properties", term2363);
        setFloatField(term2343, term2343.getClass(), "accelerationPriority", 0.8564069F);
        setField(term2343, term2343.getClass(), "surfaceManager", null);
        setField(term2342, term2342.getClass(), "img", term2343);
        setField(term2342, term2342.getClass(), "name", "eZFUvlxvGV");
        setIntField(term2342, term2342.getClass(), "index", 1107176718);
        setField(term2313, term2313.getClass(), "icon", term2342);
        setField(term2313, term2313.getClass(), "description", "BYqFIqCKAV");
        setBooleanField(term2313, term2313.getClass(), "unique", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIcon", argTypes, term2313, args);
    }

};


