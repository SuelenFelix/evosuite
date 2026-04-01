package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AITurnView_createGatherMission_5948659596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1125258;
     Object term1125348;

    public AITurnView_createGatherMission_5948659596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1125640 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term1125639 = ((Class) term1125640).getDeclaredField((String) "COLONIZE");
        ((Field) term1125639).setAccessible(true);
        Object enum2091 = ((Field) term1125639).get((Object) null);
        Class<? extends Object> term1125946 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term1125945 = ((Class) term1125946).getDeclaredField((String) "EXECUTING");
        ((Field) term1125945).setAccessible(true);
        Object enum2092 = ((Field) term1125945).get((Object) null);
        term1125258 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term1125284 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term1125258, term1125258.getClass(), "type", enum2091);
        setField(term1125258, term1125258.getClass(), "phase", enum2092);
        setIntField(term1125284, term1125284.getClass(), "x", -34121525);
        setIntField(term1125284, term1125284.getClass(), "y", -1065997660);
        setField(term1125258, term1125258.getClass(), "targetCoordinate", term1125284);
        setField(term1125258, term1125258.getClass(), "fleetName", "uPNCjIvDJk");
        setField(term1125258, term1125258.getClass(), "planetBuilding", "AjWyzREjrK");
        setField(term1125258, term1125258.getClass(), "planetGathering", "MxQciglSMi");
        setField(term1125258, term1125258.getClass(), "targetPlanet", "USYiGAYyND");
        setField(term1125258, term1125258.getClass(), "parameter", "NtomwgSxeQ");
        setIntField(term1125258, term1125258.getClass(), "missionTime", 265269699);
        term1125348 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1125348, term1125348.getClass(), "x", 1561132977);
        setIntField(term1125348, term1125348.getClass(), "y", 1473482271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term1125258;
        args[1] = term1125348;
        args[2] = "WLmGvoZgEE";
        callMethod(klass, "createGatherMission", argTypes, null, args);
    }

};


