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

public class CardResponse_getId_20307774554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1756;

    public CardResponse_getId_20307774554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1757 = new Long(8428634514691209827L);
        Class<? extends Object> term1829 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term1828 = ((Class) term1829).getDeclaredField((String) "SEVEN");
        ((Field) term1828).setAccessible(true);
        Object enum7 = ((Field) term1828).get((Object) null);
        Class<? extends Object> term2006 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term2005 = ((Class) term2006).getDeclaredField((String) "DIAMONDS");
        ((Field) term2005).setAccessible(true);
        Object enum8 = ((Field) term2005).get((Object) null);
        term1756 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term1756, term1756.getClass(), "id", term1757);
        setField(term1756, term1756.getClass(), "rank", enum7);
        setField(term1756, term1756.getClass(), "suit", enum8);
        setField(term1756, term1756.getClass(), "imageUrl", "AijpHYOFuy");
        setField(term1756, term1756.getClass(), "person", "SbAoxhfrkn");
        setField(term1756, term1756.getClass(), "action", "kuTXqwMtDB");
        setField(term1756, term1756.getClass(), "object", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1756, args);
    }

};


