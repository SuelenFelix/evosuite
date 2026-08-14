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

public class JoinSortRanks_getPageRankRank_141237172229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10242;
     Object term10243;

    public JoinSortRanks_getPageRankRank_141237172229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10242 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        setField(term10242, term10242.getClass(), "harmonicCentralityValues", null);
        setField(term10242, term10242.getClass(), "pageRankValues", null);
        setField(term10242, term10242.getClass(), "harmonicCentralityRanks", null);
        setField(term10242, term10242.getClass(), "pageRankRanks", null);
        setField(term10242, term10242.getClass(), "indirectSortPerm", null);
        term10243 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term10243;
        callMethod(klass, "getPageRankRank", argTypes, term10242, args);
    }

};


