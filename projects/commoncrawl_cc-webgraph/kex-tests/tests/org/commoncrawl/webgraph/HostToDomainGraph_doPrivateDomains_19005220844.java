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
     Object term259;
     Object term343;

    public HostToDomainGraph_doPrivateDomains_19005220844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term313 = new Long(-7237588299778557629L);
        Long term315 = new Long(6967924379644551255L);
        Long term317 = new Long(-2813493605142626659L);
        Long term319 = new Long(-8885298608300233488L);
        Long term321 = new Long(-4325723315152823407L);
        Long term323 = new Long(2535595959091595249L);
        ArrayList term311 = new ArrayList();
        ((ArrayList) term311).add(term313);
        ((ArrayList) term311).add(term315);
        ((ArrayList) term311).add(term317);
        ((ArrayList) term311).add(term319);
        ((ArrayList) term311).add(term321);
        ((ArrayList) term311).add(term323);
        term259 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term265 = (int[]) newIntArray(1);
        Object term284 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term339 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term259, term259.getClass(), "countHosts", true);
        setBooleanField(term259, term259.getClass(), "privateDomains", false);
        setBooleanField(term259, term259.getClass(), "stripWww", true);
        setBooleanField(term259, term259.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term259, term259.getClass(), "maxSize", -2813493605142626659L);
        setIntElement(term265, 0, -522618178);
        setField(term259, term259.getClass(), "ids", term265);
        setLongField(term259, term259.getClass(), "currentId", -1L);
        setLongField(term259, term259.getClass(), "lastFromId", -1L);
        setLongField(term259, term259.getClass(), "lastToId", -1L);
        setLongField(term259, term259.getClass(), "numInputLinesNodes", -8885298608300233488L);
        setLongField(term259, term259.getClass(), "numInputLinesEdges", -4325723315152823407L);
        setField(term259, term259.getClass(), "lastRevHost", "hRNSzYYIrc");
        setField(term284, term284.getClass(), "name", "RMFIsYGgne");
        setField(term284, term284.getClass(), "revName", "NRdvgJlhkX");
        setLongField(term284, term284.getClass(), "id", 2535595959091595249L);
        setLongField(term284, term284.getClass(), "numberOfHosts", -5476826692763582090L);
        setField(term284, term284.getClass(), "ids", term311);
        setField(term259, term259.getClass(), "lastDomain", term284);
        setField(term259, term259.getClass(), "lastOutputDomain", "uuaPigETmJ");
        setField(term339, term339.getClass(), "comparator", null);
        setField(term339, term339.getClass(), "root", null);
        setIntField(term339, term339.getClass(), "size", 0);
        setIntField(term339, term339.getClass(), "modCount", 0);
        setField(term339, term339.getClass(), "entrySet", null);
        setField(term339, term339.getClass(), "navigableKeySet", null);
        setField(term339, term339.getClass(), "descendingMap", null);
        setField(term339, term339.getClass(), "keySet", null);
        setField(term339, term339.getClass(), "values", null);
        setField(term259, term259.getClass(), "domainQueue", term339);
        setIntField(term259, term259.getClass(), "maxQueueUsed", 1134449235);
        setField(term259, term259.getClass(), "reporterInputNodes", null);
        setField(term259, term259.getClass(), "reporterInputEdges", null);
        term343 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term343;
        callMethod(klass, "doPrivateDomains", argTypes, term259, args);
    }

};


