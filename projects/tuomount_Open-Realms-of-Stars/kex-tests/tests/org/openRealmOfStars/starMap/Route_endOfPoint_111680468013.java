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

public class Route_endOfPoint_111680468013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156121;

    public Route_endOfPoint_111680468013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156128 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156128, term1156128.getClass(), "x", 1668627100);
        setIntField(term1156128, term1156128.getClass(), "y", 1555017982);
        Object term1156131 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156131, term1156131.getClass(), "x", -1824345436);
        setIntField(term1156131, term1156131.getClass(), "y", 902761569);
        Object term1156134 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156134, term1156134.getClass(), "x", -2050987586);
        setIntField(term1156134, term1156134.getClass(), "y", 452786746);
        Object term1156137 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156137, term1156137.getClass(), "x", -1765759986);
        setIntField(term1156137, term1156137.getClass(), "y", 1754563992);
        Object term1156140 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156140, term1156140.getClass(), "x", 1195240639);
        setIntField(term1156140, term1156140.getClass(), "y", -26471462);
        ArrayList term1156126 = new ArrayList();
        ((ArrayList) term1156126).add(term1156128);
        ((ArrayList) term1156126).add(term1156131);
        ((ArrayList) term1156126).add(term1156134);
        ((ArrayList) term1156126).add(term1156137);
        ((ArrayList) term1156126).add(term1156140);
        term1156121 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156121, term1156121.getClass(), "startX", 0.1900451907417724);
        setDoubleField(term1156121, term1156121.getClass(), "startY", 0.26687904044277755);
        setDoubleField(term1156121, term1156121.getClass(), "endX", 0.6208267483985057);
        setDoubleField(term1156121, term1156121.getClass(), "endY", 0.5935456780207055);
        setField(term1156121, term1156121.getClass(), "nextPoints", term1156126);
        setIntField(term1156121, term1156121.getClass(), "ftlSpeed", 1576418850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endOfPoint", argTypes, term1156121, args);
    }

};


