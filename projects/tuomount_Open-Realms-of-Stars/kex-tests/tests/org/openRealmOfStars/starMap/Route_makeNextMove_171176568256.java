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

public class Route_makeNextMove_171176568256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156735;
     Object term1156741;

    public Route_makeNextMove_171176568256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1156735 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156735, term1156735.getClass(), "startX", 0.0);
        setDoubleField(term1156735, term1156735.getClass(), "startY", 0.0);
        setDoubleField(term1156735, term1156735.getClass(), "endX", 0.0);
        setDoubleField(term1156735, term1156735.getClass(), "endY", 0.0);
        setField(term1156735, term1156735.getClass(), "nextPoints", null);
        setIntField(term1156735, term1156735.getClass(), "ftlSpeed", 0);
        term1156741 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1156741;
        callMethod(klass, "makeNextMove", argTypes, term1156735, args);
    }

};


