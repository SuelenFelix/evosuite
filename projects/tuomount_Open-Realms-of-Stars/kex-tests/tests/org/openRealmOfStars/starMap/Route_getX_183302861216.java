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

public class Route_getX_183302861216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156203;

    public Route_getX_183302861216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156210 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156210, term1156210.getClass(), "x", -1279745062);
        setIntField(term1156210, term1156210.getClass(), "y", -839287161);
        Object term1156213 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156213, term1156213.getClass(), "x", 421348714);
        setIntField(term1156213, term1156213.getClass(), "y", 1788878942);
        Object term1156216 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156216, term1156216.getClass(), "x", -248980611);
        setIntField(term1156216, term1156216.getClass(), "y", -1030661196);
        Object term1156219 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156219, term1156219.getClass(), "x", -978202582);
        setIntField(term1156219, term1156219.getClass(), "y", -133380428);
        Object term1156222 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156222, term1156222.getClass(), "x", 424144211);
        setIntField(term1156222, term1156222.getClass(), "y", 1759866377);
        Object term1156225 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156225, term1156225.getClass(), "x", 1513960076);
        setIntField(term1156225, term1156225.getClass(), "y", -690238407);
        Object term1156228 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156228, term1156228.getClass(), "x", -613548825);
        setIntField(term1156228, term1156228.getClass(), "y", 445239621);
        ArrayList term1156208 = new ArrayList();
        ((ArrayList) term1156208).add(term1156210);
        ((ArrayList) term1156208).add(term1156213);
        ((ArrayList) term1156208).add(term1156216);
        ((ArrayList) term1156208).add(term1156219);
        ((ArrayList) term1156208).add(term1156222);
        ((ArrayList) term1156208).add(term1156225);
        ((ArrayList) term1156208).add(term1156228);
        term1156203 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156203, term1156203.getClass(), "startX", 0.9607897323439137);
        setDoubleField(term1156203, term1156203.getClass(), "startY", 0.391302766190016);
        setDoubleField(term1156203, term1156203.getClass(), "endX", 0.4877622925755275);
        setDoubleField(term1156203, term1156203.getClass(), "endY", 0.9636047288221744);
        setField(term1156203, term1156203.getClass(), "nextPoints", term1156208);
        setIntField(term1156203, term1156203.getClass(), "ftlSpeed", -2001184759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getX", argTypes, term1156203, args);
    }

};


