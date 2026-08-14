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

public class Kitap_setYazar_4407969838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1209;
     Object term1266;

    public Kitap_setYazar_4407969838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1261 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1261, term1261.getClass(), "kitapAdi", null);
        setField(term1261, term1261.getClass(), "kitapFiyati", null);
        setField(term1261, term1261.getClass(), "yazar", null);
        Object term1262 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1262, term1262.getClass(), "kitapAdi", null);
        setField(term1262, term1262.getClass(), "kitapFiyati", null);
        setField(term1262, term1262.getClass(), "yazar", null);
        Object term1263 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1263, term1263.getClass(), "kitapAdi", null);
        setField(term1263, term1263.getClass(), "kitapFiyati", null);
        setField(term1263, term1263.getClass(), "yazar", null);
        ArrayList term1259 = new ArrayList();
        ((ArrayList) term1259).add(term1261);
        ((ArrayList) term1259).add(term1262);
        ((ArrayList) term1259).add(term1263);
        term1209 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term1234 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term1209, term1209.getClass(), "kitapAdi", "mLwibAPEsa");
        setField(term1209, term1209.getClass(), "kitapFiyati", "zsWKWiTFuo");
        setField(term1234, term1234.getClass(), "yazarAdi", "UPUbwyHQKN");
        setField(term1234, term1234.getClass(), "yazarSoyadi", "lgQkrXANyI");
        setField(term1234, term1234.getClass(), "kitapList", term1259);
        setField(term1209, term1209.getClass(), "yazar", term1234);
        Object term1293 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term1296 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term1293, term1293.getClass(), "kitapAdi", "");
        setField(term1293, term1293.getClass(), "kitapFiyati", "");
        setField(term1296, term1296.getClass(), "yazarAdi", null);
        setField(term1296, term1296.getClass(), "yazarSoyadi", null);
        setField(term1296, term1296.getClass(), "kitapList", null);
        setField(term1293, term1293.getClass(), "yazar", term1296);
        Object term1297 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term1300 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term1297, term1297.getClass(), "kitapAdi", "");
        setField(term1297, term1297.getClass(), "kitapFiyati", "");
        setField(term1300, term1300.getClass(), "yazarAdi", null);
        setField(term1300, term1300.getClass(), "yazarSoyadi", null);
        setField(term1300, term1300.getClass(), "kitapList", null);
        setField(term1297, term1297.getClass(), "yazar", term1300);
        Object term1301 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term1304 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term1301, term1301.getClass(), "kitapAdi", "");
        setField(term1301, term1301.getClass(), "kitapFiyati", "");
        setField(term1304, term1304.getClass(), "yazarAdi", null);
        setField(term1304, term1304.getClass(), "yazarSoyadi", null);
        setField(term1304, term1304.getClass(), "kitapList", null);
        setField(term1301, term1301.getClass(), "yazar", term1304);
        Object term1305 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term1308 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term1305, term1305.getClass(), "kitapAdi", "");
        setField(term1305, term1305.getClass(), "kitapFiyati", "");
        setField(term1308, term1308.getClass(), "yazarAdi", null);
        setField(term1308, term1308.getClass(), "yazarSoyadi", null);
        setField(term1308, term1308.getClass(), "kitapList", null);
        setField(term1305, term1305.getClass(), "yazar", term1308);
        Object term1309 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        Object term1312 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term1309, term1309.getClass(), "kitapAdi", "");
        setField(term1309, term1309.getClass(), "kitapFiyati", "");
        setField(term1312, term1312.getClass(), "yazarAdi", null);
        setField(term1312, term1312.getClass(), "yazarSoyadi", null);
        setField(term1312, term1312.getClass(), "kitapList", null);
        setField(term1309, term1309.getClass(), "yazar", term1312);
        Object term1313 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Kitap"));
        setField(term1313, term1313.getClass(), "kitapAdi", "");
        setField(term1313, term1313.getClass(), "kitapFiyati", "");
        setField(term1313, term1313.getClass(), "yazar", term1300);
        ArrayList term1291 = new ArrayList();
        ((ArrayList) term1291).add(term1293);
        ((ArrayList) term1291).add(term1297);
        ((ArrayList) term1291).add(term1301);
        ((ArrayList) term1291).add(term1305);
        ((ArrayList) term1291).add(term1305);
        ((ArrayList) term1291).add(term1309);
        ((ArrayList) term1291).add(term1313);
        ((ArrayList) term1291).add(term1313);
        term1266 = newInstance(Class.forName("com.patika.software.prensible.a3.composition.Yazar"));
        setField(term1266, term1266.getClass(), "yazarAdi", "lBOokzEPfe");
        setField(term1266, term1266.getClass(), "yazarSoyadi", "dtGZCsKXbW");
        setField(term1266, term1266.getClass(), "kitapList", term1291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a3.composition.Kitap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.patika.software.prensible.a3.composition.Yazar");
        Object[] args = new Object[1];
        args[0] = term1266;
        callMethod(klass, "setYazar", argTypes, term1209, args);
    }

};


