package com.getindata.connectors.http.internal.utils.uri;

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
import static com.getindata.connectors.http.internal.utils.uri.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class URIBuilder_init_19028179381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690;

    public URIBuilder_init_19028179381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term690 = newInstance(Class.forName("java.net.URI"));
        setField(term690, term690.getClass(), "scheme", "telnet");
        setField(term690, term690.getClass(), "fragment", null);
        setField(term690, term690.getClass(), "authority", "192.0.2.16:80");
        setField(term690, term690.getClass(), "userInfo", null);
        setField(term690, term690.getClass(), "host", "192.0.2.16");
        setIntField(term690, term690.getClass(), "port", 80);
        setField(term690, term690.getClass(), "path", "/");
        setField(term690, term690.getClass(), "query", null);
        setField(term690, term690.getClass(), "schemeSpecificPart", null);
        setIntField(term690, term690.getClass(), "hash", 0);
        setField(term690, term690.getClass(), "decodedUserInfo", null);
        setField(term690, term690.getClass(), "decodedAuthority", null);
        setField(term690, term690.getClass(), "decodedPath", null);
        setField(term690, term690.getClass(), "decodedQuery", null);
        setField(term690, term690.getClass(), "decodedFragment", null);
        setField(term690, term690.getClass(), "decodedSchemeSpecificPart", null);
        setField(term690, term690.getClass(), "string", "telnet://192.0.2.16:80/");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URI");
        Object[] args = new Object[1];
        args[0] = term690;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


