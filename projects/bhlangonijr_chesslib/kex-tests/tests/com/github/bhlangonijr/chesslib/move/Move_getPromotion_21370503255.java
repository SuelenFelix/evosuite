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

public class Move_getPromotion_21370503255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205303;

    public Move_getPromotion_21370503255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term205369 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term205368 = ((Class) term205369).getDeclaredField((String) "D6");
        ((Field) term205368).setAccessible(true);
        Object enum800 = ((Field) term205368).get((Object) null);
        Class<? extends Object> term205572 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term205571 = ((Class) term205572).getDeclaredField((String) "H5");
        ((Field) term205571).setAccessible(true);
        Object enum801 = ((Field) term205571).get((Object) null);
        Class<? extends Object> term205775 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term205774 = ((Class) term205775).getDeclaredField((String) "WHITE_PAWN");
        ((Field) term205774).setAccessible(true);
        Object enum802 = ((Field) term205774).get((Object) null);
        term205303 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term205303, term205303.getClass(), "from", enum800);
        setField(term205303, term205303.getClass(), "to", enum801);
        setField(term205303, term205303.getClass(), "promotion", enum802);
        setField(term205303, term205303.getClass(), "san", "UoYtihxVaS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPromotion", argTypes, term205303, args);
    }

};


