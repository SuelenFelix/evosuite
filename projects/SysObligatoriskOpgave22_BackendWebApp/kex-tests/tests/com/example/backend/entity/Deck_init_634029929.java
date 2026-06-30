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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Deck_init_634029929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20853;
     Object term20879;

    public Deck_init_634029929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20853 = new Long(8621736372873134417L);
        Long term20883 = new Long(5106927272042726665L);
        Long term20886 = new Long(6913945762720683253L);
        Class<? extends Object> term20940 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term20939 = ((Class) term20940).getDeclaredField((String) "FIVE");
        ((Field) term20939).setAccessible(true);
        Object enum85 = ((Field) term20939).get((Object) null);
        Class<? extends Object> term21114 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term21113 = ((Class) term21114).getDeclaredField((String) "DIAMONDS");
        ((Field) term21113).setAccessible(true);
        Object enum86 = ((Field) term21113).get((Object) null);
        ArrayList term20892 = new ArrayList();
        ((ArrayList) term20892).add((Object)null);
        ((ArrayList) term20892).add((Object)null);
        ((ArrayList) term20892).add((Object)null);
        ((ArrayList) term20892).add((Object)null);
        Long term20896 = new Long(-1437596366836021966L);
        Object term20882 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20885 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20895 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term20902 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term20882, term20882.getClass(), "id", term20883);
        setField(term20885, term20885.getClass(), "id", term20886);
        setField(term20885, term20885.getClass(), "rank", enum85);
        setField(term20885, term20885.getClass(), "suit", enum86);
        setField(term20885, term20885.getClass(), "paoCards", term20892);
        setField(term20882, term20882.getClass(), "card", term20885);
        setField(term20895, term20895.getClass(), "id", term20896);
        setField(term20895, term20895.getClass(), "imageUrl", "");
        setField(term20895, term20895.getClass(), "person", "");
        setField(term20895, term20895.getClass(), "action", "");
        setField(term20895, term20895.getClass(), "object", "");
        setField(term20902, term20902.getClass(), "id", null);
        setField(term20902, term20902.getClass(), "card", null);
        setField(term20902, term20902.getClass(), "pao", null);
        setField(term20895, term20895.getClass(), "paoCard", term20902);
        setField(term20882, term20882.getClass(), "pao", term20895);
        Long term20905 = new Long(8542753860527083778L);
        Long term20908 = new Long(-7981877752051488010L);
        Long term20911 = new Long(-761256632171362830L);
        Object term20904 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20907 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20910 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20904, term20904.getClass(), "id", term20905);
        setField(term20907, term20907.getClass(), "id", term20908);
        setField(term20907, term20907.getClass(), "rank", enum85);
        setField(term20907, term20907.getClass(), "suit", null);
        setField(term20907, term20907.getClass(), "paoCards", null);
        setField(term20904, term20904.getClass(), "card", term20907);
        setField(term20910, term20910.getClass(), "id", term20911);
        setField(term20910, term20910.getClass(), "imageUrl", null);
        setField(term20910, term20910.getClass(), "person", null);
        setField(term20910, term20910.getClass(), "action", null);
        setField(term20910, term20910.getClass(), "object", null);
        setField(term20910, term20910.getClass(), "paoCard", null);
        setField(term20904, term20904.getClass(), "pao", term20910);
        Long term20915 = new Long(6975846341920664143L);
        Object term20914 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term20914, term20914.getClass(), "id", term20915);
        setField(term20914, term20914.getClass(), "card", null);
        setField(term20914, term20914.getClass(), "pao", null);
        term20879 = new LinkedList();
        ((LinkedList) term20879).add(term20882);
        ((LinkedList) term20879).add(term20904);
        ((LinkedList) term20879).add(term20914);
        ((LinkedList) term20879).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Deck");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.List");
        Object[] args = new Object[4];
        args[0] = term20853;
        args[1] = "mzCFLzFuSj";
        args[2] = "WQnMpDlSfA";
        args[3] = term20879;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


