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

public class JoinSortRanks_JoinSortRanksBig_assignPageRankRank_93970056421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6978;

    public JoinSortRanks_JoinSortRanksBig_assignPageRankRank_93970056421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6978 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        setField(term6978, term6978.getClass(), "harmonicCentralityValues", null);
        setField(term6978, term6978.getClass(), "pageRankValues", null);
        setField(term6978, term6978.getClass(), "harmonicCentralityRanks", null);
        setField(term6978, term6978.getClass(), "pageRankRanks", null);
        setField(term6978, term6978.getClass(), "indirectSortPerm", null);
        setField(term6978, term6978.getClass(), "harmonicCentralityValues", null);
        setField(term6978, term6978.getClass(), "pageRankValues", null);
        setField(term6978, term6978.getClass(), "harmonicCentralityRanks", null);
        setField(term6978, term6978.getClass(), "pageRankRanks", null);
        setField(term6978, term6978.getClass(), "indirectSortPerm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignPageRankRank", argTypes, term6978, args);
    }

};


