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
import java.lang.Integer;

public class CharArrayBuffer_subSequence_10233915474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term67;
     Object term69;

    public CharArrayBuffer_subSequence_10233915474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.CharArrayBuffer"));
        char[] term61 = (char[]) newCharArray(4);
        setCharElement(term61, 0, 'l');
        setCharElement(term61, 1, 'J');
        setCharElement(term61, 2, 'A');
        setCharElement(term61, 3, 'E');
        setField(term60, term60.getClass(), "buffer", term61);
        setIntField(term60, term60.getClass(), "len", -616727354);
        term67 = new Integer(-1955890973);
        term69 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.CharArrayBuffer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term67;
        args[1] = term69;
        callMethod(klass, "subSequence", argTypes, term60, args);
    }

};


