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

public class Route_getMy_198495460941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156581;
     Object term1156603;

    public Route_getMy_198495460941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156588 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156588, term1156588.getClass(), "x", 1967946066);
        setIntField(term1156588, term1156588.getClass(), "y", -1284751331);
        Object term1156591 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156591, term1156591.getClass(), "x", 402683217);
        setIntField(term1156591, term1156591.getClass(), "y", -1496988488);
        Object term1156594 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156594, term1156594.getClass(), "x", 998341033);
        setIntField(term1156594, term1156594.getClass(), "y", 168644289);
        Object term1156597 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156597, term1156597.getClass(), "x", 1429503327);
        setIntField(term1156597, term1156597.getClass(), "y", -791127955);
        ArrayList term1156586 = new ArrayList();
        ((ArrayList) term1156586).add(term1156588);
        ((ArrayList) term1156586).add(term1156591);
        ((ArrayList) term1156586).add(term1156594);
        ((ArrayList) term1156586).add(term1156597);
        term1156581 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156581, term1156581.getClass(), "startX", 0.9617136552411361);
        setDoubleField(term1156581, term1156581.getClass(), "startY", 0.8733388286648099);
        setDoubleField(term1156581, term1156581.getClass(), "endX", 0.6961639879171184);
        setDoubleField(term1156581, term1156581.getClass(), "endY", 0.04086594399817722);
        setField(term1156581, term1156581.getClass(), "nextPoints", term1156586);
        setIntField(term1156581, term1156581.getClass(), "ftlSpeed", 1619404607);
        term1156603 = new Integer(-1537905122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1156603;
        callMethod(klass, "getMy", argTypes, term1156581, args);
    }

};


