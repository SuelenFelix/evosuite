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
import java.util.LinkedList;

public class HttpResolver_downloadUrlToString_9584957113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3045;
     Object term3063;

    public HttpResolver_downloadUrlToString_9584957113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3047 = new ArrayList();
        term3045 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver"));
        Object term3046 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver$4"));
        setField(term3046, term3046.getClass(), "this$0", term3045);
        setField(term3045, term3045.getClass(), "CONNECTION_CONFIGURATOR", term3046);
        setField(term3045, term3045.getClass(), "authenticationValues", term3047);
        term3063 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "hRNSzYYIrc";
        args[1] = term3063;
        callMethod(klass, "downloadUrlToString", argTypes, term3045, args);
    }

};


