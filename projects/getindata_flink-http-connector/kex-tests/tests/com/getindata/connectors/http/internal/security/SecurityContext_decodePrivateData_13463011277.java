package com.getindata.connectors.http.internal.security;

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
import static com.getindata.connectors.http.internal.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SecurityContext_decodePrivateData_13463011277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;
     Object term296;

    public SecurityContext_decodePrivateData_13463011277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262 = newInstance(Class.forName("com.getindata.connectors.http.internal.security.SecurityContext"));
        char[] term263 = (char[]) newCharArray(6);
        Object term270 = newInstance(Class.forName("java.security.KeyStore"));
        setCharElement(term263, 0, 'u');
        setCharElement(term263, 1, 'L');
        setCharElement(term263, 2, 'c');
        setCharElement(term263, 3, 'g');
        setCharElement(term263, 4, 'Q');
        setCharElement(term263, 5, 'H');
        setField(term262, term262.getClass(), "storePassword", term263);
        setField(term270, term270.getClass(), "type", "RMFIsYGgne");
        setField(term270, term270.getClass(), "provider", null);
        setField(term270, term270.getClass(), "keyStoreSpi", null);
        setBooleanField(term270, term270.getClass(), "initialized", true);
        setField(term262, term262.getClass(), "keystore", term270);
        term296 = (byte[]) newByteArray(7);
        setByteElement(term296, 0, (byte) 47);
        setByteElement(term296, 1, (byte) 48);
        setByteElement(term296, 2, (byte) 89);
        setByteElement(term296, 3, (byte) 75);
        setByteElement(term296, 4, (byte) 18);
        setByteElement(term296, 5, (byte) -58);
        setByteElement(term296, 6, (byte) -29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.security.SecurityContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "NRdvgJlhkX";
        args[1] = term296;
        callMethod(klass, "decodePrivateData", argTypes, term262, args);
    }

};


