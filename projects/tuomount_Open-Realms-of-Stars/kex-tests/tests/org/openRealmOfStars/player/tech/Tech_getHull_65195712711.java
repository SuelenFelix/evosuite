package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tech_getHull_65195712711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54114;

    public Tech_getHull_65195712711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54232 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term54231 = ((Class) term54232).getDeclaredField((String) "Defense");
        ((Field) term54231).setAccessible(true);
        Object enum161 = ((Field) term54231).get((Object) null);
        term54114 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        Object term54177 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term54178 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term54180 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term54189 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term54198 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term54199 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term54220 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 0);
        setField(term54114, term54114.getClass(), "name", "JCWSoxnBJs");
        setField(term54114, term54114.getClass(), "type", enum161);
        setIntField(term54114, term54114.getClass(), "level", 1008080511);
        setField(term54114, term54114.getClass(), "component", "vAxcpvjEEa");
        setField(term54114, term54114.getClass(), "improvement", "FCkOgIBqXE");
        setField(term54114, term54114.getClass(), "hull", "kadRHthQRD");
        setBooleanField(term54114, term54114.getClass(), "rareTech", false);
        setIntField(term54114, term54114.getClass(), "nextTechLevel", 1935707624);
        setIntField(term54178, term54178.getClass(), "imageType", 1507074215);
        setField(term54178, term54178.getClass(), "colorModel", null);
        setField(term54180, term54180.getClass(), "sampleModel", null);
        setField(term54180, term54180.getClass(), "dataBuffer", null);
        setIntField(term54180, term54180.getClass(), "minX", -282881827);
        setIntField(term54180, term54180.getClass(), "minY", -1183353915);
        setIntField(term54180, term54180.getClass(), "width", -420030135);
        setIntField(term54180, term54180.getClass(), "height", 267763294);
        setIntField(term54180, term54180.getClass(), "sampleModelTranslateX", -1497710478);
        setIntField(term54180, term54180.getClass(), "sampleModelTranslateY", 49950830);
        setIntField(term54180, term54180.getClass(), "numBands", -525257914);
        setIntField(term54180, term54180.getClass(), "numDataElements", 147209682);
        setField(term54189, term54189.getClass(), "sampleModel", null);
        setField(term54189, term54189.getClass(), "dataBuffer", null);
        setIntField(term54189, term54189.getClass(), "minX", 34470066);
        setIntField(term54189, term54189.getClass(), "minY", 2058711405);
        setIntField(term54189, term54189.getClass(), "width", 1743683601);
        setIntField(term54189, term54189.getClass(), "height", -945116798);
        setIntField(term54189, term54189.getClass(), "sampleModelTranslateX", 1593461795);
        setIntField(term54189, term54189.getClass(), "sampleModelTranslateY", 515182546);
        setIntField(term54189, term54189.getClass(), "numBands", -936895502);
        setIntField(term54189, term54189.getClass(), "numDataElements", -129547140);
        setField(term54189, term54189.getClass(), "parent", null);
        setField(term54180, term54180.getClass(), "parent", term54189);
        setField(term54178, term54178.getClass(), "raster", term54180);
        setField(term54178, term54178.getClass(), "osis", null);
        setField(term54198, term54198.getClass(), "table", term54199);
        setIntField(term54198, term54198.getClass(), "count", 1);
        setIntField(term54198, term54198.getClass(), "threshold", 8);
        setFloatField(term54198, term54198.getClass(), "loadFactor", 0.75F);
        setIntField(term54198, term54198.getClass(), "modCount", 1);
        setField(term54198, term54198.getClass(), "keySet", null);
        setField(term54198, term54198.getClass(), "entrySet", null);
        setField(term54198, term54198.getClass(), "values", null);
        setField(term54178, term54178.getClass(), "properties", term54198);
        setFloatField(term54178, term54178.getClass(), "accelerationPriority", 0.40176582F);
        setField(term54178, term54178.getClass(), "surfaceManager", null);
        setField(term54177, term54177.getClass(), "img", term54178);
        setField(term54177, term54177.getClass(), "name", "MzXzaqaiHW");
        setIntField(term54177, term54177.getClass(), "index", -1195339592);
        setField(term54114, term54114.getClass(), "icon", term54177);
        setBooleanField(term54114, term54114.getClass(), "tradeable", false);
        setBooleanField(term54114, term54114.getClass(), "excludeList", false);
        setField(term54114, term54114.getClass(), "spaceRaces", term54220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHull", argTypes, term54114, args);
    }

};


