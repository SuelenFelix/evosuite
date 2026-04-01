package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SunRepository_saveSun_3557038921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15342;
     Object term15343;
     Object term15360;

    public SunRepository_saveSun_3557038921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15342 = newInstance(Class.forName("org.openRealmOfStars.utilities.repository.SunRepository"));
        term15343 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term15345 = (byte[]) newByteArray(2);
        byte[] term15348 = (byte[]) newByteArray(9);
        Object term15359 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term15343, term15343.getClass(), "written", 1543091617);
        setByteElement(term15345, 0, (byte) 43);
        setByteElement(term15345, 1, (byte) -27);
        setField(term15343, term15343.getClass(), "bytearr", term15345);
        setByteElement(term15348, 0, (byte) 34);
        setByteElement(term15348, 1, (byte) -126);
        setByteElement(term15348, 2, (byte) 12);
        setByteElement(term15348, 3, (byte) -75);
        setByteElement(term15348, 4, (byte) 69);
        setByteElement(term15348, 5, (byte) -6);
        setByteElement(term15348, 6, (byte) 107);
        setByteElement(term15348, 7, (byte) -109);
        setByteElement(term15348, 8, (byte) 122);
        setField(term15343, term15343.getClass(), "writeBuffer", term15348);
        setField(term15343, term15343.getClass(), "out", null);
        setBooleanField(term15343, term15343.getClass(), "closed", true);
        setField(term15343, term15343.getClass(), "closeLock", term15359);
        term15360 = newInstance(Class.forName("org.openRealmOfStars.starMap.Sun"));
        Object term15373 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term15360, term15360.getClass(), "name", "nghfqDXyCG");
        setIntField(term15373, term15373.getClass(), "x", -763166094);
        setIntField(term15373, term15373.getClass(), "y", -222941705);
        setField(term15360, term15360.getClass(), "centerCoordinate", term15373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.SunRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Sun");
        Object[] args = new Object[2];
        args[0] = term15343;
        args[1] = term15360;
        callMethod(klass, "saveSun", argTypes, term15342, args);
    }

};


