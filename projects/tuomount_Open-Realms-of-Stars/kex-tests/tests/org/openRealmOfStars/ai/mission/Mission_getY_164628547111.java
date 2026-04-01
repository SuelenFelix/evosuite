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

public class Mission_getY_164628547111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604806;

    public Mission_getY_164628547111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term604898 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term604897 = ((Class) term604898).getDeclaredField((String) "INTERCEPT");
        ((Field) term604897).setAccessible(true);
        Object enum1691 = ((Field) term604897).get((Object) null);
        Class<? extends Object> term605147 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term605146 = ((Class) term605147).getDeclaredField((String) "EXECUTING");
        ((Field) term605146).setAccessible(true);
        Object enum1692 = ((Field) term605146).get((Object) null);
        term604806 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term604833 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term604806, term604806.getClass(), "type", enum1691);
        setField(term604806, term604806.getClass(), "phase", enum1692);
        setIntField(term604833, term604833.getClass(), "x", -1727427440);
        setIntField(term604833, term604833.getClass(), "y", -838541413);
        setField(term604806, term604806.getClass(), "targetCoordinate", term604833);
        setField(term604806, term604806.getClass(), "fleetName", "RuPfSWXfsE");
        setField(term604806, term604806.getClass(), "planetBuilding", "ZdZaGrcJzC");
        setField(term604806, term604806.getClass(), "planetGathering", "qrzZMHfMZh");
        setField(term604806, term604806.getClass(), "targetPlanet", "GQDtZONugt");
        setField(term604806, term604806.getClass(), "parameter", "yIxRkTBaAD");
        setIntField(term604806, term604806.getClass(), "missionTime", 555268442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term604806, args);
    }

};


