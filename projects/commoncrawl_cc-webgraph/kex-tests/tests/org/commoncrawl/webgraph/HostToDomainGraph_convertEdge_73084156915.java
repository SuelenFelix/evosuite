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

public class HostToDomainGraph_convertEdge_73084156915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1797;

    public HostToDomainGraph_convertEdge_73084156915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1855 = new Long(-3838084482494604218L);
        Long term1857 = new Long(3892018155439224435L);
        Long term1859 = new Long(5953383087795962419L);
        ArrayList term1853 = new ArrayList();
        ((ArrayList) term1853).add(term1855);
        ((ArrayList) term1853).add(term1857);
        ((ArrayList) term1853).add(term1859);
        term1797 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term1803 = (int[]) newIntArray(5);
        Object term1826 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term1875 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term1797, term1797.getClass(), "countHosts", false);
        setBooleanField(term1797, term1797.getClass(), "privateDomains", true);
        setBooleanField(term1797, term1797.getClass(), "stripWww", false);
        setBooleanField(term1797, term1797.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term1797, term1797.getClass(), "maxSize", 463622836963501975L);
        setIntElement(term1803, 0, 1596070772);
        setIntElement(term1803, 1, 97029295);
        setIntElement(term1803, 2, -1371869594);
        setIntElement(term1803, 3, -2095575670);
        setIntElement(term1803, 4, 1225272962);
        setField(term1797, term1797.getClass(), "ids", term1803);
        setLongField(term1797, term1797.getClass(), "currentId", -1L);
        setLongField(term1797, term1797.getClass(), "lastFromId", -1L);
        setLongField(term1797, term1797.getClass(), "lastToId", -1L);
        setLongField(term1797, term1797.getClass(), "numInputLinesNodes", 305759998609888272L);
        setLongField(term1797, term1797.getClass(), "numInputLinesEdges", -8654565919063661957L);
        setField(term1797, term1797.getClass(), "lastRevHost", "YRHGsAkhxb");
        setField(term1826, term1826.getClass(), "name", "ffYhPOzlUs");
        setField(term1826, term1826.getClass(), "revName", "MLqYREekMl");
        setLongField(term1826, term1826.getClass(), "id", -5248475803419977214L);
        setLongField(term1826, term1826.getClass(), "numberOfHosts", -6723783499250797216L);
        setField(term1826, term1826.getClass(), "ids", term1853);
        setField(term1797, term1797.getClass(), "lastDomain", term1826);
        setField(term1797, term1797.getClass(), "lastOutputDomain", "ytSBIKXogI");
        setField(term1875, term1875.getClass(), "comparator", null);
        setField(term1875, term1875.getClass(), "root", null);
        setIntField(term1875, term1875.getClass(), "size", 0);
        setIntField(term1875, term1875.getClass(), "modCount", 0);
        setField(term1875, term1875.getClass(), "entrySet", null);
        setField(term1875, term1875.getClass(), "navigableKeySet", null);
        setField(term1875, term1875.getClass(), "descendingMap", null);
        setField(term1875, term1875.getClass(), "keySet", null);
        setField(term1875, term1875.getClass(), "values", null);
        setField(term1797, term1797.getClass(), "domainQueue", term1875);
        setIntField(term1797, term1797.getClass(), "maxQueueUsed", 1324040357);
        setField(term1797, term1797.getClass(), "reporterInputNodes", null);
        setField(term1797, term1797.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nHXjMycHlU";
        callMethod(klass, "convertEdge", argTypes, term1797, args);
    }

};


