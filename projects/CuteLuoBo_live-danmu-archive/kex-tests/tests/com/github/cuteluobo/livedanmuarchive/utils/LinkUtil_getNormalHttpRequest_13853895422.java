package com.github.cuteluobo.livedanmuarchive.utils;

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
import static com.github.cuteluobo.livedanmuarchive.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LinkUtil_getNormalHttpRequest_13853895422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term995;

    public LinkUtil_getNormalHttpRequest_13853895422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term995 = newInstance(Class.forName("java.net.URI"));
        setField(term995, term995.getClass(), "scheme", "telnet");
        setField(term995, term995.getClass(), "fragment", null);
        setField(term995, term995.getClass(), "authority", "192.0.2.16:80");
        setField(term995, term995.getClass(), "userInfo", null);
        setField(term995, term995.getClass(), "host", "192.0.2.16");
        setIntField(term995, term995.getClass(), "port", 80);
        setField(term995, term995.getClass(), "path", "/");
        setField(term995, term995.getClass(), "query", null);
        setField(term995, term995.getClass(), "schemeSpecificPart", null);
        setIntField(term995, term995.getClass(), "hash", 0);
        setField(term995, term995.getClass(), "decodedUserInfo", null);
        setField(term995, term995.getClass(), "decodedAuthority", null);
        setField(term995, term995.getClass(), "decodedPath", null);
        setField(term995, term995.getClass(), "decodedQuery", null);
        setField(term995, term995.getClass(), "decodedFragment", null);
        setField(term995, term995.getClass(), "decodedSchemeSpecificPart", null);
        setField(term995, term995.getClass(), "string", "telnet://192.0.2.16:80/");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.LinkUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URI");
        Object[] args = new Object[1];
        args[0] = term995;
        callMethod(klass, "getNormalHttpRequest", argTypes, null, args);
    }

};


