package com.example.backend.entity;

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
import static com.example.backend.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Pao_getAction_18414675366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8320;

    public Pao_getAction_18414675366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8321 = new Long(7735460540091431012L);
        Long term8372 = new Long(1346299551708610248L);
        Long term8375 = new Long(-7191625829563442696L);
        Class<? extends Object> term8484 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term8483 = ((Class) term8484).getDeclaredField((String) "FIVE");
        ((Field) term8483).setAccessible(true);
        Object enum33 = ((Field) term8483).get((Object) null);
        Class<? extends Object> term8658 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term8657 = ((Class) term8658).getDeclaredField((String) "DIAMONDS");
        ((Field) term8657).setAccessible(true);
        Object enum34 = ((Field) term8657).get((Object) null);
        ArrayList term8383 = new ArrayList();
        ((ArrayList) term8383).add((Object)null);
        ((ArrayList) term8383).add((Object)null);
        ((ArrayList) term8383).add((Object)null);
        ((ArrayList) term8383).add((Object)null);
        ((ArrayList) term8383).add((Object)null);
        ((ArrayList) term8383).add((Object)null);
        Long term8388 = new Long(-6609679920238945303L);
        Long term8439 = new Long(-3130003589475815807L);
        term8320 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term8371 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term8374 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term8387 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term8438 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term8441 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term8442 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term8320, term8320.getClass(), "id", term8321);
        setField(term8320, term8320.getClass(), "imageUrl", "pumvwBWvpy");
        setField(term8320, term8320.getClass(), "person", "HwLHeGLyhe");
        setField(term8320, term8320.getClass(), "action", "RDnkgWkcbz");
        setField(term8320, term8320.getClass(), "object", "IBpaxltauX");
        setField(term8371, term8371.getClass(), "id", term8372);
        setField(term8374, term8374.getClass(), "id", term8375);
        setField(term8374, term8374.getClass(), "rank", enum33);
        setField(term8374, term8374.getClass(), "suit", enum34);
        setField(term8374, term8374.getClass(), "paoCards", term8383);
        setField(term8371, term8371.getClass(), "card", term8374);
        setField(term8387, term8387.getClass(), "id", term8388);
        setField(term8387, term8387.getClass(), "imageUrl", "RCOqfVsRHt");
        setField(term8387, term8387.getClass(), "person", "TSyCeEZPaT");
        setField(term8387, term8387.getClass(), "action", "JeZFtaqkzW");
        setField(term8387, term8387.getClass(), "object", "vOVuNSCCLe");
        setField(term8438, term8438.getClass(), "id", term8439);
        setField(term8441, term8441.getClass(), "id", null);
        setField(term8441, term8441.getClass(), "rank", null);
        setField(term8441, term8441.getClass(), "suit", null);
        setField(term8441, term8441.getClass(), "paoCards", null);
        setField(term8438, term8438.getClass(), "card", term8441);
        setField(term8442, term8442.getClass(), "id", null);
        setField(term8442, term8442.getClass(), "imageUrl", null);
        setField(term8442, term8442.getClass(), "person", null);
        setField(term8442, term8442.getClass(), "action", null);
        setField(term8442, term8442.getClass(), "object", null);
        setField(term8442, term8442.getClass(), "paoCard", null);
        setField(term8438, term8438.getClass(), "pao", term8442);
        setField(term8387, term8387.getClass(), "paoCard", term8438);
        setField(term8371, term8371.getClass(), "pao", term8387);
        setField(term8320, term8320.getClass(), "paoCard", term8371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAction", argTypes, term8320, args);
    }

};


