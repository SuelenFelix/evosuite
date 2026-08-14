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

public class HostToDomainGraph_getValue_160127688410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930;
     Object term1006;

    public HostToDomainGraph_getValue_160127688410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term986 = new Long(1967728129628047933L);
        ArrayList term984 = new ArrayList();
        ((ArrayList) term984).add(term986);
        term930 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term936 = (int[]) newIntArray(3);
        Object term957 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term1002 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term930, term930.getClass(), "countHosts", true);
        setBooleanField(term930, term930.getClass(), "privateDomains", false);
        setBooleanField(term930, term930.getClass(), "stripWww", true);
        setBooleanField(term930, term930.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term930, term930.getClass(), "maxSize", 1439298019805881866L);
        setIntElement(term936, 0, -469968304);
        setIntElement(term936, 1, -1145578966);
        setIntElement(term936, 2, 679763016);
        setField(term930, term930.getClass(), "ids", term936);
        setLongField(term930, term930.getClass(), "currentId", -1L);
        setLongField(term930, term930.getClass(), "lastFromId", -1L);
        setLongField(term930, term930.getClass(), "lastToId", -1L);
        setLongField(term930, term930.getClass(), "numInputLinesNodes", -8708192233349544946L);
        setLongField(term930, term930.getClass(), "numInputLinesEdges", 5907001541142728739L);
        setField(term930, term930.getClass(), "lastRevHost", "TEParAifyi");
        setField(term957, term957.getClass(), "name", "OWDIEULEFu");
        setField(term957, term957.getClass(), "revName", "dWRymuLBtr");
        setLongField(term957, term957.getClass(), "id", 4178434741742309755L);
        setLongField(term957, term957.getClass(), "numberOfHosts", -2068172595987555756L);
        setField(term957, term957.getClass(), "ids", term984);
        setField(term930, term930.getClass(), "lastDomain", term957);
        setField(term930, term930.getClass(), "lastOutputDomain", "AijpHYOFuy");
        setField(term1002, term1002.getClass(), "comparator", null);
        setField(term1002, term1002.getClass(), "root", null);
        setIntField(term1002, term1002.getClass(), "size", 0);
        setIntField(term1002, term1002.getClass(), "modCount", 0);
        setField(term1002, term1002.getClass(), "entrySet", null);
        setField(term1002, term1002.getClass(), "navigableKeySet", null);
        setField(term1002, term1002.getClass(), "descendingMap", null);
        setField(term1002, term1002.getClass(), "keySet", null);
        setField(term1002, term1002.getClass(), "values", null);
        setField(term930, term930.getClass(), "domainQueue", term1002);
        setIntField(term930, term930.getClass(), "maxQueueUsed", 1962444399);
        setField(term930, term930.getClass(), "reporterInputNodes", null);
        setField(term930, term930.getClass(), "reporterInputEdges", null);
        term1006 = new Long(-6292278961887936280L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1006;
        callMethod(klass, "getValue", argTypes, term930, args);
    }

};


