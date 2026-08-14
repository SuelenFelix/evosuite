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
import java.lang.Boolean;

public class HostToDomainGraph_setStripWww_37568880628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3426;
     Object term3438;

    public HostToDomainGraph_setStripWww_37568880628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3426 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        setBooleanField(term3426, term3426.getClass(), "countHosts", false);
        setBooleanField(term3426, term3426.getClass(), "privateDomains", false);
        setBooleanField(term3426, term3426.getClass(), "stripWww", false);
        setBooleanField(term3426, term3426.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term3426, term3426.getClass(), "maxSize", 0L);
        setField(term3426, term3426.getClass(), "ids", null);
        setLongField(term3426, term3426.getClass(), "currentId", 0L);
        setLongField(term3426, term3426.getClass(), "lastFromId", 0L);
        setLongField(term3426, term3426.getClass(), "lastToId", 0L);
        setLongField(term3426, term3426.getClass(), "numInputLinesNodes", 0L);
        setLongField(term3426, term3426.getClass(), "numInputLinesEdges", 0L);
        setField(term3426, term3426.getClass(), "lastRevHost", null);
        setField(term3426, term3426.getClass(), "lastDomain", null);
        setField(term3426, term3426.getClass(), "lastOutputDomain", null);
        setField(term3426, term3426.getClass(), "domainQueue", null);
        setIntField(term3426, term3426.getClass(), "maxQueueUsed", 0);
        setField(term3426, term3426.getClass(), "reporterInputNodes", null);
        setField(term3426, term3426.getClass(), "reporterInputEdges", null);
        term3438 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3438;
        callMethod(klass, "setStripWww", argTypes, term3426, args);
    }

};


