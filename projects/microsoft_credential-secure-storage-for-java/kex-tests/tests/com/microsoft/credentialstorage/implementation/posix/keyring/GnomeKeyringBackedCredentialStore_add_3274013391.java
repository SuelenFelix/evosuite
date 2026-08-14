package com.microsoft.credentialstorage.implementation.posix.keyring;

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
import static com.microsoft.credentialstorage.implementation.posix.keyring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GnomeKeyringBackedCredentialStore_add_3274013391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public GnomeKeyringBackedCredentialStore_add_3274013391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredCredential"));
        Object term26 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term27 = (char[]) newCharArray(5);
        setField(term13, term13.getClass(), "username", "sjlJAEtRrb");
        setCharElement(term27, 0, 'P');
        setCharElement(term27, 1, 'A');
        setCharElement(term27, 2, 'E');
        setCharElement(term27, 3, 'B');
        setCharElement(term27, 4, 't');
        setField(term26, term26.getClass(), "value", term27);
        setField(term13, term13.getClass(), "password", term26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.posix.keyring.GnomeKeyringBackedCredentialStore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredCredential");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        callMethod(klass, "add", argTypes, null, args);
    }

};


