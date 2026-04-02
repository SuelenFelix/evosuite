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
     Object term110;
     Object term180;

    public HostToDomainGraph_doCount_4220367273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term166 = new Long(5270370404989704783L);
        Long term168 = new Long(7411271909051562686L);
        Long term170 = new Long(4872422362414183754L);
        Long term172 = new Long(6811161968424632369L);
        ArrayList term164 = new ArrayList();
        ((ArrayList) term164).add(term166);
        ((ArrayList) term164).add(term168);
        ((ArrayList) term164).add(term170);
        ((ArrayList) term164).add(term172);
        term110 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term116 = (int[]) newIntArray(3);
        Object term137 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term176 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term110, term110.getClass(), "countHosts", true);
        setBooleanField(term110, term110.getClass(), "privateDomains", true);
        setBooleanField(term110, term110.getClass(), "stripWww", true);
        setBooleanField(term110, term110.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term110, term110.getClass(), "maxSize", 7411271909051562686L);
        setIntElement(term116, 0, -2038273078);
        setIntElement(term116, 1, 1227103734);
        setIntElement(term116, 2, -1339778481);
        setField(term110, term110.getClass(), "ids", term116);
        setLongField(term110, term110.getClass(), "currentId", -1L);
        setLongField(term110, term110.getClass(), "lastFromId", -1L);
        setLongField(term110, term110.getClass(), "lastToId", -1L);
        setLongField(term110, term110.getClass(), "numInputLinesNodes", 4872422362414183754L);
        setLongField(term110, term110.getClass(), "numInputLinesEdges", 6811161968424632369L);
        setField(term110, term110.getClass(), "lastRevHost", "xxtlPwDYFs");
        setField(term137, term137.getClass(), "name", "jJCZpVmanW");
        setField(term137, term137.getClass(), "revName", "EGtDIRbSSb");
        setLongField(term137, term137.getClass(), "id", -7237588299778557629L);
        setLongField(term137, term137.getClass(), "numberOfHosts", 6967924379644551255L);
        setField(term137, term137.getClass(), "ids", term164);
        setField(term110, term110.getClass(), "lastDomain", term137);
        setField(term176, term176.getClass(), "comparator", null);
        setField(term176, term176.getClass(), "root", null);
        setIntField(term176, term176.getClass(), "size", 0);
        setIntField(term176, term176.getClass(), "modCount", 0);
        setField(term176, term176.getClass(), "entrySet", null);
        setField(term176, term176.getClass(), "navigableKeySet", null);
        setField(term176, term176.getClass(), "descendingMap", null);
        setField(term176, term176.getClass(), "keySet", null);
        setField(term176, term176.getClass(), "values", null);
        setField(term110, term110.getClass(), "domainQueue", term176);
        setIntField(term110, term110.getClass(), "maxQueueUsed", 1725571209);
        setField(term110, term110.getClass(), "reporterInputNodes", null);
        setField(term110, term110.getClass(), "reporterInputEdges", null);
        term180 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term180;
        callMethod(klass, "doCount", argTypes, term110, args);
    }

};


