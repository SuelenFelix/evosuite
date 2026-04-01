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

public class MissionList_getMissionForPlanet_62043682326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584724;
     Object enum1628;

    public MissionList_getMissionForPlanet_62043682326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term584725 = new ArrayList();
        term584724 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term584724, term584724.getClass(), "missions", term584725);
        Class<? extends Object> term584764 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term584763 = ((Class) term584764).getDeclaredField((String) "BUILDING");
        ((Field) term584763).setAccessible(true);
        enum1628 = ((Field) term584763).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.openRealmOfStars.ai.mission.MissionPhase");
        Object[] args = new Object[2];
        args[0] = "BuyRpSkREN";
        args[1] = enum1628;
        callMethod(klass, "getMissionForPlanet", argTypes, term584724, args);
    }

};


