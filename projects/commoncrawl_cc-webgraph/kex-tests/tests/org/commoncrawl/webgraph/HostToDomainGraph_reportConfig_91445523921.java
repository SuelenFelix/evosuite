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

public class HostToDomainGraph_reportConfig_91445523921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3004;

    public HostToDomainGraph_reportConfig_91445523921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3004 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        setBooleanField(term3004, term3004.getClass(), "countHosts", false);
        setBooleanField(term3004, term3004.getClass(), "privateDomains", false);
        setBooleanField(term3004, term3004.getClass(), "stripWww", false);
        setBooleanField(term3004, term3004.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term3004, term3004.getClass(), "maxSize", 0L);
        setField(term3004, term3004.getClass(), "ids", null);
        setLongField(term3004, term3004.getClass(), "currentId", 0L);
        setLongField(term3004, term3004.getClass(), "lastFromId", 0L);
        setLongField(term3004, term3004.getClass(), "lastToId", 0L);
        setLongField(term3004, term3004.getClass(), "numInputLinesNodes", 0L);
        setLongField(term3004, term3004.getClass(), "numInputLinesEdges", 0L);
        setField(term3004, term3004.getClass(), "lastRevHost", null);
        setField(term3004, term3004.getClass(), "lastDomain", null);
        setField(term3004, term3004.getClass(), "domainQueue", null);
        setIntField(term3004, term3004.getClass(), "maxQueueUsed", 0);
        setField(term3004, term3004.getClass(), "reporterInputNodes", null);
        setField(term3004, term3004.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reportConfig", argTypes, term3004, args);
    }

};


