package org.openRealmOfStars.mapTiles.anomaly;

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
import static org.openRealmOfStars.mapTiles.anomaly.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpaceAnomaly_getImage_65583853011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15285;

    public SpaceAnomaly_getImage_65583853011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15285 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.anomaly.SpaceAnomaly"));
        setField(term15285, term15285.getClass(), "type", null);
        setIntField(term15285, term15285.getClass(), "value", 0);
        setField(term15285, term15285.getClass(), "text", null);
        setField(term15285, term15285.getClass(), "image", null);
        setField(term15285, term15285.getClass(), "combat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.anomaly.SpaceAnomaly");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage", argTypes, term15285, args);
    }

};


