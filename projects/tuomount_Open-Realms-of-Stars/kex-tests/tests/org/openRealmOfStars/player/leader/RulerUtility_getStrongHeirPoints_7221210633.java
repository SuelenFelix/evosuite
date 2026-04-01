package org.openRealmOfStars.player.leader;

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
import static org.openRealmOfStars.player.leader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RulerUtility_getStrongHeirPoints_7221210633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222319;

    public RulerUtility_getStrongHeirPoints_7221210633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222319 = newInstance(Class.forName("org.openRealmOfStars.player.leader.RulerUtility"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.RulerUtility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getStrongHeirPoints", argTypes, term222319, args);
    }

};


