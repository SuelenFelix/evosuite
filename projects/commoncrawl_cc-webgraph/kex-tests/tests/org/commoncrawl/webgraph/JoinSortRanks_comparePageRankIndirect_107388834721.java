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
import java.lang.Integer;

public class JoinSortRanks_comparePageRankIndirect_107388834721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10220;
     Object term10221;
     Object term10223;

    public JoinSortRanks_comparePageRankIndirect_107388834721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10220 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        setField(term10220, term10220.getClass(), "harmonicCentralityValues", null);
        setField(term10220, term10220.getClass(), "pageRankValues", null);
        setField(term10220, term10220.getClass(), "harmonicCentralityRanks", null);
        setField(term10220, term10220.getClass(), "pageRankRanks", null);
        setField(term10220, term10220.getClass(), "indirectSortPerm", null);
        term10221 = new Integer(0);
        term10223 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10221;
        args[1] = term10223;
        callMethod(klass, "comparePageRankIndirect", argTypes, term10220, args);
    }

};


