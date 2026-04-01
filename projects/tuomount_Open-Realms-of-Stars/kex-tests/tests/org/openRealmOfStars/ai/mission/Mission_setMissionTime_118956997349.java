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
import java.lang.Integer;

public class Mission_setMissionTime_118956997349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615724;
     Object term615726;

    public Mission_setMissionTime_118956997349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615724 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        setField(term615724, term615724.getClass(), "type", null);
        setField(term615724, term615724.getClass(), "phase", null);
        setField(term615724, term615724.getClass(), "targetCoordinate", null);
        setField(term615724, term615724.getClass(), "fleetName", null);
        setField(term615724, term615724.getClass(), "planetBuilding", null);
        setField(term615724, term615724.getClass(), "planetGathering", null);
        setField(term615724, term615724.getClass(), "targetPlanet", null);
        setField(term615724, term615724.getClass(), "parameter", null);
        setIntField(term615724, term615724.getClass(), "missionTime", 0);
        term615726 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term615726;
        callMethod(klass, "setMissionTime", argTypes, term615724, args);
    }

};


