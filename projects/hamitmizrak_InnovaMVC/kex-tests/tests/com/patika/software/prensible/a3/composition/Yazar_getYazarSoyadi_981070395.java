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

public class Yazar_getYazarSoyadi_981070395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258;

    public Yazar_getYazarSoyadi_981070395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term285 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term288 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term285, term285.getClass(), "kitapAdi", "");
        setField(term285, term285.getClass(), "kitapFiyati", "");
        setField(term288, term288.getClass(), "yazarAdi", null);
        setField(term288, term288.getClass(), "yazarSoyadi", null);
        setField(term288, term288.getClass(), "kitapList", null);
        setField(term285, term285.getClass(), "yazar", term288);
        Object term289 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term292 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term289, term289.getClass(), "kitapAdi", "");
        setField(term289, term289.getClass(), "kitapFiyati", "");
        setField(term292, term292.getClass(), "yazarAdi", null);
        setField(term292, term292.getClass(), "yazarSoyadi", null);
        setField(term292, term292.getClass(), "kitapList", null);
        setField(term289, term289.getClass(), "yazar", term292);
        Object term293 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term296 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term293, term293.getClass(), "kitapAdi", "");
        setField(term293, term293.getClass(), "kitapFiyati", "");
        setField(term296, term296.getClass(), "yazarAdi", null);
        setField(term296, term296.getClass(), "yazarSoyadi", null);
        setField(term296, term296.getClass(), "kitapList", null);
        setField(term293, term293.getClass(), "yazar", term296);
        Object term297 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term300 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term297, term297.getClass(), "kitapAdi", "");
        setField(term297, term297.getClass(), "kitapFiyati", "");
        setField(term300, term300.getClass(), "yazarAdi", null);
        setField(term300, term300.getClass(), "yazarSoyadi", null);
        setField(term300, term300.getClass(), "kitapList", null);
        setField(term297, term297.getClass(), "yazar", term300);
        Object term301 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term304 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term301, term301.getClass(), "kitapAdi", "");
        setField(term301, term301.getClass(), "kitapFiyati", "");
        setField(term304, term304.getClass(), "yazarAdi", null);
        setField(term304, term304.getClass(), "yazarSoyadi", null);
        setField(term304, term304.getClass(), "kitapList", null);
        setField(term301, term301.getClass(), "yazar", term304);
        Object term305 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term308 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term305, term305.getClass(), "kitapAdi", "");
        setField(term305, term305.getClass(), "kitapFiyati", "");
        setField(term308, term308.getClass(), "yazarAdi", null);
        setField(term308, term308.getClass(), "yazarSoyadi", null);
        setField(term308, term308.getClass(), "kitapList", null);
        setField(term305, term305.getClass(), "yazar", term308);
        ArrayList term283 = new ArrayList();
        ((ArrayList) term283).add(term285);
        ((ArrayList) term283).add(term289);
        ((ArrayList) term283).add(term293);
        ((ArrayList) term283).add(term297);
        ((ArrayList) term283).add(term301);
        ((ArrayList) term283).add(term305);
        ((ArrayList) term283).add(term289);
        ((ArrayList) term283).add(term297);
        term258 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term258, term258.getClass(), "yazarAdi", "BKLfkLiZTH");
        setField(term258, term258.getClass(), "yazarSoyadi", "SPpkrGcPRr");
        setField(term258, term258.getClass(), "kitapList", term283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Yazar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYazarSoyadi", argTypes, term258, args);
    }

};


