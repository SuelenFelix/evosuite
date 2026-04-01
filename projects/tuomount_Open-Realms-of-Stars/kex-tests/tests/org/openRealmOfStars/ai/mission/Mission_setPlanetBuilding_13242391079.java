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
import java.lang.String;
import java.lang.Object;

public class Mission_setPlanetBuilding_13242391079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603480;

    public Mission_setPlanetBuilding_13242391079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term603590 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term603589 = ((Class) term603590).getDeclaredField((String) "DEPLOY_STARBASE");
        ((Field) term603589).setAccessible(true);
        Object enum1687 = ((Field) term603589).get((Object) null);
        Class<? extends Object> term603857 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term603856 = ((Class) term603857).getDeclaredField((String) "EXECUTING");
        ((Field) term603856).setAccessible(true);
        Object enum1688 = ((Field) term603856).get((Object) null);
        term603480 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term603513 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term603480, term603480.getClass(), "type", enum1687);
        setField(term603480, term603480.getClass(), "phase", enum1688);
        setIntField(term603513, term603513.getClass(), "x", 1259462576);
        setIntField(term603513, term603513.getClass(), "y", 1096752196);
        setField(term603480, term603480.getClass(), "targetCoordinate", term603513);
        setField(term603480, term603480.getClass(), "fleetName", "MSAeSWLpvE");
        setField(term603480, term603480.getClass(), "planetBuilding", "ymVNlgISof");
        setField(term603480, term603480.getClass(), "planetGathering", "PAInRrlXjv");
        setField(term603480, term603480.getClass(), "targetPlanet", "RQLSTfypam");
        setField(term603480, term603480.getClass(), "parameter", "jRwUACtzxu");
        setIntField(term603480, term603480.getClass(), "missionTime", -1652791090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hCnZxJTpDU";
        callMethod(klass, "setPlanetBuilding", argTypes, term603480, args);
    }

};


