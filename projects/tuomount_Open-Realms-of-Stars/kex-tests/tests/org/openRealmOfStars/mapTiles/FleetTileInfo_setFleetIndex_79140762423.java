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
import java.lang.Integer;

public class FleetTileInfo_setFleetIndex_79140762423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109203;
     Object term109209;

    public FleetTileInfo_setFleetIndex_79140762423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109203 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        setField(term109203, term109203.getClass(), "race", null);
        setIntField(term109203, term109203.getClass(), "imageIndex", 0);
        setIntField(term109203, term109203.getClass(), "playerIndex", 0);
        setIntField(term109203, term109203.getClass(), "fleetIndex", 0);
        setIntField(term109203, term109203.getClass(), "planetIndex", 0);
        setIntField(term109203, term109203.getClass(), "conflictIndex", 0);
        term109209 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term109209;
        callMethod(klass, "setFleetIndex", argTypes, term109203, args);
    }

};


