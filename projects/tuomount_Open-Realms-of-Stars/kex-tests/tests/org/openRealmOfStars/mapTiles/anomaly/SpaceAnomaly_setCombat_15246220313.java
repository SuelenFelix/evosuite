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

public class SpaceAnomaly_setCombat_15246220313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19399;

    public SpaceAnomaly_setCombat_15246220313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19399 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.anomaly.SpaceAnomaly"));
        setField(term19399, term19399.getClass(), "type", null);
        setIntField(term19399, term19399.getClass(), "value", 0);
        setField(term19399, term19399.getClass(), "text", null);
        setField(term19399, term19399.getClass(), "image", null);
        setField(term19399, term19399.getClass(), "combat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.anomaly.SpaceAnomaly");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCombat", argTypes, term19399, args);
    }

};


