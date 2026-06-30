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

public class CardResponse_setImageUrl_101212779914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6784;

    public CardResponse_setImageUrl_101212779914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6785 = new Long(-5892135042702373494L);
        Class<? extends Object> term6865 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term6864 = ((Class) term6865).getDeclaredField((String) "TWO");
        ((Field) term6864).setAccessible(true);
        Object enum29 = ((Field) term6864).get((Object) null);
        Class<? extends Object> term7036 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term7035 = ((Class) term7036).getDeclaredField((String) "HEARTS");
        ((Field) term7035).setAccessible(true);
        Object enum30 = ((Field) term7035).get((Object) null);
        term6784 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term6784, term6784.getClass(), "id", term6785);
        setField(term6784, term6784.getClass(), "rank", enum29);
        setField(term6784, term6784.getClass(), "suit", enum30);
        setField(term6784, term6784.getClass(), "imageUrl", "JUmudUmaaV");
        setField(term6784, term6784.getClass(), "person", "KoyGrUJeJW");
        setField(term6784, term6784.getClass(), "action", "HqBOwkVqjD");
        setField(term6784, term6784.getClass(), "object", "MAcUBcBckh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        callMethod(klass, "setImageUrl", argTypes, term6784, args);
    }

};


