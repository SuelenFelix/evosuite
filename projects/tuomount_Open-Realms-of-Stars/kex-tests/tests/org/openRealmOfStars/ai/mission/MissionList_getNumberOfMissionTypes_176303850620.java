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

public class MissionList_getNumberOfMissionTypes_176303850620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583062;
     Object enum1622;

    public MissionList_getNumberOfMissionTypes_176303850620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term583063 = new ArrayList();
        term583062 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term583062, term583062.getClass(), "missions", term583063);
        Class<? extends Object> term583081 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term583080 = ((Class) term583081).getDeclaredField((String) "INTERCEPT");
        ((Field) term583080).setAccessible(true);
        enum1622 = ((Field) term583080).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.MissionType");
        Object[] args = new Object[1];
        args[0] = enum1622;
        callMethod(klass, "getNumberOfMissionTypes", argTypes, term583062, args);
    }

};


