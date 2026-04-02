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

public class HostToDomainGraph_convert_204625196238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3202;

    public HostToDomainGraph_convert_204625196238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3202 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        setBooleanField(term3202, term3202.getClass(), "countHosts", false);
        setBooleanField(term3202, term3202.getClass(), "privateDomains", false);
        setBooleanField(term3202, term3202.getClass(), "stripWww", false);
        setBooleanField(term3202, term3202.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term3202, term3202.getClass(), "maxSize", 0L);
        setField(term3202, term3202.getClass(), "ids", null);
        setLongField(term3202, term3202.getClass(), "currentId", 0L);
        setLongField(term3202, term3202.getClass(), "lastFromId", 0L);
        setLongField(term3202, term3202.getClass(), "lastToId", 0L);
        setLongField(term3202, term3202.getClass(), "numInputLinesNodes", 0L);
        setLongField(term3202, term3202.getClass(), "numInputLinesEdges", 0L);
        setField(term3202, term3202.getClass(), "lastRevHost", null);
        setField(term3202, term3202.getClass(), "lastDomain", null);
        setField(term3202, term3202.getClass(), "domainQueue", null);
        setIntField(term3202, term3202.getClass(), "maxQueueUsed", 0);
        setField(term3202, term3202.getClass(), "reporterInputNodes", null);
        setField(term3202, term3202.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.function.Function");
        argTypes[1] = Class.forName("java.util.stream.Stream");
        argTypes[2] = Class.forName("java.io.PrintStream");
        argTypes[3] = Class.forName("java.util.function.Consumer");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "convert", argTypes, term3202, args);
    }

};


