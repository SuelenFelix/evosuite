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
import java.lang.Double;

public class Route_setEndX_144754143830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156357;
     Object term1156379;

    public Route_setEndX_144754143830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156364 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156364, term1156364.getClass(), "x", 177825772);
        setIntField(term1156364, term1156364.getClass(), "y", 807682720);
        Object term1156367 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156367, term1156367.getClass(), "x", 521367028);
        setIntField(term1156367, term1156367.getClass(), "y", 800479559);
        Object term1156370 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156370, term1156370.getClass(), "x", -1588653039);
        setIntField(term1156370, term1156370.getClass(), "y", -621328490);
        Object term1156373 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156373, term1156373.getClass(), "x", 886976307);
        setIntField(term1156373, term1156373.getClass(), "y", 2123912924);
        ArrayList term1156362 = new ArrayList();
        ((ArrayList) term1156362).add(term1156364);
        ((ArrayList) term1156362).add(term1156367);
        ((ArrayList) term1156362).add(term1156370);
        ((ArrayList) term1156362).add(term1156373);
        term1156357 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156357, term1156357.getClass(), "startX", 0.6348426143487798);
        setDoubleField(term1156357, term1156357.getClass(), "startY", 0.2609298549951239);
        setDoubleField(term1156357, term1156357.getClass(), "endX", 0.6131087144069463);
        setDoubleField(term1156357, term1156357.getClass(), "endY", 0.4961600023778727);
        setField(term1156357, term1156357.getClass(), "nextPoints", term1156362);
        setIntField(term1156357, term1156357.getClass(), "ftlSpeed", 1634757155);
        term1156379 = new Double(0.15336192373549007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1156379;
        callMethod(klass, "setEndX", argTypes, term1156357, args);
    }

};


