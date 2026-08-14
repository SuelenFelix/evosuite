package io.zenwave360.jsonrefparser;

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
import static io.zenwave360.jsonrefparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AuthenticationValue_getKey_16844725948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15649;

    public AuthenticationValue_getKey_16844725948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15711 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term15710 = ((Class) term15711).getDeclaredField((String) "HEADER");
        ((Field) term15710).setAccessible(true);
        Object enum36 = ((Field) term15710).get((Object) null);
        term15649 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term15684 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term15685 = (Object[]) newArray("java.lang.String", 1);
        setField(term15649, term15649.getClass(), "key", "MLqYREekMl");
        setField(term15649, term15649.getClass(), "value", "ytSBIKXogI");
        setField(term15649, term15649.getClass(), "type", enum36);
        setElement(term15685, 0, "*");
        setField(term15684, term15684.getClass(), "a", term15685);
        setIntField(term15684, term15684.getClass(), "modCount", 0);
        setField(term15649, term15649.getClass(), "urlPatterns", term15684);
        setField(term15649, term15649.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKey", argTypes, term15649, args);
    }

};


