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

public class GenericPlayer_setType_14626229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39764;
     Object enum114;

    public GenericPlayer_setType_14626229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39842 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term39841 = ((Class) term39842).getDeclaredField((String) "ENGINE");
        ((Field) term39841).setAccessible(true);
        Object enum113 = ((Field) term39841).get((Object) null);
        term39764 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term39764, term39764.getClass(), "id", "uPuCVuZYOI");
        setIntField(term39764, term39764.getClass(), "elo", -243422082);
        setField(term39764, term39764.getClass(), "name", "TweMFhxNdj");
        setField(term39764, term39764.getClass(), "type", enum113);
        setField(term39764, term39764.getClass(), "description", "NBrvVzvQHe");
        Class<? extends Object> term40112 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term40111 = ((Class) term40112).getDeclaredField((String) "HUMAN");
        ((Field) term40111).setAccessible(true);
        enum114 = ((Field) term40111).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.PlayerType");
        Object[] args = new Object[1];
        args[0] = enum114;
        callMethod(klass, "setType", argTypes, term39764, args);
    }

};


