package com.github.bhlangonijr.chesslib.move;

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
import static com.github.bhlangonijr.chesslib.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Move_getType_479583409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208123;

    public Move_getType_479583409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term208189 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term208188 = ((Class) term208189).getDeclaredField((String) "E3");
        ((Field) term208188).setAccessible(true);
        Object enum812 = ((Field) term208188).get((Object) null);
        Class<? extends Object> term208392 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term208391 = ((Class) term208392).getDeclaredField((String) "C2");
        ((Field) term208391).setAccessible(true);
        Object enum813 = ((Field) term208391).get((Object) null);
        Class<? extends Object> term208595 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term208594 = ((Class) term208595).getDeclaredField((String) "BLACK_PAWN");
        ((Field) term208594).setAccessible(true);
        Object enum814 = ((Field) term208594).get((Object) null);
        term208123 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term208123, term208123.getClass(), "from", enum812);
        setField(term208123, term208123.getClass(), "to", enum813);
        setField(term208123, term208123.getClass(), "promotion", enum814);
        setField(term208123, term208123.getClass(), "san", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term208123, args);
    }

};


