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

public class Mission_toString_70512110512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605450;

    public Mission_toString_70512110512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term605543 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term605542 = ((Class) term605543).getDeclaredField((String) "SPY_MISSION");
        ((Field) term605542).setAccessible(true);
        Object enum1693 = ((Field) term605542).get((Object) null);
        Class<? extends Object> term605798 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term605797 = ((Class) term605798).getDeclaredField((String) "TREKKING");
        ((Field) term605797).setAccessible(true);
        Object enum1694 = ((Field) term605797).get((Object) null);
        term605450 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term605478 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term605450, term605450.getClass(), "type", enum1693);
        setField(term605450, term605450.getClass(), "phase", enum1694);
        setIntField(term605478, term605478.getClass(), "x", -591610853);
        setIntField(term605478, term605478.getClass(), "y", 380909580);
        setField(term605450, term605450.getClass(), "targetCoordinate", term605478);
        setField(term605450, term605450.getClass(), "fleetName", "iWvJaTfsPB");
        setField(term605450, term605450.getClass(), "planetBuilding", "JYHoSEancn");
        setField(term605450, term605450.getClass(), "planetGathering", "KnrufAhddz");
        setField(term605450, term605450.getClass(), "targetPlanet", "bcYJqlGIXT");
        setField(term605450, term605450.getClass(), "parameter", "PWLDyrDjwN");
        setIntField(term605450, term605450.getClass(), "missionTime", 1597658782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term605450, args);
    }

};


