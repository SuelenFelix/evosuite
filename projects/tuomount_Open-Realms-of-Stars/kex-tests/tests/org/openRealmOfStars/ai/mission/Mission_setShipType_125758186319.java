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

public class Mission_setShipType_125758186319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610438;

    public Mission_setShipType_125758186319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term610548 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term610547 = ((Class) term610548).getDeclaredField((String) "DESTROY_STARBASE");
        ((Field) term610547).setAccessible(true);
        Object enum1708 = ((Field) term610547).get((Object) null);
        Class<? extends Object> term610818 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term610817 = ((Class) term610818).getDeclaredField((String) "PLANNING");
        ((Field) term610817).setAccessible(true);
        Object enum1709 = ((Field) term610817).get((Object) null);
        term610438 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term610471 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term610438, term610438.getClass(), "type", enum1708);
        setField(term610438, term610438.getClass(), "phase", enum1709);
        setIntField(term610471, term610471.getClass(), "x", -338063559);
        setIntField(term610471, term610471.getClass(), "y", 1648891802);
        setField(term610438, term610438.getClass(), "targetCoordinate", term610471);
        setField(term610438, term610438.getClass(), "fleetName", "ublQWwwjDz");
        setField(term610438, term610438.getClass(), "planetBuilding", "LAQTAjhmOq");
        setField(term610438, term610438.getClass(), "planetGathering", "LCLhxCcvvp");
        setField(term610438, term610438.getClass(), "targetPlanet", "jourImKrQO");
        setField(term610438, term610438.getClass(), "parameter", "YQqHaNrGZV");
        setIntField(term610438, term610438.getClass(), "missionTime", 1536408549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OBdPteZDPV";
        callMethod(klass, "setShipType", argTypes, term610438, args);
    }

};


