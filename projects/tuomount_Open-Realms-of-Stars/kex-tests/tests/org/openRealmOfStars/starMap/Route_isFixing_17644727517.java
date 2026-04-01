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

public class Route_isFixing_17644727517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152518;

    public Route_isFixing_17644727517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1152525 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152525, term1152525.getClass(), "x", 240494862);
        setIntField(term1152525, term1152525.getClass(), "y", 1875797341);
        Object term1152528 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152528, term1152528.getClass(), "x", 720415988);
        setIntField(term1152528, term1152528.getClass(), "y", 761280378);
        Object term1152531 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152531, term1152531.getClass(), "x", 1785202010);
        setIntField(term1152531, term1152531.getClass(), "y", 967577497);
        Object term1152534 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152534, term1152534.getClass(), "x", -631305384);
        setIntField(term1152534, term1152534.getClass(), "y", -671272840);
        Object term1152537 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152537, term1152537.getClass(), "x", 382465839);
        setIntField(term1152537, term1152537.getClass(), "y", -1866914747);
        Object term1152540 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152540, term1152540.getClass(), "x", 1235265157);
        setIntField(term1152540, term1152540.getClass(), "y", -1978509879);
        Object term1152543 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152543, term1152543.getClass(), "x", 117451879);
        setIntField(term1152543, term1152543.getClass(), "y", -896841478);
        ArrayList term1152523 = new ArrayList();
        ((ArrayList) term1152523).add(term1152525);
        ((ArrayList) term1152523).add(term1152528);
        ((ArrayList) term1152523).add(term1152531);
        ((ArrayList) term1152523).add(term1152534);
        ((ArrayList) term1152523).add(term1152537);
        ((ArrayList) term1152523).add(term1152540);
        ((ArrayList) term1152523).add(term1152543);
        term1152518 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1152518, term1152518.getClass(), "startX", 0.9336280471224291);
        setDoubleField(term1152518, term1152518.getClass(), "startY", 0.927519742701973);
        setDoubleField(term1152518, term1152518.getClass(), "endX", 0.29309791570378785);
        setDoubleField(term1152518, term1152518.getClass(), "endY", 0.14499093140326424);
        setField(term1152518, term1152518.getClass(), "nextPoints", term1152523);
        setIntField(term1152518, term1152518.getClass(), "ftlSpeed", 817700957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFixing", argTypes, term1152518, args);
    }

};


