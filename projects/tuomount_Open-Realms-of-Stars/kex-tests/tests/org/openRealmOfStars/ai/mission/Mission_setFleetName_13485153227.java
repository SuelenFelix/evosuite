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

public class Mission_setFleetName_13485153227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602190;

    public Mission_setFleetName_13485153227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term602293 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term602292 = ((Class) term602293).getDeclaredField((String) "INTERCEPT");
        ((Field) term602292).setAccessible(true);
        Object enum1683 = ((Field) term602292).get((Object) null);
        Class<? extends Object> term602542 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term602541 = ((Class) term602542).getDeclaredField((String) "BUILDING");
        ((Field) term602541).setAccessible(true);
        Object enum1684 = ((Field) term602541).get((Object) null);
        term602190 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term602216 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term602190, term602190.getClass(), "type", enum1683);
        setField(term602190, term602190.getClass(), "phase", enum1684);
        setIntField(term602216, term602216.getClass(), "x", 1461876287);
        setIntField(term602216, term602216.getClass(), "y", -2077900576);
        setField(term602190, term602190.getClass(), "targetCoordinate", term602216);
        setField(term602190, term602190.getClass(), "fleetName", "RYYdNlkdHb");
        setField(term602190, term602190.getClass(), "planetBuilding", "gukWKZaVts");
        setField(term602190, term602190.getClass(), "planetGathering", "zaKhCPPVqb");
        setField(term602190, term602190.getClass(), "targetPlanet", "lKdCqDKRZY");
        setField(term602190, term602190.getClass(), "parameter", "RnuuMQmAar");
        setIntField(term602190, term602190.getClass(), "missionTime", -165571895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HpjrImBwxV";
        callMethod(klass, "setFleetName", argTypes, term602190, args);
    }

};


