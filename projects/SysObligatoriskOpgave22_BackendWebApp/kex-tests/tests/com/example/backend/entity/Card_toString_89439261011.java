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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Card_toString_89439261011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19363;

    public Card_toString_89439261011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19364 = new Long(-685001356309682920L);
        Class<? extends Object> term19416 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term19415 = ((Class) term19416).getDeclaredField((String) "SIX");
        ((Field) term19415).setAccessible(true);
        Object enum81 = ((Field) term19415).get((Object) null);
        Class<? extends Object> term19587 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term19586 = ((Class) term19587).getDeclaredField((String) "SPADES");
        ((Field) term19586).setAccessible(true);
        Object enum82 = ((Field) term19586).get((Object) null);
        Long term19386 = new Long(-3189918180129674609L);
        Long term19389 = new Long(5271284328066798769L);
        Long term19392 = new Long(5383032785479262184L);
        Object term19385 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term19388 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term19391 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term19385, term19385.getClass(), "id", term19386);
        setField(term19388, term19388.getClass(), "id", term19389);
        setField(term19388, term19388.getClass(), "rank", null);
        setField(term19388, term19388.getClass(), "suit", null);
        setField(term19388, term19388.getClass(), "paoCards", null);
        setField(term19385, term19385.getClass(), "card", term19388);
        setField(term19391, term19391.getClass(), "id", term19392);
        setField(term19391, term19391.getClass(), "imageUrl", null);
        setField(term19391, term19391.getClass(), "person", null);
        setField(term19391, term19391.getClass(), "action", null);
        setField(term19391, term19391.getClass(), "object", null);
        setField(term19391, term19391.getClass(), "paoCard", null);
        setField(term19385, term19385.getClass(), "pao", term19391);
        Long term19395 = new Long(3410093279424884335L);
        Object term19394 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term19397 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term19398 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term19394, term19394.getClass(), "id", term19395);
        setField(term19397, term19397.getClass(), "id", null);
        setField(term19397, term19397.getClass(), "rank", null);
        setField(term19397, term19397.getClass(), "suit", null);
        setField(term19397, term19397.getClass(), "paoCards", null);
        setField(term19394, term19394.getClass(), "card", term19397);
        setField(term19398, term19398.getClass(), "id", null);
        setField(term19398, term19398.getClass(), "imageUrl", null);
        setField(term19398, term19398.getClass(), "person", null);
        setField(term19398, term19398.getClass(), "action", null);
        setField(term19398, term19398.getClass(), "object", null);
        setField(term19398, term19398.getClass(), "paoCard", null);
        setField(term19394, term19394.getClass(), "pao", term19398);
        Long term19400 = new Long(1924411240174876881L);
        Long term19403 = new Long(-8287954071414913487L);
        Long term19406 = new Long(7393438062788805516L);
        Object term19399 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term19402 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term19405 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term19399, term19399.getClass(), "id", term19400);
        setField(term19402, term19402.getClass(), "id", term19403);
        setField(term19402, term19402.getClass(), "rank", null);
        setField(term19402, term19402.getClass(), "suit", null);
        setField(term19402, term19402.getClass(), "paoCards", null);
        setField(term19399, term19399.getClass(), "card", term19402);
        setField(term19405, term19405.getClass(), "id", term19406);
        setField(term19405, term19405.getClass(), "imageUrl", null);
        setField(term19405, term19405.getClass(), "person", null);
        setField(term19405, term19405.getClass(), "action", null);
        setField(term19405, term19405.getClass(), "object", null);
        setField(term19405, term19405.getClass(), "paoCard", null);
        setField(term19399, term19399.getClass(), "pao", term19405);
        Long term19409 = new Long(5646422912118770408L);
        Object term19408 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term19411 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term19412 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term19408, term19408.getClass(), "id", term19409);
        setField(term19411, term19411.getClass(), "id", null);
        setField(term19411, term19411.getClass(), "rank", null);
        setField(term19411, term19411.getClass(), "suit", null);
        setField(term19411, term19411.getClass(), "paoCards", null);
        setField(term19408, term19408.getClass(), "card", term19411);
        setField(term19412, term19412.getClass(), "id", null);
        setField(term19412, term19412.getClass(), "imageUrl", null);
        setField(term19412, term19412.getClass(), "person", null);
        setField(term19412, term19412.getClass(), "action", null);
        setField(term19412, term19412.getClass(), "object", null);
        setField(term19412, term19412.getClass(), "paoCard", null);
        setField(term19408, term19408.getClass(), "pao", term19412);
        ArrayList term19383 = new ArrayList();
        ((ArrayList) term19383).add(term19385);
        ((ArrayList) term19383).add(term19394);
        ((ArrayList) term19383).add(term19394);
        ((ArrayList) term19383).add(term19399);
        ((ArrayList) term19383).add(term19408);
        term19363 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term19363, term19363.getClass(), "id", term19364);
        setField(term19363, term19363.getClass(), "rank", enum81);
        setField(term19363, term19363.getClass(), "suit", enum82);
        setField(term19363, term19363.getClass(), "paoCards", term19383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term19363, args);
    }

};


