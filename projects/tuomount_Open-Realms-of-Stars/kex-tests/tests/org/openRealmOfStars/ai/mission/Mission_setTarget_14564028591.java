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

public class Mission_setTarget_14564028591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597754;
     Object term597841;

    public Mission_setTarget_14564028591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term597845 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term597844 = ((Class) term597845).getDeclaredField((String) "GATHER");
        ((Field) term597844).setAccessible(true);
        Object enum1669 = ((Field) term597844).get((Object) null);
        Class<? extends Object> term598085 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term598084 = ((Class) term598085).getDeclaredField((String) "TREKKING");
        ((Field) term598084).setAccessible(true);
        Object enum1670 = ((Field) term598084).get((Object) null);
        term597754 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term597777 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term597754, term597754.getClass(), "type", enum1669);
        setField(term597754, term597754.getClass(), "phase", enum1670);
        setIntField(term597777, term597777.getClass(), "x", 1164803194);
        setIntField(term597777, term597777.getClass(), "y", -1091019664);
        setField(term597754, term597754.getClass(), "targetCoordinate", term597777);
        setField(term597754, term597754.getClass(), "fleetName", "dcQSbONYKk");
        setField(term597754, term597754.getClass(), "planetBuilding", "swsoRKDIDn");
        setField(term597754, term597754.getClass(), "planetGathering", "gtXmpJrLpK");
        setField(term597754, term597754.getClass(), "targetPlanet", "orwiTTNuGb");
        setField(term597754, term597754.getClass(), "parameter", "gXjLIjrrWh");
        setIntField(term597754, term597754.getClass(), "missionTime", -1009420089);
        term597841 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term597841, term597841.getClass(), "x", -826849130);
        setIntField(term597841, term597841.getClass(), "y", -886487104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = term597841;
        callMethod(klass, "setTarget", argTypes, term597754, args);
    }

};


