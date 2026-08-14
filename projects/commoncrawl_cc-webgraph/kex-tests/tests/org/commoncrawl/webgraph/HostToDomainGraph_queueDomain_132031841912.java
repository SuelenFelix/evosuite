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

public class HostToDomainGraph_queueDomain_132031841912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1188;
     Object term1279;

    public HostToDomainGraph_queueDomain_132031841912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1249 = new Long(-5892135042702373494L);
        Long term1251 = new Long(5262507301787091109L);
        Long term1253 = new Long(-6823727938421990489L);
        Long term1255 = new Long(-484994522244390100L);
        Long term1257 = new Long(1233889271256172047L);
        Long term1259 = new Long(6617340557564669657L);
        ArrayList term1247 = new ArrayList();
        ((ArrayList) term1247).add(term1249);
        ((ArrayList) term1247).add(term1251);
        ((ArrayList) term1247).add(term1253);
        ((ArrayList) term1247).add(term1255);
        ((ArrayList) term1247).add(term1257);
        ((ArrayList) term1247).add(term1259);
        term1188 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term1194 = (int[]) newIntArray(8);
        Object term1220 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term1275 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term1188, term1188.getClass(), "countHosts", false);
        setBooleanField(term1188, term1188.getClass(), "privateDomains", true);
        setBooleanField(term1188, term1188.getClass(), "stripWww", true);
        setBooleanField(term1188, term1188.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term1188, term1188.getClass(), "maxSize", -4443169559037975007L);
        setIntElement(term1194, 0, -602026508);
        setIntElement(term1194, 1, -157887805);
        setIntElement(term1194, 2, 1876565163);
        setIntElement(term1194, 3, -817164822);
        setIntElement(term1194, 4, -1016503459);
        setIntElement(term1194, 5, -1968847291);
        setIntElement(term1194, 6, 579005622);
        setIntElement(term1194, 7, -14890619);
        setField(term1188, term1188.getClass(), "ids", term1194);
        setLongField(term1188, term1188.getClass(), "currentId", -1L);
        setLongField(term1188, term1188.getClass(), "lastFromId", -1L);
        setLongField(term1188, term1188.getClass(), "lastToId", -1L);
        setLongField(term1188, term1188.getClass(), "numInputLinesNodes", -3842548265506930260L);
        setLongField(term1188, term1188.getClass(), "numInputLinesEdges", -5788180182343976541L);
        setField(term1188, term1188.getClass(), "lastRevHost", "nyiiPDVjAc");
        setField(term1220, term1220.getClass(), "name", "aKnKipADSo");
        setField(term1220, term1220.getClass(), "revName", "wSQxaModmm");
        setLongField(term1220, term1220.getClass(), "id", 2936323121573284007L);
        setLongField(term1220, term1220.getClass(), "numberOfHosts", -1154553077993834885L);
        setField(term1220, term1220.getClass(), "ids", term1247);
        setField(term1188, term1188.getClass(), "lastDomain", term1220);
        setField(term1188, term1188.getClass(), "lastOutputDomain", "UlajhuVLaP");
        setField(term1275, term1275.getClass(), "comparator", null);
        setField(term1275, term1275.getClass(), "root", null);
        setIntField(term1275, term1275.getClass(), "size", 0);
        setIntField(term1275, term1275.getClass(), "modCount", 0);
        setField(term1275, term1275.getClass(), "entrySet", null);
        setField(term1275, term1275.getClass(), "navigableKeySet", null);
        setField(term1275, term1275.getClass(), "descendingMap", null);
        setField(term1275, term1275.getClass(), "keySet", null);
        setField(term1275, term1275.getClass(), "values", null);
        setField(term1188, term1188.getClass(), "domainQueue", term1275);
        setIntField(term1188, term1188.getClass(), "maxQueueUsed", 1632125673);
        setField(term1188, term1188.getClass(), "reporterInputNodes", null);
        setField(term1188, term1188.getClass(), "reporterInputEdges", null);
        term1279 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1280 = (byte[]) newByteArray(16);
        setField(term1279, term1279.getClass(), "value", term1280);
        setByteField(term1279, term1279.getClass(), "coder", (byte) 47);
        setIntField(term1279, term1279.getClass(), "count", 454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1279;
        args[1] = "gGSMzuGICf";
        callMethod(klass, "queueDomain", argTypes, term1188, args);
    }

};


