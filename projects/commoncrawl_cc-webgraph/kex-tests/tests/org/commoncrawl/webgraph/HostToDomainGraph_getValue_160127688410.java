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
     Object term776;
     Object term840;

    public HostToDomainGraph_getValue_160127688410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term832 = new Long(1967728129628047933L);
        ArrayList term830 = new ArrayList();
        ((ArrayList) term830).add(term832);
        term776 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term782 = (int[]) newIntArray(3);
        Object term803 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term836 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term776, term776.getClass(), "countHosts", true);
        setBooleanField(term776, term776.getClass(), "privateDomains", false);
        setBooleanField(term776, term776.getClass(), "stripWww", true);
        setBooleanField(term776, term776.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term776, term776.getClass(), "maxSize", 1439298019805881866L);
        setIntElement(term782, 0, -469968304);
        setIntElement(term782, 1, -1145578966);
        setIntElement(term782, 2, 679763016);
        setField(term776, term776.getClass(), "ids", term782);
        setLongField(term776, term776.getClass(), "currentId", -1L);
        setLongField(term776, term776.getClass(), "lastFromId", -1L);
        setLongField(term776, term776.getClass(), "lastToId", -1L);
        setLongField(term776, term776.getClass(), "numInputLinesNodes", -8708192233349544946L);
        setLongField(term776, term776.getClass(), "numInputLinesEdges", 5907001541142728739L);
        setField(term776, term776.getClass(), "lastRevHost", "xOEqzGAmDU");
        setField(term803, term803.getClass(), "name", "eZFUvlxvGV");
        setField(term803, term803.getClass(), "revName", "BYqFIqCKAV");
        setLongField(term803, term803.getClass(), "id", 4178434741742309755L);
        setLongField(term803, term803.getClass(), "numberOfHosts", -2068172595987555756L);
        setField(term803, term803.getClass(), "ids", term830);
        setField(term776, term776.getClass(), "lastDomain", term803);
        setField(term836, term836.getClass(), "comparator", null);
        setField(term836, term836.getClass(), "root", null);
        setIntField(term836, term836.getClass(), "size", 0);
        setIntField(term836, term836.getClass(), "modCount", 0);
        setField(term836, term836.getClass(), "entrySet", null);
        setField(term836, term836.getClass(), "navigableKeySet", null);
        setField(term836, term836.getClass(), "descendingMap", null);
        setField(term836, term836.getClass(), "keySet", null);
        setField(term836, term836.getClass(), "values", null);
        setField(term776, term776.getClass(), "domainQueue", term836);
        setIntField(term776, term776.getClass(), "maxQueueUsed", 1962444399);
        setField(term776, term776.getClass(), "reporterInputNodes", null);
        setField(term776, term776.getClass(), "reporterInputEdges", null);
        term840 = new Long(-6292278961887936280L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term840;
        callMethod(klass, "getValue", argTypes, term776, args);
    }

};


