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

public class Yazar_getKitapList_19272919197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414;

    public Yazar_getKitapList_19272919197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term441 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term444 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term441, term441.getClass(), "kitapAdi", "");
        setField(term441, term441.getClass(), "kitapFiyati", "");
        setField(term444, term444.getClass(), "yazarAdi", null);
        setField(term444, term444.getClass(), "yazarSoyadi", null);
        setField(term444, term444.getClass(), "kitapList", null);
        setField(term441, term441.getClass(), "yazar", term444);
        Object term445 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term448 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term445, term445.getClass(), "kitapAdi", "");
        setField(term445, term445.getClass(), "kitapFiyati", "");
        setField(term448, term448.getClass(), "yazarAdi", null);
        setField(term448, term448.getClass(), "yazarSoyadi", null);
        setField(term448, term448.getClass(), "kitapList", null);
        setField(term445, term445.getClass(), "yazar", term448);
        ArrayList term439 = new ArrayList();
        ((ArrayList) term439).add(term441);
        ((ArrayList) term439).add(term445);
        term414 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term414, term414.getClass(), "yazarAdi", "BRIVNtfUWU");
        setField(term414, term414.getClass(), "yazarSoyadi", "DbiCVtPPCT");
        setField(term414, term414.getClass(), "kitapList", term439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Yazar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKitapList", argTypes, term414, args);
    }

};


