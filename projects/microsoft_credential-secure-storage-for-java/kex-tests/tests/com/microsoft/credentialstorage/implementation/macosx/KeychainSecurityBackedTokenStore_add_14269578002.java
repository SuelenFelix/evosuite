package com.microsoft.credentialstorage.implementation.macosx;

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
import static com.microsoft.credentialstorage.implementation.macosx.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class KeychainSecurityBackedTokenStore_add_14269578002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5467;
     Object term5480;

    public KeychainSecurityBackedTokenStore_add_14269578002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5467 = newInstance(Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityBackedTokenStore"));
        Class<? extends Object> term5520 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term5519 = ((Class) term5520).getDeclaredField((String) "TEST");
        ((Field) term5519).setAccessible(true);
        Object enum9 = ((Field) term5519).get((Object) null);
        term5480 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term5506 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term5507 = (char[]) newCharArray(1);
        setField(term5480, term5480.getClass(), "type", enum9);
        setCharElement(term5507, 0, 'Y');
        setField(term5506, term5506.getClass(), "value", term5507);
        setField(term5480, term5480.getClass(), "value", term5506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityBackedTokenStore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Object[] args = new Object[2];
        args[0] = "kuTXqwMtDB";
        args[1] = term5480;
        callMethod(klass, "add", argTypes, term5467, args);
    }

};


