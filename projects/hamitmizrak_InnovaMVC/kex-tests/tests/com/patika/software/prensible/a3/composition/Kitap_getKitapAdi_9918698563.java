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

public class Kitap_getKitapAdi_9918698563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681;

    public Kitap_getKitapAdi_9918698563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term733 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term733, term733.getClass(), "kitapAdi", null);
        setField(term733, term733.getClass(), "kitapFiyati", null);
        setField(term733, term733.getClass(), "yazar", null);
        Object term734 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term734, term734.getClass(), "kitapAdi", null);
        setField(term734, term734.getClass(), "kitapFiyati", null);
        setField(term734, term734.getClass(), "yazar", null);
        ArrayList term731 = new ArrayList();
        ((ArrayList) term731).add(term733);
        ((ArrayList) term731).add(term734);
        term681 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term706 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term681, term681.getClass(), "kitapAdi", "CKWpJaaaxX");
        setField(term681, term681.getClass(), "kitapFiyati", "UBRmXJmfrt");
        setField(term706, term706.getClass(), "yazarAdi", "WZzvmIHhzZ");
        setField(term706, term706.getClass(), "yazarSoyadi", "doQLHkjpNm");
        setField(term706, term706.getClass(), "kitapList", term731);
        setField(term681, term681.getClass(), "yazar", term706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Kitap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKitapAdi", argTypes, term681, args);
    }

};


