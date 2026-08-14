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

public class PgnHolder_isLazyLoad_10448475515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2611;

    public PgnHolder_isLazyLoad_10448475515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2612 = new HashMap();
        HashMap term2617 = new HashMap();
        ArrayList term2622 = new ArrayList();
        ArrayList term2626 = new ArrayList();
        Integer term2642 = new Integer(1048535127);
        term2611 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2611, term2611.getClass(), "event", term2612);
        setField(term2611, term2611.getClass(), "player", term2617);
        setField(term2611, term2611.getClass(), "games", term2622);
        setField(term2611, term2611.getClass(), "listener", term2626);
        setField(term2611, term2611.getClass(), "fileName", "vjxIhXHxGR");
        setField(term2611, term2611.getClass(), "size", term2642);
        setBooleanField(term2611, term2611.getClass(), "lazyLoad", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLazyLoad", argTypes, term2611, args);
    }

};


