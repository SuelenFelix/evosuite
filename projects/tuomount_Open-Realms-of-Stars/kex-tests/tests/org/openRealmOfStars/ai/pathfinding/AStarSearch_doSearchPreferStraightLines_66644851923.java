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

public class AStarSearch_doSearchPreferStraightLines_66644851923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17860;

    public AStarSearch_doSearchPreferStraightLines_66644851923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17860 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setIntField(term17860, term17860.getClass(), "maxX", 0);
        setIntField(term17860, term17860.getClass(), "maxY", 0);
        setField(term17860, term17860.getClass(), "blockMap", null);
        setField(term17860, term17860.getClass(), "points", null);
        setIntField(term17860, term17860.getClass(), "tx", 0);
        setIntField(term17860, term17860.getClass(), "ty", 0);
        setIntField(term17860, term17860.getClass(), "targetDistance", 0);
        setField(term17860, term17860.getClass(), "targetPoint", null);
        setIntField(term17860, term17860.getClass(), "routeIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doSearchPreferStraightLines", argTypes, term17860, args);
    }

};


