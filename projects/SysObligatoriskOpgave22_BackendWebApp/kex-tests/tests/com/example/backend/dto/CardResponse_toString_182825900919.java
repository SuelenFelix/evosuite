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

public class CardResponse_toString_182825900919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8724;

    public CardResponse_toString_182825900919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8725 = new Long(1233889271256172047L);
        Class<? extends Object> term8795 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term8794 = ((Class) term8795).getDeclaredField((String) "THREE");
        ((Field) term8794).setAccessible(true);
        Object enum37 = ((Field) term8794).get((Object) null);
        Class<? extends Object> term8972 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term8971 = ((Class) term8972).getDeclaredField((String) "SPADES");
        ((Field) term8971).setAccessible(true);
        Object enum38 = ((Field) term8971).get((Object) null);
        term8724 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term8724, term8724.getClass(), "id", term8725);
        setField(term8724, term8724.getClass(), "rank", enum37);
        setField(term8724, term8724.getClass(), "suit", enum38);
        setField(term8724, term8724.getClass(), "imageUrl", "GVizqqzXpy");
        setField(term8724, term8724.getClass(), "person", "JqXGgAhZPl");
        setField(term8724, term8724.getClass(), "action", "jiKYgYHqIS");
        setField(term8724, term8724.getClass(), "object", "DfISiziTgG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8724, args);
    }

};


