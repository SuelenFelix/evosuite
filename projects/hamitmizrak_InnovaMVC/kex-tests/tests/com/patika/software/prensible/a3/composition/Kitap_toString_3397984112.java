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
import java.lang.Object;
import java.util.ArrayList;

public class Kitap_toString_3397984112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586;

    public Kitap_toString_3397984112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term638 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term638, term638.getClass(), "kitapAdi", null);
        setField(term638, term638.getClass(), "kitapFiyati", null);
        setField(term638, term638.getClass(), "yazar", null);
        ArrayList term636 = new ArrayList();
        ((ArrayList) term636).add(term638);
        term586 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term611 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term586, term586.getClass(), "kitapAdi", "gUvcueTURF");
        setField(term586, term586.getClass(), "kitapFiyati", "EwQBhZjCIT");
        setField(term611, term611.getClass(), "yazarAdi", "aSkmSwTnEw");
        setField(term611, term611.getClass(), "yazarSoyadi", "xvkbvaEGYd");
        setField(term611, term611.getClass(), "kitapList", term636);
        setField(term586, term586.getClass(), "yazar", term611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Kitap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term586, args);
    }

};


