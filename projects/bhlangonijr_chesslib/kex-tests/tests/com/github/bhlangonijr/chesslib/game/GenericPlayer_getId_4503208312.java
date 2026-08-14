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

public class GenericPlayer_getId_4503208312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37368;

    public GenericPlayer_getId_4503208312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37436 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term37435 = ((Class) term37436).getDeclaredField((String) "HUMAN");
        ((Field) term37435).setAccessible(true);
        Object enum106 = ((Field) term37435).get((Object) null);
        term37368 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term37368, term37368.getClass(), "id", "doQLHkjpNm");
        setIntField(term37368, term37368.getClass(), "elo", -227365013);
        setField(term37368, term37368.getClass(), "name", "lCyLIcSuom");
        setField(term37368, term37368.getClass(), "type", enum106);
        setField(term37368, term37368.getClass(), "description", "CGOpQSZZwI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term37368, args);
    }

};


