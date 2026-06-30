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

public class Card_getSuit_12152720955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16566;

    public Card_getSuit_12152720955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16567 = new Long(-159468133651974975L);
        Class<? extends Object> term16601 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term16600 = ((Class) term16601).getDeclaredField((String) "QUEEN");
        ((Field) term16600).setAccessible(true);
        Object enum67 = ((Field) term16600).get((Object) null);
        Class<? extends Object> term16778 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term16777 = ((Class) term16778).getDeclaredField((String) "CLUBS");
        ((Field) term16777).setAccessible(true);
        Object enum68 = ((Field) term16777).get((Object) null);
        Long term16590 = new Long(9160882370265093763L);
        Long term16593 = new Long(6848008460134431064L);
        Long term16596 = new Long(-823085399570394644L);
        Object term16589 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term16592 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term16595 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term16589, term16589.getClass(), "id", term16590);
        setField(term16592, term16592.getClass(), "id", term16593);
        setField(term16592, term16592.getClass(), "rank", null);
        setField(term16592, term16592.getClass(), "suit", enum68);
        setField(term16592, term16592.getClass(), "paoCards", null);
        setField(term16589, term16589.getClass(), "card", term16592);
        setField(term16595, term16595.getClass(), "id", term16596);
        setField(term16595, term16595.getClass(), "imageUrl", null);
        setField(term16595, term16595.getClass(), "person", null);
        setField(term16595, term16595.getClass(), "action", null);
        setField(term16595, term16595.getClass(), "object", null);
        setField(term16595, term16595.getClass(), "paoCard", null);
        setField(term16589, term16589.getClass(), "pao", term16595);
        ArrayList term16587 = new ArrayList();
        ((ArrayList) term16587).add(term16589);
        term16566 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term16566, term16566.getClass(), "id", term16567);
        setField(term16566, term16566.getClass(), "rank", enum67);
        setField(term16566, term16566.getClass(), "suit", enum68);
        setField(term16566, term16566.getClass(), "paoCards", term16587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuit", argTypes, term16566, args);
    }

};


