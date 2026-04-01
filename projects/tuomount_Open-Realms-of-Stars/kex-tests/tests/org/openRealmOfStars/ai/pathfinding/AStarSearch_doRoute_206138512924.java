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

public class AStarSearch_doRoute_206138512924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17867;

    public AStarSearch_doRoute_206138512924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17867 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setIntField(term17867, term17867.getClass(), "maxX", 0);
        setIntField(term17867, term17867.getClass(), "maxY", 0);
        setField(term17867, term17867.getClass(), "blockMap", null);
        setField(term17867, term17867.getClass(), "points", null);
        setIntField(term17867, term17867.getClass(), "tx", 0);
        setIntField(term17867, term17867.getClass(), "ty", 0);
        setIntField(term17867, term17867.getClass(), "targetDistance", 0);
        setField(term17867, term17867.getClass(), "targetPoint", null);
        setIntField(term17867, term17867.getClass(), "routeIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doRoute", argTypes, term17867, args);
    }

};


