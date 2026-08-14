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

public class StoredTokenPair_getAccessToken_15572797803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4428;

    public StoredTokenPair_getAccessToken_15572797803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4523 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term4522 = ((Class) term4523).getDeclaredField((String) "PERSONAL");
        ((Field) term4522).setAccessible(true);
        Object enum12 = ((Field) term4522).get((Object) null);
        Class<? extends Object> term4822 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term4821 = ((Class) term4822).getDeclaredField((String) "FEDERATED");
        ((Field) term4821).setAccessible(true);
        Object enum13 = ((Field) term4821).get((Object) null);
        term4428 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair"));
        Object term4429 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term4465 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term4466 = (char[]) newCharArray(3);
        Object term4470 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        Object term4516 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term4517 = (char[]) newCharArray(4);
        setField(term4429, term4429.getClass(), "type", enum12);
        setCharElement(term4466, 0, 'z');
        setCharElement(term4466, 1, 'Y');
        setCharElement(term4466, 2, 'Y');
        setField(term4465, term4465.getClass(), "value", term4466);
        setField(term4429, term4429.getClass(), "value", term4465);
        setField(term4428, term4428.getClass(), "accessToken", term4429);
        setField(term4470, term4470.getClass(), "type", enum13);
        setCharElement(term4517, 0, 'I');
        setCharElement(term4517, 1, 'r');
        setCharElement(term4517, 2, 'c');
        setCharElement(term4517, 3, 'R');
        setField(term4516, term4516.getClass(), "value", term4517);
        setField(term4470, term4470.getClass(), "value", term4516);
        setField(term4428, term4428.getClass(), "refreshToken", term4470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessToken", argTypes, term4428, args);
    }

};


