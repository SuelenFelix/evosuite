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

public class Pao_setAction_60758594413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11425;

    public Pao_setAction_60758594413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11426 = new Long(6077991958696417121L);
        Long term11477 = new Long(-5004803270846838598L);
        Long term11480 = new Long(-8211859616692114655L);
        Class<? extends Object> term11601 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term11600 = ((Class) term11601).getDeclaredField((String) "QUEEN");
        ((Field) term11600).setAccessible(true);
        Object enum45 = ((Field) term11600).get((Object) null);
        Class<? extends Object> term11778 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term11777 = ((Class) term11778).getDeclaredField((String) "SPADES");
        ((Field) term11777).setAccessible(true);
        Object enum46 = ((Field) term11777).get((Object) null);
        ArrayList term11488 = new ArrayList();
        ((ArrayList) term11488).add((Object)null);
        ((ArrayList) term11488).add((Object)null);
        ((ArrayList) term11488).add((Object)null);
        ((ArrayList) term11488).add((Object)null);
        ((ArrayList) term11488).add((Object)null);
        ((ArrayList) term11488).add((Object)null);
        Long term11493 = new Long(8010417010297313651L);
        Long term11544 = new Long(3643973882575578879L);
        term11425 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term11476 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term11479 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term11492 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term11543 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term11546 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term11547 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term11425, term11425.getClass(), "id", term11426);
        setField(term11425, term11425.getClass(), "imageUrl", "YsUtbngnRO");
        setField(term11425, term11425.getClass(), "person", "JisaWUxcNb");
        setField(term11425, term11425.getClass(), "action", "NxgmYPzWCI");
        setField(term11425, term11425.getClass(), "object", "SqjyKmayBx");
        setField(term11476, term11476.getClass(), "id", term11477);
        setField(term11479, term11479.getClass(), "id", term11480);
        setField(term11479, term11479.getClass(), "rank", enum45);
        setField(term11479, term11479.getClass(), "suit", enum46);
        setField(term11479, term11479.getClass(), "paoCards", term11488);
        setField(term11476, term11476.getClass(), "card", term11479);
        setField(term11492, term11492.getClass(), "id", term11493);
        setField(term11492, term11492.getClass(), "imageUrl", "XjDhvToxJy");
        setField(term11492, term11492.getClass(), "person", "nxSTJflLQy");
        setField(term11492, term11492.getClass(), "action", "FlHzxEfFzI");
        setField(term11492, term11492.getClass(), "object", "aSATgQUpoe");
        setField(term11543, term11543.getClass(), "id", term11544);
        setField(term11546, term11546.getClass(), "id", null);
        setField(term11546, term11546.getClass(), "rank", null);
        setField(term11546, term11546.getClass(), "suit", null);
        setField(term11546, term11546.getClass(), "paoCards", null);
        setField(term11543, term11543.getClass(), "card", term11546);
        setField(term11547, term11547.getClass(), "id", null);
        setField(term11547, term11547.getClass(), "imageUrl", null);
        setField(term11547, term11547.getClass(), "person", null);
        setField(term11547, term11547.getClass(), "action", null);
        setField(term11547, term11547.getClass(), "object", null);
        setField(term11547, term11547.getClass(), "paoCard", null);
        setField(term11543, term11543.getClass(), "pao", term11547);
        setField(term11492, term11492.getClass(), "paoCard", term11543);
        setField(term11476, term11476.getClass(), "pao", term11492);
        setField(term11425, term11425.getClass(), "paoCard", term11476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yevIIoVYHq";
        callMethod(klass, "setAction", argTypes, term11425, args);
    }

};


