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

public class MissionList_getDestroyFleetMission_123196608913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582910;
     Object term582915;

    public MissionList_getDestroyFleetMission_123196608913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term582911 = new ArrayList();
        term582910 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term582910, term582910.getClass(), "missions", term582911);
        term582915 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term582915, term582915.getClass(), "x", -1016296928);
        setIntField(term582915, term582915.getClass(), "y", -526369482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = term582915;
        callMethod(klass, "getDestroyFleetMission", argTypes, term582910, args);
    }

};


