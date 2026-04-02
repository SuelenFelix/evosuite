package org.commoncrawl.webgraph;

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
import static org.commoncrawl.webgraph.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JoinSortRanks_main_136552543916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9618;

    public JoinSortRanks_main_136552543916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9618 = (Object[]) newArray("java.lang.String", 9);
        setElement(term9618, 0, "mLUZFTfjle");
        setElement(term9618, 1, "xIeFjkHkOe");
        setElement(term9618, 2, "SdCKLMIYnX");
        setElement(term9618, 3, "OJJtVNPyKZ");
        setElement(term9618, 4, "AKNapTAfmD");
        setElement(term9618, 5, "xJgPlLxpgC");
        setElement(term9618, 6, "EYtfuJaxiM");
        setElement(term9618, 7, "gCWtLVKVVe");
        setElement(term9618, 8, "fWKJoSoCwE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9618;
        callMethod(klass, "main", argTypes, null, args);
    }

};


