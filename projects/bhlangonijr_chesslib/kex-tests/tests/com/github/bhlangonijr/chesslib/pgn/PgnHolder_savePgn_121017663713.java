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

public class PgnHolder_savePgn_121017663713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2523;

    public PgnHolder_savePgn_121017663713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2524 = new HashMap();
        HashMap term2529 = new HashMap();
        ArrayList term2534 = new ArrayList();
        ArrayList term2538 = new ArrayList();
        Integer term2554 = new Integer(-1456670397);
        term2523 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2523, term2523.getClass(), "event", term2524);
        setField(term2523, term2523.getClass(), "player", term2529);
        setField(term2523, term2523.getClass(), "games", term2534);
        setField(term2523, term2523.getClass(), "listener", term2538);
        setField(term2523, term2523.getClass(), "fileName", "sEccwbJKYE");
        setField(term2523, term2523.getClass(), "size", term2554);
        setBooleanField(term2523, term2523.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "savePgn", argTypes, term2523, args);
    }

};


