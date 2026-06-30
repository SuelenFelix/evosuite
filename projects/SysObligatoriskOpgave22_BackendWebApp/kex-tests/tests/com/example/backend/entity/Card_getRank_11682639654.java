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

public class Card_getRank_11682639654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16160;

    public Card_getRank_11682639654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16161 = new Long(-8928717808154338062L);
        Class<? extends Object> term16210 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term16209 = ((Class) term16210).getDeclaredField((String) "ACE");
        ((Field) term16209).setAccessible(true);
        Object enum65 = ((Field) term16209).get((Object) null);
        Class<? extends Object> term16381 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term16380 = ((Class) term16381).getDeclaredField((String) "DIAMONDS");
        ((Field) term16380).setAccessible(true);
        Object enum66 = ((Field) term16380).get((Object) null);
        Long term16185 = new Long(4628458998884457238L);
        Long term16188 = new Long(-6806576523000182981L);
        Long term16191 = new Long(5614572229094721840L);
        Object term16184 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term16187 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term16190 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term16184, term16184.getClass(), "id", term16185);
        setField(term16187, term16187.getClass(), "id", term16188);
        setField(term16187, term16187.getClass(), "rank", null);
        setField(term16187, term16187.getClass(), "suit", null);
        setField(term16187, term16187.getClass(), "paoCards", null);
        setField(term16184, term16184.getClass(), "card", term16187);
        setField(term16190, term16190.getClass(), "id", term16191);
        setField(term16190, term16190.getClass(), "imageUrl", null);
        setField(term16190, term16190.getClass(), "person", null);
        setField(term16190, term16190.getClass(), "action", null);
        setField(term16190, term16190.getClass(), "object", null);
        setField(term16190, term16190.getClass(), "paoCard", null);
        setField(term16184, term16184.getClass(), "pao", term16190);
        Long term16194 = new Long(-5367775625638780650L);
        Long term16197 = new Long(-7830820957252387854L);
        Long term16200 = new Long(-4187265590402169996L);
        Object term16193 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term16196 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term16199 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term16193, term16193.getClass(), "id", term16194);
        setField(term16196, term16196.getClass(), "id", term16197);
        setField(term16196, term16196.getClass(), "rank", enum65);
        setField(term16196, term16196.getClass(), "suit", null);
        setField(term16196, term16196.getClass(), "paoCards", null);
        setField(term16193, term16193.getClass(), "card", term16196);
        setField(term16199, term16199.getClass(), "id", term16200);
        setField(term16199, term16199.getClass(), "imageUrl", null);
        setField(term16199, term16199.getClass(), "person", null);
        setField(term16199, term16199.getClass(), "action", null);
        setField(term16199, term16199.getClass(), "object", null);
        setField(term16199, term16199.getClass(), "paoCard", null);
        setField(term16193, term16193.getClass(), "pao", term16199);
        Long term16203 = new Long(-8985577692063635272L);
        Object term16202 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term16205 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term16206 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term16202, term16202.getClass(), "id", term16203);
        setField(term16205, term16205.getClass(), "id", null);
        setField(term16205, term16205.getClass(), "rank", null);
        setField(term16205, term16205.getClass(), "suit", null);
        setField(term16205, term16205.getClass(), "paoCards", null);
        setField(term16202, term16202.getClass(), "card", term16205);
        setField(term16206, term16206.getClass(), "id", null);
        setField(term16206, term16206.getClass(), "imageUrl", null);
        setField(term16206, term16206.getClass(), "person", null);
        setField(term16206, term16206.getClass(), "action", null);
        setField(term16206, term16206.getClass(), "object", null);
        setField(term16206, term16206.getClass(), "paoCard", null);
        setField(term16202, term16202.getClass(), "pao", term16206);
        ArrayList term16182 = new ArrayList();
        ((ArrayList) term16182).add(term16184);
        ((ArrayList) term16182).add(term16193);
        ((ArrayList) term16182).add(term16202);
        term16160 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term16160, term16160.getClass(), "id", term16161);
        setField(term16160, term16160.getClass(), "rank", enum65);
        setField(term16160, term16160.getClass(), "suit", enum66);
        setField(term16160, term16160.getClass(), "paoCards", term16182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRank", argTypes, term16160, args);
    }

};


