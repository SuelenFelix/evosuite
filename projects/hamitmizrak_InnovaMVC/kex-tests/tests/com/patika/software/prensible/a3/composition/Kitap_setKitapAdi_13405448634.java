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

public class Kitap_setKitapAdi_13405448634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777;

    public Kitap_setKitapAdi_13405448634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term829 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term829, term829.getClass(), "kitapAdi", null);
        setField(term829, term829.getClass(), "kitapFiyati", null);
        setField(term829, term829.getClass(), "yazar", null);
        Object term830 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term830, term830.getClass(), "kitapAdi", null);
        setField(term830, term830.getClass(), "kitapFiyati", null);
        setField(term830, term830.getClass(), "yazar", null);
        Object term831 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term831, term831.getClass(), "kitapAdi", null);
        setField(term831, term831.getClass(), "kitapFiyati", null);
        setField(term831, term831.getClass(), "yazar", null);
        Object term832 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term832, term832.getClass(), "kitapAdi", null);
        setField(term832, term832.getClass(), "kitapFiyati", null);
        setField(term832, term832.getClass(), "yazar", null);
        Object term833 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term833, term833.getClass(), "kitapAdi", null);
        setField(term833, term833.getClass(), "kitapFiyati", null);
        setField(term833, term833.getClass(), "yazar", null);
        ArrayList term827 = new ArrayList();
        ((ArrayList) term827).add(term829);
        ((ArrayList) term827).add(term830);
        ((ArrayList) term827).add(term830);
        ((ArrayList) term827).add(term831);
        ((ArrayList) term827).add(term832);
        ((ArrayList) term827).add(term830);
        ((ArrayList) term827).add(term833);
        term777 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term802 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term777, term777.getClass(), "kitapAdi", "GBOEuByOfr");
        setField(term777, term777.getClass(), "kitapFiyati", "NHbOFFjyVK");
        setField(term802, term802.getClass(), "yazarAdi", "zaloBqlrSo");
        setField(term802, term802.getClass(), "yazarSoyadi", "vvoLrMGCoN");
        setField(term802, term802.getClass(), "kitapList", term827);
        setField(term777, term777.getClass(), "yazar", term802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Kitap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EKjQdtKxAM";
        callMethod(klass, "setKitapAdi", argTypes, term777, args);
    }

};


