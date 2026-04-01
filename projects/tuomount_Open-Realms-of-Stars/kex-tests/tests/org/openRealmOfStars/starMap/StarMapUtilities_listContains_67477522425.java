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

public class StarMapUtilities_listContains_67477522425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3640990;

    public StarMapUtilities_listContains_67477522425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3640990 = (Object[]) newArray("java.lang.String", 9);
        setElement(term3640990, 0, "bBTrbmRLRx");
        setElement(term3640990, 1, "yQouCuPFJH");
        setElement(term3640990, 2, "OrXibxohnz");
        setElement(term3640990, 3, "SqzGEkEYZk");
        setElement(term3640990, 4, "vdyWmDFqRf");
        setElement(term3640990, 5, "xXgTDCLpmO");
        setElement(term3640990, 6, "EanFwlnoRz");
        setElement(term3640990, 7, "vTQejPMWnV");
        setElement(term3640990, 8, "jACftXUzuB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3640990;
        args[1] = "fksyCablTu";
        callMethod(klass, "listContains", argTypes, null, args);
    }

};


