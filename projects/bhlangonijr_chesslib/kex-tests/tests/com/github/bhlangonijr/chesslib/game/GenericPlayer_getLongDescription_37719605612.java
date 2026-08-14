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

public class GenericPlayer_getLongDescription_37719605612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41062;

    public GenericPlayer_getLongDescription_37719605612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41131 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term41130 = ((Class) term41131).getDeclaredField((String) "ENGINE");
        ((Field) term41130).setAccessible(true);
        Object enum117 = ((Field) term41130).get((Object) null);
        term41062 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term41062, term41062.getClass(), "id", "zNdorvdUgu");
        setIntField(term41062, term41062.getClass(), "elo", -2014576105);
        setField(term41062, term41062.getClass(), "name", "oPxuZbkYio");
        setField(term41062, term41062.getClass(), "type", enum117);
        setField(term41062, term41062.getClass(), "description", "vKitydDVnM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLongDescription", argTypes, term41062, args);
    }

};


