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

public class JoinSortRanks_JoinSortRanksBig_assignRank_157562961419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6624;

    public JoinSortRanks_JoinSortRanksBig_assignRank_157562961419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6624 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        setField(term6624, term6624.getClass(), "harmonicCentralityValues", null);
        setField(term6624, term6624.getClass(), "pageRankValues", null);
        setField(term6624, term6624.getClass(), "harmonicCentralityRanks", null);
        setField(term6624, term6624.getClass(), "pageRankRanks", null);
        setField(term6624, term6624.getClass(), "indirectSortPerm", null);
        setField(term6624, term6624.getClass(), "harmonicCentralityValues", null);
        setField(term6624, term6624.getClass(), "pageRankValues", null);
        setField(term6624, term6624.getClass(), "harmonicCentralityRanks", null);
        setField(term6624, term6624.getClass(), "pageRankRanks", null);
        setField(term6624, term6624.getClass(), "indirectSortPerm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(long.class, 0).getClass(), 0).getClass();
        argTypes[1] = Class.forName("it.unimi.dsi.fastutil.longs.LongComparator");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "assignRank", argTypes, term6624, args);
    }

};


