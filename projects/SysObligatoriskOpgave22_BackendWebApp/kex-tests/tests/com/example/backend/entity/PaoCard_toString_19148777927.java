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

public class PaoCard_toString_19148777927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5051;

    public PaoCard_toString_19148777927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5052 = new Long(-6673920710396545553L);
        Long term5055 = new Long(3412644969878030772L);
        Class<? extends Object> term5138 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term5137 = ((Class) term5138).getDeclaredField((String) "TWO");
        ((Field) term5137).setAccessible(true);
        Object enum21 = ((Field) term5137).get((Object) null);
        Class<? extends Object> term5309 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term5308 = ((Class) term5309).getDeclaredField((String) "HEARTS");
        ((Field) term5308).setAccessible(true);
        Object enum22 = ((Field) term5308).get((Object) null);
        Long term5077 = new Long(6698455537431331246L);
        Object term5076 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term5076, term5076.getClass(), "id", term5077);
        setField(term5076, term5076.getClass(), "card", null);
        setField(term5076, term5076.getClass(), "pao", null);
        Long term5080 = new Long(4394651392080968777L);
        Object term5079 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term5079, term5079.getClass(), "id", term5080);
        setField(term5079, term5079.getClass(), "card", null);
        setField(term5079, term5079.getClass(), "pao", null);
        Object term5082 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term5082, term5082.getClass(), "id", null);
        setField(term5082, term5082.getClass(), "card", null);
        setField(term5082, term5082.getClass(), "pao", null);
        Object term5083 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term5083, term5083.getClass(), "id", null);
        setField(term5083, term5083.getClass(), "card", null);
        setField(term5083, term5083.getClass(), "pao", null);
        ArrayList term5074 = new ArrayList();
        ((ArrayList) term5074).add(term5076);
        ((ArrayList) term5074).add(term5079);
        ((ArrayList) term5074).add(term5082);
        ((ArrayList) term5074).add(term5083);
        Long term5087 = new Long(8540994973773607992L);
        term5051 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term5054 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term5086 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term5051, term5051.getClass(), "id", term5052);
        setField(term5054, term5054.getClass(), "id", term5055);
        setField(term5054, term5054.getClass(), "rank", enum21);
        setField(term5054, term5054.getClass(), "suit", enum22);
        setField(term5054, term5054.getClass(), "paoCards", term5074);
        setField(term5051, term5051.getClass(), "card", term5054);
        setField(term5086, term5086.getClass(), "id", term5087);
        setField(term5086, term5086.getClass(), "imageUrl", "HBGNxdNURv");
        setField(term5086, term5086.getClass(), "person", "mfCpTPPQQm");
        setField(term5086, term5086.getClass(), "action", "OcJCIDNIXA");
        setField(term5086, term5086.getClass(), "object", "XfRABIFVEp");
        setField(term5086, term5086.getClass(), "paoCard", term5083);
        setField(term5051, term5051.getClass(), "pao", term5086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.PaoCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5051, args);
    }

};


