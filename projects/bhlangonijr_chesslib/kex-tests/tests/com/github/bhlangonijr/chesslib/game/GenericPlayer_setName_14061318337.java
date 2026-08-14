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

public class GenericPlayer_setName_14061318337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39066;

    public GenericPlayer_setName_14061318337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39147 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term39146 = ((Class) term39147).getDeclaredField((String) "ENGINE");
        ((Field) term39146).setAccessible(true);
        Object enum111 = ((Field) term39146).get((Object) null);
        term39066 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term39066, term39066.getClass(), "id", "ywmcuThdfL");
        setIntField(term39066, term39066.getClass(), "elo", 229204365);
        setField(term39066, term39066.getClass(), "name", "GBOEuByOfr");
        setField(term39066, term39066.getClass(), "type", enum111);
        setField(term39066, term39066.getClass(), "description", "NHbOFFjyVK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zaloBqlrSo";
        callMethod(klass, "setName", argTypes, term39066, args);
    }

};


