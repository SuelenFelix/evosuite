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

public class Route_setRawValue_142350858138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156520;
     Object term1156557;

    public Route_setRawValue_142350858138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156527 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156527, term1156527.getClass(), "x", -517367983);
        setIntField(term1156527, term1156527.getClass(), "y", 188890036);
        Object term1156530 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156530, term1156530.getClass(), "x", -1231888970);
        setIntField(term1156530, term1156530.getClass(), "y", 1252722693);
        Object term1156533 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156533, term1156533.getClass(), "x", -579945362);
        setIntField(term1156533, term1156533.getClass(), "y", -179946459);
        Object term1156536 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156536, term1156536.getClass(), "x", -461602218);
        setIntField(term1156536, term1156536.getClass(), "y", -920631232);
        Object term1156539 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156539, term1156539.getClass(), "x", -1044290712);
        setIntField(term1156539, term1156539.getClass(), "y", 1701612356);
        Object term1156542 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156542, term1156542.getClass(), "x", -1131606349);
        setIntField(term1156542, term1156542.getClass(), "y", 801606762);
        Object term1156545 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156545, term1156545.getClass(), "x", -855052616);
        setIntField(term1156545, term1156545.getClass(), "y", 1183454027);
        Object term1156548 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156548, term1156548.getClass(), "x", -253760413);
        setIntField(term1156548, term1156548.getClass(), "y", 1271809628);
        Object term1156551 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156551, term1156551.getClass(), "x", -360978970);
        setIntField(term1156551, term1156551.getClass(), "y", 1102963581);
        ArrayList term1156525 = new ArrayList();
        ((ArrayList) term1156525).add(term1156527);
        ((ArrayList) term1156525).add(term1156530);
        ((ArrayList) term1156525).add(term1156533);
        ((ArrayList) term1156525).add(term1156536);
        ((ArrayList) term1156525).add(term1156539);
        ((ArrayList) term1156525).add(term1156542);
        ((ArrayList) term1156525).add(term1156545);
        ((ArrayList) term1156525).add(term1156548);
        ((ArrayList) term1156525).add(term1156551);
        term1156520 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156520, term1156520.getClass(), "startX", 0.18636713236319624);
        setDoubleField(term1156520, term1156520.getClass(), "startY", 0.8712455774005332);
        setDoubleField(term1156520, term1156520.getClass(), "endX", 0.16581764143035682);
        setDoubleField(term1156520, term1156520.getClass(), "endY", 0.20219858593718787);
        setField(term1156520, term1156520.getClass(), "nextPoints", term1156525);
        setIntField(term1156520, term1156520.getClass(), "ftlSpeed", -354185088);
        term1156557 = new Integer(145941073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1156557;
        callMethod(klass, "setRawValue", argTypes, term1156520, args);
    }

};


