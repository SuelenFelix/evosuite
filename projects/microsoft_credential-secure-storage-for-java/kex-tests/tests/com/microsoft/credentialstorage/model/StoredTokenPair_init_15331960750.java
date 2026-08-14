package com.microsoft.credentialstorage.model;

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
import static com.microsoft.credentialstorage.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StoredTokenPair_init_15331960750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3986;
     Object term4030;

    public StoredTokenPair_init_15331960750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4036 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term4035 = ((Class) term4036).getDeclaredField((String) "PERSONAL");
        ((Field) term4035).setAccessible(true);
        Object enum11 = ((Field) term4035).get((Object) null);
        term3986 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term4022 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term4023 = (char[]) newCharArray(6);
        setField(term3986, term3986.getClass(), "type", enum11);
        setCharElement(term4023, 0, 'V');
        setCharElement(term4023, 1, 'p');
        setCharElement(term4023, 2, 'O');
        setCharElement(term4023, 3, 'Q');
        setCharElement(term4023, 4, 'T');
        setCharElement(term4023, 5, 'y');
        setField(term4022, term4022.getClass(), "value", term4023);
        setField(term3986, term3986.getClass(), "value", term4022);
        term4030 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term4031 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term4032 = (char[]) newCharArray(2);
        setField(term4030, term4030.getClass(), "type", enum11);
        setCharElement(term4032, 0, 'S');
        setCharElement(term4032, 1, 'M');
        setField(term4031, term4031.getClass(), "value", term4032);
        setField(term4030, term4030.getClass(), "value", term4031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Object[] args = new Object[2];
        args[0] = term3986;
        args[1] = term4030;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


