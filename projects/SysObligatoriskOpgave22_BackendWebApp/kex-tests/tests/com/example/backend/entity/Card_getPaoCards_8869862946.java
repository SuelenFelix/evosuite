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

public class Card_getPaoCards_8869862946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16954;

    public Card_getPaoCards_8869862946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16955 = new Long(-894705411488729365L);
        Class<? extends Object> term17008 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term17007 = ((Class) term17008).getDeclaredField((String) "NINE");
        ((Field) term17007).setAccessible(true);
        Object enum69 = ((Field) term17007).get((Object) null);
        Class<? extends Object> term17182 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term17181 = ((Class) term17182).getDeclaredField((String) "SPADES");
        ((Field) term17181).setAccessible(true);
        Object enum70 = ((Field) term17181).get((Object) null);
        Long term16978 = new Long(-7514437039500876647L);
        Long term16981 = new Long(204473662283899955L);
        Long term16984 = new Long(-1486519351300660432L);
        Object term16977 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term16980 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term16983 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term16977, term16977.getClass(), "id", term16978);
        setField(term16980, term16980.getClass(), "id", term16981);
        setField(term16980, term16980.getClass(), "rank", null);
        setField(term16980, term16980.getClass(), "suit", null);
        setField(term16980, term16980.getClass(), "paoCards", null);
        setField(term16977, term16977.getClass(), "card", term16980);
        setField(term16983, term16983.getClass(), "id", term16984);
        setField(term16983, term16983.getClass(), "imageUrl", null);
        setField(term16983, term16983.getClass(), "person", null);
        setField(term16983, term16983.getClass(), "action", null);
        setField(term16983, term16983.getClass(), "object", null);
        setField(term16983, term16983.getClass(), "paoCard", null);
        setField(term16977, term16977.getClass(), "pao", term16983);
        Long term16987 = new Long(6978548804004471804L);
        Object term16986 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term16989 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term16990 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term16986, term16986.getClass(), "id", term16987);
        setField(term16989, term16989.getClass(), "id", null);
        setField(term16989, term16989.getClass(), "rank", null);
        setField(term16989, term16989.getClass(), "suit", null);
        setField(term16989, term16989.getClass(), "paoCards", null);
        setField(term16986, term16986.getClass(), "card", term16989);
        setField(term16990, term16990.getClass(), "id", null);
        setField(term16990, term16990.getClass(), "imageUrl", null);
        setField(term16990, term16990.getClass(), "person", null);
        setField(term16990, term16990.getClass(), "action", null);
        setField(term16990, term16990.getClass(), "object", null);
        setField(term16990, term16990.getClass(), "paoCard", null);
        setField(term16986, term16986.getClass(), "pao", term16990);
        Long term16992 = new Long(8261619652909874476L);
        Long term16995 = new Long(-3692936312179064102L);
        Long term16998 = new Long(4947643967691976731L);
        Object term16991 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term16994 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term16997 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term16991, term16991.getClass(), "id", term16992);
        setField(term16994, term16994.getClass(), "id", term16995);
        setField(term16994, term16994.getClass(), "rank", null);
        setField(term16994, term16994.getClass(), "suit", null);
        setField(term16994, term16994.getClass(), "paoCards", null);
        setField(term16991, term16991.getClass(), "card", term16994);
        setField(term16997, term16997.getClass(), "id", term16998);
        setField(term16997, term16997.getClass(), "imageUrl", null);
        setField(term16997, term16997.getClass(), "person", null);
        setField(term16997, term16997.getClass(), "action", null);
        setField(term16997, term16997.getClass(), "object", null);
        setField(term16997, term16997.getClass(), "paoCard", null);
        setField(term16991, term16991.getClass(), "pao", term16997);
        Long term17001 = new Long(-6838909359433858599L);
        Object term17000 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term17003 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term17004 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term17000, term17000.getClass(), "id", term17001);
        setField(term17003, term17003.getClass(), "id", null);
        setField(term17003, term17003.getClass(), "rank", null);
        setField(term17003, term17003.getClass(), "suit", null);
        setField(term17003, term17003.getClass(), "paoCards", null);
        setField(term17000, term17000.getClass(), "card", term17003);
        setField(term17004, term17004.getClass(), "id", null);
        setField(term17004, term17004.getClass(), "imageUrl", null);
        setField(term17004, term17004.getClass(), "person", null);
        setField(term17004, term17004.getClass(), "action", null);
        setField(term17004, term17004.getClass(), "object", null);
        setField(term17004, term17004.getClass(), "paoCard", null);
        setField(term17000, term17000.getClass(), "pao", term17004);
        ArrayList term16975 = new ArrayList();
        ((ArrayList) term16975).add(term16977);
        ((ArrayList) term16975).add(term16986);
        ((ArrayList) term16975).add(term16991);
        ((ArrayList) term16975).add(term17000);
        term16954 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term16954, term16954.getClass(), "id", term16955);
        setField(term16954, term16954.getClass(), "rank", enum69);
        setField(term16954, term16954.getClass(), "suit", enum70);
        setField(term16954, term16954.getClass(), "paoCards", term16975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaoCards", argTypes, term16954, args);
    }

};


