package com.github.bhlangonijr.chesslib.pgn;

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
import static com.github.bhlangonijr.chesslib.pgn.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Integer;

public class PgnHolder_setFileName_12897433514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2026;

    public PgnHolder_setFileName_12897433514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2027 = new HashMap();
        HashMap term2032 = new HashMap();
        ArrayList term2037 = new ArrayList();
        ArrayList term2041 = new ArrayList();
        Integer term2057 = new Integer(1227103734);
        term2026 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2026, term2026.getClass(), "event", term2027);
        setField(term2026, term2026.getClass(), "player", term2032);
        setField(term2026, term2026.getClass(), "games", term2037);
        setField(term2026, term2026.getClass(), "listener", term2041);
        setField(term2026, term2026.getClass(), "fileName", "jSpAteRute");
        setField(term2026, term2026.getClass(), "size", term2057);
        setBooleanField(term2026, term2026.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "swZVeJAxjt";
        callMethod(klass, "setFileName", argTypes, term2026, args);
    }

};


