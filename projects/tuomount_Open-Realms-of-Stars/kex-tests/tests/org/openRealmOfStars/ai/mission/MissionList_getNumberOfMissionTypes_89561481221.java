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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class MissionList_getNumberOfMissionTypes_89561481221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583329;
     Object enum1623;
     Object enum1624;

    public MissionList_getNumberOfMissionTypes_89561481221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term583330 = new ArrayList();
        term583329 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term583329, term583329.getClass(), "missions", term583330);
        Class<? extends Object> term583368 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term583367 = ((Class) term583368).getDeclaredField((String) "DESTROY_STARBASE");
        ((Field) term583367).setAccessible(true);
        enum1623 = ((Field) term583367).get((Object) null);
        Class<? extends Object> term583638 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term583637 = ((Class) term583638).getDeclaredField((String) "EXECUTING");
        ((Field) term583637).setAccessible(true);
        enum1624 = ((Field) term583637).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.MissionType");
        argTypes[1] = Class.forName("org.openRealmOfStars.ai.mission.MissionPhase");
        Object[] args = new Object[2];
        args[0] = enum1623;
        args[1] = enum1624;
        callMethod(klass, "getNumberOfMissionTypes", argTypes, term583329, args);
    }

};


