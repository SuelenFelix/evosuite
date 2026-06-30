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

public class Pao_equals_1408411711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5623;
     Object term5748;

    public Pao_equals_1408411711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5624 = new Long(-2338103433822116635L);
        Long term5675 = new Long(-1885698929232124806L);
        Long term5678 = new Long(5731563613239387113L);
        Class<? extends Object> term5790 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term5789 = ((Class) term5790).getDeclaredField((String) "EIGHT");
        ((Field) term5789).setAccessible(true);
        Object enum23 = ((Field) term5789).get((Object) null);
        Class<? extends Object> term5967 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term5966 = ((Class) term5967).getDeclaredField((String) "HEARTS");
        ((Field) term5966).setAccessible(true);
        Object enum24 = ((Field) term5966).get((Object) null);
        ArrayList term5686 = new ArrayList();
        Long term5691 = new Long(3381333711768010594L);
        Long term5742 = new Long(3580984732036213717L);
        Long term5745 = new Long(5330761990446327930L);
        term5623 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term5674 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term5677 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term5690 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term5741 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term5744 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term5747 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term5623, term5623.getClass(), "id", term5624);
        setField(term5623, term5623.getClass(), "imageUrl", "iIRsCSYqXH");
        setField(term5623, term5623.getClass(), "person", "nghfqDXyCG");
        setField(term5623, term5623.getClass(), "action", "WBAOTqErtm");
        setField(term5623, term5623.getClass(), "object", "PqtVXXZMqK");
        setField(term5674, term5674.getClass(), "id", term5675);
        setField(term5677, term5677.getClass(), "id", term5678);
        setField(term5677, term5677.getClass(), "rank", enum23);
        setField(term5677, term5677.getClass(), "suit", enum24);
        setField(term5677, term5677.getClass(), "paoCards", term5686);
        setField(term5674, term5674.getClass(), "card", term5677);
        setField(term5690, term5690.getClass(), "id", term5691);
        setField(term5690, term5690.getClass(), "imageUrl", "rYbtIDVdnd");
        setField(term5690, term5690.getClass(), "person", "UKAReurpHG");
        setField(term5690, term5690.getClass(), "action", "WVRMUmrljA");
        setField(term5690, term5690.getClass(), "object", "NTlKJDDWlk");
        setField(term5741, term5741.getClass(), "id", term5742);
        setField(term5744, term5744.getClass(), "id", term5745);
        setField(term5744, term5744.getClass(), "rank", null);
        setField(term5744, term5744.getClass(), "suit", null);
        setField(term5744, term5744.getClass(), "paoCards", null);
        setField(term5741, term5741.getClass(), "card", term5744);
        setField(term5747, term5747.getClass(), "id", null);
        setField(term5747, term5747.getClass(), "imageUrl", null);
        setField(term5747, term5747.getClass(), "person", null);
        setField(term5747, term5747.getClass(), "action", null);
        setField(term5747, term5747.getClass(), "object", null);
        setField(term5747, term5747.getClass(), "paoCard", null);
        setField(term5741, term5741.getClass(), "pao", term5747);
        setField(term5690, term5690.getClass(), "paoCard", term5741);
        setField(term5674, term5674.getClass(), "pao", term5690);
        setField(term5623, term5623.getClass(), "paoCard", term5674);
        term5748 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5748;
        callMethod(klass, "equals", argTypes, term5623, args);
    }

};


