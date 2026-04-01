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

public class MissionList_getMissionForFleet_4267005504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572718;
     Object enum1592;

    public MissionList_getMissionForFleet_4267005504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term572719 = new ArrayList();
        term572718 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term572718, term572718.getClass(), "missions", term572719);
        Class<? extends Object> term572761 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term572760 = ((Class) term572761).getDeclaredField((String) "SPY_MISSION");
        ((Field) term572760).setAccessible(true);
        enum1592 = ((Field) term572760).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.openRealmOfStars.ai.mission.MissionType");
        Object[] args = new Object[2];
        args[0] = "NUokCRNzOq";
        args[1] = enum1592;
        callMethod(klass, "getMissionForFleet", argTypes, term572718, args);
    }

};


