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

public class JoinSortRanks_assignRank_185934743323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10230;

    public JoinSortRanks_assignRank_185934743323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10230 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        setField(term10230, term10230.getClass(), "harmonicCentralityValues", null);
        setField(term10230, term10230.getClass(), "pageRankValues", null);
        setField(term10230, term10230.getClass(), "harmonicCentralityRanks", null);
        setField(term10230, term10230.getClass(), "pageRankRanks", null);
        setField(term10230, term10230.getClass(), "indirectSortPerm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("it.unimi.dsi.fastutil.ints.IntComparator");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "assignRank", argTypes, term10230, args);
    }

};


