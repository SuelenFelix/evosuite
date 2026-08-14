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

public class HostToDomainGraph_queueDomain_132031841933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3494;

    public HostToDomainGraph_queueDomain_132031841933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3494 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        setBooleanField(term3494, term3494.getClass(), "countHosts", false);
        setBooleanField(term3494, term3494.getClass(), "privateDomains", false);
        setBooleanField(term3494, term3494.getClass(), "stripWww", false);
        setBooleanField(term3494, term3494.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term3494, term3494.getClass(), "maxSize", 0L);
        setField(term3494, term3494.getClass(), "ids", null);
        setLongField(term3494, term3494.getClass(), "currentId", 0L);
        setLongField(term3494, term3494.getClass(), "lastFromId", 0L);
        setLongField(term3494, term3494.getClass(), "lastToId", 0L);
        setLongField(term3494, term3494.getClass(), "numInputLinesNodes", 0L);
        setLongField(term3494, term3494.getClass(), "numInputLinesEdges", 0L);
        setField(term3494, term3494.getClass(), "lastRevHost", null);
        setField(term3494, term3494.getClass(), "lastDomain", null);
        setField(term3494, term3494.getClass(), "lastOutputDomain", null);
        setField(term3494, term3494.getClass(), "domainQueue", null);
        setIntField(term3494, term3494.getClass(), "maxQueueUsed", 0);
        setField(term3494, term3494.getClass(), "reporterInputNodes", null);
        setField(term3494, term3494.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "queueDomain", argTypes, term3494, args);
    }

};


