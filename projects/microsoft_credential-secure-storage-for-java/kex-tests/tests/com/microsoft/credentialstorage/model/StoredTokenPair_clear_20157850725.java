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
import java.lang.Object;
import java.lang.String;

public class StoredTokenPair_clear_20157850725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5802;

    public StoredTokenPair_clear_20157850725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5879 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term5878 = ((Class) term5879).getDeclaredField((String) "PERSONAL");
        ((Field) term5878).setAccessible(true);
        Object enum16 = ((Field) term5878).get((Object) null);
        Class<? extends Object> term6182 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term6181 = ((Class) term6182).getDeclaredField((String) "REFRESH");
        ((Field) term6181).setAccessible(true);
        Object enum17 = ((Field) term6181).get((Object) null);
        term5802 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair"));
        Object term5803 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term5839 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term5840 = (char[]) newCharArray(7);
        Object term5848 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term5875 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term5876 = (char[]) newCharArray(1);
        setField(term5803, term5803.getClass(), "type", enum16);
        setCharElement(term5840, 0, 'g');
        setCharElement(term5840, 1, 'J');
        setCharElement(term5840, 2, 'l');
        setCharElement(term5840, 3, 'h');
        setCharElement(term5840, 4, 'k');
        setCharElement(term5840, 5, 'X');
        setCharElement(term5840, 6, 'u');
        setField(term5839, term5839.getClass(), "value", term5840);
        setField(term5803, term5803.getClass(), "value", term5839);
        setField(term5802, term5802.getClass(), "accessToken", term5803);
        setField(term5848, term5848.getClass(), "type", enum17);
        setCharElement(term5876, 0, 'u');
        setField(term5875, term5875.getClass(), "value", term5876);
        setField(term5848, term5848.getClass(), "value", term5875);
        setField(term5802, term5802.getClass(), "refreshToken", term5848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term5802, args);
    }

};


