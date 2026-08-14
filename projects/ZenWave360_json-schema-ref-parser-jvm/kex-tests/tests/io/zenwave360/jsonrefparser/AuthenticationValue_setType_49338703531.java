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

public class AuthenticationValue_setType_49338703531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20260;

    public AuthenticationValue_setType_49338703531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20260 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        setField(term20260, term20260.getClass(), "key", null);
        setField(term20260, term20260.getClass(), "value", null);
        setField(term20260, term20260.getClass(), "type", null);
        setField(term20260, term20260.getClass(), "urlPatterns", null);
        setField(term20260, term20260.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term20260, args);
    }

};


