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
     Object term875;

    public HostToDomainGraph_convertNode_99857328611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term928 = new Long(2120084523938730454L);
        Long term930 = new Long(6855071767938501807L);
        ArrayList term926 = new ArrayList();
        ((ArrayList) term926).add(term928);
        ((ArrayList) term926).add(term930);
        term875 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term881 = (int[]) newIntArray(0);
        Object term899 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term934 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term875, term875.getClass(), "countHosts", true);
        setBooleanField(term875, term875.getClass(), "privateDomains", true);
        setBooleanField(term875, term875.getClass(), "stripWww", false);
        setBooleanField(term875, term875.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term875, term875.getClass(), "maxSize", -6645965768855543712L);
        setField(term875, term875.getClass(), "ids", term881);
        setLongField(term875, term875.getClass(), "currentId", -1L);
        setLongField(term875, term875.getClass(), "lastFromId", -1L);
        setLongField(term875, term875.getClass(), "lastToId", -1L);
        setLongField(term875, term875.getClass(), "numInputLinesNodes", 4784595517102746672L);
        setLongField(term875, term875.getClass(), "numInputLinesEdges", -7612550318181586304L);
        setField(term875, term875.getClass(), "lastRevHost", "vrQLuWIDJX");
        setField(term899, term899.getClass(), "name", "flxyYxBRtu");
        setField(term899, term899.getClass(), "revName", "OclPbYPkcH");
        setLongField(term899, term899.getClass(), "id", -2170847986967241072L);
        setLongField(term899, term899.getClass(), "numberOfHosts", 4044358158040652353L);
        setField(term899, term899.getClass(), "ids", term926);
        setField(term875, term875.getClass(), "lastDomain", term899);
        setField(term934, term934.getClass(), "comparator", null);
        setField(term934, term934.getClass(), "root", null);
        setIntField(term934, term934.getClass(), "size", 0);
        setIntField(term934, term934.getClass(), "modCount", 0);
        setField(term934, term934.getClass(), "entrySet", null);
        setField(term934, term934.getClass(), "navigableKeySet", null);
        setField(term934, term934.getClass(), "descendingMap", null);
        setField(term934, term934.getClass(), "keySet", null);
        setField(term934, term934.getClass(), "values", null);
        setField(term875, term875.getClass(), "domainQueue", term934);
        setIntField(term875, term875.getClass(), "maxQueueUsed", 767834723);
        setField(term875, term875.getClass(), "reporterInputNodes", null);
        setField(term875, term875.getClass(), "reporterInputEdges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "convertNode", argTypes, term875, args);
    }

};


