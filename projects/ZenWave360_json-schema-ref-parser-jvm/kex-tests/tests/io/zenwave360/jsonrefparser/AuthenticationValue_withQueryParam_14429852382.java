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

public class AuthenticationValue_withQueryParam_14429852382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12937;

    public AuthenticationValue_withQueryParam_14429852382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13023 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term13022 = ((Class) term13023).getDeclaredField((String) "HEADER");
        ((Field) term13022).setAccessible(true);
        Object enum30 = ((Field) term13022).get((Object) null);
        term12937 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term12972 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term12973 = (Object[]) newArray("java.lang.String", 1);
        setField(term12937, term12937.getClass(), "key", "aKnKipADSo");
        setField(term12937, term12937.getClass(), "value", "wSQxaModmm");
        setField(term12937, term12937.getClass(), "type", enum30);
        setElement(term12973, 0, "*");
        setField(term12972, term12972.getClass(), "a", term12973);
        setIntField(term12972, term12972.getClass(), "modCount", 0);
        setField(term12937, term12937.getClass(), "urlPatterns", term12972);
        setField(term12937, term12937.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "UlajhuVLaP";
        args[1] = "gGSMzuGICf";
        callMethod(klass, "withQueryParam", argTypes, term12937, args);
    }

};


