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

public class JoinSortRanks_assignHarmonicCentralityRank_56749733224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10231;

    public JoinSortRanks_assignHarmonicCentralityRank_56749733224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10231 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        setField(term10231, term10231.getClass(), "harmonicCentralityValues", null);
        setField(term10231, term10231.getClass(), "pageRankValues", null);
        setField(term10231, term10231.getClass(), "harmonicCentralityRanks", null);
        setField(term10231, term10231.getClass(), "pageRankRanks", null);
        setField(term10231, term10231.getClass(), "indirectSortPerm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignHarmonicCentralityRank", argTypes, term10231, args);
    }

};


