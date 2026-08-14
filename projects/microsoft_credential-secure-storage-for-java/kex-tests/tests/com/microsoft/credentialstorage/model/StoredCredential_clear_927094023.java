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

public class StoredCredential_clear_927094023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3839;

    public StoredCredential_clear_927094023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3839 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredCredential"));
        Object term3852 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term3853 = (char[]) newCharArray(5);
        setField(term3839, term3839.getClass(), "username", "SzjVpOQTyS");
        setCharElement(term3853, 0, 'Y');
        setCharElement(term3853, 1, 'F');
        setCharElement(term3853, 2, 's');
        setCharElement(term3853, 3, 'j');
        setCharElement(term3853, 4, 'J');
        setField(term3852, term3852.getClass(), "value", term3853);
        setField(term3839, term3839.getClass(), "password", term3852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term3839, args);
    }

};


