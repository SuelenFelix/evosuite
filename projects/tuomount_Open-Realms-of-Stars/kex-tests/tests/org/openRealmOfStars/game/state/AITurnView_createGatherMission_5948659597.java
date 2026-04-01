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

public class AITurnView_createGatherMission_5948659597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065649;
     Object term1065739;

    public AITurnView_createGatherMission_5948659597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1066031 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term1066030 = ((Class) term1066031).getDeclaredField((String) "COLONIZE");
        ((Field) term1066030).setAccessible(true);
        Object enum1932 = ((Field) term1066030).get((Object) null);
        Class<? extends Object> term1066337 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term1066336 = ((Class) term1066337).getDeclaredField((String) "EXECUTING");
        ((Field) term1066336).setAccessible(true);
        Object enum1933 = ((Field) term1066336).get((Object) null);
        term1065649 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term1065675 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term1065649, term1065649.getClass(), "type", enum1932);
        setField(term1065649, term1065649.getClass(), "phase", enum1933);
        setIntField(term1065675, term1065675.getClass(), "x", 991420239);
        setIntField(term1065675, term1065675.getClass(), "y", -1131431146);
        setField(term1065649, term1065649.getClass(), "targetCoordinate", term1065675);
        setField(term1065649, term1065649.getClass(), "fleetName", "ZcUxfwFQrm");
        setField(term1065649, term1065649.getClass(), "planetBuilding", "rnziBGepTH");
        setField(term1065649, term1065649.getClass(), "planetGathering", "gJqCYTLRdx");
        setField(term1065649, term1065649.getClass(), "targetPlanet", "stWYMclYCM");
        setField(term1065649, term1065649.getClass(), "parameter", "rbOqqsscfk");
        setIntField(term1065649, term1065649.getClass(), "missionTime", 1879476628);
        term1065739 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1065739, term1065739.getClass(), "x", 1504007508);
        setIntField(term1065739, term1065739.getClass(), "y", -1622967660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term1065649;
        args[1] = term1065739;
        args[2] = "alDYkzuLnE";
        callMethod(klass, "createGatherMission", argTypes, null, args);
    }

};


