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
import java.lang.String;
import java.lang.Object;

public class CardResponse_getRank_21021303645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2231;

    public CardResponse_getRank_21021303645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2232 = new Long(-2585684163342970173L);
        Class<? extends Object> term2300 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term2299 = ((Class) term2300).getDeclaredField((String) "FOUR");
        ((Field) term2299).setAccessible(true);
        Object enum9 = ((Field) term2299).get((Object) null);
        Class<? extends Object> term2474 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term2473 = ((Class) term2474).getDeclaredField((String) "CLUBS");
        ((Field) term2473).setAccessible(true);
        Object enum10 = ((Field) term2473).get((Object) null);
        term2231 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term2231, term2231.getClass(), "id", term2232);
        setField(term2231, term2231.getClass(), "rank", enum9);
        setField(term2231, term2231.getClass(), "suit", enum10);
        setField(term2231, term2231.getClass(), "imageUrl", "xrwlQZdwCp");
        setField(term2231, term2231.getClass(), "person", "IDCWpPLRkE");
        setField(term2231, term2231.getClass(), "action", "nyiiPDVjAc");
        setField(term2231, term2231.getClass(), "object", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRank", argTypes, term2231, args);
    }

};


