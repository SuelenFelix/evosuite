package io.zenwave360.jsonrefparser.resolver;

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
import static io.zenwave360.jsonrefparser.resolver.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class HttpResolver_cleanUrl_11468685024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3076;

    public HttpResolver_cleanUrl_11468685024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3078 = new ArrayList();
        term3076 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver"));
        Object term3077 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver$4"));
        setField(term3077, term3077.getClass(), "this$0", term3076);
        setField(term3076, term3076.getClass(), "CONNECTION_CONFIGURATOR", term3077);
        setField(term3076, term3076.getClass(), "authenticationValues", term3078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        callMethod(klass, "cleanUrl", argTypes, term3076, args);
    }

};


