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
     Object term6614;
     Object term6615;
     Object term6617;

    public JoinSortRanks_JoinSortRanksBig_comparePageRankIndirect_49044980817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6614 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        setField(term6614, term6614.getClass(), "harmonicCentralityValues", null);
        setField(term6614, term6614.getClass(), "pageRankValues", null);
        setField(term6614, term6614.getClass(), "harmonicCentralityRanks", null);
        setField(term6614, term6614.getClass(), "pageRankRanks", null);
        setField(term6614, term6614.getClass(), "indirectSortPerm", null);
        setField(term6614, term6614.getClass(), "harmonicCentralityValues", null);
        setField(term6614, term6614.getClass(), "pageRankValues", null);
        setField(term6614, term6614.getClass(), "harmonicCentralityRanks", null);
        setField(term6614, term6614.getClass(), "pageRankRanks", null);
        setField(term6614, term6614.getClass(), "indirectSortPerm", null);
        term6615 = new Long(0L);
        term6617 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term6615;
        args[1] = term6617;
        callMethod(klass, "comparePageRankIndirect", argTypes, term6614, args);
    }

};


