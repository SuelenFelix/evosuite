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

public class Route_isBombing_5959364008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152549;

    public Route_isBombing_5959364008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1152554 = new ArrayList();
        term1152549 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1152549, term1152549.getClass(), "startX", 0.25927427995958796);
        setDoubleField(term1152549, term1152549.getClass(), "startY", 0.9257970053187846);
        setDoubleField(term1152549, term1152549.getClass(), "endX", 0.9134526610201622);
        setDoubleField(term1152549, term1152549.getClass(), "endY", 0.5462339333311422);
        setField(term1152549, term1152549.getClass(), "nextPoints", term1152554);
        setIntField(term1152549, term1152549.getClass(), "ftlSpeed", -1457288965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBombing", argTypes, term1152549, args);
    }

};


