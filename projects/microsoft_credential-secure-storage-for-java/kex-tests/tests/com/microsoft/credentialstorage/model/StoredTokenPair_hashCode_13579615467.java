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

public class StoredTokenPair_hashCode_13579615467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7171;

    public StoredTokenPair_hashCode_13579615467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7218 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term7217 = ((Class) term7218).getDeclaredField((String) "PERSONAL");
        ((Field) term7217).setAccessible(true);
        Object enum20 = ((Field) term7217).get((Object) null);
        term7171 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair"));
        Object term7172 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term7208 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term7209 = (char[]) newCharArray(2);
        Object term7212 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term7213 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term7214 = (char[]) newCharArray(2);
        setField(term7172, term7172.getClass(), "type", enum20);
        setCharElement(term7209, 0, 'z');
        setCharElement(term7209, 1, 'R');
        setField(term7208, term7208.getClass(), "value", term7209);
        setField(term7172, term7172.getClass(), "value", term7208);
        setField(term7171, term7171.getClass(), "accessToken", term7172);
        setField(term7212, term7212.getClass(), "type", enum20);
        setCharElement(term7214, 0, 'f');
        setCharElement(term7214, 1, 'L');
        setField(term7213, term7213.getClass(), "value", term7214);
        setField(term7212, term7212.getClass(), "value", term7213);
        setField(term7171, term7171.getClass(), "refreshToken", term7212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7171, args);
    }

};


