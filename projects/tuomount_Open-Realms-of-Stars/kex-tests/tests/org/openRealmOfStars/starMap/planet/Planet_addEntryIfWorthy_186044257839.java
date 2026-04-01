package org.openRealmOfStars.starMap.planet;

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
import static org.openRealmOfStars.starMap.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Planet_addEntryIfWorthy_186044257839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2219012;
     Object term2219044;

    public Planet_addEntryIfWorthy_186044257839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2219012 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2219013 = (byte[]) newByteArray(16);
        setField(term2219012, term2219012.getClass(), "value", term2219013);
        setByteField(term2219012, term2219012.getClass(), "coder", (byte) 11);
        setIntField(term2219012, term2219012.getClass(), "count", -1705795248);
        term2219044 = new Integer(-159444354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2219012;
        args[1] = "RXuktFgdMP";
        args[2] = term2219044;
        callMethod(klass, "addEntryIfWorthy", argTypes, null, args);
    }

};


