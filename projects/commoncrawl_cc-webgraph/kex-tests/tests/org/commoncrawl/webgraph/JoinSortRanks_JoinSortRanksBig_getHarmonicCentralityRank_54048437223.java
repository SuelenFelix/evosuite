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

public class JoinSortRanks_JoinSortRanksBig_getHarmonicCentralityRank_54048437223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6982;
     Object term6983;

    public JoinSortRanks_JoinSortRanksBig_getHarmonicCentralityRank_54048437223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6982 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        setField(term6982, term6982.getClass(), "harmonicCentralityValues", null);
        setField(term6982, term6982.getClass(), "pageRankValues", null);
        setField(term6982, term6982.getClass(), "harmonicCentralityRanks", null);
        setField(term6982, term6982.getClass(), "pageRankRanks", null);
        setField(term6982, term6982.getClass(), "indirectSortPerm", null);
        setField(term6982, term6982.getClass(), "harmonicCentralityValues", null);
        setField(term6982, term6982.getClass(), "pageRankValues", null);
        setField(term6982, term6982.getClass(), "harmonicCentralityRanks", null);
        setField(term6982, term6982.getClass(), "pageRankRanks", null);
        setField(term6982, term6982.getClass(), "indirectSortPerm", null);
        term6983 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6983;
        callMethod(klass, "getHarmonicCentralityRank", argTypes, term6982, args);
    }

};


