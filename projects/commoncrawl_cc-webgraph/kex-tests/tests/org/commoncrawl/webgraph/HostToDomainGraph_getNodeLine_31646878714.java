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

public class HostToDomainGraph_getNodeLine_31646878714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1329;
     Object term1401;
     Object term1421;

    public HostToDomainGraph_getNodeLine_31646878714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1385 = new Long(4044358158040652353L);
        Long term1387 = new Long(-4443169559037975007L);
        Long term1389 = new Long(-3842548265506930260L);
        Long term1391 = new Long(-5788180182343976541L);
        Long term1393 = new Long(2936323121573284007L);
        ArrayList term1383 = new ArrayList();
        ((ArrayList) term1383).add(term1385);
        ((ArrayList) term1383).add(term1387);
        ((ArrayList) term1383).add(term1389);
        ((ArrayList) term1383).add(term1391);
        ((ArrayList) term1383).add(term1393);
        term1329 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term1335 = (int[]) newIntArray(3);
        Object term1356 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term1397 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term1329, term1329.getClass(), "countHosts", true);
        setBooleanField(term1329, term1329.getClass(), "privateDomains", false);
        setBooleanField(term1329, term1329.getClass(), "stripWww", false);
        setBooleanField(term1329, term1329.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term1329, term1329.getClass(), "maxSize", 5953383087795962419L);
        setIntElement(term1335, 0, 292681826);
        setIntElement(term1335, 1, 458147407);
        setIntElement(term1335, 2, -184153539);
        setField(term1329, term1329.getClass(), "ids", term1335);
        setLongField(term1329, term1329.getClass(), "currentId", -1L);
        setLongField(term1329, term1329.getClass(), "lastFromId", -1L);
        setLongField(term1329, term1329.getClass(), "lastToId", -1L);
        setLongField(term1329, term1329.getClass(), "numInputLinesNodes", 7994303628307559416L);
        setLongField(term1329, term1329.getClass(), "numInputLinesEdges", 2443640364875054177L);
        setField(term1329, term1329.getClass(), "lastRevHost", "nyiiPDVjAc");
        setField(term1356, term1356.getClass(), "name", "aKnKipADSo");
        setField(term1356, term1356.getClass(), "revName", "wSQxaModmm");
        setLongField(term1356, term1356.getClass(), "id", -1610676979013636850L);
        setLongField(term1356, term1356.getClass(), "numberOfHosts", 2062173786000223358L);
        setField(term1356, term1356.getClass(), "ids", term1383);
        setField(term1329, term1329.getClass(), "lastDomain", term1356);
        setField(term1397, term1397.getClass(), "comparator", null);
        setField(term1397, term1397.getClass(), "root", null);
        setIntField(term1397, term1397.getClass(), "size", 0);
        setIntField(term1397, term1397.getClass(), "modCount", 0);
        setField(term1397, term1397.getClass(), "entrySet", null);
        setField(term1397, term1397.getClass(), "navigableKeySet", null);
        setField(term1397, term1397.getClass(), "descendingMap", null);
        setField(term1397, term1397.getClass(), "keySet", null);
        setField(term1397, term1397.getClass(), "values", null);
        setField(term1329, term1329.getClass(), "domainQueue", term1397);
        setIntField(term1329, term1329.getClass(), "maxQueueUsed", 493620644);
        setField(term1329, term1329.getClass(), "reporterInputNodes", null);
        setField(term1329, term1329.getClass(), "reporterInputEdges", null);
        term1401 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1402 = (byte[]) newByteArray(16);
        setField(term1401, term1401.getClass(), "value", term1402);
        setByteField(term1401, term1401.getClass(), "coder", (byte) 48);
        setIntField(term1401, term1401.getClass(), "count", 1328271830);
        Long term1450 = new Long(-1154553077993834885L);
        Long term1452 = new Long(-2850532706972744550L);
        Long term1454 = new Long(-2644215923136513282L);
        Long term1456 = new Long(-1468719814009985452L);
        Long term1458 = new Long(-7738503207562305297L);
        Long term1460 = new Long(3825396310311739952L);
        ArrayList term1448 = new ArrayList();
        ((ArrayList) term1448).add(term1450);
        ((ArrayList) term1448).add(term1452);
        ((ArrayList) term1448).add(term1454);
        ((ArrayList) term1448).add(term1456);
        ((ArrayList) term1448).add(term1458);
        ((ArrayList) term1448).add(term1460);
        term1421 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term1421, term1421.getClass(), "name", "UlajhuVLaP");
        setField(term1421, term1421.getClass(), "revName", "gGSMzuGICf");
        setLongField(term1421, term1421.getClass(), "id", -8658027316505137504L);
        setLongField(term1421, term1421.getClass(), "numberOfHosts", 414749984815662075L);
        setField(term1421, term1421.getClass(), "ids", term1448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Object[] args = new Object[2];
        args[0] = term1401;
        args[1] = term1421;
        callMethod(klass, "getNodeLine", argTypes, term1329, args);
    }

};


