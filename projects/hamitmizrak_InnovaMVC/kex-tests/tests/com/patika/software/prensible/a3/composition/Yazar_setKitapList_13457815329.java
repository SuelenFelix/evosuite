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

public class Yazar_setKitapList_13457815329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472;
     Object term513;

    public Yazar_setKitapList_13457815329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term499 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term502 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term499, term499.getClass(), "kitapAdi", "");
        setField(term499, term499.getClass(), "kitapFiyati", "");
        setField(term502, term502.getClass(), "yazarAdi", null);
        setField(term502, term502.getClass(), "yazarSoyadi", null);
        setField(term502, term502.getClass(), "kitapList", null);
        setField(term499, term499.getClass(), "yazar", term502);
        Object term503 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term506 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term503, term503.getClass(), "kitapAdi", "");
        setField(term503, term503.getClass(), "kitapFiyati", "");
        setField(term506, term506.getClass(), "yazarAdi", null);
        setField(term506, term506.getClass(), "yazarSoyadi", null);
        setField(term506, term506.getClass(), "kitapList", null);
        setField(term503, term503.getClass(), "yazar", term506);
        Object term507 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term510 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term507, term507.getClass(), "kitapAdi", "");
        setField(term507, term507.getClass(), "kitapFiyati", "");
        setField(term510, term510.getClass(), "yazarAdi", null);
        setField(term510, term510.getClass(), "yazarSoyadi", null);
        setField(term510, term510.getClass(), "kitapList", null);
        setField(term507, term507.getClass(), "yazar", term510);
        ArrayList term497 = new ArrayList();
        ((ArrayList) term497).add(term499);
        ((ArrayList) term497).add(term503);
        ((ArrayList) term497).add(term507);
        term472 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term472, term472.getClass(), "yazarAdi", "OqbwYQfvAe");
        setField(term472, term472.getClass(), "yazarSoyadi", "tRxZafjqIx");
        setField(term472, term472.getClass(), "kitapList", term497);
        term513 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Yazar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term513;
        callMethod(klass, "setKitapList", argTypes, term472, args);
    }

};


