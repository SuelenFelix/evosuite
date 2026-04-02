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

public class HostToDomainGraph_HostToDomainGraphBig_setValue_13443815791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6641;
     Object term6757;
     Object term6759;

    public HostToDomainGraph_HostToDomainGraphBig_setValue_13443815791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6723 = new Long(-7291743527973326814L);
        Long term6725 = new Long(-5963439350418910964L);
        Long term6727 = new Long(9013624480170062917L);
        ArrayList term6721 = new ArrayList();
        ((ArrayList) term6721).add(term6723);
        ((ArrayList) term6721).add(term6725);
        ((ArrayList) term6721).add(term6727);
        ArrayList term6750 = new ArrayList();
        ((ArrayList) term6750).add((Object)null);
        ((ArrayList) term6750).add((Object)null);
        ((ArrayList) term6750).add((Object)null);
        term6641 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig"));
        Object[] term6642 = (Object[]) newArray("[J", 4);
        long[] term6643 = (long[]) newLongArray(6);
        long[] term6650 = (long[]) newLongArray(9);
        long[] term6660 = (long[]) newLongArray(4);
        long[] term6665 = (long[]) newLongArray(0);
        int[] term6671 = (int[]) newIntArray(5);
        Object term6694 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term6731 = newInstance(Class.forName("java.util.TreeMap"));
        Object term6732 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term6745 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setLongElement(term6643, 0, -3323049156110984575L);
        setLongElement(term6643, 1, -9079706905309751984L);
        setLongElement(term6643, 2, -2080067238602928154L);
        setLongElement(term6643, 3, 8202413349907503373L);
        setLongElement(term6643, 4, 4715419421865334491L);
        setLongElement(term6643, 5, 6320559761926095887L);
        setElement(term6642, 0, term6643);
        setLongElement(term6650, 0, 5067793047038594982L);
        setLongElement(term6650, 1, -1572808624189549793L);
        setLongElement(term6650, 2, -6151316713456472560L);
        setLongElement(term6650, 3, -5597498165246748176L);
        setLongElement(term6650, 4, 6174523862926526279L);
        setLongElement(term6650, 5, 4977537501907213732L);
        setLongElement(term6650, 6, -2341942457089205755L);
        setLongElement(term6650, 7, -7503147844796296300L);
        setLongElement(term6650, 8, 1099634235456795888L);
        setElement(term6642, 1, term6650);
        setLongElement(term6660, 0, 5391189846186870864L);
        setLongElement(term6660, 1, 7314774835988078404L);
        setLongElement(term6660, 2, 2777168805269959396L);
        setLongElement(term6660, 3, 5255768275907389358L);
        setElement(term6642, 2, term6660);
        setElement(term6642, 3, term6665);
        setField(term6641, term6641.getClass(), "ids", term6642);
        setBooleanField(term6641, term6641.getClass(), "countHosts", false);
        setBooleanField(term6641, term6641.getClass(), "privateDomains", true);
        setBooleanField(term6641, term6641.getClass(), "stripWww", false);
        setBooleanField(term6641, term6641.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term6641, term6641.getClass(), "maxSize", -8859332911664940963L);
        setIntElement(term6671, 0, -1254072822);
        setIntElement(term6671, 1, -1111249833);
        setIntElement(term6671, 2, -1692331299);
        setIntElement(term6671, 3, 479531250);
        setIntElement(term6671, 4, 1320570890);
        setField(term6641, term6641.getClass(), "ids", term6671);
        setLongField(term6641, term6641.getClass(), "currentId", 7048544371106200955L);
        setLongField(term6641, term6641.getClass(), "lastFromId", -6299955839293054069L);
        setLongField(term6641, term6641.getClass(), "lastToId", 3573273176206440433L);
        setLongField(term6641, term6641.getClass(), "numInputLinesNodes", 8242382965219431687L);
        setLongField(term6641, term6641.getClass(), "numInputLinesEdges", -3092537062189928451L);
        setField(term6641, term6641.getClass(), "lastRevHost", "eqJfYWRaEL");
        setField(term6694, term6694.getClass(), "name", "fhkbdRViHi");
        setField(term6694, term6694.getClass(), "revName", "uWHnvSvaPl");
        setLongField(term6694, term6694.getClass(), "id", -6645699856048951433L);
        setLongField(term6694, term6694.getClass(), "numberOfHosts", -1721083210597101555L);
        setField(term6694, term6694.getClass(), "ids", term6721);
        setField(term6641, term6641.getClass(), "lastDomain", term6694);
        setField(term6731, term6731.getClass(), "comparator", null);
        setField(term6732, term6732.getClass(), "key", "kBdSllIBVz");
        setField(term6745, term6745.getClass(), "name", "");
        setField(term6745, term6745.getClass(), "revName", "");
        setLongField(term6745, term6745.getClass(), "id", 937792282597213200L);
        setLongField(term6745, term6745.getClass(), "numberOfHosts", -6096027338784768449L);
        setField(term6745, term6745.getClass(), "ids", term6750);
        setField(term6732, term6732.getClass(), "value", term6745);
        setField(term6732, term6732.getClass(), "left", null);
        setField(term6732, term6732.getClass(), "right", null);
        setField(term6732, term6732.getClass(), "parent", null);
        setBooleanField(term6732, term6732.getClass(), "color", true);
        setField(term6731, term6731.getClass(), "root", term6732);
        setIntField(term6731, term6731.getClass(), "size", 1);
        setIntField(term6731, term6731.getClass(), "modCount", 1);
        setField(term6731, term6731.getClass(), "entrySet", null);
        setField(term6731, term6731.getClass(), "navigableKeySet", null);
        setField(term6731, term6731.getClass(), "descendingMap", null);
        setField(term6731, term6731.getClass(), "keySet", null);
        setField(term6731, term6731.getClass(), "values", null);
        setField(term6641, term6641.getClass(), "domainQueue", term6731);
        setIntField(term6641, term6641.getClass(), "maxQueueUsed", -130649791);
        setField(term6641, term6641.getClass(), "reporterInputNodes", null);
        setField(term6641, term6641.getClass(), "reporterInputEdges", null);
        term6757 = new Long(6338971839666144092L);
        term6759 = new Long(5295517562699482299L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term6757;
        args[1] = term6759;
        callMethod(klass, "setValue", argTypes, term6641, args);
    }

};


