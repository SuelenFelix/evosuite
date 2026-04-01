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

public class Mission_getY_164628547138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615702;

    public Mission_getY_164628547138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615702 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        setField(term615702, term615702.getClass(), "type", null);
        setField(term615702, term615702.getClass(), "phase", null);
        setField(term615702, term615702.getClass(), "targetCoordinate", null);
        setField(term615702, term615702.getClass(), "fleetName", null);
        setField(term615702, term615702.getClass(), "planetBuilding", null);
        setField(term615702, term615702.getClass(), "planetGathering", null);
        setField(term615702, term615702.getClass(), "targetPlanet", null);
        setField(term615702, term615702.getClass(), "parameter", null);
        setIntField(term615702, term615702.getClass(), "missionTime", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term615702, args);
    }

};


