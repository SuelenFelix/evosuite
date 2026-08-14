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

public class TokenParser_skipWhiteSpace_12969993043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2113;
     Object term2114;
     Object term2124;

    public TokenParser_skipWhiteSpace_12969993043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2113 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.TokenParser"));
        term2114 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.CharArrayBuffer"));
        char[] term2115 = (char[]) newCharArray(7);
        setCharElement(term2115, 0, 'w');
        setCharElement(term2115, 1, 'D');
        setCharElement(term2115, 2, 'Y');
        setCharElement(term2115, 3, 'F');
        setCharElement(term2115, 4, 's');
        setCharElement(term2115, 5, 'j');
        setCharElement(term2115, 6, 'J');
        setField(term2114, term2114.getClass(), "buffer", term2115);
        setIntField(term2114, term2114.getClass(), "len", 1962444399);
        term2124 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.ParserCursor"));
        setIntField(term2124, term2124.getClass(), "lowerBound", 767834723);
        setIntField(term2124, term2124.getClass(), "upperBound", -602026508);
        setIntField(term2124, term2124.getClass(), "pos", -157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.TokenParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.utils.uri.CharArrayBuffer");
        argTypes[1] = Class.forName("com.getindata.connectors.http.internal.utils.uri.ParserCursor");
        Object[] args = new Object[2];
        args[0] = term2114;
        args[1] = term2124;
        callMethod(klass, "skipWhiteSpace", argTypes, term2113, args);
    }

};


