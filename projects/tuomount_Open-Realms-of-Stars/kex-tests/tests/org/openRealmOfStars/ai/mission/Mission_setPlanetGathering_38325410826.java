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

public class Mission_setPlanetGathering_38325410826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614996;

    public Mission_setPlanetGathering_38325410826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term615105 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term615104 = ((Class) term615105).getDeclaredField((String) "DEPLOY_STARBASE");
        ((Field) term615104).setAccessible(true);
        Object enum1722 = ((Field) term615104).get((Object) null);
        Class<? extends Object> term615372 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term615371 = ((Class) term615372).getDeclaredField((String) "TREKKING");
        ((Field) term615371).setAccessible(true);
        Object enum1723 = ((Field) term615371).get((Object) null);
        term614996 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term615028 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term614996, term614996.getClass(), "type", enum1722);
        setField(term614996, term614996.getClass(), "phase", enum1723);
        setIntField(term615028, term615028.getClass(), "x", -1761004554);
        setIntField(term615028, term615028.getClass(), "y", -1723168799);
        setField(term614996, term614996.getClass(), "targetCoordinate", term615028);
        setField(term614996, term614996.getClass(), "fleetName", "lnUGMXICXG");
        setField(term614996, term614996.getClass(), "planetBuilding", "DIMEqVxVxB");
        setField(term614996, term614996.getClass(), "planetGathering", "hNALyerUAV");
        setField(term614996, term614996.getClass(), "targetPlanet", "SjERFCVFJD");
        setField(term614996, term614996.getClass(), "parameter", "kSQWiCPEkE");
        setIntField(term614996, term614996.getClass(), "missionTime", 621459082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PZqoikqgAL";
        callMethod(klass, "setPlanetGathering", argTypes, term614996, args);
    }

};


