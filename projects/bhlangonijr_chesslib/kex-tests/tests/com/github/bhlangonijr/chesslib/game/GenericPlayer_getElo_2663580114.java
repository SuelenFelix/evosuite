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

public class GenericPlayer_getElo_2663580114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38058;

    public GenericPlayer_getElo_2663580114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38126 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term38125 = ((Class) term38126).getDeclaredField((String) "HUMAN");
        ((Field) term38125).setAccessible(true);
        Object enum108 = ((Field) term38125).get((Object) null);
        term38058 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term38058, term38058.getClass(), "id", "pvDEABOxLt");
        setIntField(term38058, term38058.getClass(), "elo", 1953277050);
        setField(term38058, term38058.getClass(), "name", "beAMpkroCQ");
        setField(term38058, term38058.getClass(), "type", enum108);
        setField(term38058, term38058.getClass(), "description", "uSUvKAyuvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getElo", argTypes, term38058, args);
    }

};


