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

public class Yazar_setYazarSoyadi_19526579586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331;

    public Yazar_setYazarSoyadi_19526579586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term358 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term361 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term358, term358.getClass(), "kitapAdi", "");
        setField(term358, term358.getClass(), "kitapFiyati", "");
        setField(term361, term361.getClass(), "yazarAdi", null);
        setField(term361, term361.getClass(), "yazarSoyadi", null);
        setField(term361, term361.getClass(), "kitapList", null);
        setField(term358, term358.getClass(), "yazar", term361);
        Object term362 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term365 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term362, term362.getClass(), "kitapAdi", "");
        setField(term362, term362.getClass(), "kitapFiyati", "");
        setField(term365, term365.getClass(), "yazarAdi", null);
        setField(term365, term365.getClass(), "yazarSoyadi", null);
        setField(term365, term365.getClass(), "kitapList", null);
        setField(term362, term362.getClass(), "yazar", term365);
        Object term366 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term369 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term366, term366.getClass(), "kitapAdi", "");
        setField(term366, term366.getClass(), "kitapFiyati", "");
        setField(term369, term369.getClass(), "yazarAdi", null);
        setField(term369, term369.getClass(), "yazarSoyadi", null);
        setField(term369, term369.getClass(), "kitapList", null);
        setField(term366, term366.getClass(), "yazar", term369);
        ArrayList term356 = new ArrayList();
        ((ArrayList) term356).add(term358);
        ((ArrayList) term356).add(term362);
        ((ArrayList) term356).add(term366);
        term331 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term331, term331.getClass(), "yazarAdi", "SdCKLMIYnX");
        setField(term331, term331.getClass(), "yazarSoyadi", "OJJtVNPyKZ");
        setField(term331, term331.getClass(), "kitapList", term356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Yazar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aWYOWZFyaX";
        callMethod(klass, "setYazarSoyadi", argTypes, term331, args);
    }

};


