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

public class Move_getSan_203977052210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208826;

    public Move_getSan_203977052210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term208893 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term208892 = ((Class) term208893).getDeclaredField((String) "G8");
        ((Field) term208892).setAccessible(true);
        Object enum815 = ((Field) term208892).get((Object) null);
        Class<? extends Object> term209096 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term209095 = ((Class) term209096).getDeclaredField((String) "B5");
        ((Field) term209095).setAccessible(true);
        Object enum816 = ((Field) term209095).get((Object) null);
        Class<? extends Object> term209299 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term209298 = ((Class) term209299).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term209298).setAccessible(true);
        Object enum817 = ((Field) term209298).get((Object) null);
        term208826 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term208826, term208826.getClass(), "from", enum815);
        setField(term208826, term208826.getClass(), "to", enum816);
        setField(term208826, term208826.getClass(), "promotion", enum817);
        setField(term208826, term208826.getClass(), "san", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSan", argTypes, term208826, args);
    }

};


