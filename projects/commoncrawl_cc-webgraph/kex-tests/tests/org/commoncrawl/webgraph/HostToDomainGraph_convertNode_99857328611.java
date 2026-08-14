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

public class HostToDomainGraph_convertNode_99857328611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1051;

    public HostToDomainGraph_convertNode_99857328611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1104 = new Long(2120084523938730454L);
        Long term1106 = new Long(6855071767938501807L);
        ArrayList term1102 = new ArrayList();
        ((ArrayList) term1102).add(term1104);
        ((ArrayList) term1102).add(term1106);
        term1051 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term1057 = (int[]) newIntArray(0);
        Object term1075 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term1122 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term1051, term1051.getClass(), "countHosts", true);
        setBooleanField(term1051, term1051.getClass(), "privateDomains", true);
        setBooleanField(term1051, term1051.getClass(), "stripWww", false);
        setBooleanField(term1051, term1051.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term1051, term1051.getClass(), "maxSize", -6645965768855543712L);
        setField(term1051, term1051.getClass(), "ids", term1057);
        setLongField(term1051, term1051.getClass(), "currentId", -1L);
        setLongField(term1051, term1051.getClass(), "lastFromId", -1L);
        setLongField(term1051, term1051.getClass(), "lastToId", -1L);
        setLongField(term1051, term1051.getClass(), "numInputLinesNodes", 4784595517102746672L);
        setLongField(term1051, term1051.getClass(), "numInputLinesEdges", -7612550318181586304L);
        setField(term1051, term1051.getClass(), "lastRevHost", "SbAoxhfrkn");
        setField(term1075, term1075.getClass(), "name", "kuTXqwMtDB");
        setField(term1075, term1075.getClass(), "revName", "Ghbwtircqb");
        setLongField(term1075, term1075.getClass(), "id", -2170847986967241072L);
        setLongField(term1075, term1075.getClass(), "numberOfHosts", 4044358158040652353L);
        setField(term1075, term1075.getClass(), "ids", term1102);
        setField(term1051, term1051.getClass(), "lastDomain", term1075);
        setField(term1051, term1051.getClass(), "lastOutputDomain", "xrwlQZdwCp");
        setField(term1122, term1122.getClass(), "comparator", null);
        setField(term1122, term1122.getClass(), "root", null);
        setIntField(term1122, term1122.getClass(), "size", 0);
        setIntField(term1122, term1122.getClass(), "modCount", 0);
        setField(term1122, term1122.getClass(), "entrySet", null);
        setField(term1122, term1122.getClass(), "navigableKeySet", null);
        setField(term1122, term1122.getClass(), "descendingMap", null);
        setField(term1122, term1122.getClass(), "keySet", null);
        setField(term1122, term1122.getClass(), "values", null);
        setField(term1051, term1051.getClass(), "domainQueue", term1122);
        setIntField(term1051, term1051.getClass(), "maxQueueUsed", 767834723);
        setField(term1051, term1051.getClass(), "reporterInputNodes", null);
        setField(term1051, term1051.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "convertNode", argTypes, term1051, args);
    }

};


