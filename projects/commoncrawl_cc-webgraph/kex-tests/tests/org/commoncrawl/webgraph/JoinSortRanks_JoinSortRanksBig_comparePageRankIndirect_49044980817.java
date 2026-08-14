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
import java.lang.Long;

public class JoinSortRanks_JoinSortRanksBig_comparePageRankIndirect_49044980817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6966;
     Object term6967;
     Object term6969;

    public JoinSortRanks_JoinSortRanksBig_comparePageRankIndirect_49044980817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6966 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        setField(term6966, term6966.getClass(), "harmonicCentralityValues", null);
        setField(term6966, term6966.getClass(), "pageRankValues", null);
        setField(term6966, term6966.getClass(), "harmonicCentralityRanks", null);
        setField(term6966, term6966.getClass(), "pageRankRanks", null);
        setField(term6966, term6966.getClass(), "indirectSortPerm", null);
        setField(term6966, term6966.getClass(), "harmonicCentralityValues", null);
        setField(term6966, term6966.getClass(), "pageRankValues", null);
        setField(term6966, term6966.getClass(), "harmonicCentralityRanks", null);
        setField(term6966, term6966.getClass(), "pageRankRanks", null);
        setField(term6966, term6966.getClass(), "indirectSortPerm", null);
        term6967 = new Long(0L);
        term6969 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term6967;
        args[1] = term6969;
        callMethod(klass, "comparePageRankIndirect", argTypes, term6966, args);
    }

};


