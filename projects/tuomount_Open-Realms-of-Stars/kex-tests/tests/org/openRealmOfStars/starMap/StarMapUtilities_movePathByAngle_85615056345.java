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
import java.lang.Integer;

public class StarMapUtilities_movePathByAngle_85615056345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3670635;
     Object term3670636;
     Object term3670638;
     Object term3670640;
     Object term3670642;

    public StarMapUtilities_movePathByAngle_85615056345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3670635 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapUtilities"));
        term3670636 = new Integer(0);
        term3670638 = new Integer(0);
        term3670640 = new Integer(0);
        term3670642 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term3670636;
        args[1] = term3670638;
        args[2] = term3670640;
        args[3] = term3670642;
        callMethod(klass, "movePathByAngle", argTypes, term3670635, args);
    }

};


