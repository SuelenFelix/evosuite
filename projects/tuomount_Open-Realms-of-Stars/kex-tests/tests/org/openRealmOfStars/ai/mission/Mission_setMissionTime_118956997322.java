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
import java.lang.Integer;

public class Mission_setMissionTime_118956997322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612404;
     Object term612497;

    public Mission_setMissionTime_118956997322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term612500 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term612499 = ((Class) term612500).getDeclaredField((String) "TRADE_FLEET");
        ((Field) term612499).setAccessible(true);
        Object enum1714 = ((Field) term612499).get((Object) null);
        Class<? extends Object> term612755 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term612754 = ((Class) term612755).getDeclaredField((String) "EXECUTING");
        ((Field) term612754).setAccessible(true);
        Object enum1715 = ((Field) term612754).get((Object) null);
        term612404 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term612433 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term612404, term612404.getClass(), "type", enum1714);
        setField(term612404, term612404.getClass(), "phase", enum1715);
        setIntField(term612433, term612433.getClass(), "x", -1474787582);
        setIntField(term612433, term612433.getClass(), "y", 578870419);
        setField(term612404, term612404.getClass(), "targetCoordinate", term612433);
        setField(term612404, term612404.getClass(), "fleetName", "vSpWBCWekU");
        setField(term612404, term612404.getClass(), "planetBuilding", "dVftNpEmen");
        setField(term612404, term612404.getClass(), "planetGathering", "AJjEtDfuCW");
        setField(term612404, term612404.getClass(), "targetPlanet", "bFxPdrXcIX");
        setField(term612404, term612404.getClass(), "parameter", "MAXRdTbrAl");
        setIntField(term612404, term612404.getClass(), "missionTime", -1731737733);
        term612497 = new Integer(524549049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term612497;
        callMethod(klass, "setMissionTime", argTypes, term612404, args);
    }

};


