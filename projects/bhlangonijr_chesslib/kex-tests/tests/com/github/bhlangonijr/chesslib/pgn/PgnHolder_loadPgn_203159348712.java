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

public class PgnHolder_loadPgn_203159348712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2457;

    public PgnHolder_loadPgn_203159348712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2458 = new HashMap();
        HashMap term2463 = new HashMap();
        ArrayList term2468 = new ArrayList();
        ArrayList term2472 = new ArrayList();
        Integer term2488 = new Integer(-1685132342);
        term2457 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2457, term2457.getClass(), "event", term2458);
        setField(term2457, term2457.getClass(), "player", term2463);
        setField(term2457, term2457.getClass(), "games", term2468);
        setField(term2457, term2457.getClass(), "listener", term2472);
        setField(term2457, term2457.getClass(), "fileName", "BKLfkLiZTH");
        setField(term2457, term2457.getClass(), "size", term2488);
        setBooleanField(term2457, term2457.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPpkrGcPRr";
        callMethod(klass, "loadPgn", argTypes, term2457, args);
    }

};


