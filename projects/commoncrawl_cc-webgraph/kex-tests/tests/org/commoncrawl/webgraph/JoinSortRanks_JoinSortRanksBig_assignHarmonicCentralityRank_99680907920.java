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

public class JoinSortRanks_JoinSortRanksBig_assignHarmonicCentralityRank_99680907920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6977;

    public JoinSortRanks_JoinSortRanksBig_assignHarmonicCentralityRank_99680907920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6977 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        setField(term6977, term6977.getClass(), "harmonicCentralityValues", null);
        setField(term6977, term6977.getClass(), "pageRankValues", null);
        setField(term6977, term6977.getClass(), "harmonicCentralityRanks", null);
        setField(term6977, term6977.getClass(), "pageRankRanks", null);
        setField(term6977, term6977.getClass(), "indirectSortPerm", null);
        setField(term6977, term6977.getClass(), "harmonicCentralityValues", null);
        setField(term6977, term6977.getClass(), "pageRankValues", null);
        setField(term6977, term6977.getClass(), "harmonicCentralityRanks", null);
        setField(term6977, term6977.getClass(), "pageRankRanks", null);
        setField(term6977, term6977.getClass(), "indirectSortPerm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignHarmonicCentralityRank", argTypes, term6977, args);
    }

};


