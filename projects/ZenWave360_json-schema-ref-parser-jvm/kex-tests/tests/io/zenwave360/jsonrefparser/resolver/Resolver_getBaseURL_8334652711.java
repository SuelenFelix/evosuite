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

public class Resolver_getBaseURL_8334652711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3532;

    public Resolver_getBaseURL_8334652711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3532 = newInstance(Class.forName("java.net.URL"));
        Object term3576 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term3532, term3532.getClass(), "protocol", "http");
        setField(term3532, term3532.getClass(), "host", "www.oracle.com");
        setIntField(term3532, term3532.getClass(), "port", -1);
        setField(term3532, term3532.getClass(), "file", "");
        setField(term3532, term3532.getClass(), "query", null);
        setField(term3532, term3532.getClass(), "authority", "www.oracle.com");
        setField(term3532, term3532.getClass(), "path", "");
        setField(term3532, term3532.getClass(), "userInfo", null);
        setField(term3532, term3532.getClass(), "ref", null);
        setField(term3532, term3532.getClass(), "hostAddress", null);
        setField(term3576, term3576.getClass(), "proxy", null);
        setIntField(term3576, term3576.getClass(), "proxyPort", -1);
        setField(term3532, term3532.getClass(), "handler", term3576);
        setField(term3532, term3532.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.resolver.Resolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term3532;
        callMethod(klass, "getBaseURL", argTypes, null, args);
    }

};


