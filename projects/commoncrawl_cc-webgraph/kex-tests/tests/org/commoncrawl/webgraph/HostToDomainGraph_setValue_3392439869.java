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

public class HostToDomainGraph_setValue_3392439869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;
     Object term737;
     Object term739;

    public HostToDomainGraph_setValue_3392439869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term727 = new Long(-7672528020740371001L);
        Long term729 = new Long(-4502405999831680926L);
        ArrayList term725 = new ArrayList();
        ((ArrayList) term725).add(term727);
        ((ArrayList) term725).add(term729);
        term669 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term675 = (int[]) newIntArray(5);
        Object term698 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term733 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term669, term669.getClass(), "countHosts", true);
        setBooleanField(term669, term669.getClass(), "privateDomains", true);
        setBooleanField(term669, term669.getClass(), "stripWww", true);
        setBooleanField(term669, term669.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term669, term669.getClass(), "maxSize", 6855071767938501807L);
        setIntElement(term675, 0, -1179120542);
        setIntElement(term675, 1, -73683645);
        setIntElement(term675, 2, -226514366);
        setIntElement(term675, 3, 1193880199);
        setIntElement(term675, 4, -1087774327);
        setField(term669, term669.getClass(), "ids", term675);
        setLongField(term669, term669.getClass(), "currentId", -1L);
        setLongField(term669, term669.getClass(), "lastFromId", -1L);
        setLongField(term669, term669.getClass(), "lastToId", -1L);
        setLongField(term669, term669.getClass(), "numInputLinesNodes", -5892135042702373494L);
        setLongField(term669, term669.getClass(), "numInputLinesEdges", 5262507301787091109L);
        setField(term669, term669.getClass(), "lastRevHost", "pCTimMblYc");
        setField(term698, term698.getClass(), "name", "hNxWaHcfhY");
        setField(term698, term698.getClass(), "revName", "RkybSrpybU");
        setLongField(term698, term698.getClass(), "id", -6823727938421990489L);
        setLongField(term698, term698.getClass(), "numberOfHosts", -484994522244390100L);
        setField(term698, term698.getClass(), "ids", term725);
        setField(term669, term669.getClass(), "lastDomain", term698);
        setField(term733, term733.getClass(), "comparator", null);
        setField(term733, term733.getClass(), "root", null);
        setIntField(term733, term733.getClass(), "size", 0);
        setIntField(term733, term733.getClass(), "modCount", 0);
        setField(term733, term733.getClass(), "entrySet", null);
        setField(term733, term733.getClass(), "navigableKeySet", null);
        setField(term733, term733.getClass(), "descendingMap", null);
        setField(term733, term733.getClass(), "keySet", null);
        setField(term733, term733.getClass(), "values", null);
        setField(term669, term669.getClass(), "domainQueue", term733);
        setIntField(term669, term669.getClass(), "maxQueueUsed", -1530420153);
        setField(term669, term669.getClass(), "reporterInputNodes", null);
        setField(term669, term669.getClass(), "reporterInputEdges", null);
        term737 = new Long(1233889271256172047L);
        term739 = new Long(6617340557564669657L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term737;
        args[1] = term739;
        callMethod(klass, "setValue", argTypes, term669, args);
    }

};


