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
import java.lang.Integer;

public class AStarSearch_isValidPos_129779068120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17835;
     Object term17842;
     Object term17844;

    public AStarSearch_isValidPos_129779068120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17835 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setIntField(term17835, term17835.getClass(), "maxX", 0);
        setIntField(term17835, term17835.getClass(), "maxY", 0);
        setField(term17835, term17835.getClass(), "blockMap", null);
        setField(term17835, term17835.getClass(), "points", null);
        setIntField(term17835, term17835.getClass(), "tx", 0);
        setIntField(term17835, term17835.getClass(), "ty", 0);
        setIntField(term17835, term17835.getClass(), "targetDistance", 0);
        setField(term17835, term17835.getClass(), "targetPoint", null);
        setIntField(term17835, term17835.getClass(), "routeIndex", 0);
        term17842 = new Integer(0);
        term17844 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term17842;
        args[1] = term17844;
        callMethod(klass, "isValidPos", argTypes, term17835, args);
    }

};


