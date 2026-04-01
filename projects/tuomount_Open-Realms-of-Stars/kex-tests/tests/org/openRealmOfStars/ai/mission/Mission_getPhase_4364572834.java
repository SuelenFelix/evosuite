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

public class Mission_getPhase_4364572834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599979;

    public Mission_getPhase_4364572834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term600076 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term600075 = ((Class) term600076).getDeclaredField((String) "DEPLOY_STARBASE");
        ((Field) term600075).setAccessible(true);
        Object enum1676 = ((Field) term600075).get((Object) null);
        Class<? extends Object> term600343 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term600342 = ((Class) term600343).getDeclaredField((String) "PLANNING");
        ((Field) term600342).setAccessible(true);
        Object enum1677 = ((Field) term600342).get((Object) null);
        term599979 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term600011 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term599979, term599979.getClass(), "type", enum1676);
        setField(term599979, term599979.getClass(), "phase", enum1677);
        setIntField(term600011, term600011.getClass(), "x", -1602562135);
        setIntField(term600011, term600011.getClass(), "y", -1071040496);
        setField(term599979, term599979.getClass(), "targetCoordinate", term600011);
        setField(term599979, term599979.getClass(), "fleetName", "nYVnOegiCp");
        setField(term599979, term599979.getClass(), "planetBuilding", "WWbtkUjUKL");
        setField(term599979, term599979.getClass(), "planetGathering", "xaOhctMhRk");
        setField(term599979, term599979.getClass(), "targetPlanet", "BoXECcnWDI");
        setField(term599979, term599979.getClass(), "parameter", "pkOlSmqIRh");
        setIntField(term599979, term599979.getClass(), "missionTime", 743421180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhase", argTypes, term599979, args);
    }

};


