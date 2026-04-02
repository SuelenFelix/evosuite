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
     Object term990;
     Object term1069;

    public HostToDomainGraph_queueDomain_132031841912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1051 = new Long(-5892135042702373494L);
        Long term1053 = new Long(5262507301787091109L);
        Long term1055 = new Long(-6823727938421990489L);
        Long term1057 = new Long(-484994522244390100L);
        Long term1059 = new Long(1233889271256172047L);
        Long term1061 = new Long(6617340557564669657L);
        ArrayList term1049 = new ArrayList();
        ((ArrayList) term1049).add(term1051);
        ((ArrayList) term1049).add(term1053);
        ((ArrayList) term1049).add(term1055);
        ((ArrayList) term1049).add(term1057);
        ((ArrayList) term1049).add(term1059);
        ((ArrayList) term1049).add(term1061);
        term990 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term996 = (int[]) newIntArray(8);
        Object term1022 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term1065 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term990, term990.getClass(), "countHosts", false);
        setBooleanField(term990, term990.getClass(), "privateDomains", true);
        setBooleanField(term990, term990.getClass(), "stripWww", true);
        setBooleanField(term990, term990.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term990, term990.getClass(), "maxSize", -4443169559037975007L);
        setIntElement(term996, 0, -602026508);
        setIntElement(term996, 1, -157887805);
        setIntElement(term996, 2, 1876565163);
        setIntElement(term996, 3, -817164822);
        setIntElement(term996, 4, -1016503459);
        setIntElement(term996, 5, -1968847291);
        setIntElement(term996, 6, 579005622);
        setIntElement(term996, 7, -14890619);
        setField(term990, term990.getClass(), "ids", term996);
        setLongField(term990, term990.getClass(), "currentId", -1L);
        setLongField(term990, term990.getClass(), "lastFromId", -1L);
        setLongField(term990, term990.getClass(), "lastToId", -1L);
        setLongField(term990, term990.getClass(), "numInputLinesNodes", -3842548265506930260L);
        setLongField(term990, term990.getClass(), "numInputLinesEdges", -5788180182343976541L);
        setField(term990, term990.getClass(), "lastRevHost", "TEParAifyi");
        setField(term1022, term1022.getClass(), "name", "OWDIEULEFu");
        setField(term1022, term1022.getClass(), "revName", "dWRymuLBtr");
        setLongField(term1022, term1022.getClass(), "id", 2936323121573284007L);
        setLongField(term1022, term1022.getClass(), "numberOfHosts", -1154553077993834885L);
        setField(term1022, term1022.getClass(), "ids", term1049);
        setField(term990, term990.getClass(), "lastDomain", term1022);
        setField(term1065, term1065.getClass(), "comparator", null);
        setField(term1065, term1065.getClass(), "root", null);
        setIntField(term1065, term1065.getClass(), "size", 0);
        setIntField(term1065, term1065.getClass(), "modCount", 0);
        setField(term1065, term1065.getClass(), "entrySet", null);
        setField(term1065, term1065.getClass(), "navigableKeySet", null);
        setField(term1065, term1065.getClass(), "descendingMap", null);
        setField(term1065, term1065.getClass(), "keySet", null);
        setField(term1065, term1065.getClass(), "values", null);
        setField(term990, term990.getClass(), "domainQueue", term1065);
        setIntField(term990, term990.getClass(), "maxQueueUsed", 1632125673);
        setField(term990, term990.getClass(), "reporterInputNodes", null);
        setField(term990, term990.getClass(), "reporterInputEdges", null);
        term1069 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1070 = (byte[]) newByteArray(16);
        setField(term1069, term1069.getClass(), "value", term1070);
        setByteField(term1069, term1069.getClass(), "coder", (byte) 47);
        setIntField(term1069, term1069.getClass(), "count", 454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1069;
        args[1] = "AijpHYOFuy";
        callMethod(klass, "queueDomain", argTypes, term990, args);
    }

};


