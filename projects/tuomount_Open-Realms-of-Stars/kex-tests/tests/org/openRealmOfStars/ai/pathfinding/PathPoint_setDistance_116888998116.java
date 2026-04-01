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
import java.lang.Double;

public class PathPoint_setDistance_116888998116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term84;

    public PathPoint_setDistance_116888998116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term80, term80.getClass(), "x", 0);
        setIntField(term80, term80.getClass(), "y", 0);
        setDoubleField(term80, term80.getClass(), "distance", 0.0);
        term84 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term84;
        callMethod(klass, "setDistance", argTypes, term80, args);
    }

};


