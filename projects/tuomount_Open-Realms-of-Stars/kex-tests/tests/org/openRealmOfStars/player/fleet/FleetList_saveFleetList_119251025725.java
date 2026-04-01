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

public class FleetList_saveFleetList_119251025725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220872;

    public FleetList_saveFleetList_119251025725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220872 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.FleetList"));
        setField(term220872, term220872.getClass(), "fleetList", null);
        setIntField(term220872, term220872.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.FleetList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "saveFleetList", argTypes, term220872, args);
    }

};


