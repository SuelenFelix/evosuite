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

public class HostToDomainGraph_showHelp_188300428940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3226;

    public HostToDomainGraph_showHelp_188300428940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3226 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        setBooleanField(term3226, term3226.getClass(), "countHosts", false);
        setBooleanField(term3226, term3226.getClass(), "privateDomains", false);
        setBooleanField(term3226, term3226.getClass(), "stripWww", false);
        setBooleanField(term3226, term3226.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term3226, term3226.getClass(), "maxSize", 0L);
        setField(term3226, term3226.getClass(), "ids", null);
        setLongField(term3226, term3226.getClass(), "currentId", 0L);
        setLongField(term3226, term3226.getClass(), "lastFromId", 0L);
        setLongField(term3226, term3226.getClass(), "lastToId", 0L);
        setLongField(term3226, term3226.getClass(), "numInputLinesNodes", 0L);
        setLongField(term3226, term3226.getClass(), "numInputLinesEdges", 0L);
        setField(term3226, term3226.getClass(), "lastRevHost", null);
        setField(term3226, term3226.getClass(), "lastDomain", null);
        setField(term3226, term3226.getClass(), "domainQueue", null);
        setIntField(term3226, term3226.getClass(), "maxQueueUsed", 0);
        setField(term3226, term3226.getClass(), "reporterInputNodes", null);
        setField(term3226, term3226.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "showHelp", argTypes, term3226, args);
    }

};


