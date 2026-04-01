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

public class MissionList_remove_137789731927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585014;
     Object term585019;

    public MissionList_remove_137789731927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term585015 = new ArrayList();
        term585014 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term585014, term585014.getClass(), "missions", term585015);
        Class<? extends Object> term585105 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term585104 = ((Class) term585105).getDeclaredField((String) "ROAM");
        ((Field) term585104).setAccessible(true);
        Object enum1629 = ((Field) term585104).get((Object) null);
        Class<? extends Object> term585339 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term585338 = ((Class) term585339).getDeclaredField((String) "TREKKING");
        ((Field) term585338).setAccessible(true);
        Object enum1630 = ((Field) term585338).get((Object) null);
        term585019 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term585040 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term585019, term585019.getClass(), "type", enum1629);
        setField(term585019, term585019.getClass(), "phase", enum1630);
        setIntField(term585040, term585040.getClass(), "x", 608684123);
        setIntField(term585040, term585040.getClass(), "y", -171647915);
        setField(term585019, term585019.getClass(), "targetCoordinate", term585040);
        setField(term585019, term585019.getClass(), "fleetName", "DaMXmHmGeO");
        setField(term585019, term585019.getClass(), "planetBuilding", "ZXCYBkKGsd");
        setField(term585019, term585019.getClass(), "planetGathering", "nelhvypqPO");
        setField(term585019, term585019.getClass(), "targetPlanet", "LhvOXTprYf");
        setField(term585019, term585019.getClass(), "parameter", "GjcJeMBzvW");
        setIntField(term585019, term585019.getClass(), "missionTime", -1101286926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Object[] args = new Object[1];
        args[0] = term585019;
        callMethod(klass, "remove", argTypes, term585014, args);
    }

};


