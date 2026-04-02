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

public class HostToDomainGraph_setValue_33924398630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3100;
     Object term3112;
     Object term3114;

    public HostToDomainGraph_setValue_33924398630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3100 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        setBooleanField(term3100, term3100.getClass(), "countHosts", false);
        setBooleanField(term3100, term3100.getClass(), "privateDomains", false);
        setBooleanField(term3100, term3100.getClass(), "stripWww", false);
        setBooleanField(term3100, term3100.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term3100, term3100.getClass(), "maxSize", 0L);
        setField(term3100, term3100.getClass(), "ids", null);
        setLongField(term3100, term3100.getClass(), "currentId", 0L);
        setLongField(term3100, term3100.getClass(), "lastFromId", 0L);
        setLongField(term3100, term3100.getClass(), "lastToId", 0L);
        setLongField(term3100, term3100.getClass(), "numInputLinesNodes", 0L);
        setLongField(term3100, term3100.getClass(), "numInputLinesEdges", 0L);
        setField(term3100, term3100.getClass(), "lastRevHost", null);
        setField(term3100, term3100.getClass(), "lastDomain", null);
        setField(term3100, term3100.getClass(), "domainQueue", null);
        setIntField(term3100, term3100.getClass(), "maxQueueUsed", 0);
        setField(term3100, term3100.getClass(), "reporterInputNodes", null);
        setField(term3100, term3100.getClass(), "reporterInputEdges", null);
        term3112 = new Long(0L);
        term3114 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term3112;
        args[1] = term3114;
        callMethod(klass, "setValue", argTypes, term3100, args);
    }

};


