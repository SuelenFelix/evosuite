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

public class Pao_setImageUrl_191641874611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10365;

    public Pao_setImageUrl_191641874611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10366 = new Long(-1571034605670661708L);
        Long term10417 = new Long(-7983954942068142191L);
        Long term10420 = new Long(2274723545906746965L);
        Class<? extends Object> term10541 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term10540 = ((Class) term10541).getDeclaredField((String) "EIGHT");
        ((Field) term10540).setAccessible(true);
        Object enum41 = ((Field) term10540).get((Object) null);
        Class<? extends Object> term10718 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term10717 = ((Class) term10718).getDeclaredField((String) "CLUBS");
        ((Field) term10717).setAccessible(true);
        Object enum42 = ((Field) term10717).get((Object) null);
        ArrayList term10428 = new ArrayList();
        ((ArrayList) term10428).add((Object)null);
        ((ArrayList) term10428).add((Object)null);
        ((ArrayList) term10428).add((Object)null);
        Long term10433 = new Long(-7400951017937830861L);
        Long term10484 = new Long(-8303973304709662279L);
        term10365 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term10416 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term10419 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term10432 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term10483 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term10486 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term10487 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term10365, term10365.getClass(), "id", term10366);
        setField(term10365, term10365.getClass(), "imageUrl", "zjZYTddemL");
        setField(term10365, term10365.getClass(), "person", "QtrylgCLiF");
        setField(term10365, term10365.getClass(), "action", "orEuhCStGM");
        setField(term10365, term10365.getClass(), "object", "HhEaSXWvrY");
        setField(term10416, term10416.getClass(), "id", term10417);
        setField(term10419, term10419.getClass(), "id", term10420);
        setField(term10419, term10419.getClass(), "rank", enum41);
        setField(term10419, term10419.getClass(), "suit", enum42);
        setField(term10419, term10419.getClass(), "paoCards", term10428);
        setField(term10416, term10416.getClass(), "card", term10419);
        setField(term10432, term10432.getClass(), "id", term10433);
        setField(term10432, term10432.getClass(), "imageUrl", "uXYcXVYJZM");
        setField(term10432, term10432.getClass(), "person", "BJhjdJUhkz");
        setField(term10432, term10432.getClass(), "action", "cdHYQDgUZR");
        setField(term10432, term10432.getClass(), "object", "KAORSSPSeV");
        setField(term10483, term10483.getClass(), "id", term10484);
        setField(term10486, term10486.getClass(), "id", null);
        setField(term10486, term10486.getClass(), "rank", null);
        setField(term10486, term10486.getClass(), "suit", null);
        setField(term10486, term10486.getClass(), "paoCards", null);
        setField(term10483, term10483.getClass(), "card", term10486);
        setField(term10487, term10487.getClass(), "id", null);
        setField(term10487, term10487.getClass(), "imageUrl", null);
        setField(term10487, term10487.getClass(), "person", null);
        setField(term10487, term10487.getClass(), "action", null);
        setField(term10487, term10487.getClass(), "object", null);
        setField(term10487, term10487.getClass(), "paoCard", null);
        setField(term10483, term10483.getClass(), "pao", term10487);
        setField(term10432, term10432.getClass(), "paoCard", term10483);
        setField(term10416, term10416.getClass(), "pao", term10432);
        setField(term10365, term10365.getClass(), "paoCard", term10416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UimMMORkzd";
        callMethod(klass, "setImageUrl", argTypes, term10365, args);
    }

};


