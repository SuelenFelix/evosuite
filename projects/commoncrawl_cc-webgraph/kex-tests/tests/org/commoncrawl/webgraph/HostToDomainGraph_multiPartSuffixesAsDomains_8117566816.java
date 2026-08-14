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
     Object term515;
     Object term595;

    public HostToDomainGraph_multiPartSuffixesAsDomains_8117566816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term575 = new Long(8428634514691209827L);
        ArrayList term573 = new ArrayList();
        ((ArrayList) term573).add(term575);
        term515 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term521 = (int[]) newIntArray(7);
        Object term546 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term591 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term515, term515.getClass(), "countHosts", false);
        setBooleanField(term515, term515.getClass(), "privateDomains", true);
        setBooleanField(term515, term515.getClass(), "stripWww", true);
        setBooleanField(term515, term515.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term515, term515.getClass(), "maxSize", 8428634514691209827L);
        setIntElement(term521, 0, -1685132342);
        setIntElement(term521, 1, -1456670397);
        setIntElement(term521, 2, 1622346318);
        setIntElement(term521, 3, 1048535127);
        setIntElement(term521, 4, -655067527);
        setIntElement(term521, 5, -6029667);
        setIntElement(term521, 6, -2068769794);
        setField(term515, term515.getClass(), "ids", term521);
        setLongField(term515, term515.getClass(), "currentId", -1L);
        setLongField(term515, term515.getClass(), "lastFromId", -1L);
        setLongField(term515, term515.getClass(), "lastToId", -1L);
        setLongField(term515, term515.getClass(), "numInputLinesNodes", -2585684163342970173L);
        setLongField(term515, term515.getClass(), "numInputLinesEdges", 8059786003080744426L);
        setField(term515, term515.getClass(), "lastRevHost", "ZiaGIbnzTs");
        setField(term546, term546.getClass(), "name", "tbcdzjIfER");
        setField(term546, term546.getClass(), "revName", "HyxfbSQYBe");
        setLongField(term546, term546.getClass(), "id", -4365849114644724155L);
        setLongField(term546, term546.getClass(), "numberOfHosts", 2486810210675247493L);
        setField(term546, term546.getClass(), "ids", term573);
        setField(term515, term515.getClass(), "lastDomain", term546);
        setField(term515, term515.getClass(), "lastOutputDomain", "pCTimMblYc");
        setField(term591, term591.getClass(), "comparator", null);
        setField(term591, term591.getClass(), "root", null);
        setIntField(term591, term591.getClass(), "size", 0);
        setIntField(term591, term591.getClass(), "modCount", 0);
        setField(term591, term591.getClass(), "entrySet", null);
        setField(term591, term591.getClass(), "navigableKeySet", null);
        setField(term591, term591.getClass(), "descendingMap", null);
        setField(term591, term591.getClass(), "keySet", null);
        setField(term591, term591.getClass(), "values", null);
        setField(term515, term515.getClass(), "domainQueue", term591);
        setIntField(term515, term515.getClass(), "maxQueueUsed", -117576464);
        setField(term515, term515.getClass(), "reporterInputNodes", null);
        setField(term515, term515.getClass(), "reporterInputEdges", null);
        term595 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term595;
        callMethod(klass, "multiPartSuffixesAsDomains", argTypes, term515, args);
    }

};


