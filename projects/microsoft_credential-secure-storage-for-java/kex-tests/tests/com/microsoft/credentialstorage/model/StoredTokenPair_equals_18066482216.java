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
import java.lang.String;

public class StoredTokenPair_equals_18066482216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6475;
     Object term6566;

    public StoredTokenPair_equals_18066482216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6568 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term6567 = ((Class) term6568).getDeclaredField((String) "FEDERATED");
        ((Field) term6567).setAccessible(true);
        Object enum18 = ((Field) term6567).get((Object) null);
        Class<? extends Object> term6875 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term6874 = ((Class) term6875).getDeclaredField((String) "ACCESS");
        ((Field) term6874).setAccessible(true);
        Object enum19 = ((Field) term6874).get((Object) null);
        term6475 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair"));
        Object term6476 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term6522 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term6523 = (char[]) newCharArray(8);
        Object term6532 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term6557 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term6558 = (char[]) newCharArray(7);
        setField(term6476, term6476.getClass(), "type", enum18);
        setCharElement(term6523, 0, 'a');
        setCharElement(term6523, 1, 'P');
        setCharElement(term6523, 2, 'i');
        setCharElement(term6523, 3, 'g');
        setCharElement(term6523, 4, 'E');
        setCharElement(term6523, 5, 'T');
        setCharElement(term6523, 6, 'm');
        setCharElement(term6523, 7, 'J');
        setField(term6522, term6522.getClass(), "value", term6523);
        setField(term6476, term6476.getClass(), "value", term6522);
        setField(term6475, term6475.getClass(), "accessToken", term6476);
        setField(term6532, term6532.getClass(), "type", enum19);
        setCharElement(term6558, 0, 'M');
        setCharElement(term6558, 1, 'x');
        setCharElement(term6558, 2, 'l');
        setCharElement(term6558, 3, 's');
        setCharElement(term6558, 4, 'z');
        setCharElement(term6558, 5, 'Y');
        setCharElement(term6558, 6, 'V');
        setField(term6557, term6557.getClass(), "value", term6558);
        setField(term6532, term6532.getClass(), "value", term6557);
        setField(term6475, term6475.getClass(), "refreshToken", term6532);
        term6566 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6566;
        callMethod(klass, "equals", argTypes, term6475, args);
    }

};


