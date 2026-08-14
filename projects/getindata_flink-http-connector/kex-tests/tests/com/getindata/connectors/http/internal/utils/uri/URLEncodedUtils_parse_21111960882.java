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

public class URLEncodedUtils_parse_21111960882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;
     Object term146;

    public URLEncodedUtils_parse_21111960882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.CharArrayBuffer"));
        char[] term142 = (char[]) newCharArray(2);
        setCharElement(term142, 0, 'c');
        setCharElement(term142, 1, 'g');
        setField(term141, term141.getClass(), "buffer", term142);
        setIntField(term141, term141.getClass(), "len", -522618178);
        term146 = (char[]) newCharArray(6);
        setCharElement(term146, 0, 'Q');
        setCharElement(term146, 1, 'H');
        setCharElement(term146, 2, 'g');
        setCharElement(term146, 3, 'q');
        setCharElement(term146, 4, 'z');
        setCharElement(term146, 5, 'x');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.URLEncodedUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.utils.uri.CharArrayBuffer");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        argTypes[2] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term141;
        args[1] = null;
        args[2] = term146;
        callMethod(klass, "parse", argTypes, null, args);
    }

};


