package com.example.backend.dto;

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
import static com.example.backend.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Boolean;

public class CardResponse_init_12800527300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term109;

    public CardResponse_init_12800527300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Long term5 = new Long(6375119433582206027L);
        Class<? extends Object> term216 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term215 = ((Class) term216).getDeclaredField((String) "THREE");
        ((Field) term215).setAccessible(true);
        Object enum0 = ((Field) term215).get((Object) null);
        Class<? extends Object> term434 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term433 = ((Class) term434).getDeclaredField((String) "HEARTS");
        ((Field) term433).setAccessible(true);
        Object enum1 = ((Field) term433).get((Object) null);
        Long term29 = new Long(-8257434502486459194L);
        Object term28 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term28, term28.getClass(), "id", term29);
        setField(term28, term28.getClass(), "card", null);
        setField(term28, term28.getClass(), "pao", null);
        Long term32 = new Long(-7237588299778557629L);
        Object term31 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term31, term31.getClass(), "id", term32);
        setField(term31, term31.getClass(), "card", null);
        setField(term31, term31.getClass(), "pao", null);
        Long term35 = new Long(-8885298608300233488L);
        Object term34 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term34, term34.getClass(), "id", term35);
        setField(term34, term34.getClass(), "card", null);
        setField(term34, term34.getClass(), "pao", null);
        Object term37 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term37, term37.getClass(), "id", null);
        setField(term37, term37.getClass(), "card", null);
        setField(term37, term37.getClass(), "pao", null);
        ArrayList term26 = new ArrayList();
        ((ArrayList) term26).add(term28);
        ((ArrayList) term26).add(term31);
        ((ArrayList) term26).add(term34);
        ((ArrayList) term26).add(term37);
        ((ArrayList) term26).add(term37);
        Long term41 = new Long(5127676408959197577L);
        Long term92 = new Long(4872422362414183754L);
        Long term95 = new Long(6811161968424632369L);
        Class<? extends Object> term654 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term653 = ((Class) term654).getDeclaredField((String) "QUEEN");
        ((Field) term653).setAccessible(true);
        Object enum2 = ((Field) term653).get((Object) null);
        ArrayList term99 = new ArrayList();
        ((ArrayList) term99).add((Object)null);
        ((ArrayList) term99).add((Object)null);
        ((ArrayList) term99).add((Object)null);
        ((ArrayList) term99).add((Object)null);
        Long term103 = new Long(-5476826692763582090L);
        term1 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term4 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term40 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term91 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term94 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term102 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term4, term4.getClass(), "id", term5);
        setField(term4, term4.getClass(), "rank", enum0);
        setField(term4, term4.getClass(), "suit", enum1);
        setField(term4, term4.getClass(), "paoCards", term26);
        setField(term1, term1.getClass(), "card", term4);
        setField(term40, term40.getClass(), "id", term41);
        setField(term40, term40.getClass(), "imageUrl", "hNxWaHcfhY");
        setField(term40, term40.getClass(), "person", "RkybSrpybU");
        setField(term40, term40.getClass(), "action", "xOEqzGAmDU");
        setField(term40, term40.getClass(), "object", "eZFUvlxvGV");
        setField(term91, term91.getClass(), "id", term92);
        setField(term94, term94.getClass(), "id", term95);
        setField(term94, term94.getClass(), "rank", enum2);
        setField(term94, term94.getClass(), "suit", enum1);
        setField(term94, term94.getClass(), "paoCards", term99);
        setField(term91, term91.getClass(), "card", term94);
        setField(term102, term102.getClass(), "id", term103);
        setField(term102, term102.getClass(), "imageUrl", "");
        setField(term102, term102.getClass(), "person", "");
        setField(term102, term102.getClass(), "action", "");
        setField(term102, term102.getClass(), "object", "");
        setField(term102, term102.getClass(), "paoCard", term37);
        setField(term91, term91.getClass(), "pao", term102);
        setField(term40, term40.getClass(), "paoCard", term91);
        setField(term1, term1.getClass(), "pao", term40);
        term109 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.example.backend.entity.PaoCard");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term109;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


