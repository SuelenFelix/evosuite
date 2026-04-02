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
import java.lang.Integer;

public class JoinSortRanks_comparePageRankIndirect_107388834721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9824;
     Object term9825;
     Object term9827;

    public JoinSortRanks_comparePageRankIndirect_107388834721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9824 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        setField(term9824, term9824.getClass(), "harmonicCentralityValues", null);
        setField(term9824, term9824.getClass(), "pageRankValues", null);
        setField(term9824, term9824.getClass(), "harmonicCentralityRanks", null);
        setField(term9824, term9824.getClass(), "pageRankRanks", null);
        setField(term9824, term9824.getClass(), "indirectSortPerm", null);
        term9825 = new Integer(0);
        term9827 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9825;
        args[1] = term9827;
        callMethod(klass, "comparePageRankIndirect", argTypes, term9824, args);
    }

};


