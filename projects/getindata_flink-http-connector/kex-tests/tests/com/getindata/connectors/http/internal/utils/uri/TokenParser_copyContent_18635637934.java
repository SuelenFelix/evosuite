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

public class TokenParser_copyContent_18635637934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2135;
     Object term2136;
     Object term2140;
     Object term2144;
     Object term2149;

    public TokenParser_copyContent_18635637934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2135 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.TokenParser"));
        term2136 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.CharArrayBuffer"));
        char[] term2137 = (char[]) newCharArray(1);
        setCharElement(term2137, 0, 'C');
        setField(term2136, term2136.getClass(), "buffer", term2137);
        setIntField(term2136, term2136.getClass(), "len", 1876565163);
        term2140 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.ParserCursor"));
        setIntField(term2140, term2140.getClass(), "lowerBound", -817164822);
        setIntField(term2140, term2140.getClass(), "upperBound", -1016503459);
        setIntField(term2140, term2140.getClass(), "pos", -1968847291);
        term2144 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2145 = (long[]) newLongArray(1);
        setField(term2144, term2144.getClass(), "words", term2145);
        setIntField(term2144, term2144.getClass(), "wordsInUse", 579005622);
        setBooleanField(term2144, term2144.getClass(), "sizeIsSticky", true);
        term2149 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2150 = (byte[]) newByteArray(16);
        setField(term2149, term2149.getClass(), "value", term2150);
        setByteField(term2149, term2149.getClass(), "coder", (byte) 47);
        setIntField(term2149, term2149.getClass(), "count", -14890619);
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
        args[0] = term2136;
        args[1] = term2140;
        args[2] = term2144;
        args[3] = term2149;
        callMethod(klass, "copyContent", argTypes, term2135, args);
    }

};


