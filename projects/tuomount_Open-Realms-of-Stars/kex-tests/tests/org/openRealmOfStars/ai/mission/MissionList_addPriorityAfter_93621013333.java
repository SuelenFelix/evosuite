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

public class MissionList_addPriorityAfter_93621013333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595885;
     Object term595890;
     Object term595984;

    public MissionList_addPriorityAfter_93621013333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term595886 = new ArrayList();
        term595885 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term595885, term595885.getClass(), "missions", term595886);
        Class<? extends Object> term596076 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term596075 = ((Class) term596076).getDeclaredField((String) "DEVOURER_ROAM");
        ((Field) term596075).setAccessible(true);
        Object enum1663 = ((Field) term596075).get((Object) null);
        Class<? extends Object> term596337 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term596336 = ((Class) term596337).getDeclaredField((String) "BUILDING");
        ((Field) term596336).setAccessible(true);
        Object enum1664 = ((Field) term596336).get((Object) null);
        term595890 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term595920 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term595890, term595890.getClass(), "type", enum1663);
        setField(term595890, term595890.getClass(), "phase", enum1664);
        setIntField(term595920, term595920.getClass(), "x", 2007882601);
        setIntField(term595920, term595920.getClass(), "y", 741871354);
        setField(term595890, term595890.getClass(), "targetCoordinate", term595920);
        setField(term595890, term595890.getClass(), "fleetName", "NrluQGGkAI");
        setField(term595890, term595890.getClass(), "planetBuilding", "rRRHIwZeYE");
        setField(term595890, term595890.getClass(), "planetGathering", "atLPmHEHde");
        setField(term595890, term595890.getClass(), "targetPlanet", "GYuYmlhiwJ");
        setField(term595890, term595890.getClass(), "parameter", "vWTmyqmUcF");
        setIntField(term595890, term595890.getClass(), "missionTime", 1202129074);
        Class<? extends Object> term596638 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term596637 = ((Class) term596638).getDeclaredField((String) "SPY_MISSION");
        ((Field) term596637).setAccessible(true);
        Object enum1665 = ((Field) term596637).get((Object) null);
        Class<? extends Object> term596893 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term596892 = ((Class) term596893).getDeclaredField((String) "LOADING");
        ((Field) term596892).setAccessible(true);
        Object enum1666 = ((Field) term596892).get((Object) null);
        term595984 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term596011 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term595984, term595984.getClass(), "type", enum1665);
        setField(term595984, term595984.getClass(), "phase", enum1666);
        setIntField(term596011, term596011.getClass(), "x", -1288669556);
        setIntField(term596011, term596011.getClass(), "y", -1521858560);
        setField(term595984, term595984.getClass(), "targetCoordinate", term596011);
        setField(term595984, term595984.getClass(), "fleetName", "CJxbKlnsfa");
        setField(term595984, term595984.getClass(), "planetBuilding", "raUGgyZbSO");
        setField(term595984, term595984.getClass(), "planetGathering", "IdxOFTBJVV");
        setField(term595984, term595984.getClass(), "targetPlanet", "sUeCaxONBi");
        setField(term595984, term595984.getClass(), "parameter", "FmgtgLqfIa");
        setIntField(term595984, term595984.getClass(), "missionTime", 593933721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        argTypes[1] = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Object[] args = new Object[2];
        args[0] = term595890;
        args[1] = term595984;
        callMethod(klass, "addPriorityAfter", argTypes, term595885, args);
    }

};


