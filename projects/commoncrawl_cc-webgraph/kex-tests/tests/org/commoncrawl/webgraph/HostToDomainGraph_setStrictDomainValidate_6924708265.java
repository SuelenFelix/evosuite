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
     Object term386;
     Object term471;

    public HostToDomainGraph_setStrictDomainValidate_6924708265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term441 = new Long(-5476826692763582090L);
        Long term443 = new Long(-872011222785455006L);
        Long term445 = new Long(-316468845751588286L);
        Long term447 = new Long(5127676408959197577L);
        Long term449 = new Long(-6573104506744284592L);
        Long term451 = new Long(-4920224193275732920L);
        ArrayList term439 = new ArrayList();
        ((ArrayList) term439).add(term441);
        ((ArrayList) term439).add(term443);
        ((ArrayList) term439).add(term445);
        ((ArrayList) term439).add(term447);
        ((ArrayList) term439).add(term449);
        ((ArrayList) term439).add(term451);
        term386 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term392 = (int[]) newIntArray(2);
        Object term412 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term467 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term386, term386.getClass(), "countHosts", false);
        setBooleanField(term386, term386.getClass(), "privateDomains", false);
        setBooleanField(term386, term386.getClass(), "stripWww", true);
        setBooleanField(term386, term386.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term386, term386.getClass(), "maxSize", -872011222785455006L);
        setIntElement(term392, 0, -883034806);
        setIntElement(term392, 1, 1585847225);
        setField(term386, term386.getClass(), "ids", term392);
        setLongField(term386, term386.getClass(), "currentId", -1L);
        setLongField(term386, term386.getClass(), "lastFromId", -1L);
        setLongField(term386, term386.getClass(), "lastToId", -1L);
        setLongField(term386, term386.getClass(), "numInputLinesNodes", -316468845751588286L);
        setLongField(term386, term386.getClass(), "numInputLinesEdges", 5127676408959197577L);
        setField(term386, term386.getClass(), "lastRevHost", "MxlszYVzRf");
        setField(term412, term412.getClass(), "name", "LQFpaHEwXR");
        setField(term412, term412.getClass(), "revName", "oVcInYnLWB");
        setLongField(term412, term412.getClass(), "id", -6573104506744284592L);
        setLongField(term412, term412.getClass(), "numberOfHosts", -4920224193275732920L);
        setField(term412, term412.getClass(), "ids", term439);
        setField(term386, term386.getClass(), "lastDomain", term412);
        setField(term386, term386.getClass(), "lastOutputDomain", "aJlieCFVtF");
        setField(term467, term467.getClass(), "comparator", null);
        setField(term467, term467.getClass(), "root", null);
        setIntField(term467, term467.getClass(), "size", 0);
        setIntField(term467, term467.getClass(), "modCount", 0);
        setField(term467, term467.getClass(), "entrySet", null);
        setField(term467, term467.getClass(), "navigableKeySet", null);
        setField(term467, term467.getClass(), "descendingMap", null);
        setField(term467, term467.getClass(), "keySet", null);
        setField(term467, term467.getClass(), "values", null);
        setField(term386, term386.getClass(), "domainQueue", term467);
        setIntField(term386, term386.getClass(), "maxQueueUsed", 597278769);
        setField(term386, term386.getClass(), "reporterInputNodes", null);
        setField(term386, term386.getClass(), "reporterInputEdges", null);
        term471 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term471;
        callMethod(klass, "setStrictDomainValidate", argTypes, term386, args);
    }

};


