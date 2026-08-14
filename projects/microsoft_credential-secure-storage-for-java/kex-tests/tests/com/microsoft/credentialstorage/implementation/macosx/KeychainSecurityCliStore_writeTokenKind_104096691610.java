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

public class KeychainSecurityCliStore_writeTokenKind_104096691610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1902;
     Object enum3;
     Object term1929;

    public KeychainSecurityCliStore_writeTokenKind_104096691610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1902 = newInstance(Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore"));
        Class<? extends Object> term1971 = Class.forName((String) "com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore$SecretKind");
        Field term1970 = ((Class) term1971).getDeclaredField((String) "Credential");
        ((Field) term1970).setAccessible(true);
        enum3 = ((Field) term1970).get((Object) null);
        Class<? extends Object> term2628 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term2627 = ((Class) term2628).getDeclaredField((String) "ACCESS");
        ((Field) term2627).setAccessible(true);
        Object enum4 = ((Field) term2627).get((Object) null);
        term1929 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term1954 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term1955 = (char[]) newCharArray(4);
        setField(term1929, term1929.getClass(), "type", enum4);
        setCharElement(term1955, 0, 'P');
        setCharElement(term1955, 1, 'A');
        setCharElement(term1955, 2, 'E');
        setCharElement(term1955, 3, 'B');
        setField(term1954, term1954.getClass(), "value", term1955);
        setField(term1929, term1929.getClass(), "value", term1954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore$SecretKind");
        argTypes[2] = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Object[] args = new Object[3];
        args[0] = "xOEqzGAmDU";
        args[1] = enum3;
        args[2] = term1929;
        callMethod(klass, "writeTokenKind", argTypes, term1902, args);
    }

};


