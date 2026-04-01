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

public class Mission_setPhase_3454737155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600643;
     Object enum1680;

    public Mission_setPhase_3454737155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term600748 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term600747 = ((Class) term600748).getDeclaredField((String) "SPORE_COLONY");
        ((Field) term600747).setAccessible(true);
        Object enum1678 = ((Field) term600747).get((Object) null);
        Class<? extends Object> term601006 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term601005 = ((Class) term601006).getDeclaredField((String) "LOADING");
        ((Field) term601005).setAccessible(true);
        Object enum1679 = ((Field) term601005).get((Object) null);
        term600643 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term600671 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term600643, term600643.getClass(), "type", enum1678);
        setField(term600643, term600643.getClass(), "phase", enum1679);
        setIntField(term600671, term600671.getClass(), "x", 582186159);
        setIntField(term600671, term600671.getClass(), "y", 1121745615);
        setField(term600643, term600643.getClass(), "targetCoordinate", term600671);
        setField(term600643, term600643.getClass(), "fleetName", "SgkSELfiCN");
        setField(term600643, term600643.getClass(), "planetBuilding", "BCYPvvqrrs");
        setField(term600643, term600643.getClass(), "planetGathering", "BZJrDPszsn");
        setField(term600643, term600643.getClass(), "targetPlanet", "cSJlAITYRY");
        setField(term600643, term600643.getClass(), "parameter", "XuyPJzqInD");
        setIntField(term600643, term600643.getClass(), "missionTime", 2135167581);
        Class<? extends Object> term601304 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term601303 = ((Class) term601304).getDeclaredField((String) "TREKKING");
        ((Field) term601303).setAccessible(true);
        enum1680 = ((Field) term601303).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.MissionPhase");
        Object[] args = new Object[1];
        args[0] = enum1680;
        callMethod(klass, "setPhase", argTypes, term600643, args);
    }

};


