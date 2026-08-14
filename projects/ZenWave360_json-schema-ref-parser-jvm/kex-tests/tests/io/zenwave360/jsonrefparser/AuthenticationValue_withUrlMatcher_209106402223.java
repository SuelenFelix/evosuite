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

public class AuthenticationValue_withUrlMatcher_209106402223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20252;

    public AuthenticationValue_withUrlMatcher_209106402223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20252 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        setField(term20252, term20252.getClass(), "key", null);
        setField(term20252, term20252.getClass(), "value", null);
        setField(term20252, term20252.getClass(), "type", null);
        setField(term20252, term20252.getClass(), "urlPatterns", null);
        setField(term20252, term20252.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Predicate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withUrlMatcher", argTypes, term20252, args);
    }

};


