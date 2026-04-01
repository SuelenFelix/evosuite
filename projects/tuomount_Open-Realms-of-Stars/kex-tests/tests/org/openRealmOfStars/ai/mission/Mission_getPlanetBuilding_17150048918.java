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

public class Mission_getPlanetBuilding_17150048918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602852;

    public Mission_getPlanetBuilding_17150048918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term602940 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term602939 = ((Class) term602940).getDeclaredField((String) "DEFEND");
        ((Field) term602939).setAccessible(true);
        Object enum1685 = ((Field) term602939).get((Object) null);
        Class<? extends Object> term603180 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term603179 = ((Class) term603180).getDeclaredField((String) "TREKKING");
        ((Field) term603179).setAccessible(true);
        Object enum1686 = ((Field) term603179).get((Object) null);
        term602852 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term602875 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term602852, term602852.getClass(), "type", enum1685);
        setField(term602852, term602852.getClass(), "phase", enum1686);
        setIntField(term602875, term602875.getClass(), "x", -1773441307);
        setIntField(term602875, term602875.getClass(), "y", -205848544);
        setField(term602852, term602852.getClass(), "targetCoordinate", term602875);
        setField(term602852, term602852.getClass(), "fleetName", "YouPGxynTk");
        setField(term602852, term602852.getClass(), "planetBuilding", "CojZYdwcwt");
        setField(term602852, term602852.getClass(), "planetGathering", "gfqiYmmXUT");
        setField(term602852, term602852.getClass(), "targetPlanet", "whoEHGLUhh");
        setField(term602852, term602852.getClass(), "parameter", "WVdfjzeThF");
        setIntField(term602852, term602852.getClass(), "missionTime", -845902757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetBuilding", argTypes, term602852, args);
    }

};


