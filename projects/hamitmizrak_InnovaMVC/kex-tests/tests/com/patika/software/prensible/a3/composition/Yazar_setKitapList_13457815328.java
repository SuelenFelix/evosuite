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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Yazar_setKitapList_13457815328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;
     Object term512;

    public Yazar_setKitapList_13457815328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term498 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term501 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term498, term498.getClass(), "kitapAdi", "");
        setField(term498, term498.getClass(), "kitapFiyati", "");
        setField(term501, term501.getClass(), "yazarAdi", null);
        setField(term501, term501.getClass(), "yazarSoyadi", null);
        setField(term501, term501.getClass(), "kitapList", null);
        setField(term498, term498.getClass(), "yazar", term501);
        Object term502 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term505 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term502, term502.getClass(), "kitapAdi", "");
        setField(term502, term502.getClass(), "kitapFiyati", "");
        setField(term505, term505.getClass(), "yazarAdi", null);
        setField(term505, term505.getClass(), "yazarSoyadi", null);
        setField(term505, term505.getClass(), "kitapList", null);
        setField(term502, term502.getClass(), "yazar", term505);
        Object term506 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term509 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term506, term506.getClass(), "kitapAdi", "");
        setField(term506, term506.getClass(), "kitapFiyati", "");
        setField(term509, term509.getClass(), "yazarAdi", null);
        setField(term509, term509.getClass(), "yazarSoyadi", null);
        setField(term509, term509.getClass(), "kitapList", null);
        setField(term506, term506.getClass(), "yazar", term509);
        ArrayList term496 = new ArrayList();
        ((ArrayList) term496).add(term498);
        ((ArrayList) term496).add(term502);
        ((ArrayList) term496).add(term506);
        term471 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term471, term471.getClass(), "yazarAdi", "OqbwYQfvAe");
        setField(term471, term471.getClass(), "yazarSoyadi", "tRxZafjqIx");
        setField(term471, term471.getClass(), "kitapList", term496);
        term512 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Yazar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term512;
        callMethod(klass, "setKitapList", argTypes, term471, args);
    }

};


