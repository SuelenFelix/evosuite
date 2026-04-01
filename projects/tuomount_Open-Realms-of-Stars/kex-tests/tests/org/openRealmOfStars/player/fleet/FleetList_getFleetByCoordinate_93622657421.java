package org.openRealmOfStars.player.fleet;

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
import static org.openRealmOfStars.player.fleet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class FleetList_getFleetByCoordinate_93622657421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220751;
     Object term220757;

    public FleetList_getFleetByCoordinate_93622657421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term220752 = new ArrayList();
        term220751 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.FleetList"));
        setField(term220751, term220751.getClass(), "fleetList", term220752);
        setIntField(term220751, term220751.getClass(), "index", -1);
        term220757 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term220757, term220757.getClass(), "x", 782140754);
        setIntField(term220757, term220757.getClass(), "y", -1361513040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.FleetList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = term220757;
        callMethod(klass, "getFleetByCoordinate", argTypes, term220751, args);
    }

};


