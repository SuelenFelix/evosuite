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

public class Move_equals_14858382796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206006;
     Object term206072;

    public Move_equals_14858382796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term206074 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term206073 = ((Class) term206074).getDeclaredField((String) "D6");
        ((Field) term206073).setAccessible(true);
        Object enum803 = ((Field) term206073).get((Object) null);
        Class<? extends Object> term206277 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term206276 = ((Class) term206277).getDeclaredField((String) "A3");
        ((Field) term206276).setAccessible(true);
        Object enum804 = ((Field) term206276).get((Object) null);
        Class<? extends Object> term206480 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term206479 = ((Class) term206480).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term206479).setAccessible(true);
        Object enum805 = ((Field) term206479).get((Object) null);
        term206006 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term206006, term206006.getClass(), "from", enum803);
        setField(term206006, term206006.getClass(), "to", enum804);
        setField(term206006, term206006.getClass(), "promotion", enum805);
        setField(term206006, term206006.getClass(), "san", "JDswTTCZHV");
        term206072 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term206072;
        callMethod(klass, "equals", argTypes, term206006, args);
    }

};


