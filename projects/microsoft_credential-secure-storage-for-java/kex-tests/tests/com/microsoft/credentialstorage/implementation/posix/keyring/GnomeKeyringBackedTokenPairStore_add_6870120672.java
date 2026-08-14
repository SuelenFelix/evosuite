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
import java.lang.String;

public class GnomeKeyringBackedTokenPairStore_add_6870120672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;

    public GnomeKeyringBackedTokenPairStore_add_6870120672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term376 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term375 = ((Class) term376).getDeclaredField((String) "ACCESS");
        ((Field) term375).setAccessible(true);
        Object enum0 = ((Field) term375).get((Object) null);
        Class<? extends Object> term669 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term668 = ((Class) term669).getDeclaredField((String) "REFRESH");
        ((Field) term668).setAccessible(true);
        Object enum1 = ((Field) term668).get((Object) null);
        term126 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair"));
        Object term127 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term152 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term153 = (char[]) newCharArray(3);
        Object term157 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term184 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term185 = (char[]) newCharArray(4);
        setField(term127, term127.getClass(), "type", enum0);
        setCharElement(term153, 0, 'D');
        setCharElement(term153, 1, 's');
        setCharElement(term153, 2, 'j');
        setField(term152, term152.getClass(), "value", term153);
        setField(term127, term127.getClass(), "value", term152);
        setField(term126, term126.getClass(), "accessToken", term127);
        setField(term157, term157.getClass(), "type", enum1);
        setCharElement(term185, 0, 'l');
        setCharElement(term185, 1, 'J');
        setCharElement(term185, 2, 'A');
        setCharElement(term185, 3, 'E');
        setField(term184, term184.getClass(), "value", term185);
        setField(term157, term157.getClass(), "value", term184);
        setField(term126, term126.getClass(), "refreshToken", term157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.posix.keyring.GnomeKeyringBackedTokenPairStore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair");
        Object[] args = new Object[2];
        args[0] = "jJCZpVmanW";
        args[1] = term126;
        callMethod(klass, "add", argTypes, null, args);
    }

};


