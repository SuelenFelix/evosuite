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
import java.lang.Integer;

public class GenericPlayer_setElo_2911271955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38392;
     Object term38439;

    public GenericPlayer_setElo_2911271955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38462 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term38461 = ((Class) term38462).getDeclaredField((String) "HUMAN");
        ((Field) term38461).setAccessible(true);
        Object enum109 = ((Field) term38461).get((Object) null);
        term38392 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term38392, term38392.getClass(), "id", "onQLVONGuf");
        setIntField(term38392, term38392.getClass(), "elo", 1283079251);
        setField(term38392, term38392.getClass(), "name", "SOrEHbcbmn");
        setField(term38392, term38392.getClass(), "type", enum109);
        setField(term38392, term38392.getClass(), "description", "bnsyeQXFdu");
        term38439 = new Integer(-523949691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term38439;
        callMethod(klass, "setElo", argTypes, term38392, args);
    }

};


