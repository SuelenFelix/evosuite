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

public class JoinSortRanks_JoinSortRanksBig_getPageRankRank_15193468925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6636;
     Object term6637;

    public JoinSortRanks_JoinSortRanksBig_getPageRankRank_15193468925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6636 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        setField(term6636, term6636.getClass(), "harmonicCentralityValues", null);
        setField(term6636, term6636.getClass(), "pageRankValues", null);
        setField(term6636, term6636.getClass(), "harmonicCentralityRanks", null);
        setField(term6636, term6636.getClass(), "pageRankRanks", null);
        setField(term6636, term6636.getClass(), "indirectSortPerm", null);
        setField(term6636, term6636.getClass(), "harmonicCentralityValues", null);
        setField(term6636, term6636.getClass(), "pageRankValues", null);
        setField(term6636, term6636.getClass(), "harmonicCentralityRanks", null);
        setField(term6636, term6636.getClass(), "pageRankRanks", null);
        setField(term6636, term6636.getClass(), "indirectSortPerm", null);
        term6637 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6637;
        callMethod(klass, "getPageRankRank", argTypes, term6636, args);
    }

};


