package org.openRealmOfStars.starMap.history.event;

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
import static org.openRealmOfStars.starMap.history.event.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LeaderEvent_setPlanetName_142381431214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29471;

    public LeaderEvent_setPlanetName_142381431214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29471 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent"));
        setField(term29471, term29471.getClass(), "coordinate", null);
        setField(term29471, term29471.getClass(), "planetName", null);
        setIntField(term29471, term29471.getClass(), "leaderIndex", 0);
        setField(term29471, term29471.getClass(), "text", null);
        setField(term29471, term29471.getClass(), "type", null);
        setByteField(term29471, term29471.getClass(), "playerIndex", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanetName", argTypes, term29471, args);
    }

};


