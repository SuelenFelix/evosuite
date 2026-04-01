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

public class FleetTileInfo_setPlanetIndex_110812714627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109231;
     Object term109237;

    public FleetTileInfo_setPlanetIndex_110812714627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109231 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        setField(term109231, term109231.getClass(), "race", null);
        setIntField(term109231, term109231.getClass(), "imageIndex", 0);
        setIntField(term109231, term109231.getClass(), "playerIndex", 0);
        setIntField(term109231, term109231.getClass(), "fleetIndex", 0);
        setIntField(term109231, term109231.getClass(), "planetIndex", 0);
        setIntField(term109231, term109231.getClass(), "conflictIndex", 0);
        term109237 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term109237;
        callMethod(klass, "setPlanetIndex", argTypes, term109231, args);
    }

};


