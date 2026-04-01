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

public class Mission_setTargetRealmName_131749946616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608076;

    public Mission_setTargetRealmName_131749946616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term608185 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term608184 = ((Class) term608185).getDeclaredField((String) "DESTROY_STARBASE");
        ((Field) term608184).setAccessible(true);
        Object enum1701 = ((Field) term608184).get((Object) null);
        Class<? extends Object> term608455 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term608454 = ((Class) term608455).getDeclaredField((String) "LOADING");
        ((Field) term608454).setAccessible(true);
        Object enum1702 = ((Field) term608454).get((Object) null);
        term608076 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term608108 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term608076, term608076.getClass(), "type", enum1701);
        setField(term608076, term608076.getClass(), "phase", enum1702);
        setIntField(term608108, term608108.getClass(), "x", 644137680);
        setIntField(term608108, term608108.getClass(), "y", -1900421772);
        setField(term608076, term608076.getClass(), "targetCoordinate", term608108);
        setField(term608076, term608076.getClass(), "fleetName", "UozREqziBi");
        setField(term608076, term608076.getClass(), "planetBuilding", "AFjqMhiaul");
        setField(term608076, term608076.getClass(), "planetGathering", "ItdqLGXwVd");
        setField(term608076, term608076.getClass(), "targetPlanet", "rxiCFTVFZP");
        setField(term608076, term608076.getClass(), "parameter", "nBBUJLtJqC");
        setIntField(term608076, term608076.getClass(), "missionTime", 1412785358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yvSETHdPRA";
        callMethod(klass, "setTargetRealmName", argTypes, term608076, args);
    }

};


