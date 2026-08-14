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

public class PgnHolder_loadPgn_18793403649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2268;

    public PgnHolder_loadPgn_18793403649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2269 = new HashMap();
        HashMap term2274 = new HashMap();
        ArrayList term2279 = new ArrayList();
        ArrayList term2283 = new ArrayList();
        Integer term2299 = new Integer(-883034806);
        term2268 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2268, term2268.getClass(), "event", term2269);
        setField(term2268, term2268.getClass(), "player", term2274);
        setField(term2268, term2268.getClass(), "games", term2279);
        setField(term2268, term2268.getClass(), "listener", term2283);
        setField(term2268, term2268.getClass(), "fileName", "DfISiziTgG");
        setField(term2268, term2268.getClass(), "size", term2299);
        setBooleanField(term2268, term2268.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "loadPgn", argTypes, term2268, args);
    }

};


