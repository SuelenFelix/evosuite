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

public class HttpResolver_3_init_8030837760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10028;

    public HttpResolver_3_init_8030837760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10030 = new ArrayList();
        term10028 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver"));
        Object term10029 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver$4"));
        setField(term10029, term10029.getClass(), "this$0", term10028);
        setField(term10028, term10028.getClass(), "CONNECTION_CONFIGURATOR", term10029);
        setField(term10028, term10028.getClass(), "authenticationValues", term10030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver$3");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver");
        argTypes[1] = Class.forName("javax.net.ssl.SSLSocketFactory");
        argTypes[2] = Class.forName("javax.net.ssl.HostnameVerifier");
        Object[] args = new Object[3];
        args[0] = term10028;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


