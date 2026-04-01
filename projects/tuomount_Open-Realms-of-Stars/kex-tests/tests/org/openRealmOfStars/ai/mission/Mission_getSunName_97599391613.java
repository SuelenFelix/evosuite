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

public class Mission_getSunName_97599391613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606098;

    public Mission_getSunName_97599391613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term606189 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term606188 = ((Class) term606189).getDeclaredField((String) "INTERCEPT");
        ((Field) term606188).setAccessible(true);
        Object enum1695 = ((Field) term606188).get((Object) null);
        Class<? extends Object> term606438 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term606437 = ((Class) term606438).getDeclaredField((String) "PLANNING");
        ((Field) term606437).setAccessible(true);
        Object enum1696 = ((Field) term606437).get((Object) null);
        term606098 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term606124 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term606098, term606098.getClass(), "type", enum1695);
        setField(term606098, term606098.getClass(), "phase", enum1696);
        setIntField(term606124, term606124.getClass(), "x", -1600372385);
        setIntField(term606124, term606124.getClass(), "y", -1988901529);
        setField(term606098, term606098.getClass(), "targetCoordinate", term606124);
        setField(term606098, term606098.getClass(), "fleetName", "QPUQGsWcDB");
        setField(term606098, term606098.getClass(), "planetBuilding", "EizGfnjzSM");
        setField(term606098, term606098.getClass(), "planetGathering", "TNGzZszPGl");
        setField(term606098, term606098.getClass(), "targetPlanet", "ycANIGRvuf");
        setField(term606098, term606098.getClass(), "parameter", "amfcaZNMHw");
        setIntField(term606098, term606098.getClass(), "missionTime", 357838303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSunName", argTypes, term606098, args);
    }

};


