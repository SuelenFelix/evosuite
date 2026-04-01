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
import java.lang.Object;
import java.lang.Integer;

public class StarMapUtilities_setSolarSystem_6334001493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3530988;
     Object term3531005;
     Object term3531007;
     Object term3531009;
     Object term3531011;

    public StarMapUtilities_setSolarSystem_6334001493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3530988 = (Object[]) newArray("[I", 3);
        int[] term3530989 = (int[]) newIntArray(4);
        int[] term3530994 = (int[]) newIntArray(3);
        int[] term3530998 = (int[]) newIntArray(6);
        setIntElement(term3530989, 0, -1050234909);
        setIntElement(term3530989, 1, -1317938186);
        setIntElement(term3530989, 2, 542313802);
        setIntElement(term3530989, 3, 393887496);
        setElement(term3530988, 0, term3530989);
        setIntElement(term3530994, 0, -1364225712);
        setIntElement(term3530994, 1, 986850007);
        setIntElement(term3530994, 2, -1387743875);
        setElement(term3530988, 1, term3530994);
        setIntElement(term3530998, 0, -1348713961);
        setIntElement(term3530998, 1, -1447166954);
        setIntElement(term3530998, 2, -1106517599);
        setIntElement(term3530998, 3, -739082344);
        setIntElement(term3530998, 4, 609352122);
        setIntElement(term3530998, 5, -1546752866);
        setElement(term3530988, 2, term3530998);
        term3531005 = new Integer(-607406225);
        term3531007 = new Integer(-138867167);
        term3531009 = new Integer(810501080);
        term3531011 = new Integer(1641962046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term3530988;
        args[1] = term3531005;
        args[2] = term3531007;
        args[3] = term3531009;
        args[4] = term3531011;
        callMethod(klass, "setSolarSystem", argTypes, null, args);
    }

};


