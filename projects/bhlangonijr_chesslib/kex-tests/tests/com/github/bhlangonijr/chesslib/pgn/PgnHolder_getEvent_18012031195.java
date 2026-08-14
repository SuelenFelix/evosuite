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

public class PgnHolder_getEvent_18012031195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2092;

    public PgnHolder_getEvent_18012031195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2093 = new HashMap();
        HashMap term2098 = new HashMap();
        ArrayList term2103 = new ArrayList();
        ArrayList term2107 = new ArrayList();
        Integer term2123 = new Integer(-1339778481);
        term2092 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2092, term2092.getClass(), "event", term2093);
        setField(term2092, term2092.getClass(), "player", term2098);
        setField(term2092, term2092.getClass(), "games", term2103);
        setField(term2092, term2092.getClass(), "listener", term2107);
        setField(term2092, term2092.getClass(), "fileName", "xOcJIiQQDu");
        setField(term2092, term2092.getClass(), "size", term2123);
        setBooleanField(term2092, term2092.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEvent", argTypes, term2092, args);
    }

};


