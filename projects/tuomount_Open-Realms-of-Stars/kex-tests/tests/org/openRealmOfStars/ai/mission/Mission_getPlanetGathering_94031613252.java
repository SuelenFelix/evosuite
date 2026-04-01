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

public class Mission_getPlanetGathering_94031613252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615732;

    public Mission_getPlanetGathering_94031613252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615732 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        setField(term615732, term615732.getClass(), "type", null);
        setField(term615732, term615732.getClass(), "phase", null);
        setField(term615732, term615732.getClass(), "targetCoordinate", null);
        setField(term615732, term615732.getClass(), "fleetName", null);
        setField(term615732, term615732.getClass(), "planetBuilding", null);
        setField(term615732, term615732.getClass(), "planetGathering", null);
        setField(term615732, term615732.getClass(), "targetPlanet", null);
        setField(term615732, term615732.getClass(), "parameter", null);
        setIntField(term615732, term615732.getClass(), "missionTime", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetGathering", argTypes, term615732, args);
    }

};


