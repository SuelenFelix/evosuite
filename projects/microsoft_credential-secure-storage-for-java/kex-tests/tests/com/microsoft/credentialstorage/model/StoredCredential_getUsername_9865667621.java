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

public class StoredCredential_getUsername_9865667621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3775;

    public StoredCredential_getUsername_9865667621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3775 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredCredential"));
        Object term3788 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term3789 = (char[]) newCharArray(1);
        setField(term3775, term3775.getClass(), "username", "jJCZpVmanW");
        setCharElement(term3789, 0, 'x');
        setField(term3788, term3788.getClass(), "value", term3789);
        setField(term3775, term3775.getClass(), "password", term3788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term3775, args);
    }

};


