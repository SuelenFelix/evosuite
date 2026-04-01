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
import java.lang.Double;

public class Route_setEndY_144754239932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156394;
     Object term1156413;

    public Route_setEndY_144754239932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156401 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156401, term1156401.getClass(), "x", 1857726261);
        setIntField(term1156401, term1156401.getClass(), "y", -1448345725);
        Object term1156404 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156404, term1156404.getClass(), "x", -150997898);
        setIntField(term1156404, term1156404.getClass(), "y", 1446146934);
        Object term1156407 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156407, term1156407.getClass(), "x", 989422451);
        setIntField(term1156407, term1156407.getClass(), "y", 232752640);
        ArrayList term1156399 = new ArrayList();
        ((ArrayList) term1156399).add(term1156401);
        ((ArrayList) term1156399).add(term1156404);
        ((ArrayList) term1156399).add(term1156407);
        term1156394 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156394, term1156394.getClass(), "startX", 0.06523961946138956);
        setDoubleField(term1156394, term1156394.getClass(), "startY", 0.5651796580837669);
        setDoubleField(term1156394, term1156394.getClass(), "endX", 0.4084300846738409);
        setDoubleField(term1156394, term1156394.getClass(), "endY", 0.7788960836558265);
        setField(term1156394, term1156394.getClass(), "nextPoints", term1156399);
        setIntField(term1156394, term1156394.getClass(), "ftlSpeed", 487624443);
        term1156413 = new Double(0.8641629614441709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1156413;
        callMethod(klass, "setEndY", argTypes, term1156394, args);
    }

};


