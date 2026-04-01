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

public class Mission_getShipType_145104299320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611128;

    public Mission_getShipType_145104299320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term611223 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term611222 = ((Class) term611223).getDeclaredField((String) "DEVOURER_ROAM");
        ((Field) term611222).setAccessible(true);
        Object enum1710 = ((Field) term611222).get((Object) null);
        Class<? extends Object> term611484 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term611483 = ((Class) term611484).getDeclaredField((String) "PLANNING");
        ((Field) term611483).setAccessible(true);
        Object enum1711 = ((Field) term611483).get((Object) null);
        term611128 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term611158 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term611128, term611128.getClass(), "type", enum1710);
        setField(term611128, term611128.getClass(), "phase", enum1711);
        setIntField(term611158, term611158.getClass(), "x", 1873113546);
        setIntField(term611158, term611158.getClass(), "y", -1046505415);
        setField(term611128, term611128.getClass(), "targetCoordinate", term611158);
        setField(term611128, term611128.getClass(), "fleetName", "XdXWnfZcAH");
        setField(term611128, term611128.getClass(), "planetBuilding", "QHjztNhEIN");
        setField(term611128, term611128.getClass(), "planetGathering", "DLOkxuOgAE");
        setField(term611128, term611128.getClass(), "targetPlanet", "EDNEytIwph");
        setField(term611128, term611128.getClass(), "parameter", "BXWaPfQRPB");
        setIntField(term611128, term611128.getClass(), "missionTime", -582722508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShipType", argTypes, term611128, args);
    }

};


