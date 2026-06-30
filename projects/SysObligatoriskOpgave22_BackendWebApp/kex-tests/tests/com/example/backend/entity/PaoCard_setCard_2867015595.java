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

public class PaoCard_setCard_2867015595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3028;
     Object term3135;

    public PaoCard_setCard_2867015595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3029 = new Long(-3936701866695933852L);
        Long term3032 = new Long(1215116475929634177L);
        Class<? extends Object> term3183 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term3182 = ((Class) term3183).getDeclaredField((String) "QUEEN");
        ((Field) term3182).setAccessible(true);
        Object enum12 = ((Field) term3182).get((Object) null);
        Class<? extends Object> term3360 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term3359 = ((Class) term3360).getDeclaredField((String) "SPADES");
        ((Field) term3359).setAccessible(true);
        Object enum13 = ((Field) term3359).get((Object) null);
        Long term3056 = new Long(1597484336218508869L);
        Object term3055 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term3055, term3055.getClass(), "id", term3056);
        setField(term3055, term3055.getClass(), "card", null);
        setField(term3055, term3055.getClass(), "pao", null);
        Object term3058 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term3058, term3058.getClass(), "id", null);
        setField(term3058, term3058.getClass(), "card", null);
        setField(term3058, term3058.getClass(), "pao", null);
        ArrayList term3053 = new ArrayList();
        ((ArrayList) term3053).add(term3055);
        ((ArrayList) term3053).add(term3058);
        ((ArrayList) term3053).add(term3058);
        Long term3062 = new Long(3620247240684476031L);
        Long term3113 = new Long(-6342139649364011743L);
        Long term3116 = new Long(-4924950707540628022L);
        Class<? extends Object> term3580 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term3579 = ((Class) term3580).getDeclaredField((String) "FIVE");
        ((Field) term3579).setAccessible(true);
        Object enum14 = ((Field) term3579).get((Object) null);
        Class<? extends Object> term3754 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term3753 = ((Class) term3754).getDeclaredField((String) "CLUBS");
        ((Field) term3753).setAccessible(true);
        Object enum15 = ((Field) term3753).get((Object) null);
        ArrayList term3122 = new ArrayList();
        ((ArrayList) term3122).add((Object)null);
        Long term3126 = new Long(-7268507582722666254L);
        Long term3133 = new Long(5671808784468963649L);
        term3028 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term3031 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term3061 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term3112 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term3115 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term3125 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term3132 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term3028, term3028.getClass(), "id", term3029);
        setField(term3031, term3031.getClass(), "id", term3032);
        setField(term3031, term3031.getClass(), "rank", enum12);
        setField(term3031, term3031.getClass(), "suit", enum13);
        setField(term3031, term3031.getClass(), "paoCards", term3053);
        setField(term3028, term3028.getClass(), "card", term3031);
        setField(term3061, term3061.getClass(), "id", term3062);
        setField(term3061, term3061.getClass(), "imageUrl", "WHcwFgsGFC");
        setField(term3061, term3061.getClass(), "person", "HzqpegHiRq");
        setField(term3061, term3061.getClass(), "action", "jwsfVjMoJT");
        setField(term3061, term3061.getClass(), "object", "ZfdXfCCFDf");
        setField(term3112, term3112.getClass(), "id", term3113);
        setField(term3115, term3115.getClass(), "id", term3116);
        setField(term3115, term3115.getClass(), "rank", enum14);
        setField(term3115, term3115.getClass(), "suit", enum15);
        setField(term3115, term3115.getClass(), "paoCards", term3122);
        setField(term3112, term3112.getClass(), "card", term3115);
        setField(term3125, term3125.getClass(), "id", term3126);
        setField(term3125, term3125.getClass(), "imageUrl", "");
        setField(term3125, term3125.getClass(), "person", "");
        setField(term3125, term3125.getClass(), "action", "");
        setField(term3125, term3125.getClass(), "object", "");
        setField(term3132, term3132.getClass(), "id", term3133);
        setField(term3132, term3132.getClass(), "card", null);
        setField(term3132, term3132.getClass(), "pao", null);
        setField(term3125, term3125.getClass(), "paoCard", term3132);
        setField(term3112, term3112.getClass(), "pao", term3125);
        setField(term3061, term3061.getClass(), "paoCard", term3112);
        setField(term3028, term3028.getClass(), "pao", term3061);
        Long term3136 = new Long(8313800941204938919L);
        Class<? extends Object> term3931 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term3930 = ((Class) term3931).getDeclaredField((String) "SIX");
        ((Field) term3930).setAccessible(true);
        Object enum16 = ((Field) term3930).get((Object) null);
        Class<? extends Object> term4102 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term4101 = ((Class) term4102).getDeclaredField((String) "HEARTS");
        ((Field) term4101).setAccessible(true);
        Object enum17 = ((Field) term4101).get((Object) null);
        Long term3158 = new Long(-1214968196781083707L);
        Long term3161 = new Long(-1804015692891701666L);
        Long term3164 = new Long(-6587807377747738663L);
        Object term3157 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term3160 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term3163 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term3157, term3157.getClass(), "id", term3158);
        setField(term3160, term3160.getClass(), "id", term3161);
        setField(term3160, term3160.getClass(), "rank", null);
        setField(term3160, term3160.getClass(), "suit", null);
        setField(term3160, term3160.getClass(), "paoCards", null);
        setField(term3157, term3157.getClass(), "card", term3160);
        setField(term3163, term3163.getClass(), "id", term3164);
        setField(term3163, term3163.getClass(), "imageUrl", null);
        setField(term3163, term3163.getClass(), "person", null);
        setField(term3163, term3163.getClass(), "action", null);
        setField(term3163, term3163.getClass(), "object", null);
        setField(term3163, term3163.getClass(), "paoCard", null);
        setField(term3157, term3157.getClass(), "pao", term3163);
        Long term3167 = new Long(855932984568615096L);
        Object term3166 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term3169 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term3170 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term3166, term3166.getClass(), "id", term3167);
        setField(term3169, term3169.getClass(), "id", null);
        setField(term3169, term3169.getClass(), "rank", null);
        setField(term3169, term3169.getClass(), "suit", null);
        setField(term3169, term3169.getClass(), "paoCards", null);
        setField(term3166, term3166.getClass(), "card", term3169);
        setField(term3170, term3170.getClass(), "id", null);
        setField(term3170, term3170.getClass(), "imageUrl", null);
        setField(term3170, term3170.getClass(), "person", null);
        setField(term3170, term3170.getClass(), "action", null);
        setField(term3170, term3170.getClass(), "object", null);
        setField(term3170, term3170.getClass(), "paoCard", null);
        setField(term3166, term3166.getClass(), "pao", term3170);
        Long term3172 = new Long(-6432617521836576658L);
        Long term3175 = new Long(-2255965562447970862L);
        Long term3178 = new Long(-3948863953565024517L);
        Object term3171 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term3174 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term3177 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term3171, term3171.getClass(), "id", term3172);
        setField(term3174, term3174.getClass(), "id", term3175);
        setField(term3174, term3174.getClass(), "rank", null);
        setField(term3174, term3174.getClass(), "suit", enum17);
        setField(term3174, term3174.getClass(), "paoCards", null);
        setField(term3171, term3171.getClass(), "card", term3174);
        setField(term3177, term3177.getClass(), "id", term3178);
        setField(term3177, term3177.getClass(), "imageUrl", null);
        setField(term3177, term3177.getClass(), "person", null);
        setField(term3177, term3177.getClass(), "action", null);
        setField(term3177, term3177.getClass(), "object", null);
        setField(term3177, term3177.getClass(), "paoCard", null);
        setField(term3171, term3171.getClass(), "pao", term3177);
        ArrayList term3155 = new ArrayList();
        ((ArrayList) term3155).add(term3157);
        ((ArrayList) term3155).add(term3166);
        ((ArrayList) term3155).add(term3166);
        ((ArrayList) term3155).add(term3171);
        term3135 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term3135, term3135.getClass(), "id", term3136);
        setField(term3135, term3135.getClass(), "rank", enum16);
        setField(term3135, term3135.getClass(), "suit", enum17);
        setField(term3135, term3135.getClass(), "paoCards", term3155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.PaoCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.backend.entity.Card");
        Object[] args = new Object[1];
        args[0] = term3135;
        callMethod(klass, "setCard", argTypes, term3028, args);
    }

};


