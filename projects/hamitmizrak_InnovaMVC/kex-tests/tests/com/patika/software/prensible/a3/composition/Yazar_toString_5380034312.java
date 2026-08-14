package com.patika.software.prensible.a3.composition;

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
import static com.patika.software.prensible.a3.composition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Yazar_toString_5380034312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536;

    public Yazar_toString_5380034312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term536, term536.getClass(), "yazarAdi", null);
        setField(term536, term536.getClass(), "yazarSoyadi", null);
        setField(term536, term536.getClass(), "kitapList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Yazar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term536, args);
    }

};


