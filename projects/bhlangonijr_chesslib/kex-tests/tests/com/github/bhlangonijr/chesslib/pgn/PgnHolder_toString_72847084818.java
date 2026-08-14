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

public class PgnHolder_toString_72847084818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2745;

    public PgnHolder_toString_72847084818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2746 = new HashMap();
        HashMap term2751 = new HashMap();
        ArrayList term2756 = new ArrayList();
        ArrayList term2760 = new ArrayList();
        Integer term2776 = new Integer(-2068769794);
        term2745 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2745, term2745.getClass(), "event", term2746);
        setField(term2745, term2745.getClass(), "player", term2751);
        setField(term2745, term2745.getClass(), "games", term2756);
        setField(term2745, term2745.getClass(), "listener", term2760);
        setField(term2745, term2745.getClass(), "fileName", "xBsXSDjXYK");
        setField(term2745, term2745.getClass(), "size", term2776);
        setBooleanField(term2745, term2745.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2745, args);
    }

};


