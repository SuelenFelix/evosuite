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

public class HostToDomainGraph_doCount_4220367273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;
     Object term214;

    public HostToDomainGraph_doCount_4220367273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term188 = new Long(5270370404989704783L);
        Long term190 = new Long(7411271909051562686L);
        Long term192 = new Long(4872422362414183754L);
        Long term194 = new Long(6811161968424632369L);
        ArrayList term186 = new ArrayList();
        ((ArrayList) term186).add(term188);
        ((ArrayList) term186).add(term190);
        ((ArrayList) term186).add(term192);
        ((ArrayList) term186).add(term194);
        term132 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term138 = (int[]) newIntArray(3);
        Object term159 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term210 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term132, term132.getClass(), "countHosts", true);
        setBooleanField(term132, term132.getClass(), "privateDomains", true);
        setBooleanField(term132, term132.getClass(), "stripWww", true);
        setBooleanField(term132, term132.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term132, term132.getClass(), "maxSize", 7411271909051562686L);
        setIntElement(term138, 0, -2038273078);
        setIntElement(term138, 1, 1227103734);
        setIntElement(term138, 2, -1339778481);
        setField(term132, term132.getClass(), "ids", term138);
        setLongField(term132, term132.getClass(), "currentId", -1L);
        setLongField(term132, term132.getClass(), "lastFromId", -1L);
        setLongField(term132, term132.getClass(), "lastToId", -1L);
        setLongField(term132, term132.getClass(), "numInputLinesNodes", 4872422362414183754L);
        setLongField(term132, term132.getClass(), "numInputLinesEdges", 6811161968424632369L);
        setField(term132, term132.getClass(), "lastRevHost", "jJCZpVmanW");
        setField(term159, term159.getClass(), "name", "EGtDIRbSSb");
        setField(term159, term159.getClass(), "revName", "SzjVpOQTyS");
        setLongField(term159, term159.getClass(), "id", -7237588299778557629L);
        setLongField(term159, term159.getClass(), "numberOfHosts", 6967924379644551255L);
        setField(term159, term159.getClass(), "ids", term186);
        setField(term132, term132.getClass(), "lastDomain", term159);
        setField(term132, term132.getClass(), "lastOutputDomain", "MjGYSRKTNF");
        setField(term210, term210.getClass(), "comparator", null);
        setField(term210, term210.getClass(), "root", null);
        setIntField(term210, term210.getClass(), "size", 0);
        setIntField(term210, term210.getClass(), "modCount", 0);
        setField(term210, term210.getClass(), "entrySet", null);
        setField(term210, term210.getClass(), "navigableKeySet", null);
        setField(term210, term210.getClass(), "descendingMap", null);
        setField(term210, term210.getClass(), "keySet", null);
        setField(term210, term210.getClass(), "values", null);
        setField(term132, term132.getClass(), "domainQueue", term210);
        setIntField(term132, term132.getClass(), "maxQueueUsed", 1725571209);
        setField(term132, term132.getClass(), "reporterInputNodes", null);
        setField(term132, term132.getClass(), "reporterInputEdges", null);
        term214 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term214;
        callMethod(klass, "doCount", argTypes, term132, args);
    }

};


