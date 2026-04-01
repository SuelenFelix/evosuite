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

public class Route_getRegularSpeed_16702079535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156455;

    public Route_getRegularSpeed_16702079535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156462 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156462, term1156462.getClass(), "x", 71878101);
        setIntField(term1156462, term1156462.getClass(), "y", 1298889892);
        Object term1156465 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156465, term1156465.getClass(), "x", -89281425);
        setIntField(term1156465, term1156465.getClass(), "y", 1262193901);
        Object term1156468 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156468, term1156468.getClass(), "x", 2048146220);
        setIntField(term1156468, term1156468.getClass(), "y", -399396275);
        Object term1156471 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156471, term1156471.getClass(), "x", 1554834873);
        setIntField(term1156471, term1156471.getClass(), "y", -1590493662);
        Object term1156474 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156474, term1156474.getClass(), "x", -697355325);
        setIntField(term1156474, term1156474.getClass(), "y", 1306219827);
        Object term1156477 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156477, term1156477.getClass(), "x", 1479371730);
        setIntField(term1156477, term1156477.getClass(), "y", 1619996616);
        Object term1156480 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156480, term1156480.getClass(), "x", -1410876055);
        setIntField(term1156480, term1156480.getClass(), "y", 1126738115);
        ArrayList term1156460 = new ArrayList();
        ((ArrayList) term1156460).add(term1156462);
        ((ArrayList) term1156460).add(term1156465);
        ((ArrayList) term1156460).add(term1156468);
        ((ArrayList) term1156460).add(term1156471);
        ((ArrayList) term1156460).add(term1156474);
        ((ArrayList) term1156460).add(term1156477);
        ((ArrayList) term1156460).add(term1156480);
        term1156455 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156455, term1156455.getClass(), "startX", 0.5019274780721351);
        setDoubleField(term1156455, term1156455.getClass(), "startY", 0.38325419627935253);
        setDoubleField(term1156455, term1156455.getClass(), "endX", 0.6829029193256314);
        setDoubleField(term1156455, term1156455.getClass(), "endY", 1.7403320892983576E-4);
        setField(term1156455, term1156455.getClass(), "nextPoints", term1156460);
        setIntField(term1156455, term1156455.getClass(), "ftlSpeed", -1934344988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegularSpeed", argTypes, term1156455, args);
    }

};


