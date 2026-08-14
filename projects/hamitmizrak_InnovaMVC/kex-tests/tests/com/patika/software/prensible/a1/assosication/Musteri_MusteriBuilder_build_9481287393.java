package com.patika.software.prensible.a1.assosication;

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
import static com.patika.software.prensible.a1.assosication.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Musteri_MusteriBuilder_build_9481287393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654;

    public Musteri_MusteriBuilder_build_9481287393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term654 = newInstance(Class.forName("com.patika.software.prensible.a1.assosication.Musteri$MusteriBuilder"));
        setField(term654, term654.getClass(), "musteriAdi", "TEParAifyi");
        setField(term654, term654.getClass(), "musteriSehir", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a1.assosication.Musteri$MusteriBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term654, args);
    }

};


