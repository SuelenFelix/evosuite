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

public class Move_hashCode_19345249547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206711;

    public Move_hashCode_19345249547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term206780 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term206779 = ((Class) term206780).getDeclaredField((String) "H6");
        ((Field) term206779).setAccessible(true);
        Object enum806 = ((Field) term206779).get((Object) null);
        Class<? extends Object> term206983 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term206982 = ((Class) term206983).getDeclaredField((String) "F6");
        ((Field) term206982).setAccessible(true);
        Object enum807 = ((Field) term206982).get((Object) null);
        Class<? extends Object> term207186 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term207185 = ((Class) term207186).getDeclaredField((String) "WHITE_QUEEN");
        ((Field) term207185).setAccessible(true);
        Object enum808 = ((Field) term207185).get((Object) null);
        term206711 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term206711, term206711.getClass(), "from", enum806);
        setField(term206711, term206711.getClass(), "to", enum807);
        setField(term206711, term206711.getClass(), "promotion", enum808);
        setField(term206711, term206711.getClass(), "san", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term206711, args);
    }

};


