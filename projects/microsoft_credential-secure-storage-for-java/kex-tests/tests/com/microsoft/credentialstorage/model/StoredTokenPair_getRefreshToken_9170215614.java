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

public class StoredTokenPair_getRefreshToken_9170215614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5124;

    public StoredTokenPair_getRefreshToken_9170215614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5204 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term5203 = ((Class) term5204).getDeclaredField((String) "PERSONAL");
        ((Field) term5203).setAccessible(true);
        Object enum14 = ((Field) term5203).get((Object) null);
        Class<? extends Object> term5509 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term5508 = ((Class) term5509).getDeclaredField((String) "ACCESS");
        ((Field) term5508).setAccessible(true);
        Object enum15 = ((Field) term5508).get((Object) null);
        term5124 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair"));
        Object term5125 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term5161 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term5162 = (char[]) newCharArray(9);
        Object term5172 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term5197 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term5198 = (char[]) newCharArray(4);
        setField(term5125, term5125.getClass(), "type", enum14);
        setCharElement(term5162, 0, 'M');
        setCharElement(term5162, 1, 'F');
        setCharElement(term5162, 2, 'I');
        setCharElement(term5162, 3, 's');
        setCharElement(term5162, 4, 'Y');
        setCharElement(term5162, 5, 'G');
        setCharElement(term5162, 6, 'g');
        setCharElement(term5162, 7, 'n');
        setCharElement(term5162, 8, 'e');
        setField(term5161, term5161.getClass(), "value", term5162);
        setField(term5125, term5125.getClass(), "value", term5161);
        setField(term5124, term5124.getClass(), "accessToken", term5125);
        setField(term5172, term5172.getClass(), "type", enum15);
        setCharElement(term5198, 0, 'N');
        setCharElement(term5198, 1, 'R');
        setCharElement(term5198, 2, 'd');
        setCharElement(term5198, 3, 'v');
        setField(term5197, term5197.getClass(), "value", term5198);
        setField(term5172, term5172.getClass(), "value", term5197);
        setField(term5124, term5124.getClass(), "refreshToken", term5172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefreshToken", argTypes, term5124, args);
    }

};


