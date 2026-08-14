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
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class MoveGenerator_addPromotions_13564275993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107276;
     Object enum364;
     Object enum365;
     Object enum366;

    public MoveGenerator_addPromotions_13564275993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107276 = new LinkedList();
        Class<? extends Object> term107301 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term107300 = ((Class) term107301).getDeclaredField((String) "WHITE");
        ((Field) term107300).setAccessible(true);
        enum364 = ((Field) term107300).get((Object) null);
        Class<? extends Object> term107503 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term107502 = ((Class) term107503).getDeclaredField((String) "D1");
        ((Field) term107502).setAccessible(true);
        enum365 = ((Field) term107502).get((Object) null);
        Class<? extends Object> term107706 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term107705 = ((Class) term107706).getDeclaredField((String) "D8");
        ((Field) term107705).setAccessible(true);
        enum366 = ((Field) term107705).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[3] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[4];
        args[0] = term107276;
        args[1] = enum364;
        args[2] = enum365;
        args[3] = enum366;
        callMethod(klass, "addPromotions", argTypes, null, args);
    }

};


