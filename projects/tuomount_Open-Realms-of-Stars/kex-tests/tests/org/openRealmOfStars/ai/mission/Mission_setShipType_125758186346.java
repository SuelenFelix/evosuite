package org.openRealmOfStars.ai.mission;

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
import static org.openRealmOfStars.ai.mission.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Mission_setShipType_125758186346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615718;

    public Mission_setShipType_125758186346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615718 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        setField(term615718, term615718.getClass(), "type", null);
        setField(term615718, term615718.getClass(), "phase", null);
        setField(term615718, term615718.getClass(), "targetCoordinate", null);
        setField(term615718, term615718.getClass(), "fleetName", null);
        setField(term615718, term615718.getClass(), "planetBuilding", null);
        setField(term615718, term615718.getClass(), "planetGathering", null);
        setField(term615718, term615718.getClass(), "targetPlanet", null);
        setField(term615718, term615718.getClass(), "parameter", null);
        setIntField(term615718, term615718.getClass(), "missionTime", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShipType", argTypes, term615718, args);
    }

};


