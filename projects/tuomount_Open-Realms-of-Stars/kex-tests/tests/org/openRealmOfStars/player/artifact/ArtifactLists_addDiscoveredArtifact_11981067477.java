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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class ArtifactLists_addDiscoveredArtifact_11981067477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5267;
     Object term5277;

    public ArtifactLists_addDiscoveredArtifact_11981067477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5268 = new ArrayList();
        ArrayList term5272 = new ArrayList();
        term5267 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists"));
        setField(term5267, term5267.getClass(), "discoveredArtifacts", term5268);
        setField(term5267, term5267.getClass(), "researchedArtifacts", term5272);
        setIntField(term5267, term5267.getClass(), "artifactResearchPoints", -1656687479);
        Class<? extends Object> term5369 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term5368 = ((Class) term5369).getDeclaredField((String) "FACILITY");
        ((Field) term5368).setAccessible(true);
        Object enum13 = ((Field) term5368).get((Object) null);
        term5277 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        Object term5304 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term5305 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term5307 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term5316 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term5325 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term5326 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term5277, term5277.getClass(), "index", -249614216);
        setField(term5277, term5277.getClass(), "name", "UoYtihxVaS");
        setField(term5277, term5277.getClass(), "artifactType", enum13);
        setIntField(term5277, term5277.getClass(), "oneTimeTechBonus", 1870727665);
        setIntField(term5305, term5305.getClass(), "imageType", -519881101);
        setField(term5305, term5305.getClass(), "colorModel", null);
        setField(term5307, term5307.getClass(), "sampleModel", null);
        setField(term5307, term5307.getClass(), "dataBuffer", null);
        setIntField(term5307, term5307.getClass(), "minX", -680920524);
        setIntField(term5307, term5307.getClass(), "minY", -916335264);
        setIntField(term5307, term5307.getClass(), "width", -919416536);
        setIntField(term5307, term5307.getClass(), "height", -43417861);
        setIntField(term5307, term5307.getClass(), "sampleModelTranslateX", -1533843432);
        setIntField(term5307, term5307.getClass(), "sampleModelTranslateY", -123338791);
        setIntField(term5307, term5307.getClass(), "numBands", -1467089634);
        setIntField(term5307, term5307.getClass(), "numDataElements", 413548937);
        setField(term5316, term5316.getClass(), "sampleModel", null);
        setField(term5316, term5316.getClass(), "dataBuffer", null);
        setIntField(term5316, term5316.getClass(), "minX", 1901317214);
        setIntField(term5316, term5316.getClass(), "minY", 1166710220);
        setIntField(term5316, term5316.getClass(), "width", -1070592289);
        setIntField(term5316, term5316.getClass(), "height", -1464172784);
        setIntField(term5316, term5316.getClass(), "sampleModelTranslateX", 32185364);
        setIntField(term5316, term5316.getClass(), "sampleModelTranslateY", 1768204942);
        setIntField(term5316, term5316.getClass(), "numBands", 1252951645);
        setIntField(term5316, term5316.getClass(), "numDataElements", 574481092);
        setField(term5316, term5316.getClass(), "parent", null);
        setField(term5307, term5307.getClass(), "parent", term5316);
        setField(term5305, term5305.getClass(), "raster", term5307);
        setField(term5305, term5305.getClass(), "osis", null);
        setField(term5325, term5325.getClass(), "table", term5326);
        setIntField(term5325, term5325.getClass(), "count", 1);
        setIntField(term5325, term5325.getClass(), "threshold", 8);
        setFloatField(term5325, term5325.getClass(), "loadFactor", 0.75F);
        setIntField(term5325, term5325.getClass(), "modCount", 1);
        setField(term5325, term5325.getClass(), "keySet", null);
        setField(term5325, term5325.getClass(), "entrySet", null);
        setField(term5325, term5325.getClass(), "values", null);
        setField(term5305, term5305.getClass(), "properties", term5325);
        setFloatField(term5305, term5305.getClass(), "accelerationPriority", 0.7944024F);
        setField(term5305, term5305.getClass(), "surfaceManager", null);
        setField(term5304, term5304.getClass(), "img", term5305);
        setField(term5304, term5304.getClass(), "name", "onpbIeEKoi");
        setIntField(term5304, term5304.getClass(), "index", -634976996);
        setField(term5277, term5277.getClass(), "icon", term5304);
        setField(term5277, term5277.getClass(), "description", "YRHGsAkhxb");
        setBooleanField(term5277, term5277.getClass(), "unique", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Object[] args = new Object[1];
        args[0] = term5277;
        callMethod(klass, "addDiscoveredArtifact", argTypes, term5267, args);
    }

};


