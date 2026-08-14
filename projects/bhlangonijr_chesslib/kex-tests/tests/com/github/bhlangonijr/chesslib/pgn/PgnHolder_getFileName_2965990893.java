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

public class PgnHolder_getFileName_2965990893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1982;

    public PgnHolder_getFileName_2965990893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1983 = new HashMap();
        HashMap term1988 = new HashMap();
        ArrayList term1993 = new ArrayList();
        ArrayList term1997 = new ArrayList();
        Integer term2013 = new Integer(-2038273078);
        term1982 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term1982, term1982.getClass(), "event", term1983);
        setField(term1982, term1982.getClass(), "player", term1988);
        setField(term1982, term1982.getClass(), "games", term1993);
        setField(term1982, term1982.getClass(), "listener", term1997);
        setField(term1982, term1982.getClass(), "fileName", "PkWMRdJcBb");
        setField(term1982, term1982.getClass(), "size", term2013);
        setBooleanField(term1982, term1982.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileName", argTypes, term1982, args);
    }

};


