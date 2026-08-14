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

public class AuthenticationValue_withUrlMatcher_20910640225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14298;

    public AuthenticationValue_withUrlMatcher_20910640225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14360 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term14359 = ((Class) term14360).getDeclaredField((String) "HEADER");
        ((Field) term14359).setAccessible(true);
        Object enum33 = ((Field) term14359).get((Object) null);
        term14298 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term14333 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term14334 = (Object[]) newArray("java.lang.String", 1);
        setField(term14298, term14298.getClass(), "key", "nGKItKLYNC");
        setField(term14298, term14298.getClass(), "value", "UiUYnPrcCi");
        setField(term14298, term14298.getClass(), "type", enum33);
        setElement(term14334, 0, "*");
        setField(term14333, term14333.getClass(), "a", term14334);
        setIntField(term14333, term14333.getClass(), "modCount", 0);
        setField(term14298, term14298.getClass(), "urlPatterns", term14333);
        setField(term14298, term14298.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Predicate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withUrlMatcher", argTypes, term14298, args);
    }

};


