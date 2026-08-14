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

public class GenericPlayer_setDescription_7965042011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40706;

    public GenericPlayer_setDescription_7965042011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40786 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term40785 = ((Class) term40786).getDeclaredField((String) "HUMAN");
        ((Field) term40785).setAccessible(true);
        Object enum116 = ((Field) term40785).get((Object) null);
        term40706 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term40706, term40706.getClass(), "id", "MYWYUeLGOp");
        setIntField(term40706, term40706.getClass(), "elo", -1002370457);
        setField(term40706, term40706.getClass(), "name", "tsTGdgQYUL");
        setField(term40706, term40706.getClass(), "type", enum116);
        setField(term40706, term40706.getClass(), "description", "TtGbVmKcnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GJVkUrCVdD";
        callMethod(klass, "setDescription", argTypes, term40706, args);
    }

};


