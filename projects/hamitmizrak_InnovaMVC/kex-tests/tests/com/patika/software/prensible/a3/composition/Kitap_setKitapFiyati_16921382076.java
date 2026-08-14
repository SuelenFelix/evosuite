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

public class Kitap_setKitapFiyati_16921382076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term992;

    public Kitap_setKitapFiyati_16921382076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1044 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1044, term1044.getClass(), "kitapAdi", null);
        setField(term1044, term1044.getClass(), "kitapFiyati", null);
        setField(term1044, term1044.getClass(), "yazar", null);
        Object term1045 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1045, term1045.getClass(), "kitapAdi", null);
        setField(term1045, term1045.getClass(), "kitapFiyati", null);
        setField(term1045, term1045.getClass(), "yazar", null);
        Object term1046 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1046, term1046.getClass(), "kitapAdi", null);
        setField(term1046, term1046.getClass(), "kitapFiyati", null);
        setField(term1046, term1046.getClass(), "yazar", null);
        ArrayList term1042 = new ArrayList();
        ((ArrayList) term1042).add(term1044);
        ((ArrayList) term1042).add(term1045);
        ((ArrayList) term1042).add(term1046);
        ((ArrayList) term1042).add(term1044);
        term992 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term1017 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term992, term992.getClass(), "kitapAdi", "wBGfLpNNiZ");
        setField(term992, term992.getClass(), "kitapFiyati", "yUGCjlqgJE");
        setField(term1017, term1017.getClass(), "yazarAdi", "PXdVZyoJyC");
        setField(term1017, term1017.getClass(), "yazarSoyadi", "vLerpqavFM");
        setField(term1017, term1017.getClass(), "kitapList", term1042);
        setField(term992, term992.getClass(), "yazar", term1017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Kitap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HwLHeGLyhe";
        callMethod(klass, "setKitapFiyati", argTypes, term992, args);
    }

};


