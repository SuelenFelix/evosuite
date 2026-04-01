package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Route_copy_18186785402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152408;

    public Route_copy_18186785402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1152415 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152415, term1152415.getClass(), "x", -1106372687);
        setIntField(term1152415, term1152415.getClass(), "y", 1138266136);
        ArrayList term1152413 = new ArrayList();
        ((ArrayList) term1152413).add(term1152415);
        term1152408 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1152408, term1152408.getClass(), "startX", 0.5149544974885987);
        setDoubleField(term1152408, term1152408.getClass(), "startY", 0.8722279671290181);
        setDoubleField(term1152408, term1152408.getClass(), "endX", 0.18489050285246944);
        setDoubleField(term1152408, term1152408.getClass(), "endY", 0.8978351455009401);
        setField(term1152408, term1152408.getClass(), "nextPoints", term1152413);
        setIntField(term1152408, term1152408.getClass(), "ftlSpeed", 1833443496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term1152408, args);
    }

};


