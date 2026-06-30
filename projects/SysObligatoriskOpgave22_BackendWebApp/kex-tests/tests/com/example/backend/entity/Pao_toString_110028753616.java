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

public class Pao_toString_110028753616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13635;

    public Pao_toString_110028753616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13636 = new Long(6542357174275680335L);
        Long term13687 = new Long(206360660645917003L);
        Long term13690 = new Long(8680715663951713735L);
        Class<? extends Object> term13803 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term13802 = ((Class) term13803).getDeclaredField((String) "TEN");
        ((Field) term13802).setAccessible(true);
        Object enum53 = ((Field) term13802).get((Object) null);
        Class<? extends Object> term13974 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term13973 = ((Class) term13974).getDeclaredField((String) "SPADES");
        ((Field) term13973).setAccessible(true);
        Object enum54 = ((Field) term13973).get((Object) null);
        ArrayList term13698 = new ArrayList();
        ((ArrayList) term13698).add((Object)null);
        ((ArrayList) term13698).add((Object)null);
        ((ArrayList) term13698).add((Object)null);
        ((ArrayList) term13698).add((Object)null);
        ((ArrayList) term13698).add((Object)null);
        ((ArrayList) term13698).add((Object)null);
        ((ArrayList) term13698).add((Object)null);
        Long term13703 = new Long(-354905832180781372L);
        Long term13754 = new Long(-4562564710769146498L);
        Long term13757 = new Long(-6254265799185295775L);
        Long term13760 = new Long(-5714578622746827780L);
        term13635 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term13686 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term13689 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term13702 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term13753 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term13756 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term13759 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term13635, term13635.getClass(), "id", term13636);
        setField(term13635, term13635.getClass(), "imageUrl", "HknsTajwxJ");
        setField(term13635, term13635.getClass(), "person", "XtiurrVYKw");
        setField(term13635, term13635.getClass(), "action", "rsumfoDNHa");
        setField(term13635, term13635.getClass(), "object", "ceCWHUTQUM");
        setField(term13686, term13686.getClass(), "id", term13687);
        setField(term13689, term13689.getClass(), "id", term13690);
        setField(term13689, term13689.getClass(), "rank", enum53);
        setField(term13689, term13689.getClass(), "suit", enum54);
        setField(term13689, term13689.getClass(), "paoCards", term13698);
        setField(term13686, term13686.getClass(), "card", term13689);
        setField(term13702, term13702.getClass(), "id", term13703);
        setField(term13702, term13702.getClass(), "imageUrl", "BsuVlGUUjV");
        setField(term13702, term13702.getClass(), "person", "bHHjfDCntT");
        setField(term13702, term13702.getClass(), "action", "sEphiduvkv");
        setField(term13702, term13702.getClass(), "object", "PbLgCSAHce");
        setField(term13753, term13753.getClass(), "id", term13754);
        setField(term13756, term13756.getClass(), "id", term13757);
        setField(term13756, term13756.getClass(), "rank", null);
        setField(term13756, term13756.getClass(), "suit", enum54);
        setField(term13756, term13756.getClass(), "paoCards", null);
        setField(term13753, term13753.getClass(), "card", term13756);
        setField(term13759, term13759.getClass(), "id", term13760);
        setField(term13759, term13759.getClass(), "imageUrl", null);
        setField(term13759, term13759.getClass(), "person", null);
        setField(term13759, term13759.getClass(), "action", null);
        setField(term13759, term13759.getClass(), "object", null);
        setField(term13759, term13759.getClass(), "paoCard", null);
        setField(term13753, term13753.getClass(), "pao", term13759);
        setField(term13702, term13702.getClass(), "paoCard", term13753);
        setField(term13686, term13686.getClass(), "pao", term13702);
        setField(term13635, term13635.getClass(), "paoCard", term13686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13635, args);
    }

};


