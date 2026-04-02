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

public class HostToDomainGraph_doPrivateDomains_19005220844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215;
     Object term287;

    public HostToDomainGraph_doPrivateDomains_19005220844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term269 = new Long(-7237588299778557629L);
        Long term271 = new Long(6967924379644551255L);
        Long term273 = new Long(-2813493605142626659L);
        Long term275 = new Long(-8885298608300233488L);
        Long term277 = new Long(-4325723315152823407L);
        Long term279 = new Long(2535595959091595249L);
        ArrayList term267 = new ArrayList();
        ((ArrayList) term267).add(term269);
        ((ArrayList) term267).add(term271);
        ((ArrayList) term267).add(term273);
        ((ArrayList) term267).add(term275);
        ((ArrayList) term267).add(term277);
        ((ArrayList) term267).add(term279);
        term215 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term221 = (int[]) newIntArray(1);
        Object term240 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term283 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term215, term215.getClass(), "countHosts", true);
        setBooleanField(term215, term215.getClass(), "privateDomains", false);
        setBooleanField(term215, term215.getClass(), "stripWww", true);
        setBooleanField(term215, term215.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term215, term215.getClass(), "maxSize", -2813493605142626659L);
        setIntElement(term221, 0, -522618178);
        setField(term215, term215.getClass(), "ids", term221);
        setLongField(term215, term215.getClass(), "currentId", -1L);
        setLongField(term215, term215.getClass(), "lastFromId", -1L);
        setLongField(term215, term215.getClass(), "lastToId", -1L);
        setLongField(term215, term215.getClass(), "numInputLinesNodes", -8885298608300233488L);
        setLongField(term215, term215.getClass(), "numInputLinesEdges", -4325723315152823407L);
        setField(term215, term215.getClass(), "lastRevHost", "SzjVpOQTyS");
        setField(term240, term240.getClass(), "name", "MjGYSRKTNF");
        setField(term240, term240.getClass(), "revName", "hRNSzYYIrc");
        setLongField(term240, term240.getClass(), "id", 2535595959091595249L);
        setLongField(term240, term240.getClass(), "numberOfHosts", -5476826692763582090L);
        setField(term240, term240.getClass(), "ids", term267);
        setField(term215, term215.getClass(), "lastDomain", term240);
        setField(term283, term283.getClass(), "comparator", null);
        setField(term283, term283.getClass(), "root", null);
        setIntField(term283, term283.getClass(), "size", 0);
        setIntField(term283, term283.getClass(), "modCount", 0);
        setField(term283, term283.getClass(), "entrySet", null);
        setField(term283, term283.getClass(), "navigableKeySet", null);
        setField(term283, term283.getClass(), "descendingMap", null);
        setField(term283, term283.getClass(), "keySet", null);
        setField(term283, term283.getClass(), "values", null);
        setField(term215, term215.getClass(), "domainQueue", term283);
        setIntField(term215, term215.getClass(), "maxQueueUsed", 1134449235);
        setField(term215, term215.getClass(), "reporterInputNodes", null);
        setField(term215, term215.getClass(), "reporterInputEdges", null);
        term287 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term287;
        callMethod(klass, "doPrivateDomains", argTypes, term215, args);
    }

};


