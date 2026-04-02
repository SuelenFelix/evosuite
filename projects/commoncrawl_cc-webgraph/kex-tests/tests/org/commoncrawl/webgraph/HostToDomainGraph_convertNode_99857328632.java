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

public class HostToDomainGraph_convertNode_99857328632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3130;

    public HostToDomainGraph_convertNode_99857328632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3130 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        setBooleanField(term3130, term3130.getClass(), "countHosts", false);
        setBooleanField(term3130, term3130.getClass(), "privateDomains", false);
        setBooleanField(term3130, term3130.getClass(), "stripWww", false);
        setBooleanField(term3130, term3130.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term3130, term3130.getClass(), "maxSize", 0L);
        setField(term3130, term3130.getClass(), "ids", null);
        setLongField(term3130, term3130.getClass(), "currentId", 0L);
        setLongField(term3130, term3130.getClass(), "lastFromId", 0L);
        setLongField(term3130, term3130.getClass(), "lastToId", 0L);
        setLongField(term3130, term3130.getClass(), "numInputLinesNodes", 0L);
        setLongField(term3130, term3130.getClass(), "numInputLinesEdges", 0L);
        setField(term3130, term3130.getClass(), "lastRevHost", null);
        setField(term3130, term3130.getClass(), "lastDomain", null);
        setField(term3130, term3130.getClass(), "domainQueue", null);
        setIntField(term3130, term3130.getClass(), "maxQueueUsed", 0);
        setField(term3130, term3130.getClass(), "reporterInputNodes", null);
        setField(term3130, term3130.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "convertNode", argTypes, term3130, args);
    }

};


