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

public class Yazar_setYazarAdi_18003964794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171;

    public Yazar_setYazarAdi_18003964794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term198 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term201 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term198, term198.getClass(), "kitapAdi", "");
        setField(term198, term198.getClass(), "kitapFiyati", "");
        setField(term201, term201.getClass(), "yazarAdi", null);
        setField(term201, term201.getClass(), "yazarSoyadi", null);
        setField(term201, term201.getClass(), "kitapList", null);
        setField(term198, term198.getClass(), "yazar", term201);
        Object term202 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term205 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term202, term202.getClass(), "kitapAdi", "");
        setField(term202, term202.getClass(), "kitapFiyati", "");
        setField(term205, term205.getClass(), "yazarAdi", null);
        setField(term205, term205.getClass(), "yazarSoyadi", null);
        setField(term205, term205.getClass(), "kitapList", null);
        setField(term202, term202.getClass(), "yazar", term205);
        Object term206 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term209 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term206, term206.getClass(), "kitapAdi", "");
        setField(term206, term206.getClass(), "kitapFiyati", "");
        setField(term209, term209.getClass(), "yazarAdi", null);
        setField(term209, term209.getClass(), "yazarSoyadi", null);
        setField(term209, term209.getClass(), "kitapList", null);
        setField(term206, term206.getClass(), "yazar", term209);
        Object term210 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term213 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term210, term210.getClass(), "kitapAdi", "");
        setField(term210, term210.getClass(), "kitapFiyati", "");
        setField(term213, term213.getClass(), "yazarAdi", null);
        setField(term213, term213.getClass(), "yazarSoyadi", null);
        setField(term213, term213.getClass(), "kitapList", null);
        setField(term210, term210.getClass(), "yazar", term213);
        ArrayList term196 = new ArrayList();
        ((ArrayList) term196).add(term198);
        ((ArrayList) term196).add(term202);
        ((ArrayList) term196).add(term202);
        ((ArrayList) term196).add(term206);
        ((ArrayList) term196).add(term210);
        term171 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term171, term171.getClass(), "yazarAdi", "fhkbdRViHi");
        setField(term171, term171.getClass(), "yazarSoyadi", "uWHnvSvaPl");
        setField(term171, term171.getClass(), "kitapList", term196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Yazar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        callMethod(klass, "setYazarAdi", argTypes, term171, args);
    }

};


