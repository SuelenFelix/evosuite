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

public class Route_getEndY_151239404931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156381;

    public Route_getEndY_151239404931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156388 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156388, term1156388.getClass(), "x", -1850944786);
        setIntField(term1156388, term1156388.getClass(), "y", -575654179);
        ArrayList term1156386 = new ArrayList();
        ((ArrayList) term1156386).add(term1156388);
        term1156381 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156381, term1156381.getClass(), "startX", 0.9148125806219113);
        setDoubleField(term1156381, term1156381.getClass(), "startY", 0.5424105805193429);
        setDoubleField(term1156381, term1156381.getClass(), "endX", 0.961202697260254);
        setDoubleField(term1156381, term1156381.getClass(), "endY", 0.6198565030073423);
        setField(term1156381, term1156381.getClass(), "nextPoints", term1156386);
        setIntField(term1156381, term1156381.getClass(), "ftlSpeed", -2027050953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndY", argTypes, term1156381, args);
    }

};


