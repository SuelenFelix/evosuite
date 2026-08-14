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

public class StoredToken_clear_20155153503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1184;

    public StoredToken_clear_20155153503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1217 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term1216 = ((Class) term1217).getDeclaredField((String) "TEST");
        ((Field) term1216).setAccessible(true);
        Object enum3 = ((Field) term1216).get((Object) null);
        term1184 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term1210 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term1211 = (char[]) newCharArray(4);
        setField(term1184, term1184.getClass(), "type", enum3);
        setCharElement(term1211, 0, 'l');
        setCharElement(term1211, 1, 'J');
        setCharElement(term1211, 2, 'A');
        setCharElement(term1211, 3, 'E');
        setField(term1210, term1210.getClass(), "value", term1211);
        setField(term1184, term1184.getClass(), "value", term1210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term1184, args);
    }

};


