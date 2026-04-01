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

public class MissionList_addHighestPriority_205447299632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595224;
     Object term595229;

    public MissionList_addHighestPriority_205447299632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term595225 = new ArrayList();
        term595224 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term595224, term595224.getClass(), "missions", term595225);
        Class<? extends Object> term595324 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term595323 = ((Class) term595324).getDeclaredField((String) "DEVOURER_ROAM");
        ((Field) term595323).setAccessible(true);
        Object enum1661 = ((Field) term595323).get((Object) null);
        Class<? extends Object> term595585 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term595584 = ((Class) term595585).getDeclaredField((String) "BUILDING");
        ((Field) term595584).setAccessible(true);
        Object enum1662 = ((Field) term595584).get((Object) null);
        term595229 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term595259 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term595229, term595229.getClass(), "type", enum1661);
        setField(term595229, term595229.getClass(), "phase", enum1662);
        setIntField(term595259, term595259.getClass(), "x", -1496124355);
        setIntField(term595259, term595259.getClass(), "y", -482420846);
        setField(term595229, term595229.getClass(), "targetCoordinate", term595259);
        setField(term595229, term595229.getClass(), "fleetName", "PPIdNQKIpq");
        setField(term595229, term595229.getClass(), "planetBuilding", "aCayimkJDN");
        setField(term595229, term595229.getClass(), "planetGathering", "TisQHkcutF");
        setField(term595229, term595229.getClass(), "targetPlanet", "SERBXrZyPQ");
        setField(term595229, term595229.getClass(), "parameter", "WrcohoYvuN");
        setIntField(term595229, term595229.getClass(), "missionTime", -736943198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Object[] args = new Object[1];
        args[0] = term595229;
        callMethod(klass, "addHighestPriority", argTypes, term595224, args);
    }

};


