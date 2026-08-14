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

public class GenericPlayer_setId_1499567593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37702;

    public GenericPlayer_setId_1499567593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37782 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.PlayerType");
        Field term37781 = ((Class) term37782).getDeclaredField((String) "HUMAN");
        ((Field) term37781).setAccessible(true);
        Object enum107 = ((Field) term37781).get((Object) null);
        term37702 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer"));
        setField(term37702, term37702.getClass(), "id", "ypEdrstygY");
        setIntField(term37702, term37702.getClass(), "elo", 11724947);
        setField(term37702, term37702.getClass(), "name", "sNQFlATEeQ");
        setField(term37702, term37702.getClass(), "type", enum107);
        setField(term37702, term37702.getClass(), "description", "ZKMLioamsY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GenericPlayer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVbxuoDBcn";
        callMethod(klass, "setId", argTypes, term37702, args);
    }

};


