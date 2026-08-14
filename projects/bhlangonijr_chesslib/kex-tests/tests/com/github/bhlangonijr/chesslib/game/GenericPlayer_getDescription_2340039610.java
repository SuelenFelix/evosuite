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

public class GenericPlayer_getDescription_2340039610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40368;

    public GenericPlayer_getDescription_2340039610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40437 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term40436 = ((Class) term40437).getDeclaredField((String) "ENGINE");
        ((Field) term40436).setAccessible(true);
        Object enum115 = ((Field) term40436).get((Object) null);
        term40368 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term40368, term40368.getClass(), "id", "FjOiNAfBOc");
        setIntField(term40368, term40368.getClass(), "elo", 1384592638);
        setField(term40368, term40368.getClass(), "name", "iCCsaLHohG");
        setField(term40368, term40368.getClass(), "type", enum115);
        setField(term40368, term40368.getClass(), "description", "NJhGgctbdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term40368, args);
    }

};


