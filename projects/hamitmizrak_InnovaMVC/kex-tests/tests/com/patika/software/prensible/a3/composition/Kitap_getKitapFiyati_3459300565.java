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

public class Kitap_getKitapFiyati_3459300565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term898;

    public Kitap_getKitapFiyati_3459300565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term948 = new ArrayList();
        term898 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term923 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term898, term898.getClass(), "kitapAdi", "TXZAIPQJHt");
        setField(term898, term898.getClass(), "kitapFiyati", "DIbeDHICho");
        setField(term923, term923.getClass(), "yazarAdi", "dJGPlmSRnz");
        setField(term923, term923.getClass(), "yazarSoyadi", "DPskuFUobI");
        setField(term923, term923.getClass(), "kitapList", term948);
        setField(term898, term898.getClass(), "yazar", term923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Kitap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKitapFiyati", argTypes, term898, args);
    }

};


