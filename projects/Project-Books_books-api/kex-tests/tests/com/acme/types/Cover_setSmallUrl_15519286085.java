package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Cover_setSmallUrl_15519286085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37015;

    public Cover_setSmallUrl_15519286085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37015 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term37015, term37015.getClass(), "id", "tJAUsTSKkk");
        setField(term37015, term37015.getClass(), "smallUrl", "VEHiNYtljb");
        setField(term37015, term37015.getClass(), "mediumUrl", "suoEAqekUb");
        setField(term37015, term37015.getClass(), "largeUrl", "qmZEKiXqxP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Cover");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lAuVFraTOT";
        callMethod(klass, "setSmallUrl", argTypes, term37015, args);
    }

};


