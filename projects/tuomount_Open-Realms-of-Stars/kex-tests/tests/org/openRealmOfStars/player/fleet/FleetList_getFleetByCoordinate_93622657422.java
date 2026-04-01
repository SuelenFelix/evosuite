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

public class FleetList_getFleetByCoordinate_93622657422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2232998;
     Object term2233004;

    public FleetList_getFleetByCoordinate_93622657422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2232999 = new ArrayList();
        term2232998 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.FleetList"));
        setField(term2232998, term2232998.getClass(), "fleetList", term2232999);
        setIntField(term2232998, term2232998.getClass(), "index", -1);
        term2233004 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term2233004, term2233004.getClass(), "x", 1252767312);
        setIntField(term2233004, term2233004.getClass(), "y", -773578935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.FleetList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = term2233004;
        callMethod(klass, "getFleetByCoordinate", argTypes, term2232998, args);
    }

};


