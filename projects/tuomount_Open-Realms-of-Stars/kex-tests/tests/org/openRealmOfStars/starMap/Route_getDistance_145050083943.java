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
import java.lang.Integer;

public class Route_getDistance_145050083943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156624;
     Object term1156640;

    public Route_getDistance_145050083943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156631 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156631, term1156631.getClass(), "x", -1774723195);
        setIntField(term1156631, term1156631.getClass(), "y", 1112199407);
        Object term1156634 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156634, term1156634.getClass(), "x", 1530250025);
        setIntField(term1156634, term1156634.getClass(), "y", -736019794);
        ArrayList term1156629 = new ArrayList();
        ((ArrayList) term1156629).add(term1156631);
        ((ArrayList) term1156629).add(term1156634);
        term1156624 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156624, term1156624.getClass(), "startX", 0.8233926052583531);
        setDoubleField(term1156624, term1156624.getClass(), "startY", 0.01480700687689196);
        setDoubleField(term1156624, term1156624.getClass(), "endX", 0.2199442770536334);
        setDoubleField(term1156624, term1156624.getClass(), "endY", 0.18246579362349058);
        setField(term1156624, term1156624.getClass(), "nextPoints", term1156629);
        setIntField(term1156624, term1156624.getClass(), "ftlSpeed", 1800367880);
        term1156640 = new Integer(-1878890327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1156640;
        callMethod(klass, "getDistance", argTypes, term1156624, args);
    }

};


