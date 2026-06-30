package com.sachett.samosa.samosac.symbol;

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
import static com.sachett.samosa.samosac.symbol.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class StringSymbol_init_5455471210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12413;
     Object term12415;
     Object term12429;
     Object term12431;
     Object term12433;

    public StringSymbol_init_5455471210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12413 = new Integer(91958879);
        term12415 = new Boolean(false);
        term12429 = new Boolean(true);
        term12431 = new Boolean(true);
        Integer term12434 = new Integer(1622346318);
        Integer term12436 = new Integer(1048535127);
        term12433 = newInstance(Class.forName("kotlin.Pair"));
        setField(term12433, term12433.getClass(), "first", term12434);
        setField(term12433, term12433.getClass(), "second", term12436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("kotlin.Pair");
        Object[] args = new Object[7];
        args[0] = "bxrCBbrrct";
        args[1] = term12413;
        args[2] = term12415;
        args[3] = "CKWpJaaaxX";
        args[4] = term12429;
        args[5] = term12431;
        args[6] = term12433;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


