package com.github.bhlangonijr.chesslib;

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
import static com.github.bhlangonijr.chesslib.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Board_isPromoRank_16283598432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1477;
     Object term426958;

    public Board_isPromoRank_16283598432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term427016 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term427015 = ((Class) term427016).getDeclaredField((String) "BLACK");
        ((Field) term427015).setAccessible(true);
        enum1477 = ((Field) term427015).get((Object) null);
        Class<? extends Object> term427218 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term427217 = ((Class) term427218).getDeclaredField((String) "F8");
        ((Field) term427217).setAccessible(true);
        Object enum1478 = ((Field) term427217).get((Object) null);
        Class<? extends Object> term427421 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term427420 = ((Class) term427421).getDeclaredField((String) "G5");
        ((Field) term427420).setAccessible(true);
        Object enum1479 = ((Field) term427420).get((Object) null);
        Class<? extends Object> term427624 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term427623 = ((Class) term427624).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term427623).setAccessible(true);
        Object enum1480 = ((Field) term427623).get((Object) null);
        term426958 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term426958, term426958.getClass(), "from", enum1478);
        setField(term426958, term426958.getClass(), "to", enum1479);
        setField(term426958, term426958.getClass(), "promotion", enum1480);
        setField(term426958, term426958.getClass(), "san", "UGMtNRjhnC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[2];
        args[0] = enum1477;
        args[1] = term426958;
        callMethod(klass, "isPromoRank", argTypes, null, args);
    }

};


