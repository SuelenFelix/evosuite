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

public class MissionList_getMissionForPlanet_178315176625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584455;
     Object enum1627;

    public MissionList_getMissionForPlanet_178315176625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term584456 = new ArrayList();
        term584455 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term584455, term584455.getClass(), "missions", term584456);
        Class<? extends Object> term584491 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term584490 = ((Class) term584491).getDeclaredField((String) "MOVE");
        ((Field) term584490).setAccessible(true);
        enum1627 = ((Field) term584490).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.openRealmOfStars.ai.mission.MissionType");
        Object[] args = new Object[2];
        args[0] = "AwxLSCNoHX";
        args[1] = enum1627;
        callMethod(klass, "getMissionForPlanet", argTypes, term584455, args);
    }

};


