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

public class Move_getTo_14110819324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204600;

    public Move_getTo_14110819324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term204666 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term204665 = ((Class) term204666).getDeclaredField((String) "C8");
        ((Field) term204665).setAccessible(true);
        Object enum797 = ((Field) term204665).get((Object) null);
        Class<? extends Object> term204869 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term204868 = ((Class) term204869).getDeclaredField((String) "A1");
        ((Field) term204868).setAccessible(true);
        Object enum798 = ((Field) term204868).get((Object) null);
        Class<? extends Object> term205072 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term205071 = ((Class) term205072).getDeclaredField((String) "WHITE_PAWN");
        ((Field) term205071).setAccessible(true);
        Object enum799 = ((Field) term205071).get((Object) null);
        term204600 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term204600, term204600.getClass(), "from", enum797);
        setField(term204600, term204600.getClass(), "to", enum798);
        setField(term204600, term204600.getClass(), "promotion", enum799);
        setField(term204600, term204600.getClass(), "san", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTo", argTypes, term204600, args);
    }

};


