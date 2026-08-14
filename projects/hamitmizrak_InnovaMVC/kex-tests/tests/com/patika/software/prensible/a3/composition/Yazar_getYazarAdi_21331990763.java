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

public class Yazar_getYazarAdi_21331990763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;

    public Yazar_getYazarAdi_21331990763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term141 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term144 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term141, term141.getClass(), "kitapAdi", "");
        setField(term141, term141.getClass(), "kitapFiyati", "");
        setField(term144, term144.getClass(), "yazarAdi", null);
        setField(term144, term144.getClass(), "yazarSoyadi", null);
        setField(term144, term144.getClass(), "kitapList", null);
        setField(term141, term141.getClass(), "yazar", term144);
        Object term145 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term148 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term145, term145.getClass(), "kitapAdi", "");
        setField(term145, term145.getClass(), "kitapFiyati", "");
        setField(term148, term148.getClass(), "yazarAdi", null);
        setField(term148, term148.getClass(), "yazarSoyadi", null);
        setField(term148, term148.getClass(), "kitapList", null);
        setField(term145, term145.getClass(), "yazar", term148);
        ArrayList term139 = new ArrayList();
        ((ArrayList) term139).add(term141);
        ((ArrayList) term139).add(term145);
        term114 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term114, term114.getClass(), "yazarAdi", "kuTXqwMtDB");
        setField(term114, term114.getClass(), "yazarSoyadi", "Ghbwtircqb");
        setField(term114, term114.getClass(), "kitapList", term139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Yazar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYazarAdi", argTypes, term114, args);
    }

};


