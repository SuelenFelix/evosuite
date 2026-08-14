package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.LinkedList;

public class Book_init_9274753601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7242;
     Object term7267;
     Object term7281;
     Object term7284;
     Object term7287;
     Object term7312;
     Object term7337;
     Object term7386;

    public Book_init_9274753601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7242 = newInstance(Class.forName("com.acme.types.Genre"));
        setField(term7242, term7242.getClass(), "id", "NInWPlYtwe");
        setField(term7242, term7242.getClass(), "name", "qVYRtrgZJt");
        term7267 = new Integer(197109649);
        term7281 = new LinkedList();
        term7284 = new LinkedList();
        term7287 = newInstance(Class.forName("com.acme.types.Lang"));
        setField(term7287, term7287.getClass(), "id", "fwAMmjMsDq");
        setField(term7287, term7287.getClass(), "name", "aqdKzesECj");
        term7312 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        setField(term7312, term7312.getClass(), "id", "voSygcVEYO");
        setField(term7312, term7312.getClass(), "formatName", "LfcceVKtWg");
        term7337 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term7337, term7337.getClass(), "id", "CNkueZBdYF");
        setField(term7337, term7337.getClass(), "smallUrl", "ZAjjJEUomV");
        setField(term7337, term7337.getClass(), "mediumUrl", "cHwZbezfEu");
        setField(term7337, term7337.getClass(), "largeUrl", "GuQzOBxsNv");
        term7386 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[13];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.acme.types.Genre");
        argTypes[5] = Class.forName("java.lang.Integer");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.util.List");
        argTypes[8] = Class.forName("java.util.List");
        argTypes[9] = Class.forName("com.acme.types.Lang");
        argTypes[10] = Class.forName("com.acme.types.PublishingFormat");
        argTypes[11] = Class.forName("com.acme.types.Cover");
        argTypes[12] = Class.forName("java.util.List");
        Object[] args = new Object[13];
        args[0] = "cXTrsrxYFN";
        args[1] = "pEUndHGBiE";
        args[2] = "PCzKLiLqoO";
        args[3] = "JuYhKUgElF";
        args[4] = term7242;
        args[5] = term7267;
        args[6] = "PCttFvFDzJ";
        args[7] = term7281;
        args[8] = term7284;
        args[9] = term7287;
        args[10] = term7312;
        args[11] = term7337;
        args[12] = term7386;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


