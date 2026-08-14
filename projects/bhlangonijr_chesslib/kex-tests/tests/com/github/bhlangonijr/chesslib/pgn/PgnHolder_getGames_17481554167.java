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

public class PgnHolder_getGames_17481554167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2180;

    public PgnHolder_getGames_17481554167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2181 = new HashMap();
        HashMap term2186 = new HashMap();
        ArrayList term2191 = new ArrayList();
        ArrayList term2195 = new ArrayList();
        Integer term2211 = new Integer(-522618178);
        term2180 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2180, term2180.getClass(), "event", term2181);
        setField(term2180, term2180.getClass(), "player", term2186);
        setField(term2180, term2180.getClass(), "games", term2191);
        setField(term2180, term2180.getClass(), "listener", term2195);
        setField(term2180, term2180.getClass(), "fileName", "JqXGgAhZPl");
        setField(term2180, term2180.getClass(), "size", term2211);
        setBooleanField(term2180, term2180.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGames", argTypes, term2180, args);
    }

};


