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

public class Card_setId_9002816847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17361;
     Object term17405;

    public Card_setId_9002816847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17362 = new Long(4777103307547199454L);
        Class<? extends Object> term17408 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term17407 = ((Class) term17408).getDeclaredField((String) "SEVEN");
        ((Field) term17407).setAccessible(true);
        Object enum71 = ((Field) term17407).get((Object) null);
        Class<? extends Object> term17585 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term17584 = ((Class) term17585).getDeclaredField((String) "HEARTS");
        ((Field) term17584).setAccessible(true);
        Object enum72 = ((Field) term17584).get((Object) null);
        Long term17386 = new Long(6462632207326555041L);
        Long term17389 = new Long(-3188913050877092148L);
        Long term17392 = new Long(-6314099457945626605L);
        Object term17385 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term17388 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term17391 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term17385, term17385.getClass(), "id", term17386);
        setField(term17388, term17388.getClass(), "id", term17389);
        setField(term17388, term17388.getClass(), "rank", null);
        setField(term17388, term17388.getClass(), "suit", null);
        setField(term17388, term17388.getClass(), "paoCards", null);
        setField(term17385, term17385.getClass(), "card", term17388);
        setField(term17391, term17391.getClass(), "id", term17392);
        setField(term17391, term17391.getClass(), "imageUrl", null);
        setField(term17391, term17391.getClass(), "person", null);
        setField(term17391, term17391.getClass(), "action", null);
        setField(term17391, term17391.getClass(), "object", null);
        setField(term17391, term17391.getClass(), "paoCard", null);
        setField(term17385, term17385.getClass(), "pao", term17391);
        Long term17395 = new Long(7893661350133453338L);
        Long term17398 = new Long(9056245012917372169L);
        Long term17401 = new Long(4036794646678680547L);
        Object term17394 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term17397 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term17400 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term17394, term17394.getClass(), "id", term17395);
        setField(term17397, term17397.getClass(), "id", term17398);
        setField(term17397, term17397.getClass(), "rank", null);
        setField(term17397, term17397.getClass(), "suit", null);
        setField(term17397, term17397.getClass(), "paoCards", null);
        setField(term17394, term17394.getClass(), "card", term17397);
        setField(term17400, term17400.getClass(), "id", term17401);
        setField(term17400, term17400.getClass(), "imageUrl", null);
        setField(term17400, term17400.getClass(), "person", null);
        setField(term17400, term17400.getClass(), "action", null);
        setField(term17400, term17400.getClass(), "object", null);
        setField(term17400, term17400.getClass(), "paoCard", null);
        setField(term17394, term17394.getClass(), "pao", term17400);
        ArrayList term17383 = new ArrayList();
        ((ArrayList) term17383).add(term17385);
        ((ArrayList) term17383).add(term17394);
        term17361 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term17361, term17361.getClass(), "id", term17362);
        setField(term17361, term17361.getClass(), "rank", enum71);
        setField(term17361, term17361.getClass(), "suit", enum72);
        setField(term17361, term17361.getClass(), "paoCards", term17383);
        term17405 = new Long(-8697239524885136781L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term17405;
        callMethod(klass, "setId", argTypes, term17361, args);
    }

};


