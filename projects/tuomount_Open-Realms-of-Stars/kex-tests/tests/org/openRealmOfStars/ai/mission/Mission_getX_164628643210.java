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

public class Mission_getX_164628643210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604170;

    public Mission_getX_164628643210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term604260 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term604259 = ((Class) term604260).getDeclaredField((String) "COLONIZE");
        ((Field) term604259).setAccessible(true);
        Object enum1689 = ((Field) term604259).get((Object) null);
        Class<? extends Object> term604506 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term604505 = ((Class) term604506).getDeclaredField((String) "PLANNING");
        ((Field) term604505).setAccessible(true);
        Object enum1690 = ((Field) term604505).get((Object) null);
        term604170 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term604195 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term604170, term604170.getClass(), "type", enum1689);
        setField(term604170, term604170.getClass(), "phase", enum1690);
        setIntField(term604195, term604195.getClass(), "x", -1234698980);
        setIntField(term604195, term604195.getClass(), "y", 219686926);
        setField(term604170, term604170.getClass(), "targetCoordinate", term604195);
        setField(term604170, term604170.getClass(), "fleetName", "MSEuPwNmfQ");
        setField(term604170, term604170.getClass(), "planetBuilding", "iPyWpJYoKL");
        setField(term604170, term604170.getClass(), "planetGathering", "CMjWeflwpG");
        setField(term604170, term604170.getClass(), "targetPlanet", "kPFEUASycT");
        setField(term604170, term604170.getClass(), "parameter", "tbbtdPGViu");
        setIntField(term604170, term604170.getClass(), "missionTime", -428877223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getX", argTypes, term604170, args);
    }

};


