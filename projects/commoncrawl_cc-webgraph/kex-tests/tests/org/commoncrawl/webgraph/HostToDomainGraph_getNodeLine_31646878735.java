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

public class HostToDomainGraph_getNodeLine_31646878735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3518;

    public HostToDomainGraph_getNodeLine_31646878735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3518 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        setBooleanField(term3518, term3518.getClass(), "countHosts", false);
        setBooleanField(term3518, term3518.getClass(), "privateDomains", false);
        setBooleanField(term3518, term3518.getClass(), "stripWww", false);
        setBooleanField(term3518, term3518.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term3518, term3518.getClass(), "maxSize", 0L);
        setField(term3518, term3518.getClass(), "ids", null);
        setLongField(term3518, term3518.getClass(), "currentId", 0L);
        setLongField(term3518, term3518.getClass(), "lastFromId", 0L);
        setLongField(term3518, term3518.getClass(), "lastToId", 0L);
        setLongField(term3518, term3518.getClass(), "numInputLinesNodes", 0L);
        setLongField(term3518, term3518.getClass(), "numInputLinesEdges", 0L);
        setField(term3518, term3518.getClass(), "lastRevHost", null);
        setField(term3518, term3518.getClass(), "lastDomain", null);
        setField(term3518, term3518.getClass(), "lastOutputDomain", null);
        setField(term3518, term3518.getClass(), "domainQueue", null);
        setIntField(term3518, term3518.getClass(), "maxQueueUsed", 0);
        setField(term3518, term3518.getClass(), "reporterInputNodes", null);
        setField(term3518, term3518.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getNodeLine", argTypes, term3518, args);
    }

};


