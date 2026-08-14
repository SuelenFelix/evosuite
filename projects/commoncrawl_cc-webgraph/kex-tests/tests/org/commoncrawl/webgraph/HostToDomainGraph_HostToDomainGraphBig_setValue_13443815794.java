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

public class HostToDomainGraph_HostToDomainGraphBig_setValue_13443815794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7428;
     Object term7440;
     Object term7442;

    public HostToDomainGraph_HostToDomainGraphBig_setValue_13443815794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7428 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig"));
        setField(term7428, term7428.getClass(), "ids", null);
        setBooleanField(term7428, term7428.getClass(), "countHosts", false);
        setBooleanField(term7428, term7428.getClass(), "privateDomains", false);
        setBooleanField(term7428, term7428.getClass(), "stripWww", false);
        setBooleanField(term7428, term7428.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term7428, term7428.getClass(), "maxSize", 0L);
        setField(term7428, term7428.getClass(), "ids", null);
        setLongField(term7428, term7428.getClass(), "currentId", 0L);
        setLongField(term7428, term7428.getClass(), "lastFromId", 0L);
        setLongField(term7428, term7428.getClass(), "lastToId", 0L);
        setLongField(term7428, term7428.getClass(), "numInputLinesNodes", 0L);
        setLongField(term7428, term7428.getClass(), "numInputLinesEdges", 0L);
        setField(term7428, term7428.getClass(), "lastRevHost", null);
        setField(term7428, term7428.getClass(), "lastDomain", null);
        setField(term7428, term7428.getClass(), "lastOutputDomain", null);
        setField(term7428, term7428.getClass(), "domainQueue", null);
        setIntField(term7428, term7428.getClass(), "maxQueueUsed", 0);
        setField(term7428, term7428.getClass(), "reporterInputNodes", null);
        setField(term7428, term7428.getClass(), "reporterInputEdges", null);
        term7440 = new Long(0L);
        term7442 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term7440;
        args[1] = term7442;
        callMethod(klass, "setValue", argTypes, term7428, args);
    }

};


