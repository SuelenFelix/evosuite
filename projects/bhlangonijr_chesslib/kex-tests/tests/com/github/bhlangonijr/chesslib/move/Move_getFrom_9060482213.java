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

public class Move_getFrom_9060482213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203938;

    public Move_getFrom_9060482213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term203981 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term203980 = ((Class) term203981).getDeclaredField((String) "F5");
        ((Field) term203980).setAccessible(true);
        Object enum794 = ((Field) term203980).get((Object) null);
        Class<? extends Object> term204184 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term204183 = ((Class) term204184).getDeclaredField((String) "D3");
        ((Field) term204183).setAccessible(true);
        Object enum795 = ((Field) term204183).get((Object) null);
        Class<? extends Object> term204387 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term204386 = ((Class) term204387).getDeclaredField((String) "NONE");
        ((Field) term204386).setAccessible(true);
        Object enum796 = ((Field) term204386).get((Object) null);
        term203938 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term203938, term203938.getClass(), "from", enum794);
        setField(term203938, term203938.getClass(), "to", enum795);
        setField(term203938, term203938.getClass(), "promotion", enum796);
        setField(term203938, term203938.getClass(), "san", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrom", argTypes, term203938, args);
    }

};


