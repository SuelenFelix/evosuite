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

public class CardResponse_setRank_39535803812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5482;
     Object enum25;

    public CardResponse_setRank_39535803812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5483 = new Long(2120084523938730454L);
        Class<? extends Object> term5560 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term5559 = ((Class) term5560).getDeclaredField((String) "SEVEN");
        ((Field) term5559).setAccessible(true);
        Object enum23 = ((Field) term5559).get((Object) null);
        Class<? extends Object> term5737 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term5736 = ((Class) term5737).getDeclaredField((String) "CLUBS");
        ((Field) term5736).setAccessible(true);
        Object enum24 = ((Field) term5736).get((Object) null);
        term5482 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term5482, term5482.getClass(), "id", term5483);
        setField(term5482, term5482.getClass(), "rank", enum23);
        setField(term5482, term5482.getClass(), "suit", enum24);
        setField(term5482, term5482.getClass(), "imageUrl", "fhkbdRViHi");
        setField(term5482, term5482.getClass(), "person", "uWHnvSvaPl");
        setField(term5482, term5482.getClass(), "action", "kBdSllIBVz");
        setField(term5482, term5482.getClass(), "object", "TJmVBGfTML");
        Class<? extends Object> term5954 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term5953 = ((Class) term5954).getDeclaredField((String) "FIVE");
        ((Field) term5953).setAccessible(true);
        enum25 = ((Field) term5953).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.backend.entity.Rank");
        Object[] args = new Object[1];
        args[0] = enum25;
        callMethod(klass, "setRank", argTypes, term5482, args);
    }

};


