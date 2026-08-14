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
import java.lang.String;
import java.lang.Object;

public class GnomeKeyringBackedTokenStore_add_15875575392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1064;

    public GnomeKeyringBackedTokenStore_add_15875575392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1125 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term1124 = ((Class) term1125).getDeclaredField((String) "FEDERATED");
        ((Field) term1124).setAccessible(true);
        Object enum2 = ((Field) term1124).get((Object) null);
        term1064 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term1110 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term1111 = (char[]) newCharArray(2);
        setField(term1064, term1064.getClass(), "type", enum2);
        setCharElement(term1111, 0, 'c');
        setCharElement(term1111, 1, 'g');
        setField(term1110, term1110.getClass(), "value", term1111);
        setField(term1064, term1064.getClass(), "value", term1110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.posix.keyring.GnomeKeyringBackedTokenStore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Object[] args = new Object[2];
        args[0] = "hRNSzYYIrc";
        args[1] = term1064;
        callMethod(klass, "add", argTypes, null, args);
    }

};


