package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FleetTileInfo_getConflictIndex_24004498624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109211;

    public FleetTileInfo_getConflictIndex_24004498624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109211 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        setField(term109211, term109211.getClass(), "race", null);
        setIntField(term109211, term109211.getClass(), "imageIndex", 0);
        setIntField(term109211, term109211.getClass(), "playerIndex", 0);
        setIntField(term109211, term109211.getClass(), "fleetIndex", 0);
        setIntField(term109211, term109211.getClass(), "planetIndex", 0);
        setIntField(term109211, term109211.getClass(), "conflictIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConflictIndex", argTypes, term109211, args);
    }

};


