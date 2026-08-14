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
     Object term1571;
     Object term1655;
     Object term1675;

    public HostToDomainGraph_getNodeLine_31646878714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1627 = new Long(4044358158040652353L);
        Long term1629 = new Long(-4443169559037975007L);
        Long term1631 = new Long(-3842548265506930260L);
        Long term1633 = new Long(-5788180182343976541L);
        Long term1635 = new Long(2936323121573284007L);
        ArrayList term1625 = new ArrayList();
        ((ArrayList) term1625).add(term1627);
        ((ArrayList) term1625).add(term1629);
        ((ArrayList) term1625).add(term1631);
        ((ArrayList) term1625).add(term1633);
        ((ArrayList) term1625).add(term1635);
        term1571 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term1577 = (int[]) newIntArray(3);
        Object term1598 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term1651 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term1571, term1571.getClass(), "countHosts", true);
        setBooleanField(term1571, term1571.getClass(), "privateDomains", false);
        setBooleanField(term1571, term1571.getClass(), "stripWww", false);
        setBooleanField(term1571, term1571.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term1571, term1571.getClass(), "maxSize", 5953383087795962419L);
        setIntElement(term1577, 0, 292681826);
        setIntElement(term1577, 1, 458147407);
        setIntElement(term1577, 2, -184153539);
        setField(term1571, term1571.getClass(), "ids", term1577);
        setLongField(term1571, term1571.getClass(), "currentId", -1L);
        setLongField(term1571, term1571.getClass(), "lastFromId", -1L);
        setLongField(term1571, term1571.getClass(), "lastToId", -1L);
        setLongField(term1571, term1571.getClass(), "numInputLinesNodes", 7994303628307559416L);
        setLongField(term1571, term1571.getClass(), "numInputLinesEdges", 2443640364875054177L);
        setField(term1571, term1571.getClass(), "lastRevHost", "jDtqGUpnZN");
        setField(term1598, term1598.getClass(), "name", "nGKItKLYNC");
        setField(term1598, term1598.getClass(), "revName", "UiUYnPrcCi");
        setLongField(term1598, term1598.getClass(), "id", -1610676979013636850L);
        setLongField(term1598, term1598.getClass(), "numberOfHosts", 2062173786000223358L);
        setField(term1598, term1598.getClass(), "ids", term1625);
        setField(term1571, term1571.getClass(), "lastDomain", term1598);
        setField(term1571, term1571.getClass(), "lastOutputDomain", "UoYtihxVaS");
        setField(term1651, term1651.getClass(), "comparator", null);
        setField(term1651, term1651.getClass(), "root", null);
        setIntField(term1651, term1651.getClass(), "size", 0);
        setIntField(term1651, term1651.getClass(), "modCount", 0);
        setField(term1651, term1651.getClass(), "entrySet", null);
        setField(term1651, term1651.getClass(), "navigableKeySet", null);
        setField(term1651, term1651.getClass(), "descendingMap", null);
        setField(term1651, term1651.getClass(), "keySet", null);
        setField(term1651, term1651.getClass(), "values", null);
        setField(term1571, term1571.getClass(), "domainQueue", term1651);
        setIntField(term1571, term1571.getClass(), "maxQueueUsed", 493620644);
        setField(term1571, term1571.getClass(), "reporterInputNodes", null);
        setField(term1571, term1571.getClass(), "reporterInputEdges", null);
        term1655 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1656 = (byte[]) newByteArray(16);
        setField(term1655, term1655.getClass(), "value", term1656);
        setByteField(term1655, term1655.getClass(), "coder", (byte) 48);
        setIntField(term1655, term1655.getClass(), "count", 1328271830);
        Long term1704 = new Long(-1154553077993834885L);
        Long term1706 = new Long(-2850532706972744550L);
        Long term1708 = new Long(-2644215923136513282L);
        Long term1710 = new Long(-1468719814009985452L);
        Long term1712 = new Long(-7738503207562305297L);
        Long term1714 = new Long(3825396310311739952L);
        ArrayList term1702 = new ArrayList();
        ((ArrayList) term1702).add(term1704);
        ((ArrayList) term1702).add(term1706);
        ((ArrayList) term1702).add(term1708);
        ((ArrayList) term1702).add(term1710);
        ((ArrayList) term1702).add(term1712);
        ((ArrayList) term1702).add(term1714);
        term1675 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term1675, term1675.getClass(), "name", "JDswTTCZHV");
        setField(term1675, term1675.getClass(), "revName", "onpbIeEKoi");
        setLongField(term1675, term1675.getClass(), "id", -8658027316505137504L);
        setLongField(term1675, term1675.getClass(), "numberOfHosts", 414749984815662075L);
        setField(term1675, term1675.getClass(), "ids", term1702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Object[] args = new Object[2];
        args[0] = term1655;
        args[1] = term1675;
        callMethod(klass, "getNodeLine", argTypes, term1571, args);
    }

};


