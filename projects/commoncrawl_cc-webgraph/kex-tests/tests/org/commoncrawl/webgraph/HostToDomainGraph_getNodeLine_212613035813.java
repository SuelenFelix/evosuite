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

public class HostToDomainGraph_getNodeLine_212613035813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1385;
     Object term1460;

    public HostToDomainGraph_getNodeLine_212613035813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1440 = new Long(1439298019805881866L);
        ArrayList term1438 = new ArrayList();
        ((ArrayList) term1438).add(term1440);
        term1385 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term1391 = (int[]) newIntArray(2);
        Object term1411 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term1456 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term1385, term1385.getClass(), "countHosts", true);
        setBooleanField(term1385, term1385.getClass(), "privateDomains", true);
        setBooleanField(term1385, term1385.getClass(), "stripWww", true);
        setBooleanField(term1385, term1385.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term1385, term1385.getClass(), "maxSize", -2850532706972744550L);
        setIntElement(term1391, 0, -1786399638);
        setIntElement(term1391, 1, 2055867847);
        setField(term1385, term1385.getClass(), "ids", term1391);
        setLongField(term1385, term1385.getClass(), "currentId", -1L);
        setLongField(term1385, term1385.getClass(), "lastFromId", -1L);
        setLongField(term1385, term1385.getClass(), "lastToId", -1L);
        setLongField(term1385, term1385.getClass(), "numInputLinesNodes", -2644215923136513282L);
        setLongField(term1385, term1385.getClass(), "numInputLinesEdges", -1468719814009985452L);
        setField(term1385, term1385.getClass(), "lastRevHost", "hxCBltsObl");
        setField(term1411, term1411.getClass(), "name", "BndsHwAFMv");
        setField(term1411, term1411.getClass(), "revName", "GzFkzHGYFt");
        setLongField(term1411, term1411.getClass(), "id", -7738503207562305297L);
        setLongField(term1411, term1411.getClass(), "numberOfHosts", 3825396310311739952L);
        setField(term1411, term1411.getClass(), "ids", term1438);
        setField(term1385, term1385.getClass(), "lastDomain", term1411);
        setField(term1385, term1385.getClass(), "lastOutputDomain", "tShwQLRGNe");
        setField(term1456, term1456.getClass(), "comparator", null);
        setField(term1456, term1456.getClass(), "root", null);
        setIntField(term1456, term1456.getClass(), "size", 0);
        setIntField(term1456, term1456.getClass(), "modCount", 0);
        setField(term1456, term1456.getClass(), "entrySet", null);
        setField(term1456, term1456.getClass(), "navigableKeySet", null);
        setField(term1456, term1456.getClass(), "descendingMap", null);
        setField(term1456, term1456.getClass(), "keySet", null);
        setField(term1456, term1456.getClass(), "values", null);
        setField(term1385, term1385.getClass(), "domainQueue", term1456);
        setIntField(term1385, term1385.getClass(), "maxQueueUsed", -1048298087);
        setField(term1385, term1385.getClass(), "reporterInputNodes", null);
        setField(term1385, term1385.getClass(), "reporterInputEdges", null);
        Long term1489 = new Long(-8708192233349544946L);
        Long term1491 = new Long(5907001541142728739L);
        Long term1493 = new Long(4178434741742309755L);
        Long term1495 = new Long(-2068172595987555756L);
        Long term1497 = new Long(-6292278961887936280L);
        Long term1499 = new Long(-6645965768855543712L);
        Long term1501 = new Long(4784595517102746672L);
        Long term1503 = new Long(-7612550318181586304L);
        Long term1505 = new Long(-2170847986967241072L);
        ArrayList term1487 = new ArrayList();
        ((ArrayList) term1487).add(term1489);
        ((ArrayList) term1487).add(term1491);
        ((ArrayList) term1487).add(term1493);
        ((ArrayList) term1487).add(term1495);
        ((ArrayList) term1487).add(term1497);
        ((ArrayList) term1487).add(term1499);
        ((ArrayList) term1487).add(term1501);
        ((ArrayList) term1487).add(term1503);
        ((ArrayList) term1487).add(term1505);
        term1460 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term1460, term1460.getClass(), "name", "LvtrsXUliU");
        setField(term1460, term1460.getClass(), "revName", "xLbjWUgOIL");
        setLongField(term1460, term1460.getClass(), "id", -3838084482494604218L);
        setLongField(term1460, term1460.getClass(), "numberOfHosts", 3892018155439224435L);
        setField(term1460, term1460.getClass(), "ids", term1487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Object[] args = new Object[1];
        args[0] = term1460;
        callMethod(klass, "getNodeLine", argTypes, term1385, args);
    }

};


