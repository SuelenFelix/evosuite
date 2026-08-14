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

public class PgnHolder_cleanUp_2342845052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1938;

    public PgnHolder_cleanUp_2342845052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1939 = new HashMap();
        HashMap term1944 = new HashMap();
        ArrayList term1949 = new ArrayList();
        ArrayList term1953 = new ArrayList();
        Integer term1969 = new Integer(-1955890973);
        term1938 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term1938, term1938.getClass(), "event", term1939);
        setField(term1938, term1938.getClass(), "player", term1944);
        setField(term1938, term1938.getClass(), "games", term1949);
        setField(term1938, term1938.getClass(), "listener", term1953);
        setField(term1938, term1938.getClass(), "fileName", "TimdotUuNC");
        setField(term1938, term1938.getClass(), "size", term1969);
        setBooleanField(term1938, term1938.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "cleanUp", argTypes, term1938, args);
    }

};


