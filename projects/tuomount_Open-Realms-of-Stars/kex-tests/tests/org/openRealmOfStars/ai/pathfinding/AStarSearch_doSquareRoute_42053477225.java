package org.openRealmOfStars.ai.pathfinding;

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
import static org.openRealmOfStars.ai.pathfinding.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AStarSearch_doSquareRoute_42053477225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17874;

    public AStarSearch_doSquareRoute_42053477225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17874 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setIntField(term17874, term17874.getClass(), "maxX", 0);
        setIntField(term17874, term17874.getClass(), "maxY", 0);
        setField(term17874, term17874.getClass(), "blockMap", null);
        setField(term17874, term17874.getClass(), "points", null);
        setIntField(term17874, term17874.getClass(), "tx", 0);
        setIntField(term17874, term17874.getClass(), "ty", 0);
        setIntField(term17874, term17874.getClass(), "targetDistance", 0);
        setField(term17874, term17874.getClass(), "targetPoint", null);
        setIntField(term17874, term17874.getClass(), "routeIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doSquareRoute", argTypes, term17874, args);
    }

};


