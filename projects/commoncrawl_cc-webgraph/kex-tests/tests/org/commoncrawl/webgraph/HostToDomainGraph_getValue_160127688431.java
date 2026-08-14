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

public class HostToDomainGraph_getValue_160127688431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3468;
     Object term3480;

    public HostToDomainGraph_getValue_160127688431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3468 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        setBooleanField(term3468, term3468.getClass(), "countHosts", false);
        setBooleanField(term3468, term3468.getClass(), "privateDomains", false);
        setBooleanField(term3468, term3468.getClass(), "stripWww", false);
        setBooleanField(term3468, term3468.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term3468, term3468.getClass(), "maxSize", 0L);
        setField(term3468, term3468.getClass(), "ids", null);
        setLongField(term3468, term3468.getClass(), "currentId", 0L);
        setLongField(term3468, term3468.getClass(), "lastFromId", 0L);
        setLongField(term3468, term3468.getClass(), "lastToId", 0L);
        setLongField(term3468, term3468.getClass(), "numInputLinesNodes", 0L);
        setLongField(term3468, term3468.getClass(), "numInputLinesEdges", 0L);
        setField(term3468, term3468.getClass(), "lastRevHost", null);
        setField(term3468, term3468.getClass(), "lastDomain", null);
        setField(term3468, term3468.getClass(), "lastOutputDomain", null);
        setField(term3468, term3468.getClass(), "domainQueue", null);
        setIntField(term3468, term3468.getClass(), "maxQueueUsed", 0);
        setField(term3468, term3468.getClass(), "reporterInputNodes", null);
        setField(term3468, term3468.getClass(), "reporterInputEdges", null);
        term3480 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3480;
        callMethod(klass, "getValue", argTypes, term3468, args);
    }

};


