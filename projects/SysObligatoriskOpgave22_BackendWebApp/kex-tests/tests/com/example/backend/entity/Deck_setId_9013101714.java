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
import java.util.ArrayList;
import java.lang.Object;

public class Deck_setId_9013101714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20070;
     Object term20115;

    public Deck_setId_9013101714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20071 = new Long(2315395988604904502L);
        Long term20100 = new Long(4337555582321907177L);
        Long term20103 = new Long(-6367418587326372844L);
        Long term20106 = new Long(-7148236042086608592L);
        Object term20099 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20102 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20105 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20099, term20099.getClass(), "id", term20100);
        setField(term20102, term20102.getClass(), "id", term20103);
        setField(term20102, term20102.getClass(), "rank", null);
        setField(term20102, term20102.getClass(), "suit", null);
        setField(term20102, term20102.getClass(), "paoCards", null);
        setField(term20099, term20099.getClass(), "card", term20102);
        setField(term20105, term20105.getClass(), "id", term20106);
        setField(term20105, term20105.getClass(), "imageUrl", null);
        setField(term20105, term20105.getClass(), "person", null);
        setField(term20105, term20105.getClass(), "action", null);
        setField(term20105, term20105.getClass(), "object", null);
        setField(term20105, term20105.getClass(), "paoCard", null);
        setField(term20099, term20099.getClass(), "pao", term20105);
        Long term20109 = new Long(2014229530618878786L);
        Object term20108 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20111 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20112 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20108, term20108.getClass(), "id", term20109);
        setField(term20111, term20111.getClass(), "id", null);
        setField(term20111, term20111.getClass(), "rank", null);
        setField(term20111, term20111.getClass(), "suit", null);
        setField(term20111, term20111.getClass(), "paoCards", null);
        setField(term20108, term20108.getClass(), "card", term20111);
        setField(term20112, term20112.getClass(), "id", null);
        setField(term20112, term20112.getClass(), "imageUrl", null);
        setField(term20112, term20112.getClass(), "person", null);
        setField(term20112, term20112.getClass(), "action", null);
        setField(term20112, term20112.getClass(), "object", null);
        setField(term20112, term20112.getClass(), "paoCard", null);
        setField(term20108, term20108.getClass(), "pao", term20112);
        ArrayList term20097 = new ArrayList();
        ((ArrayList) term20097).add(term20099);
        ((ArrayList) term20097).add(term20108);
        ((ArrayList) term20097).add(term20108);
        term20070 = newInstance(Class.forName("com.example.backend.entity.Deck"));
        setField(term20070, term20070.getClass(), "id", term20071);
        setField(term20070, term20070.getClass(), "name", "CRAUqtVBkU");
        setField(term20070, term20070.getClass(), "description", "DddqUYfomL");
        setField(term20070, term20070.getClass(), "paoCards", term20097);
        term20115 = new Long(7716258711075652753L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Deck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term20115;
        callMethod(klass, "setId", argTypes, term20070, args);
    }

};


