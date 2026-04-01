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

public class CulturePower_addCulture_17915262132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3376828;
     Object term3376838;
     Object term3376840;

    public CulturePower_addCulture_17915262132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3376828 = newInstance(Class.forName("org.openRealmOfStars.starMap.CulturePower"));
        int[] term3376829 = (int[]) newIntArray(8);
        setIntElement(term3376829, 0, 1426418006);
        setIntElement(term3376829, 1, 1006642859);
        setIntElement(term3376829, 2, 1072681393);
        setIntElement(term3376829, 3, 1774684155);
        setIntElement(term3376829, 4, 671302283);
        setIntElement(term3376829, 5, -834149287);
        setIntElement(term3376829, 6, 940577929);
        setIntElement(term3376829, 7, 1506944120);
        setField(term3376828, term3376828.getClass(), "culture", term3376829);
        term3376838 = new Integer(784712012);
        term3376840 = new Integer(-1081370228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.CulturePower");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3376838;
        args[1] = term3376840;
        callMethod(klass, "addCulture", argTypes, term3376828, args);
    }

};


