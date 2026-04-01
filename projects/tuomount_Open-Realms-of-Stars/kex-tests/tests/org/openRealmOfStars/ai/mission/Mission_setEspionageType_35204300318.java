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

public class Mission_setEspionageType_35204300318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609426;
     Object enum1707;

    public Mission_setEspionageType_35204300318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term609549 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term609548 = ((Class) term609549).getDeclaredField((String) "DIPLOMATIC_DELEGACY");
        ((Field) term609548).setAccessible(true);
        Object enum1705 = ((Field) term609548).get((Object) null);
        Class<? extends Object> term609828 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term609827 = ((Class) term609828).getDeclaredField((String) "LOADING");
        ((Field) term609827).setAccessible(true);
        Object enum1706 = ((Field) term609827).get((Object) null);
        term609426 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term609461 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term609426, term609426.getClass(), "type", enum1705);
        setField(term609426, term609426.getClass(), "phase", enum1706);
        setIntField(term609461, term609461.getClass(), "x", -600588040);
        setIntField(term609461, term609461.getClass(), "y", 664854678);
        setField(term609426, term609426.getClass(), "targetCoordinate", term609461);
        setField(term609426, term609426.getClass(), "fleetName", "cWZFBFUtRq");
        setField(term609426, term609426.getClass(), "planetBuilding", "JATsJMUffI");
        setField(term609426, term609426.getClass(), "planetGathering", "lpZaVKLGnz");
        setField(term609426, term609426.getClass(), "targetPlanet", "CbTzEovelY");
        setField(term609426, term609426.getClass(), "parameter", "AzJzHNCIbb");
        setIntField(term609426, term609426.getClass(), "missionTime", -700896821);
        Class<? extends Object> term610126 = Class.forName((String) "org.openRealmOfStars.player.leader.EspionageMission");
        Field term610125 = ((Class) term610126).getDeclaredField((String) "ASSASSIN_GOVERNOR");
        ((Field) term610125).setAccessible(true);
        enum1707 = ((Field) term610125).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.EspionageMission");
        Object[] args = new Object[1];
        args[0] = enum1707;
        callMethod(klass, "setEspionageType", argTypes, term609426, args);
    }

};


