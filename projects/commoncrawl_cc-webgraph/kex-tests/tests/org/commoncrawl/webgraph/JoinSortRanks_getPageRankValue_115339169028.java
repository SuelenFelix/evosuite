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

public class JoinSortRanks_getPageRankValue_115339169028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10239;
     Object term10240;

    public JoinSortRanks_getPageRankValue_115339169028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10239 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        setField(term10239, term10239.getClass(), "harmonicCentralityValues", null);
        setField(term10239, term10239.getClass(), "pageRankValues", null);
        setField(term10239, term10239.getClass(), "harmonicCentralityRanks", null);
        setField(term10239, term10239.getClass(), "pageRankRanks", null);
        setField(term10239, term10239.getClass(), "indirectSortPerm", null);
        term10240 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term10240;
        callMethod(klass, "getPageRankValue", argTypes, term10239, args);
    }

};


