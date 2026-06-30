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

public class PaoCard_init_3322898210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term53;

    public PaoCard_init_3322898210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Class<? extends Object> term281 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term280 = ((Class) term281).getDeclaredField((String) "THREE");
        ((Field) term280).setAccessible(true);
        Object enum0 = ((Field) term280).get((Object) null);
        Class<? extends Object> term499 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term498 = ((Class) term499).getDeclaredField((String) "HEARTS");
        ((Field) term498).setAccessible(true);
        Object enum1 = ((Field) term498).get((Object) null);
        Long term26 = new Long(6375119433582206027L);
        Long term29 = new Long(-8257434502486459194L);
        Long term32 = new Long(8428634514691209827L);
        Object term25 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term28 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term31 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term25, term25.getClass(), "id", term26);
        setField(term28, term28.getClass(), "id", term29);
        setField(term28, term28.getClass(), "rank", null);
        setField(term28, term28.getClass(), "suit", null);
        setField(term28, term28.getClass(), "paoCards", null);
        setField(term25, term25.getClass(), "card", term28);
        setField(term31, term31.getClass(), "id", term32);
        setField(term31, term31.getClass(), "imageUrl", null);
        setField(term31, term31.getClass(), "person", null);
        setField(term31, term31.getClass(), "action", null);
        setField(term31, term31.getClass(), "object", null);
        setField(term31, term31.getClass(), "paoCard", null);
        setField(term25, term25.getClass(), "pao", term31);
        Long term35 = new Long(6967924379644551255L);
        Object term34 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term37 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term38 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term34, term34.getClass(), "id", term35);
        setField(term37, term37.getClass(), "id", null);
        setField(term37, term37.getClass(), "rank", null);
        setField(term37, term37.getClass(), "suit", null);
        setField(term37, term37.getClass(), "paoCards", null);
        setField(term34, term34.getClass(), "card", term37);
        setField(term38, term38.getClass(), "id", null);
        setField(term38, term38.getClass(), "imageUrl", null);
        setField(term38, term38.getClass(), "person", null);
        setField(term38, term38.getClass(), "action", null);
        setField(term38, term38.getClass(), "object", null);
        setField(term38, term38.getClass(), "paoCard", null);
        setField(term34, term34.getClass(), "pao", term38);
        Long term40 = new Long(-5476826692763582090L);
        Object term39 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term42 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term43 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term39, term39.getClass(), "id", term40);
        setField(term42, term42.getClass(), "id", null);
        setField(term42, term42.getClass(), "rank", null);
        setField(term42, term42.getClass(), "suit", null);
        setField(term42, term42.getClass(), "paoCards", null);
        setField(term39, term39.getClass(), "card", term42);
        setField(term43, term43.getClass(), "id", null);
        setField(term43, term43.getClass(), "imageUrl", null);
        setField(term43, term43.getClass(), "person", null);
        setField(term43, term43.getClass(), "action", null);
        setField(term43, term43.getClass(), "object", null);
        setField(term43, term43.getClass(), "paoCard", null);
        setField(term39, term39.getClass(), "pao", term43);
        Long term45 = new Long(-316468845751588286L);
        Long term48 = new Long(2535595959091595249L);
        Object term44 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term47 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term50 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term44, term44.getClass(), "id", term45);
        setField(term47, term47.getClass(), "id", term48);
        setField(term47, term47.getClass(), "rank", null);
        setField(term47, term47.getClass(), "suit", null);
        setField(term47, term47.getClass(), "paoCards", null);
        setField(term44, term44.getClass(), "card", term47);
        setField(term50, term50.getClass(), "id", null);
        setField(term50, term50.getClass(), "imageUrl", null);
        setField(term50, term50.getClass(), "person", null);
        setField(term50, term50.getClass(), "action", null);
        setField(term50, term50.getClass(), "object", null);
        setField(term50, term50.getClass(), "paoCard", null);
        setField(term44, term44.getClass(), "pao", term50);
        ArrayList term23 = new ArrayList();
        ((ArrayList) term23).add(term25);
        ((ArrayList) term23).add(term34);
        ((ArrayList) term23).add(term39);
        ((ArrayList) term23).add(term44);
        ((ArrayList) term23).add(term44);
        term1 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "rank", enum0);
        setField(term1, term1.getClass(), "suit", enum1);
        setField(term1, term1.getClass(), "paoCards", term23);
        Long term54 = new Long(-2585684163342970173L);
        Long term105 = new Long(8059786003080744426L);
        Long term108 = new Long(-4365849114644724155L);
        Class<? extends Object> term719 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term718 = ((Class) term719).getDeclaredField((String) "QUEEN");
        ((Field) term718).setAccessible(true);
        Object enum2 = ((Field) term718).get((Object) null);
        Class<? extends Object> term896 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term895 = ((Class) term896).getDeclaredField((String) "SPADES");
        ((Field) term895).setAccessible(true);
        Object enum3 = ((Field) term895).get((Object) null);
        ArrayList term116 = new ArrayList();
        ((ArrayList) term116).add((Object)null);
        ((ArrayList) term116).add((Object)null);
        Long term121 = new Long(4178434741742309755L);
        Long term172 = new Long(6855071767938501807L);
        term53 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term104 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term107 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term120 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term171 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term174 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term175 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term53, term53.getClass(), "id", term54);
        setField(term53, term53.getClass(), "imageUrl", "hNxWaHcfhY");
        setField(term53, term53.getClass(), "person", "RkybSrpybU");
        setField(term53, term53.getClass(), "action", "xOEqzGAmDU");
        setField(term53, term53.getClass(), "object", "eZFUvlxvGV");
        setField(term104, term104.getClass(), "id", term105);
        setField(term107, term107.getClass(), "id", term108);
        setField(term107, term107.getClass(), "rank", enum2);
        setField(term107, term107.getClass(), "suit", enum3);
        setField(term107, term107.getClass(), "paoCards", term116);
        setField(term104, term104.getClass(), "card", term107);
        setField(term120, term120.getClass(), "id", term121);
        setField(term120, term120.getClass(), "imageUrl", "xrwlQZdwCp");
        setField(term120, term120.getClass(), "person", "IDCWpPLRkE");
        setField(term120, term120.getClass(), "action", "nyiiPDVjAc");
        setField(term120, term120.getClass(), "object", "aKnKipADSo");
        setField(term171, term171.getClass(), "id", term172);
        setField(term174, term174.getClass(), "id", null);
        setField(term174, term174.getClass(), "rank", null);
        setField(term174, term174.getClass(), "suit", null);
        setField(term174, term174.getClass(), "paoCards", null);
        setField(term171, term171.getClass(), "card", term174);
        setField(term175, term175.getClass(), "id", null);
        setField(term175, term175.getClass(), "imageUrl", null);
        setField(term175, term175.getClass(), "person", null);
        setField(term175, term175.getClass(), "action", null);
        setField(term175, term175.getClass(), "object", null);
        setField(term175, term175.getClass(), "paoCard", null);
        setField(term171, term171.getClass(), "pao", term175);
        setField(term120, term120.getClass(), "paoCard", term171);
        setField(term104, term104.getClass(), "pao", term120);
        setField(term53, term53.getClass(), "paoCard", term104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.PaoCard");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.example.backend.entity.Card");
        argTypes[1] = Class.forName("com.example.backend.entity.Pao");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term53;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


