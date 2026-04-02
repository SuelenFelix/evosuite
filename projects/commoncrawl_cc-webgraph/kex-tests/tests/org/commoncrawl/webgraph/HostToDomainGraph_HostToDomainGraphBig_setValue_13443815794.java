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
     Object term7032;
     Object term7044;
     Object term7046;

    public HostToDomainGraph_HostToDomainGraphBig_setValue_13443815794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7032 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig"));
        setField(term7032, term7032.getClass(), "ids", null);
        setBooleanField(term7032, term7032.getClass(), "countHosts", false);
        setBooleanField(term7032, term7032.getClass(), "privateDomains", false);
        setBooleanField(term7032, term7032.getClass(), "stripWww", false);
        setBooleanField(term7032, term7032.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term7032, term7032.getClass(), "maxSize", 0L);
        setField(term7032, term7032.getClass(), "ids", null);
        setLongField(term7032, term7032.getClass(), "currentId", 0L);
        setLongField(term7032, term7032.getClass(), "lastFromId", 0L);
        setLongField(term7032, term7032.getClass(), "lastToId", 0L);
        setLongField(term7032, term7032.getClass(), "numInputLinesNodes", 0L);
        setLongField(term7032, term7032.getClass(), "numInputLinesEdges", 0L);
        setField(term7032, term7032.getClass(), "lastRevHost", null);
        setField(term7032, term7032.getClass(), "lastDomain", null);
        setField(term7032, term7032.getClass(), "domainQueue", null);
        setIntField(term7032, term7032.getClass(), "maxQueueUsed", 0);
        setField(term7032, term7032.getClass(), "reporterInputNodes", null);
        setField(term7032, term7032.getClass(), "reporterInputEdges", null);
        term7044 = new Long(0L);
        term7046 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term7044;
        args[1] = term7046;
        callMethod(klass, "setValue", argTypes, term7032, args);
    }

};


