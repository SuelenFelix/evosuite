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

public class Move_toString_18496826528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207420;

    public Move_toString_18496826528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207486 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term207485 = ((Class) term207486).getDeclaredField((String) "A7");
        ((Field) term207485).setAccessible(true);
        Object enum809 = ((Field) term207485).get((Object) null);
        Class<? extends Object> term207689 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term207688 = ((Class) term207689).getDeclaredField((String) "C7");
        ((Field) term207688).setAccessible(true);
        Object enum810 = ((Field) term207688).get((Object) null);
        Class<? extends Object> term207892 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term207891 = ((Class) term207892).getDeclaredField((String) "BLACK_PAWN");
        ((Field) term207891).setAccessible(true);
        Object enum811 = ((Field) term207891).get((Object) null);
        term207420 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term207420, term207420.getClass(), "from", enum809);
        setField(term207420, term207420.getClass(), "to", enum810);
        setField(term207420, term207420.getClass(), "promotion", enum811);
        setField(term207420, term207420.getClass(), "san", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term207420, args);
    }

};


