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

public class ClearableValue_hashCode_12723526244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3964;

    public ClearableValue_hashCode_12723526244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3964 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term3965 = (char[]) newCharArray(8);
        setCharElement(term3965, 0, 'R');
        setCharElement(term3965, 1, 'b');
        setCharElement(term3965, 2, 'S');
        setCharElement(term3965, 3, 'S');
        setCharElement(term3965, 4, 'b');
        setCharElement(term3965, 5, 'S');
        setCharElement(term3965, 6, 'z');
        setCharElement(term3965, 7, 'j');
        setField(term3964, term3964.getClass(), "value", term3965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.ClearableValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3964, args);
    }

};


