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

public class HostToDomainGraph_setStrictDomainValidate_6924708265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320;
     Object term393;

    public HostToDomainGraph_setStrictDomainValidate_6924708265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term375 = new Long(-5476826692763582090L);
        Long term377 = new Long(-872011222785455006L);
        Long term379 = new Long(-316468845751588286L);
        Long term381 = new Long(5127676408959197577L);
        Long term383 = new Long(-6573104506744284592L);
        Long term385 = new Long(-4920224193275732920L);
        ArrayList term373 = new ArrayList();
        ((ArrayList) term373).add(term375);
        ((ArrayList) term373).add(term377);
        ((ArrayList) term373).add(term379);
        ((ArrayList) term373).add(term381);
        ((ArrayList) term373).add(term383);
        ((ArrayList) term373).add(term385);
        term320 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term326 = (int[]) newIntArray(2);
        Object term346 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term389 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term320, term320.getClass(), "countHosts", false);
        setBooleanField(term320, term320.getClass(), "privateDomains", false);
        setBooleanField(term320, term320.getClass(), "stripWww", true);
        setBooleanField(term320, term320.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term320, term320.getClass(), "maxSize", -872011222785455006L);
        setIntElement(term326, 0, -883034806);
        setIntElement(term326, 1, 1585847225);
        setField(term320, term320.getClass(), "ids", term326);
        setLongField(term320, term320.getClass(), "currentId", -1L);
        setLongField(term320, term320.getClass(), "lastFromId", -1L);
        setLongField(term320, term320.getClass(), "lastToId", -1L);
        setLongField(term320, term320.getClass(), "numInputLinesNodes", -316468845751588286L);
        setLongField(term320, term320.getClass(), "numInputLinesEdges", 5127676408959197577L);
        setField(term320, term320.getClass(), "lastRevHost", "RMFIsYGgne");
        setField(term346, term346.getClass(), "name", "NRdvgJlhkX");
        setField(term346, term346.getClass(), "revName", "uuaPigETmJ");
        setLongField(term346, term346.getClass(), "id", -6573104506744284592L);
        setLongField(term346, term346.getClass(), "numberOfHosts", -4920224193275732920L);
        setField(term346, term346.getClass(), "ids", term373);
        setField(term320, term320.getClass(), "lastDomain", term346);
        setField(term389, term389.getClass(), "comparator", null);
        setField(term389, term389.getClass(), "root", null);
        setIntField(term389, term389.getClass(), "size", 0);
        setIntField(term389, term389.getClass(), "modCount", 0);
        setField(term389, term389.getClass(), "entrySet", null);
        setField(term389, term389.getClass(), "navigableKeySet", null);
        setField(term389, term389.getClass(), "descendingMap", null);
        setField(term389, term389.getClass(), "keySet", null);
        setField(term389, term389.getClass(), "values", null);
        setField(term320, term320.getClass(), "domainQueue", term389);
        setIntField(term320, term320.getClass(), "maxQueueUsed", 597278769);
        setField(term320, term320.getClass(), "reporterInputNodes", null);
        setField(term320, term320.getClass(), "reporterInputEdges", null);
        term393 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term393;
        callMethod(klass, "setStrictDomainValidate", argTypes, term320, args);
    }

};


