package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MissionRepository_saveMission_17572008831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2114;
     Object term2115;
     Object term2131;

    public MissionRepository_saveMission_17572008831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2114 = newInstance(Class.forName("org.openRealmOfStars.utilities.repository.MissionRepository"));
        term2115 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term2117 = (byte[]) newByteArray(1);
        byte[] term2119 = (byte[]) newByteArray(9);
        Object term2130 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2115, term2115.getClass(), "written", 1063420942);
        setByteElement(term2117, 0, (byte) -46);
        setField(term2115, term2115.getClass(), "bytearr", term2117);
        setByteElement(term2119, 0, (byte) -128);
        setByteElement(term2119, 1, (byte) 66);
        setByteElement(term2119, 2, (byte) -112);
        setByteElement(term2119, 3, (byte) 81);
        setByteElement(term2119, 4, (byte) 65);
        setByteElement(term2119, 5, (byte) -44);
        setByteElement(term2119, 6, (byte) 33);
        setByteElement(term2119, 7, (byte) -74);
        setByteElement(term2119, 8, (byte) -84);
        setField(term2115, term2115.getClass(), "writeBuffer", term2119);
        setField(term2115, term2115.getClass(), "out", null);
        setBooleanField(term2115, term2115.getClass(), "closed", false);
        setField(term2115, term2115.getClass(), "closeLock", term2130);
        Class<? extends Object> term2508 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term2507 = ((Class) term2508).getDeclaredField((String) "COLONIZE");
        ((Field) term2507).setAccessible(true);
        Object enum2 = ((Field) term2507).get((Object) null);
        Class<? extends Object> term2814 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term2813 = ((Class) term2814).getDeclaredField((String) "EXECUTING");
        ((Field) term2813).setAccessible(true);
        Object enum3 = ((Field) term2813).get((Object) null);
        term2131 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term2157 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term2131, term2131.getClass(), "type", enum2);
        setField(term2131, term2131.getClass(), "phase", enum3);
        setIntField(term2157, term2157.getClass(), "x", 1375330971);
        setIntField(term2157, term2157.getClass(), "y", -478195677);
        setField(term2131, term2131.getClass(), "targetCoordinate", term2157);
        setField(term2131, term2131.getClass(), "fleetName", "NRdvgJlhkX");
        setField(term2131, term2131.getClass(), "planetBuilding", "uuaPigETmJ");
        setField(term2131, term2131.getClass(), "planetGathering", "MxlszYVzRf");
        setField(term2131, term2131.getClass(), "targetPlanet", "LQFpaHEwXR");
        setField(term2131, term2131.getClass(), "parameter", "oVcInYnLWB");
        setIntField(term2131, term2131.getClass(), "missionTime", 1655935355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.MissionRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Object[] args = new Object[2];
        args[0] = term2115;
        args[1] = term2131;
        callMethod(klass, "saveMission", argTypes, term2114, args);
    }

};


