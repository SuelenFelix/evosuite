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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Boolean;

public class HostToDomainGraph_multiPartSuffixesAsDomains_8117566816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427;
     Object term495;

    public HostToDomainGraph_multiPartSuffixesAsDomains_8117566816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term487 = new Long(8428634514691209827L);
        ArrayList term485 = new ArrayList();
        ((ArrayList) term485).add(term487);
        term427 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term433 = (int[]) newIntArray(7);
        Object term458 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term491 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term427, term427.getClass(), "countHosts", false);
        setBooleanField(term427, term427.getClass(), "privateDomains", true);
        setBooleanField(term427, term427.getClass(), "stripWww", true);
        setBooleanField(term427, term427.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term427, term427.getClass(), "maxSize", 8428634514691209827L);
        setIntElement(term433, 0, -1685132342);
        setIntElement(term433, 1, -1456670397);
        setIntElement(term433, 2, 1622346318);
        setIntElement(term433, 3, 1048535127);
        setIntElement(term433, 4, -655067527);
        setIntElement(term433, 5, -6029667);
        setIntElement(term433, 6, -2068769794);
        setField(term427, term427.getClass(), "ids", term433);
        setLongField(term427, term427.getClass(), "currentId", -1L);
        setLongField(term427, term427.getClass(), "lastFromId", -1L);
        setLongField(term427, term427.getClass(), "lastToId", -1L);
        setLongField(term427, term427.getClass(), "numInputLinesNodes", -2585684163342970173L);
        setLongField(term427, term427.getClass(), "numInputLinesEdges", 8059786003080744426L);
        setField(term427, term427.getClass(), "lastRevHost", "MxlszYVzRf");
        setField(term458, term458.getClass(), "name", "LQFpaHEwXR");
        setField(term458, term458.getClass(), "revName", "oVcInYnLWB");
        setLongField(term458, term458.getClass(), "id", -4365849114644724155L);
        setLongField(term458, term458.getClass(), "numberOfHosts", 2486810210675247493L);
        setField(term458, term458.getClass(), "ids", term485);
        setField(term427, term427.getClass(), "lastDomain", term458);
        setField(term491, term491.getClass(), "comparator", null);
        setField(term491, term491.getClass(), "root", null);
        setIntField(term491, term491.getClass(), "size", 0);
        setIntField(term491, term491.getClass(), "modCount", 0);
        setField(term491, term491.getClass(), "entrySet", null);
        setField(term491, term491.getClass(), "navigableKeySet", null);
        setField(term491, term491.getClass(), "descendingMap", null);
        setField(term491, term491.getClass(), "keySet", null);
        setField(term491, term491.getClass(), "values", null);
        setField(term427, term427.getClass(), "domainQueue", term491);
        setIntField(term427, term427.getClass(), "maxQueueUsed", -117576464);
        setField(term427, term427.getClass(), "reporterInputNodes", null);
        setField(term427, term427.getClass(), "reporterInputEdges", null);
        term495 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term495;
        callMethod(klass, "multiPartSuffixesAsDomains", argTypes, term427, args);
    }

};


