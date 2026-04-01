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

public class MissionList_getMission_67521362422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583891;
     Object enum1625;
     Object enum1626;

    public MissionList_getMission_67521362422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term583892 = new ArrayList();
        term583891 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term583891, term583891.getClass(), "missions", term583892);
        Class<? extends Object> term583917 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term583916 = ((Class) term583917).getDeclaredField((String) "ROAM");
        ((Field) term583916).setAccessible(true);
        enum1625 = ((Field) term583916).get((Object) null);
        Class<? extends Object> term584151 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term584150 = ((Class) term584151).getDeclaredField((String) "TREKKING");
        ((Field) term584150).setAccessible(true);
        enum1626 = ((Field) term584150).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.MissionType");
        argTypes[1] = Class.forName("org.openRealmOfStars.ai.mission.MissionPhase");
        Object[] args = new Object[2];
        args[0] = enum1625;
        args[1] = enum1626;
        callMethod(klass, "getMission", argTypes, term583891, args);
    }

};


