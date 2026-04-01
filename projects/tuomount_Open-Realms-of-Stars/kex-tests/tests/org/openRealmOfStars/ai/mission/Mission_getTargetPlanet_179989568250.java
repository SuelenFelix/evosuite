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

public class Mission_getTargetPlanet_179989568250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615728;

    public Mission_getTargetPlanet_179989568250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615728 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        setField(term615728, term615728.getClass(), "type", null);
        setField(term615728, term615728.getClass(), "phase", null);
        setField(term615728, term615728.getClass(), "targetCoordinate", null);
        setField(term615728, term615728.getClass(), "fleetName", null);
        setField(term615728, term615728.getClass(), "planetBuilding", null);
        setField(term615728, term615728.getClass(), "planetGathering", null);
        setField(term615728, term615728.getClass(), "targetPlanet", null);
        setField(term615728, term615728.getClass(), "parameter", null);
        setIntField(term615728, term615728.getClass(), "missionTime", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTargetPlanet", argTypes, term615728, args);
    }

};


