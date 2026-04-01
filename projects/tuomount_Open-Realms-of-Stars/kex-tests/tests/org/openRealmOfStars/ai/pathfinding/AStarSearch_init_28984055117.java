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
import java.lang.Boolean;

public class AStarSearch_init_28984055117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17805;
     Object term17807;
     Object term17809;
     Object term17811;
     Object term17813;
     Object term17815;

    public AStarSearch_init_28984055117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17805 = new Integer(0);
        term17807 = new Integer(0);
        term17809 = new Integer(0);
        term17811 = new Integer(0);
        term17813 = new Integer(0);
        term17815 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term17805;
        args[2] = term17807;
        args[3] = term17809;
        args[4] = term17811;
        args[5] = term17813;
        args[6] = term17815;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


