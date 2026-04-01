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

public class Mission_init_10369265370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1667;
     Object enum1668;
     Object term597269;

    public Mission_init_10369265370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term597273 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term597272 = ((Class) term597273).getDeclaredField((String) "MOVE");
        ((Field) term597272).setAccessible(true);
        enum1667 = ((Field) term597272).get((Object) null);
        Class<? extends Object> term597507 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term597506 = ((Class) term597507).getDeclaredField((String) "LOADING");
        ((Field) term597506).setAccessible(true);
        enum1668 = ((Field) term597506).get((Object) null);
        term597269 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term597269, term597269.getClass(), "x", -701067515);
        setIntField(term597269, term597269.getClass(), "y", -1359929680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.MissionType");
        argTypes[1] = Class.forName("org.openRealmOfStars.ai.mission.MissionPhase");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[3];
        args[0] = enum1667;
        args[1] = enum1668;
        args[2] = term597269;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


