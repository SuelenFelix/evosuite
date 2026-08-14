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

public class TokenParser_copyContent_18635637939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2192;

    public TokenParser_copyContent_18635637939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2192 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.TokenParser"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.TokenParser");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.utils.uri.CharArrayBuffer");
        argTypes[1] = Class.forName("com.getindata.connectors.http.internal.utils.uri.ParserCursor");
        argTypes[2] = Class.forName("java.util.BitSet");
        argTypes[3] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "copyContent", argTypes, term2192, args);
    }

};


