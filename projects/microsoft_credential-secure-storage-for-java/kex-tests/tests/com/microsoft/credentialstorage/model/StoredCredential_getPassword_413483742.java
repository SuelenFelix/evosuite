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

public class StoredCredential_getPassword_413483742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3802;

    public StoredCredential_getPassword_413483742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3802 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredCredential"));
        Object term3815 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term3816 = (char[]) newCharArray(6);
        setField(term3802, term3802.getClass(), "username", "EGtDIRbSSb");
        setCharElement(term3816, 0, 'x');
        setCharElement(term3816, 1, 't');
        setCharElement(term3816, 2, 'l');
        setCharElement(term3816, 3, 'P');
        setCharElement(term3816, 4, 'w');
        setCharElement(term3816, 5, 'D');
        setField(term3815, term3815.getClass(), "value", term3816);
        setField(term3802, term3802.getClass(), "password", term3815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term3802, args);
    }

};


