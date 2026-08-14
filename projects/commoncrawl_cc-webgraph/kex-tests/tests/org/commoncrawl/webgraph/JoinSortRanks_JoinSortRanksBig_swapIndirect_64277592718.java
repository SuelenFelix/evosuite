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

public class JoinSortRanks_JoinSortRanksBig_swapIndirect_64277592718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6971;
     Object term6972;
     Object term6974;

    public JoinSortRanks_JoinSortRanksBig_swapIndirect_64277592718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6971 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        setField(term6971, term6971.getClass(), "harmonicCentralityValues", null);
        setField(term6971, term6971.getClass(), "pageRankValues", null);
        setField(term6971, term6971.getClass(), "harmonicCentralityRanks", null);
        setField(term6971, term6971.getClass(), "pageRankRanks", null);
        setField(term6971, term6971.getClass(), "indirectSortPerm", null);
        setField(term6971, term6971.getClass(), "harmonicCentralityValues", null);
        setField(term6971, term6971.getClass(), "pageRankValues", null);
        setField(term6971, term6971.getClass(), "harmonicCentralityRanks", null);
        setField(term6971, term6971.getClass(), "pageRankRanks", null);
        setField(term6971, term6971.getClass(), "indirectSortPerm", null);
        term6972 = new Long(0L);
        term6974 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term6972;
        args[1] = term6974;
        callMethod(klass, "swapIndirect", argTypes, term6971, args);
    }

};


