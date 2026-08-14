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
     Object term644;
     Object term731;

    public HostToDomainGraph_setStripWww_3756888067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term703 = new Long(-2585684163342970173L);
        Long term705 = new Long(8059786003080744426L);
        Long term707 = new Long(-4365849114644724155L);
        Long term709 = new Long(2486810210675247493L);
        Long term711 = new Long(7009926388951271268L);
        ArrayList term701 = new ArrayList();
        ((ArrayList) term701).add(term703);
        ((ArrayList) term701).add(term705);
        ((ArrayList) term701).add(term707);
        ((ArrayList) term701).add(term709);
        ((ArrayList) term701).add(term711);
        term644 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term650 = (int[]) newIntArray(6);
        Object term674 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term727 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term644, term644.getClass(), "countHosts", true);
        setBooleanField(term644, term644.getClass(), "privateDomains", false);
        setBooleanField(term644, term644.getClass(), "stripWww", false);
        setBooleanField(term644, term644.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term644, term644.getClass(), "maxSize", 7009926388951271268L);
        setIntElement(term650, 0, -1007160944);
        setIntElement(term650, 1, 1135664017);
        setIntElement(term650, 2, 590364439);
        setIntElement(term650, 3, 865208305);
        setIntElement(term650, 4, -1275173084);
        setIntElement(term650, 5, -244121226);
        setField(term644, term644.getClass(), "ids", term650);
        setLongField(term644, term644.getClass(), "currentId", -1L);
        setLongField(term644, term644.getClass(), "lastFromId", -1L);
        setLongField(term644, term644.getClass(), "lastToId", -1L);
        setLongField(term644, term644.getClass(), "numInputLinesNodes", -7672528020740371001L);
        setLongField(term644, term644.getClass(), "numInputLinesEdges", -4502405999831680926L);
        setField(term644, term644.getClass(), "lastRevHost", "hNxWaHcfhY");
        setField(term674, term674.getClass(), "name", "RkybSrpybU");
        setField(term674, term674.getClass(), "revName", "xOEqzGAmDU");
        setLongField(term674, term674.getClass(), "id", 1967728129628047933L);
        setLongField(term674, term674.getClass(), "numberOfHosts", 2120084523938730454L);
        setField(term674, term674.getClass(), "ids", term701);
        setField(term644, term644.getClass(), "lastDomain", term674);
        setField(term644, term644.getClass(), "lastOutputDomain", "eZFUvlxvGV");
        setField(term727, term727.getClass(), "comparator", null);
        setField(term727, term727.getClass(), "root", null);
        setIntField(term727, term727.getClass(), "size", 0);
        setIntField(term727, term727.getClass(), "modCount", 0);
        setField(term727, term727.getClass(), "entrySet", null);
        setField(term727, term727.getClass(), "navigableKeySet", null);
        setField(term727, term727.getClass(), "descendingMap", null);
        setField(term727, term727.getClass(), "keySet", null);
        setField(term727, term727.getClass(), "values", null);
        setField(term644, term644.getClass(), "domainQueue", term727);
        setIntField(term644, term644.getClass(), "maxQueueUsed", -203030934);
        setField(term644, term644.getClass(), "reporterInputNodes", null);
        setField(term644, term644.getClass(), "reporterInputEdges", null);
        term731 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term731;
        callMethod(klass, "setStripWww", argTypes, term644, args);
    }

};


