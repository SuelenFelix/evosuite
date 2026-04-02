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

public class JoinSortRanks_convert_111370446330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9849;

    public JoinSortRanks_convert_111370446330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9849 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        setField(term9849, term9849.getClass(), "harmonicCentralityValues", null);
        setField(term9849, term9849.getClass(), "pageRankValues", null);
        setField(term9849, term9849.getClass(), "harmonicCentralityRanks", null);
        setField(term9849, term9849.getClass(), "pageRankRanks", null);
        setField(term9849, term9849.getClass(), "indirectSortPerm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.function.Function");
        argTypes[1] = Class.forName("java.util.stream.Stream");
        argTypes[2] = Class.forName("java.io.PrintStream");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "convert", argTypes, term9849, args);
    }

};


