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

public class StoredToken_equals_20703150954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1504;
     Object term1543;

    public StoredToken_equals_20703150954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1545 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term1544 = ((Class) term1545).getDeclaredField((String) "PERSONAL");
        ((Field) term1544).setAccessible(true);
        Object enum4 = ((Field) term1544).get((Object) null);
        term1504 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term1540 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term1541 = (char[]) newCharArray(1);
        setField(term1504, term1504.getClass(), "type", enum4);
        setCharElement(term1541, 0, 't');
        setField(term1540, term1540.getClass(), "value", term1541);
        setField(term1504, term1504.getClass(), "value", term1540);
        term1543 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1543;
        callMethod(klass, "equals", argTypes, term1504, args);
    }

};


