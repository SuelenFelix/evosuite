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

public class JoinSortRanks_loadPageRank_201125552919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10214;

    public JoinSortRanks_loadPageRank_201125552919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10214 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        setField(term10214, term10214.getClass(), "harmonicCentralityValues", null);
        setField(term10214, term10214.getClass(), "pageRankValues", null);
        setField(term10214, term10214.getClass(), "harmonicCentralityRanks", null);
        setField(term10214, term10214.getClass(), "pageRankRanks", null);
        setField(term10214, term10214.getClass(), "indirectSortPerm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "loadPageRank", argTypes, term10214, args);
    }

};


