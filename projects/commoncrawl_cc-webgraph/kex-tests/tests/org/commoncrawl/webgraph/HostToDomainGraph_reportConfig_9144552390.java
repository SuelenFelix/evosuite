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

public class HostToDomainGraph_reportConfig_9144552390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public HostToDomainGraph_reportConfig_9144552390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term59 = new Long(2442117782898005296L);
        Long term61 = new Long(6375119433582206027L);
        Long term63 = new Long(-8257434502486459194L);
        Long term65 = new Long(-8400487765614892086L);
        ArrayList term57 = new ArrayList();
        ((ArrayList) term57).add(term59);
        ((ArrayList) term57).add(term61);
        ((ArrayList) term57).add(term63);
        ((ArrayList) term57).add(term65);
        term1 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term7 = (int[]) newIntArray(5);
        Object term30 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term69 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term1, term1.getClass(), "countHosts", false);
        setBooleanField(term1, term1.getClass(), "privateDomains", false);
        setBooleanField(term1, term1.getClass(), "stripWww", false);
        setBooleanField(term1, term1.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term1, term1.getClass(), "maxSize", 2442117782898005296L);
        setIntElement(term7, 0, 568599855);
        setIntElement(term7, 1, 1162663216);
        setIntElement(term7, 2, 1484323161);
        setIntElement(term7, 3, 391863371);
        setIntElement(term7, 4, -1922583790);
        setField(term1, term1.getClass(), "ids", term7);
        setLongField(term1, term1.getClass(), "currentId", -1L);
        setLongField(term1, term1.getClass(), "lastFromId", -1L);
        setLongField(term1, term1.getClass(), "lastToId", -1L);
        setLongField(term1, term1.getClass(), "numInputLinesNodes", 6375119433582206027L);
        setLongField(term1, term1.getClass(), "numInputLinesEdges", -8257434502486459194L);
        setField(term1, term1.getClass(), "lastRevHost", "PAEBtnZtTD");
        setField(term30, term30.getClass(), "name", "sjlJAEtRrb");
        setField(term30, term30.getClass(), "revName", "MuLcgQHgqz");
        setLongField(term30, term30.getClass(), "id", -8400487765614892086L);
        setLongField(term30, term30.getClass(), "numberOfHosts", 5270370404989704783L);
        setField(term30, term30.getClass(), "ids", term57);
        setField(term1, term1.getClass(), "lastDomain", term30);
        setField(term69, term69.getClass(), "comparator", null);
        setField(term69, term69.getClass(), "root", null);
        setIntField(term69, term69.getClass(), "size", 0);
        setIntField(term69, term69.getClass(), "modCount", 0);
        setField(term69, term69.getClass(), "entrySet", null);
        setField(term69, term69.getClass(), "navigableKeySet", null);
        setField(term69, term69.getClass(), "descendingMap", null);
        setField(term69, term69.getClass(), "keySet", null);
        setField(term69, term69.getClass(), "values", null);
        setField(term1, term1.getClass(), "domainQueue", term69);
        setIntField(term1, term1.getClass(), "maxQueueUsed", -616727354);
        setField(term1, term1.getClass(), "reporterInputNodes", null);
        setField(term1, term1.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reportConfig", argTypes, term1, args);
    }

};


