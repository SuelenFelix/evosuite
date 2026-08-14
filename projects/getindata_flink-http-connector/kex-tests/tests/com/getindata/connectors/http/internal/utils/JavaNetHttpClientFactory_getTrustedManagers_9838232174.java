package com.getindata.connectors.http.internal.utils;

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
import static com.getindata.connectors.http.internal.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class JavaNetHttpClientFactory_getTrustedManagers_9838232174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term77;

    public JavaNetHttpClientFactory_getTrustedManagers_9838232174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("com.getindata.connectors.http.internal.security.SecurityContext"));
        char[] term58 = (char[]) newCharArray(4);
        Object term63 = newInstance(Class.forName("java.security.KeyStore"));
        setCharElement(term58, 0, 'P');
        setCharElement(term58, 1, 'A');
        setCharElement(term58, 2, 'E');
        setCharElement(term58, 3, 'B');
        setField(term57, term57.getClass(), "storePassword", term58);
        setField(term63, term63.getClass(), "type", "PAEBtnZtTD");
        setField(term63, term63.getClass(), "provider", null);
        setField(term63, term63.getClass(), "keyStoreSpi", null);
        setBooleanField(term63, term63.getClass(), "initialized", false);
        setField(term57, term57.getClass(), "keystore", term63);
        term77 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.JavaNetHttpClientFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.security.SecurityContext");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term57;
        args[1] = term77;
        callMethod(klass, "getTrustedManagers", argTypes, null, args);
    }

};


