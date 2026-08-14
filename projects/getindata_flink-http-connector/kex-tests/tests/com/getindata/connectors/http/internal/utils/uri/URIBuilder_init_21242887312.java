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

public class URIBuilder_init_21242887312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;

    public URIBuilder_init_21242887312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809 = newInstance(Class.forName("java.net.URI"));
        setField(term809, term809.getClass(), "scheme", "mailto");
        setField(term809, term809.getClass(), "fragment", null);
        setField(term809, term809.getClass(), "authority", null);
        setField(term809, term809.getClass(), "userInfo", null);
        setField(term809, term809.getClass(), "host", null);
        setIntField(term809, term809.getClass(), "port", -1);
        setField(term809, term809.getClass(), "path", null);
        setField(term809, term809.getClass(), "query", null);
        setField(term809, term809.getClass(), "schemeSpecificPart", "John.Doe@example.com");
        setIntField(term809, term809.getClass(), "hash", 0);
        setField(term809, term809.getClass(), "decodedUserInfo", null);
        setField(term809, term809.getClass(), "decodedAuthority", null);
        setField(term809, term809.getClass(), "decodedPath", null);
        setField(term809, term809.getClass(), "decodedQuery", null);
        setField(term809, term809.getClass(), "decodedFragment", null);
        setField(term809, term809.getClass(), "decodedSchemeSpecificPart", null);
        setField(term809, term809.getClass(), "string", "mailto:John.Doe@example.com");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URIBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URI");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = term809;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


