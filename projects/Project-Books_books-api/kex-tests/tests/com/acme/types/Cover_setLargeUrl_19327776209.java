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

public class Cover_setLargeUrl_19327776209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37415;

    public Cover_setLargeUrl_19327776209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37415 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term37415, term37415.getClass(), "id", "yxWimtmvkl");
        setField(term37415, term37415.getClass(), "smallUrl", "PUzanajQSP");
        setField(term37415, term37415.getClass(), "mediumUrl", "yxepsSOVzF");
        setField(term37415, term37415.getClass(), "largeUrl", "ZUOjNutasW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Cover");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iLnavpwPVW";
        callMethod(klass, "setLargeUrl", argTypes, term37415, args);
    }

};


