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

public class AuthenticationValue_setUrlMatcher_40652527514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18556;

    public AuthenticationValue_setUrlMatcher_40652527514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18618 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term18617 = ((Class) term18618).getDeclaredField((String) "HEADER");
        ((Field) term18617).setAccessible(true);
        Object enum43 = ((Field) term18617).get((Object) null);
        term18556 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term18591 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term18592 = (Object[]) newArray("java.lang.String", 1);
        setField(term18556, term18556.getClass(), "key", "IgRJUzaCwW");
        setField(term18556, term18556.getClass(), "value", "JUmudUmaaV");
        setField(term18556, term18556.getClass(), "type", enum43);
        setElement(term18592, 0, "*");
        setField(term18591, term18591.getClass(), "a", term18592);
        setIntField(term18591, term18591.getClass(), "modCount", 0);
        setField(term18556, term18556.getClass(), "urlPatterns", term18591);
        setField(term18556, term18556.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Predicate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUrlMatcher", argTypes, term18556, args);
    }

};


