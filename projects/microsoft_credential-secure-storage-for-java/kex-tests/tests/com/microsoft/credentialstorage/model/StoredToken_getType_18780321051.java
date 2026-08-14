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

public class StoredToken_getType_18780321051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501;

    public StoredToken_getType_18780321051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term535 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term534 = ((Class) term535).getDeclaredField((String) "REFRESH");
        ((Field) term534).setAccessible(true);
        Object enum1 = ((Field) term534).get((Object) null);
        term501 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term528 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term529 = (char[]) newCharArray(4);
        setField(term501, term501.getClass(), "type", enum1);
        setCharElement(term529, 0, 'n');
        setCharElement(term529, 1, 'Z');
        setCharElement(term529, 2, 't');
        setCharElement(term529, 3, 'T');
        setField(term528, term528.getClass(), "value", term529);
        setField(term501, term501.getClass(), "value", term528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term501, args);
    }

};


