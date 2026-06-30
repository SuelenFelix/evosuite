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

public class Card_setSuit_12807503579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18366;
     Object enum78;

    public Card_setSuit_12807503579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18367 = new Long(742593745847006219L);
        Class<? extends Object> term18419 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term18418 = ((Class) term18419).getDeclaredField((String) "TEN");
        ((Field) term18418).setAccessible(true);
        Object enum76 = ((Field) term18418).get((Object) null);
        Class<? extends Object> term18590 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term18589 = ((Class) term18590).getDeclaredField((String) "HEARTS");
        ((Field) term18589).setAccessible(true);
        Object enum77 = ((Field) term18589).get((Object) null);
        Long term18389 = new Long(6801904611028883308L);
        Long term18392 = new Long(-7717027128782374599L);
        Long term18395 = new Long(1731335447688885587L);
        Object term18388 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term18391 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term18394 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term18388, term18388.getClass(), "id", term18389);
        setField(term18391, term18391.getClass(), "id", term18392);
        setField(term18391, term18391.getClass(), "rank", null);
        setField(term18391, term18391.getClass(), "suit", null);
        setField(term18391, term18391.getClass(), "paoCards", null);
        setField(term18388, term18388.getClass(), "card", term18391);
        setField(term18394, term18394.getClass(), "id", term18395);
        setField(term18394, term18394.getClass(), "imageUrl", null);
        setField(term18394, term18394.getClass(), "person", null);
        setField(term18394, term18394.getClass(), "action", null);
        setField(term18394, term18394.getClass(), "object", null);
        setField(term18394, term18394.getClass(), "paoCard", null);
        setField(term18388, term18388.getClass(), "pao", term18394);
        Long term18398 = new Long(-7787918913179897745L);
        Object term18397 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term18400 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term18401 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term18397, term18397.getClass(), "id", term18398);
        setField(term18400, term18400.getClass(), "id", null);
        setField(term18400, term18400.getClass(), "rank", null);
        setField(term18400, term18400.getClass(), "suit", null);
        setField(term18400, term18400.getClass(), "paoCards", null);
        setField(term18397, term18397.getClass(), "card", term18400);
        setField(term18401, term18401.getClass(), "id", null);
        setField(term18401, term18401.getClass(), "imageUrl", null);
        setField(term18401, term18401.getClass(), "person", null);
        setField(term18401, term18401.getClass(), "action", null);
        setField(term18401, term18401.getClass(), "object", null);
        setField(term18401, term18401.getClass(), "paoCard", null);
        setField(term18397, term18397.getClass(), "pao", term18401);
        Long term18403 = new Long(2289954139848415685L);
        Object term18402 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term18405 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term18406 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term18402, term18402.getClass(), "id", term18403);
        setField(term18405, term18405.getClass(), "id", null);
        setField(term18405, term18405.getClass(), "rank", null);
        setField(term18405, term18405.getClass(), "suit", null);
        setField(term18405, term18405.getClass(), "paoCards", null);
        setField(term18402, term18402.getClass(), "card", term18405);
        setField(term18406, term18406.getClass(), "id", null);
        setField(term18406, term18406.getClass(), "imageUrl", null);
        setField(term18406, term18406.getClass(), "person", null);
        setField(term18406, term18406.getClass(), "action", null);
        setField(term18406, term18406.getClass(), "object", null);
        setField(term18406, term18406.getClass(), "paoCard", null);
        setField(term18402, term18402.getClass(), "pao", term18406);
        ArrayList term18386 = new ArrayList();
        ((ArrayList) term18386).add(term18388);
        ((ArrayList) term18386).add(term18397);
        ((ArrayList) term18386).add(term18402);
        term18366 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term18366, term18366.getClass(), "id", term18367);
        setField(term18366, term18366.getClass(), "rank", enum76);
        setField(term18366, term18366.getClass(), "suit", enum77);
        setField(term18366, term18366.getClass(), "paoCards", term18386);
        Class<? extends Object> term18770 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term18769 = ((Class) term18770).getDeclaredField((String) "CLUBS");
        ((Field) term18769).setAccessible(true);
        enum78 = ((Field) term18769).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.backend.entity.Suit");
        Object[] args = new Object[1];
        args[0] = enum78;
        callMethod(klass, "setSuit", argTypes, term18366, args);
    }

};


