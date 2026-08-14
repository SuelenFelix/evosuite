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

public class PgnHolder_getPlayer_18030514906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2136;

    public PgnHolder_getPlayer_18030514906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2137 = new HashMap();
        HashMap term2142 = new HashMap();
        ArrayList term2147 = new ArrayList();
        ArrayList term2151 = new ArrayList();
        Integer term2167 = new Integer(1725571209);
        term2136 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2136, term2136.getClass(), "event", term2137);
        setField(term2136, term2136.getClass(), "player", term2142);
        setField(term2136, term2136.getClass(), "games", term2147);
        setField(term2136, term2136.getClass(), "listener", term2151);
        setField(term2136, term2136.getClass(), "fileName", "GVizqqzXpy");
        setField(term2136, term2136.getClass(), "size", term2167);
        setBooleanField(term2136, term2136.getClass(), "lazyLoad", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer", argTypes, term2136, args);
    }

};


