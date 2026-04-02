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

public class HostToDomainGraph_setStripWww_3756888067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534;
     Object term609;

    public HostToDomainGraph_setStripWww_3756888067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term593 = new Long(-2585684163342970173L);
        Long term595 = new Long(8059786003080744426L);
        Long term597 = new Long(-4365849114644724155L);
        Long term599 = new Long(2486810210675247493L);
        Long term601 = new Long(7009926388951271268L);
        ArrayList term591 = new ArrayList();
        ((ArrayList) term591).add(term593);
        ((ArrayList) term591).add(term595);
        ((ArrayList) term591).add(term597);
        ((ArrayList) term591).add(term599);
        ((ArrayList) term591).add(term601);
        term534 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term540 = (int[]) newIntArray(6);
        Object term564 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term605 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term534, term534.getClass(), "countHosts", true);
        setBooleanField(term534, term534.getClass(), "privateDomains", false);
        setBooleanField(term534, term534.getClass(), "stripWww", false);
        setBooleanField(term534, term534.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term534, term534.getClass(), "maxSize", 7009926388951271268L);
        setIntElement(term540, 0, -1007160944);
        setIntElement(term540, 1, 1135664017);
        setIntElement(term540, 2, 590364439);
        setIntElement(term540, 3, 865208305);
        setIntElement(term540, 4, -1275173084);
        setIntElement(term540, 5, -244121226);
        setField(term534, term534.getClass(), "ids", term540);
        setLongField(term534, term534.getClass(), "currentId", -1L);
        setLongField(term534, term534.getClass(), "lastFromId", -1L);
        setLongField(term534, term534.getClass(), "lastToId", -1L);
        setLongField(term534, term534.getClass(), "numInputLinesNodes", -7672528020740371001L);
        setLongField(term534, term534.getClass(), "numInputLinesEdges", -4502405999831680926L);
        setField(term534, term534.getClass(), "lastRevHost", "aJlieCFVtF");
        setField(term564, term564.getClass(), "name", "ZiaGIbnzTs");
        setField(term564, term564.getClass(), "revName", "tbcdzjIfER");
        setLongField(term564, term564.getClass(), "id", 1967728129628047933L);
        setLongField(term564, term564.getClass(), "numberOfHosts", 2120084523938730454L);
        setField(term564, term564.getClass(), "ids", term591);
        setField(term534, term534.getClass(), "lastDomain", term564);
        setField(term605, term605.getClass(), "comparator", null);
        setField(term605, term605.getClass(), "root", null);
        setIntField(term605, term605.getClass(), "size", 0);
        setIntField(term605, term605.getClass(), "modCount", 0);
        setField(term605, term605.getClass(), "entrySet", null);
        setField(term605, term605.getClass(), "navigableKeySet", null);
        setField(term605, term605.getClass(), "descendingMap", null);
        setField(term605, term605.getClass(), "keySet", null);
        setField(term605, term605.getClass(), "values", null);
        setField(term534, term534.getClass(), "domainQueue", term605);
        setIntField(term534, term534.getClass(), "maxQueueUsed", -203030934);
        setField(term534, term534.getClass(), "reporterInputNodes", null);
        setField(term534, term534.getClass(), "reporterInputEdges", null);
        term609 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term609;
        callMethod(klass, "setStripWww", argTypes, term534, args);
    }

};


