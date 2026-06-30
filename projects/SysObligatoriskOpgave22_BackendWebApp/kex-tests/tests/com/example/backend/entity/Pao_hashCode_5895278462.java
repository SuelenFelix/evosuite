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

public class Pao_hashCode_5895278462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6186;

    public Pao_hashCode_5895278462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6187 = new Long(1993646237353405740L);
        Long term6238 = new Long(-4043093655001688454L);
        Long term6241 = new Long(-419800263764810394L);
        Class<? extends Object> term6350 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term6349 = ((Class) term6350).getDeclaredField((String) "QUEEN");
        ((Field) term6349).setAccessible(true);
        Object enum25 = ((Field) term6349).get((Object) null);
        Class<? extends Object> term6527 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term6526 = ((Class) term6527).getDeclaredField((String) "HEARTS");
        ((Field) term6526).setAccessible(true);
        Object enum26 = ((Field) term6526).get((Object) null);
        ArrayList term6249 = new ArrayList();
        ((ArrayList) term6249).add((Object)null);
        ((ArrayList) term6249).add((Object)null);
        Long term6254 = new Long(1044883697493326351L);
        Long term6305 = new Long(-7904053112604879960L);
        term6186 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term6237 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term6240 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term6253 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term6304 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term6307 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term6308 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term6186, term6186.getClass(), "id", term6187);
        setField(term6186, term6186.getClass(), "imageUrl", "lCyLIcSuom");
        setField(term6186, term6186.getClass(), "person", "CGOpQSZZwI");
        setField(term6186, term6186.getClass(), "action", "ypEdrstygY");
        setField(term6186, term6186.getClass(), "object", "sNQFlATEeQ");
        setField(term6237, term6237.getClass(), "id", term6238);
        setField(term6240, term6240.getClass(), "id", term6241);
        setField(term6240, term6240.getClass(), "rank", enum25);
        setField(term6240, term6240.getClass(), "suit", enum26);
        setField(term6240, term6240.getClass(), "paoCards", term6249);
        setField(term6237, term6237.getClass(), "card", term6240);
        setField(term6253, term6253.getClass(), "id", term6254);
        setField(term6253, term6253.getClass(), "imageUrl", "GBOEuByOfr");
        setField(term6253, term6253.getClass(), "person", "NHbOFFjyVK");
        setField(term6253, term6253.getClass(), "action", "zaloBqlrSo");
        setField(term6253, term6253.getClass(), "object", "vvoLrMGCoN");
        setField(term6304, term6304.getClass(), "id", term6305);
        setField(term6307, term6307.getClass(), "id", null);
        setField(term6307, term6307.getClass(), "rank", null);
        setField(term6307, term6307.getClass(), "suit", null);
        setField(term6307, term6307.getClass(), "paoCards", null);
        setField(term6304, term6304.getClass(), "card", term6307);
        setField(term6308, term6308.getClass(), "id", null);
        setField(term6308, term6308.getClass(), "imageUrl", null);
        setField(term6308, term6308.getClass(), "person", null);
        setField(term6308, term6308.getClass(), "action", null);
        setField(term6308, term6308.getClass(), "object", null);
        setField(term6308, term6308.getClass(), "paoCard", null);
        setField(term6304, term6304.getClass(), "pao", term6308);
        setField(term6253, term6253.getClass(), "paoCard", term6304);
        setField(term6237, term6237.getClass(), "pao", term6253);
        setField(term6186, term6186.getClass(), "paoCard", term6237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6186, args);
    }

};


