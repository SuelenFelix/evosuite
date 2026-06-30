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

public class Pao_setPerson_149174957512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10944;

    public Pao_setPerson_149174957512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10945 = new Long(-8993073054427011802L);
        Long term10996 = new Long(2287785643837657068L);
        Long term10999 = new Long(-7283193381993602128L);
        Class<? extends Object> term11065 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term11064 = ((Class) term11065).getDeclaredField((String) "SIX");
        ((Field) term11064).setAccessible(true);
        Object enum43 = ((Field) term11064).get((Object) null);
        Class<? extends Object> term11236 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term11235 = ((Class) term11236).getDeclaredField((String) "SPADES");
        ((Field) term11235).setAccessible(true);
        Object enum44 = ((Field) term11235).get((Object) null);
        ArrayList term11007 = new ArrayList();
        ((ArrayList) term11007).add((Object)null);
        ((ArrayList) term11007).add((Object)null);
        ((ArrayList) term11007).add((Object)null);
        ((ArrayList) term11007).add((Object)null);
        ((ArrayList) term11007).add((Object)null);
        term10944 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term10995 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term10998 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term11011 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term10944, term10944.getClass(), "id", term10945);
        setField(term10944, term10944.getClass(), "imageUrl", "huVIXUWLtI");
        setField(term10944, term10944.getClass(), "person", "vhKzFyKPOT");
        setField(term10944, term10944.getClass(), "action", "nQhIgWXdRc");
        setField(term10944, term10944.getClass(), "object", "EusenEbIoF");
        setField(term10995, term10995.getClass(), "id", term10996);
        setField(term10998, term10998.getClass(), "id", term10999);
        setField(term10998, term10998.getClass(), "rank", enum43);
        setField(term10998, term10998.getClass(), "suit", enum44);
        setField(term10998, term10998.getClass(), "paoCards", term11007);
        setField(term10995, term10995.getClass(), "card", term10998);
        setField(term11011, term11011.getClass(), "id", null);
        setField(term11011, term11011.getClass(), "imageUrl", null);
        setField(term11011, term11011.getClass(), "person", null);
        setField(term11011, term11011.getClass(), "action", null);
        setField(term11011, term11011.getClass(), "object", null);
        setField(term11011, term11011.getClass(), "paoCard", null);
        setField(term10995, term10995.getClass(), "pao", term11011);
        setField(term10944, term10944.getClass(), "paoCard", term10995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OGQsfjmReM";
        callMethod(klass, "setPerson", argTypes, term10944, args);
    }

};


