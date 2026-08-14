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
import java.lang.Boolean;

public class PgnHolder_setLazyLoad_158677862316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2655;
     Object term2689;

    public PgnHolder_setLazyLoad_158677862316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2656 = new HashMap();
        HashMap term2661 = new HashMap();
        ArrayList term2666 = new ArrayList();
        ArrayList term2670 = new ArrayList();
        Integer term2686 = new Integer(-655067527);
        term2655 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2655, term2655.getClass(), "event", term2656);
        setField(term2655, term2655.getClass(), "player", term2661);
        setField(term2655, term2655.getClass(), "games", term2666);
        setField(term2655, term2655.getClass(), "listener", term2670);
        setField(term2655, term2655.getClass(), "fileName", "QXzGXbEXMu");
        setField(term2655, term2655.getClass(), "size", term2686);
        setBooleanField(term2655, term2655.getClass(), "lazyLoad", true);
        term2689 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2689;
        callMethod(klass, "setLazyLoad", argTypes, term2655, args);
    }

};


