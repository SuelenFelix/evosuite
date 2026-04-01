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

public class Route_getDistance_145049891744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156642;

    public Route_getDistance_145049891744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156649 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156649, term1156649.getClass(), "x", -1510160972);
        setIntField(term1156649, term1156649.getClass(), "y", -1464623823);
        Object term1156652 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156652, term1156652.getClass(), "x", 531774152);
        setIntField(term1156652, term1156652.getClass(), "y", -1531336014);
        Object term1156655 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156655, term1156655.getClass(), "x", -1155658412);
        setIntField(term1156655, term1156655.getClass(), "y", 2100346566);
        ArrayList term1156647 = new ArrayList();
        ((ArrayList) term1156647).add(term1156649);
        ((ArrayList) term1156647).add(term1156652);
        ((ArrayList) term1156647).add(term1156655);
        term1156642 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156642, term1156642.getClass(), "startX", 0.4625644623844958);
        setDoubleField(term1156642, term1156642.getClass(), "startY", 0.20372080216921717);
        setDoubleField(term1156642, term1156642.getClass(), "endX", 0.3858905478901201);
        setDoubleField(term1156642, term1156642.getClass(), "endY", 0.06209980384851188);
        setField(term1156642, term1156642.getClass(), "nextPoints", term1156647);
        setIntField(term1156642, term1156642.getClass(), "ftlSpeed", 1306785724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDistance", argTypes, term1156642, args);
    }

};


