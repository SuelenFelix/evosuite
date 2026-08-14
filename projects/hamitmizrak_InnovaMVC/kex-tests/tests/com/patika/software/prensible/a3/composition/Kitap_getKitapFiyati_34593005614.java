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

public class Kitap_getKitapFiyati_34593005614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381;

    public Kitap_getKitapFiyati_34593005614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1381 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1381, term1381.getClass(), "kitapAdi", null);
        setField(term1381, term1381.getClass(), "kitapFiyati", null);
        setField(term1381, term1381.getClass(), "yazar", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Kitap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKitapFiyati", argTypes, term1381, args);
    }

};


