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

public class PgnHolder_getListener_148354495117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2701;

    public PgnHolder_getListener_148354495117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2702 = new HashMap();
        HashMap term2707 = new HashMap();
        ArrayList term2712 = new ArrayList();
        ArrayList term2716 = new ArrayList();
        Integer term2732 = new Integer(-6029667);
        term2701 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2701, term2701.getClass(), "event", term2702);
        setField(term2701, term2701.getClass(), "player", term2707);
        setField(term2701, term2701.getClass(), "games", term2712);
        setField(term2701, term2701.getClass(), "listener", term2716);
        setField(term2701, term2701.getClass(), "fileName", "qxSDVejjiY");
        setField(term2701, term2701.getClass(), "size", term2732);
        setBooleanField(term2701, term2701.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getListener", argTypes, term2701, args);
    }

};


