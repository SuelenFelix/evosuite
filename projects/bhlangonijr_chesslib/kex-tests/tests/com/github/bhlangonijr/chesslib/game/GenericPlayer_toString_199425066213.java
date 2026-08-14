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

public class GenericPlayer_toString_199425066213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41400;

    public GenericPlayer_toString_199425066213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41468 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term41467 = ((Class) term41468).getDeclaredField((String) "HUMAN");
        ((Field) term41467).setAccessible(true);
        Object enum118 = ((Field) term41467).get((Object) null);
        term41400 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term41400, term41400.getClass(), "id", "urCiQnUFBM");
        setIntField(term41400, term41400.getClass(), "elo", 1296895584);
        setField(term41400, term41400.getClass(), "name", "EKjQdtKxAM");
        setField(term41400, term41400.getClass(), "type", enum118);
        setField(term41400, term41400.getClass(), "description", "TXZAIPQJHt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term41400, args);
    }

};


