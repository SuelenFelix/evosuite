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
import java.util.LinkedList;

public class Card_setPaoCards_29267732810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18946;
     Object term18997;

    public Card_setPaoCards_29267732810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18947 = new Long(-6206610574921547811L);
        Class<? extends Object> term19001 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term19000 = ((Class) term19001).getDeclaredField((String) "EIGHT");
        ((Field) term19000).setAccessible(true);
        Object enum79 = ((Field) term19000).get((Object) null);
        Class<? extends Object> term19178 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term19177 = ((Class) term19178).getDeclaredField((String) "DIAMONDS");
        ((Field) term19177).setAccessible(true);
        Object enum80 = ((Field) term19177).get((Object) null);
        Long term18973 = new Long(-1625372334693179543L);
        Long term18976 = new Long(3778691000276335279L);
        Long term18979 = new Long(-6657309314982735134L);
        Object term18972 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term18975 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term18978 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term18972, term18972.getClass(), "id", term18973);
        setField(term18975, term18975.getClass(), "id", term18976);
        setField(term18975, term18975.getClass(), "rank", null);
        setField(term18975, term18975.getClass(), "suit", null);
        setField(term18975, term18975.getClass(), "paoCards", null);
        setField(term18972, term18972.getClass(), "card", term18975);
        setField(term18978, term18978.getClass(), "id", term18979);
        setField(term18978, term18978.getClass(), "imageUrl", null);
        setField(term18978, term18978.getClass(), "person", null);
        setField(term18978, term18978.getClass(), "action", null);
        setField(term18978, term18978.getClass(), "object", null);
        setField(term18978, term18978.getClass(), "paoCard", null);
        setField(term18972, term18972.getClass(), "pao", term18978);
        Long term18982 = new Long(-6265886087280835813L);
        Object term18981 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term18984 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term18985 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term18981, term18981.getClass(), "id", term18982);
        setField(term18984, term18984.getClass(), "id", null);
        setField(term18984, term18984.getClass(), "rank", null);
        setField(term18984, term18984.getClass(), "suit", null);
        setField(term18984, term18984.getClass(), "paoCards", null);
        setField(term18981, term18981.getClass(), "card", term18984);
        setField(term18985, term18985.getClass(), "id", null);
        setField(term18985, term18985.getClass(), "imageUrl", null);
        setField(term18985, term18985.getClass(), "person", null);
        setField(term18985, term18985.getClass(), "action", null);
        setField(term18985, term18985.getClass(), "object", null);
        setField(term18985, term18985.getClass(), "paoCard", null);
        setField(term18981, term18981.getClass(), "pao", term18985);
        Long term18987 = new Long(8453730687540121475L);
        Long term18990 = new Long(8505184530074334434L);
        Long term18993 = new Long(-4944032768681866361L);
        Object term18986 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term18989 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term18992 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term18986, term18986.getClass(), "id", term18987);
        setField(term18989, term18989.getClass(), "id", term18990);
        setField(term18989, term18989.getClass(), "rank", null);
        setField(term18989, term18989.getClass(), "suit", enum80);
        setField(term18989, term18989.getClass(), "paoCards", null);
        setField(term18986, term18986.getClass(), "card", term18989);
        setField(term18992, term18992.getClass(), "id", term18993);
        setField(term18992, term18992.getClass(), "imageUrl", null);
        setField(term18992, term18992.getClass(), "person", null);
        setField(term18992, term18992.getClass(), "action", null);
        setField(term18992, term18992.getClass(), "object", null);
        setField(term18992, term18992.getClass(), "paoCard", null);
        setField(term18986, term18986.getClass(), "pao", term18992);
        ArrayList term18970 = new ArrayList();
        ((ArrayList) term18970).add(term18972);
        ((ArrayList) term18970).add(term18981);
        ((ArrayList) term18970).add(term18986);
        term18946 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term18946, term18946.getClass(), "id", term18947);
        setField(term18946, term18946.getClass(), "rank", enum79);
        setField(term18946, term18946.getClass(), "suit", enum80);
        setField(term18946, term18946.getClass(), "paoCards", term18970);
        term18997 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term18997;
        callMethod(klass, "setPaoCards", argTypes, term18946, args);
    }

};


