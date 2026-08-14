package com.getindata.connectors.http.internal.utils;

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
import static com.getindata.connectors.http.internal.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProxyConfig_1_getPasswordAuthentication_19747395431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2396;

    public ProxyConfig_1_getPasswordAuthentication_19747395431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2396 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.ProxyConfig$1"));
        Object term2409 = newInstance(Class.forName("java.util.Optional"));
        Object term2422 = newInstance(Class.forName("java.net.InetAddress"));
        Object term2423 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        Object term2475 = newInstance(Class.forName("java.net.URL"));
        Object term2519 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        Object term2521 = newInstance(Class.forName("java.net.Authenticator$RequestorType"));
        setField(term2396, term2396.getClass(), "val$host", "AWRooQKkdW");
        setField(term2409, term2409.getClass(), "value", null);
        setField(term2396, term2396.getClass(), "val$proxyUsername", term2409);
        setField(term2396, term2396.getClass(), "val$proxyPassword", term2409);
        setField(term2396, term2396.getClass(), "this$0", null);
        setField(term2396, term2396.getClass(), "requestingHost", "vjxIhXHxGR");
        setField(term2423, term2423.getClass(), "originalHostName", null);
        setField(term2423, term2423.getClass(), "hostName", null);
        setIntField(term2423, term2423.getClass(), "address", 0);
        setIntField(term2423, term2423.getClass(), "family", 0);
        setField(term2422, term2422.getClass(), "holder", term2423);
        setField(term2422, term2422.getClass(), "canonicalHostName", "QXzGXbEXMu");
        setField(term2396, term2396.getClass(), "requestingSite", term2422);
        setIntField(term2396, term2396.getClass(), "requestingPort", 1876565163);
        setField(term2396, term2396.getClass(), "requestingProtocol", "ZVecLZMLHF");
        setField(term2396, term2396.getClass(), "requestingPrompt", "fztQhjqwdP");
        setField(term2396, term2396.getClass(), "requestingScheme", "eVpkWxjuki");
        setField(term2475, term2475.getClass(), "protocol", "http");
        setField(term2475, term2475.getClass(), "host", "www.oracle.com");
        setIntField(term2475, term2475.getClass(), "port", -1);
        setField(term2475, term2475.getClass(), "file", "");
        setField(term2475, term2475.getClass(), "query", null);
        setField(term2475, term2475.getClass(), "authority", "www.oracle.com");
        setField(term2475, term2475.getClass(), "path", "");
        setField(term2475, term2475.getClass(), "userInfo", null);
        setField(term2475, term2475.getClass(), "ref", null);
        setField(term2475, term2475.getClass(), "hostAddress", null);
        setField(term2519, term2519.getClass(), "proxy", null);
        setIntField(term2519, term2519.getClass(), "proxyPort", -1);
        setField(term2475, term2475.getClass(), "handler", term2519);
        setField(term2475, term2475.getClass(), "tempState", null);
        setField(term2396, term2396.getClass(), "requestingURL", term2475);
        setField(term2521, term2521.getClass(), "name", "PROXY");
        setIntField(term2521, term2521.getClass(), "ordinal", 0);
        setField(term2396, term2396.getClass(), "requestingAuthType", term2521);
        setField(term2396, term2396.getClass(), "key", "SJiQaLvSKv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.ProxyConfig$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordAuthentication", argTypes, term2396, args);
    }

};


