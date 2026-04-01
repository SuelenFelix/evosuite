package org.openRealmOfStars.starMap.planet.status;

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
import static org.openRealmOfStars.starMap.planet.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlanetaryStatus_init_17409105731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5982;

    public PlanetaryStatus_init_17409105731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5982 = (Object[]) newArray("java.lang.String", 6);
        setElement(term5982, 0, "fWKJoSoCwE");
        setElement(term5982, 1, "wfaXBpWAUH");
        setElement(term5982, 2, "VMeAzAHwZj");
        setElement(term5982, 3, "PznxWXsZME");
        setElement(term5982, 4, "ZzIujlwVsw");
        setElement(term5982, 5, "LWyEaeIyAo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = "xJgPlLxpgC";
        args[1] = "EYtfuJaxiM";
        args[2] = "gCWtLVKVVe";
        args[3] = term5982;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


