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

public class SpaceAnomaly_createNewsStation_189177110417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32228;

    public SpaceAnomaly_createNewsStation_189177110417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32228 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.anomaly.SpaceAnomaly"));
        setField(term32228, term32228.getClass(), "type", null);
        setIntField(term32228, term32228.getClass(), "value", 0);
        setField(term32228, term32228.getClass(), "text", null);
        setField(term32228, term32228.getClass(), "image", null);
        setField(term32228, term32228.getClass(), "combat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.anomaly.SpaceAnomaly");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createNewsStation", argTypes, term32228, args);
    }

};


