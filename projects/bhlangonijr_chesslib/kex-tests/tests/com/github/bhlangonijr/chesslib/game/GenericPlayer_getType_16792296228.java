package com.github.bhlangonijr.chesslib.game;

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
import static com.github.bhlangonijr.chesslib.game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GenericPlayer_getType_16792296228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39426;

    public GenericPlayer_getType_16792296228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39495 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term39494 = ((Class) term39495).getDeclaredField((String) "ENGINE");
        ((Field) term39494).setAccessible(true);
        Object enum112 = ((Field) term39494).get((Object) null);
        term39426 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term39426, term39426.getClass(), "id", "vvoLrMGCoN");
        setIntField(term39426, term39426.getClass(), "elo", -461771056);
        setField(term39426, term39426.getClass(), "name", "pXdglvyrQe");
        setField(term39426, term39426.getClass(), "type", enum112);
        setField(term39426, term39426.getClass(), "description", "OcfNzHYdki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term39426, args);
    }

};


