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

public class JoinSortRanks_JoinSortRanksBig_loadPageRank_71940535615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6960;

    public JoinSortRanks_JoinSortRanksBig_loadPageRank_71940535615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6960 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        setField(term6960, term6960.getClass(), "harmonicCentralityValues", null);
        setField(term6960, term6960.getClass(), "pageRankValues", null);
        setField(term6960, term6960.getClass(), "harmonicCentralityRanks", null);
        setField(term6960, term6960.getClass(), "pageRankRanks", null);
        setField(term6960, term6960.getClass(), "indirectSortPerm", null);
        setField(term6960, term6960.getClass(), "harmonicCentralityValues", null);
        setField(term6960, term6960.getClass(), "pageRankValues", null);
        setField(term6960, term6960.getClass(), "harmonicCentralityRanks", null);
        setField(term6960, term6960.getClass(), "pageRankRanks", null);
        setField(term6960, term6960.getClass(), "indirectSortPerm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "loadPageRank", argTypes, term6960, args);
    }

};


