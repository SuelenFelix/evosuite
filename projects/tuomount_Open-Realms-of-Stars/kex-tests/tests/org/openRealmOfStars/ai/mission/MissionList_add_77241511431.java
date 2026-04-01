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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class MissionList_add_77241511431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594559;
     Object term594564;

    public MissionList_add_77241511431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term594560 = new ArrayList();
        term594559 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term594559, term594559.getClass(), "missions", term594560);
        Class<? extends Object> term594660 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term594659 = ((Class) term594660).getDeclaredField((String) "DESTROY_FLEET");
        ((Field) term594659).setAccessible(true);
        Object enum1659 = ((Field) term594659).get((Object) null);
        Class<? extends Object> term594921 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term594920 = ((Class) term594921).getDeclaredField((String) "EXECUTING");
        ((Field) term594920).setAccessible(true);
        Object enum1660 = ((Field) term594920).get((Object) null);
        term594564 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term594595 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term594564, term594564.getClass(), "type", enum1659);
        setField(term594564, term594564.getClass(), "phase", enum1660);
        setIntField(term594595, term594595.getClass(), "x", -826963523);
        setIntField(term594595, term594595.getClass(), "y", 1201706903);
        setField(term594564, term594564.getClass(), "targetCoordinate", term594595);
        setField(term594564, term594564.getClass(), "fleetName", "GpPiWwTKcU");
        setField(term594564, term594564.getClass(), "planetBuilding", "ofjXUHewlG");
        setField(term594564, term594564.getClass(), "planetGathering", "CHXNYgOymZ");
        setField(term594564, term594564.getClass(), "targetPlanet", "vkEHMEQCHn");
        setField(term594564, term594564.getClass(), "parameter", "RYAEwfwytw");
        setIntField(term594564, term594564.getClass(), "missionTime", 1864594766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Object[] args = new Object[1];
        args[0] = term594564;
        callMethod(klass, "add", argTypes, term594559, args);
    }

};


