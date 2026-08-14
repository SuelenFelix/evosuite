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

public class TokenParser_parseToken_6253529842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2095;
     Object term2096;
     Object term2101;
     Object term2105;

    public TokenParser_parseToken_6253529842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2095 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.TokenParser"));
        term2096 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.CharArrayBuffer"));
        char[] term2097 = (char[]) newCharArray(2);
        setCharElement(term2097, 0, 'l');
        setCharElement(term2097, 1, 'P');
        setField(term2096, term2096.getClass(), "buffer", term2097);
        setIntField(term2096, term2096.getClass(), "len", -1087774327);
        term2101 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.ParserCursor"));
        setIntField(term2101, term2101.getClass(), "lowerBound", -1530420153);
        setIntField(term2101, term2101.getClass(), "upperBound", -469968304);
        setIntField(term2101, term2101.getClass(), "pos", -1145578966);
        term2105 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2106 = (long[]) newLongArray(1);
        setField(term2105, term2105.getClass(), "words", term2106);
        setIntField(term2105, term2105.getClass(), "wordsInUse", 679763016);
        setBooleanField(term2105, term2105.getClass(), "sizeIsSticky", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.TokenParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.utils.uri.CharArrayBuffer");
        argTypes[1] = Class.forName("com.getindata.connectors.http.internal.utils.uri.ParserCursor");
        argTypes[2] = Class.forName("java.util.BitSet");
        Object[] args = new Object[3];
        args[0] = term2096;
        args[1] = term2101;
        args[2] = term2105;
        callMethod(klass, "parseToken", argTypes, term2095, args);
    }

};


