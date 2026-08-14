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

public class StoredToken_getValue_16074522842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831;

    public StoredToken_getValue_16074522842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term883 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term882 = ((Class) term883).getDeclaredField((String) "FEDERATED");
        ((Field) term882).setAccessible(true);
        Object enum2 = ((Field) term882).get((Object) null);
        term831 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term877 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term878 = (char[]) newCharArray(3);
        setField(term831, term831.getClass(), "type", enum2);
        setCharElement(term878, 0, 'D');
        setCharElement(term878, 1, 's');
        setCharElement(term878, 2, 'j');
        setField(term877, term877.getClass(), "value", term878);
        setField(term831, term831.getClass(), "value", term877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term831, args);
    }

};


