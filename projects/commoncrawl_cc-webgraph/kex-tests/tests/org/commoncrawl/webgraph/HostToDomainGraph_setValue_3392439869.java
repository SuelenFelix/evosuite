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
     Object term801;
     Object term881;
     Object term883;

    public HostToDomainGraph_setValue_3392439869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term859 = new Long(-7672528020740371001L);
        Long term861 = new Long(-4502405999831680926L);
        ArrayList term857 = new ArrayList();
        ((ArrayList) term857).add(term859);
        ((ArrayList) term857).add(term861);
        term801 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term807 = (int[]) newIntArray(5);
        Object term830 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term877 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term801, term801.getClass(), "countHosts", true);
        setBooleanField(term801, term801.getClass(), "privateDomains", true);
        setBooleanField(term801, term801.getClass(), "stripWww", true);
        setBooleanField(term801, term801.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term801, term801.getClass(), "maxSize", 6855071767938501807L);
        setIntElement(term807, 0, -1179120542);
        setIntElement(term807, 1, -73683645);
        setIntElement(term807, 2, -226514366);
        setIntElement(term807, 3, 1193880199);
        setIntElement(term807, 4, -1087774327);
        setField(term801, term801.getClass(), "ids", term807);
        setLongField(term801, term801.getClass(), "currentId", -1L);
        setLongField(term801, term801.getClass(), "lastFromId", -1L);
        setLongField(term801, term801.getClass(), "lastToId", -1L);
        setLongField(term801, term801.getClass(), "numInputLinesNodes", -5892135042702373494L);
        setLongField(term801, term801.getClass(), "numInputLinesEdges", 5262507301787091109L);
        setField(term801, term801.getClass(), "lastRevHost", "vrQLuWIDJX");
        setField(term830, term830.getClass(), "name", "flxyYxBRtu");
        setField(term830, term830.getClass(), "revName", "OclPbYPkcH");
        setLongField(term830, term830.getClass(), "id", -6823727938421990489L);
        setLongField(term830, term830.getClass(), "numberOfHosts", -484994522244390100L);
        setField(term830, term830.getClass(), "ids", term857);
        setField(term801, term801.getClass(), "lastDomain", term830);
        setField(term801, term801.getClass(), "lastOutputDomain", "IoAlmYsBwc");
        setField(term877, term877.getClass(), "comparator", null);
        setField(term877, term877.getClass(), "root", null);
        setIntField(term877, term877.getClass(), "size", 0);
        setIntField(term877, term877.getClass(), "modCount", 0);
        setField(term877, term877.getClass(), "entrySet", null);
        setField(term877, term877.getClass(), "navigableKeySet", null);
        setField(term877, term877.getClass(), "descendingMap", null);
        setField(term877, term877.getClass(), "keySet", null);
        setField(term877, term877.getClass(), "values", null);
        setField(term801, term801.getClass(), "domainQueue", term877);
        setIntField(term801, term801.getClass(), "maxQueueUsed", -1530420153);
        setField(term801, term801.getClass(), "reporterInputNodes", null);
        setField(term801, term801.getClass(), "reporterInputEdges", null);
        term881 = new Long(1233889271256172047L);
        term883 = new Long(6617340557564669657L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term881;
        args[1] = term883;
        callMethod(klass, "setValue", argTypes, term801, args);
    }

};


