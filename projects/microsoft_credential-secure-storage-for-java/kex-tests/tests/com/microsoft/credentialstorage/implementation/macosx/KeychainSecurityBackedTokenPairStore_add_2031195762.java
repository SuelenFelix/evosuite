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
import java.lang.Object;
import java.lang.String;

public class KeychainSecurityBackedTokenPairStore_add_2031195762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3459;
     Object term3472;

    public KeychainSecurityBackedTokenPairStore_add_2031195762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3459 = newInstance(Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityBackedTokenPairStore"));
        Class<? extends Object> term3571 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term3570 = ((Class) term3571).getDeclaredField((String) "REFRESH");
        ((Field) term3570).setAccessible(true);
        Object enum5 = ((Field) term3570).get((Object) null);
        Class<? extends Object> term3867 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term3866 = ((Class) term3867).getDeclaredField((String) "FEDERATED");
        ((Field) term3866).setAccessible(true);
        Object enum6 = ((Field) term3866).get((Object) null);
        term3472 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair"));
        Object term3473 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term3500 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term3501 = (char[]) newCharArray(3);
        Object term3505 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term3551 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term3552 = (char[]) newCharArray(7);
        setField(term3473, term3473.getClass(), "type", enum5);
        setCharElement(term3501, 0, 'g');
        setCharElement(term3501, 1, 'q');
        setCharElement(term3501, 2, 'z');
        setField(term3500, term3500.getClass(), "value", term3501);
        setField(term3473, term3473.getClass(), "value", term3500);
        setField(term3472, term3472.getClass(), "accessToken", term3473);
        setField(term3505, term3505.getClass(), "type", enum6);
        setCharElement(term3552, 0, 'x');
        setCharElement(term3552, 1, 'x');
        setCharElement(term3552, 2, 't');
        setCharElement(term3552, 3, 'l');
        setCharElement(term3552, 4, 'P');
        setCharElement(term3552, 5, 'w');
        setCharElement(term3552, 6, 'D');
        setField(term3551, term3551.getClass(), "value", term3552);
        setField(term3505, term3505.getClass(), "value", term3551);
        setField(term3472, term3472.getClass(), "refreshToken", term3505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityBackedTokenPairStore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair");
        Object[] args = new Object[2];
        args[0] = "OWDIEULEFu";
        args[1] = term3472;
        callMethod(klass, "add", argTypes, term3459, args);
    }

};


