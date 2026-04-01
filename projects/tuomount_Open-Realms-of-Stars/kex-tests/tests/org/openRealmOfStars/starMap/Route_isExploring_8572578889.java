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

public class Route_isExploring_8572578889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152559;

    public Route_isExploring_8572578889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1152566 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152566, term1152566.getClass(), "x", -1353166461);
        setIntField(term1152566, term1152566.getClass(), "y", 262991238);
        Object term1152569 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152569, term1152569.getClass(), "x", -237868298);
        setIntField(term1152569, term1152569.getClass(), "y", 1397135384);
        Object term1152572 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152572, term1152572.getClass(), "x", 1333843681);
        setIntField(term1152572, term1152572.getClass(), "y", -379209300);
        ArrayList term1152564 = new ArrayList();
        ((ArrayList) term1152564).add(term1152566);
        ((ArrayList) term1152564).add(term1152569);
        ((ArrayList) term1152564).add(term1152572);
        term1152559 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1152559, term1152559.getClass(), "startX", 0.6104966841551919);
        setDoubleField(term1152559, term1152559.getClass(), "startY", 0.4780880596367493);
        setDoubleField(term1152559, term1152559.getClass(), "endX", 0.7174146280831781);
        setDoubleField(term1152559, term1152559.getClass(), "endY", 0.9120605477208);
        setField(term1152559, term1152559.getClass(), "nextPoints", term1152564);
        setIntField(term1152559, term1152559.getClass(), "ftlSpeed", 937390603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExploring", argTypes, term1152559, args);
    }

};


