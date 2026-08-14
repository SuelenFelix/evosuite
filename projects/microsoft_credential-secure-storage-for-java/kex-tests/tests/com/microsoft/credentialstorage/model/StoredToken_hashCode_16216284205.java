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

public class StoredToken_hashCode_16216284205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1841;

    public StoredToken_hashCode_16216284205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1875 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term1874 = ((Class) term1875).getDeclaredField((String) "ACCESS");
        ((Field) term1874).setAccessible(true);
        Object enum5 = ((Field) term1874).get((Object) null);
        term1841 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term1866 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term1867 = (char[]) newCharArray(6);
        setField(term1841, term1841.getClass(), "type", enum5);
        setCharElement(term1867, 0, 'R');
        setCharElement(term1867, 1, 'r');
        setCharElement(term1867, 2, 'b');
        setCharElement(term1867, 3, 'M');
        setCharElement(term1867, 4, 'u');
        setCharElement(term1867, 5, 'L');
        setField(term1866, term1866.getClass(), "value", term1867);
        setField(term1841, term1841.getClass(), "value", term1866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1841, args);
    }

};


