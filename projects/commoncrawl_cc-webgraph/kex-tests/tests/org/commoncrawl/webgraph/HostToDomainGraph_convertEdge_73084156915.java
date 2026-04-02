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
     Object term1533;

    public HostToDomainGraph_convertEdge_73084156915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1591 = new Long(-3838084482494604218L);
        Long term1593 = new Long(3892018155439224435L);
        Long term1595 = new Long(5953383087795962419L);
        ArrayList term1589 = new ArrayList();
        ((ArrayList) term1589).add(term1591);
        ((ArrayList) term1589).add(term1593);
        ((ArrayList) term1589).add(term1595);
        term1533 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term1539 = (int[]) newIntArray(5);
        Object term1562 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term1599 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term1533, term1533.getClass(), "countHosts", false);
        setBooleanField(term1533, term1533.getClass(), "privateDomains", true);
        setBooleanField(term1533, term1533.getClass(), "stripWww", false);
        setBooleanField(term1533, term1533.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term1533, term1533.getClass(), "maxSize", 463622836963501975L);
        setIntElement(term1539, 0, 1596070772);
        setIntElement(term1539, 1, 97029295);
        setIntElement(term1539, 2, -1371869594);
        setIntElement(term1539, 3, -2095575670);
        setIntElement(term1539, 4, 1225272962);
        setField(term1533, term1533.getClass(), "ids", term1539);
        setLongField(term1533, term1533.getClass(), "currentId", -1L);
        setLongField(term1533, term1533.getClass(), "lastFromId", -1L);
        setLongField(term1533, term1533.getClass(), "lastToId", -1L);
        setLongField(term1533, term1533.getClass(), "numInputLinesNodes", 305759998609888272L);
        setLongField(term1533, term1533.getClass(), "numInputLinesEdges", -8654565919063661957L);
        setField(term1533, term1533.getClass(), "lastRevHost", "hxCBltsObl");
        setField(term1562, term1562.getClass(), "name", "BndsHwAFMv");
        setField(term1562, term1562.getClass(), "revName", "GzFkzHGYFt");
        setLongField(term1562, term1562.getClass(), "id", -5248475803419977214L);
        setLongField(term1562, term1562.getClass(), "numberOfHosts", -6723783499250797216L);
        setField(term1562, term1562.getClass(), "ids", term1589);
        setField(term1533, term1533.getClass(), "lastDomain", term1562);
        setField(term1599, term1599.getClass(), "comparator", null);
        setField(term1599, term1599.getClass(), "root", null);
        setIntField(term1599, term1599.getClass(), "size", 0);
        setIntField(term1599, term1599.getClass(), "modCount", 0);
        setField(term1599, term1599.getClass(), "entrySet", null);
        setField(term1599, term1599.getClass(), "navigableKeySet", null);
        setField(term1599, term1599.getClass(), "descendingMap", null);
        setField(term1599, term1599.getClass(), "keySet", null);
        setField(term1599, term1599.getClass(), "values", null);
        setField(term1533, term1533.getClass(), "domainQueue", term1599);
        setIntField(term1533, term1533.getClass(), "maxQueueUsed", 1324040357);
        setField(term1533, term1533.getClass(), "reporterInputNodes", null);
        setField(term1533, term1533.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "convertEdge", argTypes, term1533, args);
    }

};


