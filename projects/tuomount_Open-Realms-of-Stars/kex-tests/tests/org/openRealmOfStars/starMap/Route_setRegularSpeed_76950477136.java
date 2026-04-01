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
import java.lang.Integer;

public class Route_setRegularSpeed_76950477136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156486;
     Object term1156508;

    public Route_setRegularSpeed_76950477136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156493 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156493, term1156493.getClass(), "x", -1434138256);
        setIntField(term1156493, term1156493.getClass(), "y", 1545174224);
        Object term1156496 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156496, term1156496.getClass(), "x", 343373673);
        setIntField(term1156496, term1156496.getClass(), "y", -1027713907);
        Object term1156499 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156499, term1156499.getClass(), "x", 1411236979);
        setIntField(term1156499, term1156499.getClass(), "y", 225881086);
        Object term1156502 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156502, term1156502.getClass(), "x", 60635888);
        setIntField(term1156502, term1156502.getClass(), "y", -414668199);
        ArrayList term1156491 = new ArrayList();
        ((ArrayList) term1156491).add(term1156493);
        ((ArrayList) term1156491).add(term1156496);
        ((ArrayList) term1156491).add(term1156499);
        ((ArrayList) term1156491).add(term1156502);
        term1156486 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156486, term1156486.getClass(), "startX", 0.359822327374657);
        setDoubleField(term1156486, term1156486.getClass(), "startY", 0.6984496238941496);
        setDoubleField(term1156486, term1156486.getClass(), "endX", 0.026751890106275433);
        setDoubleField(term1156486, term1156486.getClass(), "endY", 0.5131701879289331);
        setField(term1156486, term1156486.getClass(), "nextPoints", term1156491);
        setIntField(term1156486, term1156486.getClass(), "ftlSpeed", -1268639340);
        term1156508 = new Integer(1384310426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1156508;
        callMethod(klass, "setRegularSpeed", argTypes, term1156486, args);
    }

};


