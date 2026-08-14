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

public class Move_setSan_88181559011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209530;

    public Move_setSan_88181559011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term209613 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term209612 = ((Class) term209613).getDeclaredField((String) "D8");
        ((Field) term209612).setAccessible(true);
        Object enum818 = ((Field) term209612).get((Object) null);
        Class<? extends Object> term209816 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term209815 = ((Class) term209816).getDeclaredField((String) "C4");
        ((Field) term209815).setAccessible(true);
        Object enum819 = ((Field) term209815).get((Object) null);
        Class<? extends Object> term210019 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term210018 = ((Class) term210019).getDeclaredField((String) "BLACK_BISHOP");
        ((Field) term210018).setAccessible(true);
        Object enum820 = ((Field) term210018).get((Object) null);
        term209530 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term209530, term209530.getClass(), "from", enum818);
        setField(term209530, term209530.getClass(), "to", enum819);
        setField(term209530, term209530.getClass(), "promotion", enum820);
        setField(term209530, term209530.getClass(), "san", "ytSBIKXogI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nHXjMycHlU";
        callMethod(klass, "setSan", argTypes, term209530, args);
    }

};


