package com.github.bhlangonijr.chesslib;

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
import static com.github.bhlangonijr.chesslib.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Square_encode_20845097553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1027;
     Object enum1028;

    public Square_encode_20845097553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term296306 = Class.forName((String) "com.github.bhlangonijr.chesslib.Rank");
        Field term296305 = ((Class) term296306).getDeclaredField((String) "RANK_8");
        ((Field) term296305).setAccessible(true);
        enum1027 = ((Field) term296305).get((Object) null);
        Class<? extends Object> term296511 = Class.forName((String) "com.github.bhlangonijr.chesslib.File");
        Field term296510 = ((Class) term296511).getDeclaredField((String) "FILE_H");
        ((Field) term296510).setAccessible(true);
        enum1028 = ((Field) term296510).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Rank");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.File");
        Object[] args = new Object[2];
        args[0] = enum1027;
        args[1] = enum1028;
        callMethod(klass, "encode", argTypes, null, args);
    }

};


