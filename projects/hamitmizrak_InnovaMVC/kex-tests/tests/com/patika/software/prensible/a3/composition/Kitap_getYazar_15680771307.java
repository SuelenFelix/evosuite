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

public class Kitap_getYazar_15680771307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1111;

    public Kitap_getYazar_15680771307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1163 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1163, term1163.getClass(), "kitapAdi", null);
        setField(term1163, term1163.getClass(), "kitapFiyati", null);
        setField(term1163, term1163.getClass(), "yazar", null);
        Object term1164 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1164, term1164.getClass(), "kitapAdi", null);
        setField(term1164, term1164.getClass(), "kitapFiyati", null);
        setField(term1164, term1164.getClass(), "yazar", null);
        Object term1165 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1165, term1165.getClass(), "kitapAdi", null);
        setField(term1165, term1165.getClass(), "kitapFiyati", null);
        setField(term1165, term1165.getClass(), "yazar", null);
        Object term1166 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1166, term1166.getClass(), "kitapAdi", null);
        setField(term1166, term1166.getClass(), "kitapFiyati", null);
        setField(term1166, term1166.getClass(), "yazar", null);
        ArrayList term1161 = new ArrayList();
        ((ArrayList) term1161).add(term1163);
        ((ArrayList) term1161).add(term1164);
        ((ArrayList) term1161).add(term1165);
        ((ArrayList) term1161).add(term1166);
        term1111 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term1136 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term1111, term1111.getClass(), "kitapAdi", "RDnkgWkcbz");
        setField(term1111, term1111.getClass(), "kitapFiyati", "IBpaxltauX");
        setField(term1136, term1136.getClass(), "yazarAdi", "hePqROaplw");
        setField(term1136, term1136.getClass(), "yazarSoyadi", "PJcSNDruWd");
        setField(term1136, term1136.getClass(), "kitapList", term1161);
        setField(term1111, term1111.getClass(), "yazar", term1136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Kitap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYazar", argTypes, term1111, args);
    }

};


