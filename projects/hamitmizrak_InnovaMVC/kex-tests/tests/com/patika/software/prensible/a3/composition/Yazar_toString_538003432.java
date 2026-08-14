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

public class Yazar_toString_538003432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public Yazar_toString_538003432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term75 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term72, term72.getClass(), "kitapAdi", "");
        setField(term72, term72.getClass(), "kitapFiyati", "");
        setField(term75, term75.getClass(), "yazarAdi", null);
        setField(term75, term75.getClass(), "yazarSoyadi", null);
        setField(term75, term75.getClass(), "kitapList", null);
        setField(term72, term72.getClass(), "yazar", term75);
        Object term76 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term79 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term76, term76.getClass(), "kitapAdi", "");
        setField(term76, term76.getClass(), "kitapFiyati", "");
        setField(term79, term79.getClass(), "yazarAdi", null);
        setField(term79, term79.getClass(), "yazarSoyadi", null);
        setField(term79, term79.getClass(), "kitapList", null);
        setField(term76, term76.getClass(), "yazar", term79);
        Object term80 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term83 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term80, term80.getClass(), "kitapAdi", "");
        setField(term80, term80.getClass(), "kitapFiyati", "");
        setField(term83, term83.getClass(), "yazarAdi", null);
        setField(term83, term83.getClass(), "yazarSoyadi", null);
        setField(term83, term83.getClass(), "kitapList", null);
        setField(term80, term80.getClass(), "yazar", term83);
        Object term84 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term87 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term84, term84.getClass(), "kitapAdi", "");
        setField(term84, term84.getClass(), "kitapFiyati", "");
        setField(term87, term87.getClass(), "yazarAdi", null);
        setField(term87, term87.getClass(), "yazarSoyadi", null);
        setField(term87, term87.getClass(), "kitapList", null);
        setField(term84, term84.getClass(), "yazar", term87);
        Object term88 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term91 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term88, term88.getClass(), "kitapAdi", "");
        setField(term88, term88.getClass(), "kitapFiyati", "");
        setField(term91, term91.getClass(), "yazarAdi", null);
        setField(term91, term91.getClass(), "yazarSoyadi", null);
        setField(term91, term91.getClass(), "kitapList", null);
        setField(term88, term88.getClass(), "yazar", term91);
        ArrayList term70 = new ArrayList();
        ((ArrayList) term70).add(term72);
        ((ArrayList) term70).add(term76);
        ((ArrayList) term70).add(term80);
        ((ArrayList) term70).add(term84);
        ((ArrayList) term70).add(term88);
        term45 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term45, term45.getClass(), "yazarAdi", "MuLcgQHgqz");
        setField(term45, term45.getClass(), "yazarSoyadi", "xxtlPwDYFs");
        setField(term45, term45.getClass(), "kitapList", term70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Yazar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term45, args);
    }

};


