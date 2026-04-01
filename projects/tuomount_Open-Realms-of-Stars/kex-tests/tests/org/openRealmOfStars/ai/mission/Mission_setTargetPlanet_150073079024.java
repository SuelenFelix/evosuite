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

public class Mission_setTargetPlanet_150073079024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613698;

    public Mission_setTargetPlanet_150073079024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term613801 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term613800 = ((Class) term613801).getDeclaredField((String) "INTERCEPT");
        ((Field) term613800).setAccessible(true);
        Object enum1718 = ((Field) term613800).get((Object) null);
        Class<? extends Object> term614050 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term614049 = ((Class) term614050).getDeclaredField((String) "TREKKING");
        ((Field) term614049).setAccessible(true);
        Object enum1719 = ((Field) term614049).get((Object) null);
        term613698 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term613724 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term613698, term613698.getClass(), "type", enum1718);
        setField(term613698, term613698.getClass(), "phase", enum1719);
        setIntField(term613724, term613724.getClass(), "x", -1553544579);
        setIntField(term613724, term613724.getClass(), "y", 214455591);
        setField(term613698, term613698.getClass(), "targetCoordinate", term613724);
        setField(term613698, term613698.getClass(), "fleetName", "gMSrpUdlFS");
        setField(term613698, term613698.getClass(), "planetBuilding", "RpXedZglmC");
        setField(term613698, term613698.getClass(), "planetGathering", "pklyQGxOCR");
        setField(term613698, term613698.getClass(), "targetPlanet", "BjLljDRLiM");
        setField(term613698, term613698.getClass(), "parameter", "axqAmoKcaw");
        setIntField(term613698, term613698.getClass(), "missionTime", 1515470608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dDEoScnoSx";
        callMethod(klass, "setTargetPlanet", argTypes, term613698, args);
    }

};


