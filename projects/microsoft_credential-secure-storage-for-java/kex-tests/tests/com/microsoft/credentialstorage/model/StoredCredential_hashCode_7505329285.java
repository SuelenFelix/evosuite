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

public class StoredCredential_hashCode_7505329285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3910;

    public StoredCredential_hashCode_7505329285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3910 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredCredential"));
        Object term3923 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term3924 = (char[]) newCharArray(2);
        setField(term3910, term3910.getClass(), "username", "hRNSzYYIrc");
        setCharElement(term3924, 0, 'a');
        setCharElement(term3924, 1, 'n');
        setField(term3923, term3923.getClass(), "value", term3924);
        setField(term3910, term3910.getClass(), "password", term3923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3910, args);
    }

};


