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

public class Mission_getEspionageType_135966204317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608762;

    public Mission_getEspionageType_135966204317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term608859 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term608858 = ((Class) term608859).getDeclaredField((String) "DEPLOY_STARBASE");
        ((Field) term608858).setAccessible(true);
        Object enum1703 = ((Field) term608858).get((Object) null);
        Class<? extends Object> term609126 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term609125 = ((Class) term609126).getDeclaredField((String) "PLANNING");
        ((Field) term609125).setAccessible(true);
        Object enum1704 = ((Field) term609125).get((Object) null);
        term608762 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term608794 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term608762, term608762.getClass(), "type", enum1703);
        setField(term608762, term608762.getClass(), "phase", enum1704);
        setIntField(term608794, term608794.getClass(), "x", 410202257);
        setIntField(term608794, term608794.getClass(), "y", -2082861847);
        setField(term608762, term608762.getClass(), "targetCoordinate", term608794);
        setField(term608762, term608762.getClass(), "fleetName", "XXdWUxBeFl");
        setField(term608762, term608762.getClass(), "planetBuilding", "YGvKOpsRjI");
        setField(term608762, term608762.getClass(), "planetGathering", "MknkZVAwDo");
        setField(term608762, term608762.getClass(), "targetPlanet", "aczvRILssC");
        setField(term608762, term608762.getClass(), "parameter", "UNMfEvrRbR");
        setIntField(term608762, term608762.getClass(), "missionTime", 1336089129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEspionageType", argTypes, term608762, args);
    }

};


