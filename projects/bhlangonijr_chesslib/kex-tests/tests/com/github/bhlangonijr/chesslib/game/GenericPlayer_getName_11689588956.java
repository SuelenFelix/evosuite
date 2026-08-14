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

public class GenericPlayer_getName_11689588956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38728;

    public GenericPlayer_getName_11689588956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38797 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term38796 = ((Class) term38797).getDeclaredField((String) "ENGINE");
        ((Field) term38796).setAccessible(true);
        Object enum110 = ((Field) term38796).get((Object) null);
        term38728 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term38728, term38728.getClass(), "id", "BwtdjiefJn");
        setIntField(term38728, term38728.getClass(), "elo", 1398204340);
        setField(term38728, term38728.getClass(), "name", "jDmhBrIoDa");
        setField(term38728, term38728.getClass(), "type", enum110);
        setField(term38728, term38728.getClass(), "description", "SPtPatHeOm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term38728, args);
    }

};


