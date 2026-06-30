package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Country_setName_9461092827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5892;

    public Country_setName_9461092827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5920 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5923 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5920, term5920.getClass(), "id", 464181937);
        setField(term5920, term5920.getClass(), "name", "");
        setIntField(term5923, term5923.getClass(), "id", -1455526612);
        setField(term5923, term5923.getClass(), "code", null);
        setField(term5923, term5923.getClass(), "name", null);
        setField(term5923, term5923.getClass(), "states", null);
        setField(term5920, term5920.getClass(), "country", term5923);
        Object term5925 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5928 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5925, term5925.getClass(), "id", 1607082164);
        setField(term5925, term5925.getClass(), "name", "");
        setIntField(term5928, term5928.getClass(), "id", 0);
        setField(term5928, term5928.getClass(), "code", null);
        setField(term5928, term5928.getClass(), "name", null);
        setField(term5928, term5928.getClass(), "states", null);
        setField(term5925, term5925.getClass(), "country", term5928);
        Object term5930 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5933 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5930, term5930.getClass(), "id", -19246901);
        setField(term5930, term5930.getClass(), "name", "");
        setIntField(term5933, term5933.getClass(), "id", -370828664);
        setField(term5933, term5933.getClass(), "code", null);
        setField(term5933, term5933.getClass(), "name", null);
        setField(term5933, term5933.getClass(), "states", null);
        setField(term5930, term5930.getClass(), "country", term5933);
        Object term5935 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5938 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5935, term5935.getClass(), "id", -423900705);
        setField(term5935, term5935.getClass(), "name", "");
        setIntField(term5938, term5938.getClass(), "id", 0);
        setField(term5938, term5938.getClass(), "code", null);
        setField(term5938, term5938.getClass(), "name", null);
        setField(term5938, term5938.getClass(), "states", null);
        setField(term5935, term5935.getClass(), "country", term5938);
        ArrayList term5918 = new ArrayList();
        ((ArrayList) term5918).add(term5920);
        ((ArrayList) term5918).add(term5925);
        ((ArrayList) term5918).add(term5930);
        ((ArrayList) term5918).add(term5930);
        ((ArrayList) term5918).add(term5935);
        term5892 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5892, term5892.getClass(), "id", 489201218);
        setField(term5892, term5892.getClass(), "code", "nQodIeQekM");
        setField(term5892, term5892.getClass(), "name", "YXORpHCDcd");
        setField(term5892, term5892.getClass(), "states", term5918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PQLyoEKWSa";
        callMethod(klass, "setName", argTypes, term5892, args);
    }

};


