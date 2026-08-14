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
     Object term6993;
     Object term7121;
     Object term7123;

    public HostToDomainGraph_HostToDomainGraphBig_setValue_13443815791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7075 = new Long(-7291743527973326814L);
        Long term7077 = new Long(-5963439350418910964L);
        Long term7079 = new Long(9013624480170062917L);
        ArrayList term7073 = new ArrayList();
        ((ArrayList) term7073).add(term7075);
        ((ArrayList) term7073).add(term7077);
        ((ArrayList) term7073).add(term7079);
        ArrayList term7114 = new ArrayList();
        ((ArrayList) term7114).add((Object)null);
        ((ArrayList) term7114).add((Object)null);
        ((ArrayList) term7114).add((Object)null);
        term6993 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig"));
        Object[] term6994 = (Object[]) newArray("[J", 4);
        long[] term6995 = (long[]) newLongArray(6);
        long[] term7002 = (long[]) newLongArray(9);
        long[] term7012 = (long[]) newLongArray(4);
        long[] term7017 = (long[]) newLongArray(0);
        int[] term7023 = (int[]) newIntArray(5);
        Object term7046 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term7095 = newInstance(Class.forName("java.util.TreeMap"));
        Object term7096 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term7109 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setLongElement(term6995, 0, -3323049156110984575L);
        setLongElement(term6995, 1, -9079706905309751984L);
        setLongElement(term6995, 2, -2080067238602928154L);
        setLongElement(term6995, 3, 8202413349907503373L);
        setLongElement(term6995, 4, 4715419421865334491L);
        setLongElement(term6995, 5, 6320559761926095887L);
        setElement(term6994, 0, term6995);
        setLongElement(term7002, 0, 5067793047038594982L);
        setLongElement(term7002, 1, -1572808624189549793L);
        setLongElement(term7002, 2, -6151316713456472560L);
        setLongElement(term7002, 3, -5597498165246748176L);
        setLongElement(term7002, 4, 6174523862926526279L);
        setLongElement(term7002, 5, 4977537501907213732L);
        setLongElement(term7002, 6, -2341942457089205755L);
        setLongElement(term7002, 7, -7503147844796296300L);
        setLongElement(term7002, 8, 1099634235456795888L);
        setElement(term6994, 1, term7002);
        setLongElement(term7012, 0, 5391189846186870864L);
        setLongElement(term7012, 1, 7314774835988078404L);
        setLongElement(term7012, 2, 2777168805269959396L);
        setLongElement(term7012, 3, 5255768275907389358L);
        setElement(term6994, 2, term7012);
        setElement(term6994, 3, term7017);
        setField(term6993, term6993.getClass(), "ids", term6994);
        setBooleanField(term6993, term6993.getClass(), "countHosts", false);
        setBooleanField(term6993, term6993.getClass(), "privateDomains", true);
        setBooleanField(term6993, term6993.getClass(), "stripWww", false);
        setBooleanField(term6993, term6993.getClass(), "includeMultiPartSuffixes", true);
        setLongField(term6993, term6993.getClass(), "maxSize", -8859332911664940963L);
        setIntElement(term7023, 0, -1254072822);
        setIntElement(term7023, 1, -1111249833);
        setIntElement(term7023, 2, -1692331299);
        setIntElement(term7023, 3, 479531250);
        setIntElement(term7023, 4, 1320570890);
        setField(term6993, term6993.getClass(), "ids", term7023);
        setLongField(term6993, term6993.getClass(), "currentId", 7048544371106200955L);
        setLongField(term6993, term6993.getClass(), "lastFromId", -6299955839293054069L);
        setLongField(term6993, term6993.getClass(), "lastToId", 3573273176206440433L);
        setLongField(term6993, term6993.getClass(), "numInputLinesNodes", 8242382965219431687L);
        setLongField(term6993, term6993.getClass(), "numInputLinesEdges", -3092537062189928451L);
        setField(term6993, term6993.getClass(), "lastRevHost", "wGmYcqUkgE");
        setField(term7046, term7046.getClass(), "name", "idgaQsnJpQ");
        setField(term7046, term7046.getClass(), "revName", "VgZnGoIFwQ");
        setLongField(term7046, term7046.getClass(), "id", -6645699856048951433L);
        setLongField(term7046, term7046.getClass(), "numberOfHosts", -1721083210597101555L);
        setField(term7046, term7046.getClass(), "ids", term7073);
        setField(term6993, term6993.getClass(), "lastDomain", term7046);
        setField(term6993, term6993.getClass(), "lastOutputDomain", "jUbSRrkrYZ");
        setField(term7095, term7095.getClass(), "comparator", null);
        setField(term7096, term7096.getClass(), "key", "bWWfajKbEX");
        setField(term7109, term7109.getClass(), "name", "");
        setField(term7109, term7109.getClass(), "revName", "");
        setLongField(term7109, term7109.getClass(), "id", 937792282597213200L);
        setLongField(term7109, term7109.getClass(), "numberOfHosts", -6096027338784768449L);
        setField(term7109, term7109.getClass(), "ids", term7114);
        setField(term7096, term7096.getClass(), "value", term7109);
        setField(term7096, term7096.getClass(), "left", null);
        setField(term7096, term7096.getClass(), "right", null);
        setField(term7096, term7096.getClass(), "parent", null);
        setBooleanField(term7096, term7096.getClass(), "color", true);
        setField(term7095, term7095.getClass(), "root", term7096);
        setIntField(term7095, term7095.getClass(), "size", 1);
        setIntField(term7095, term7095.getClass(), "modCount", 1);
        setField(term7095, term7095.getClass(), "entrySet", null);
        setField(term7095, term7095.getClass(), "navigableKeySet", null);
        setField(term7095, term7095.getClass(), "descendingMap", null);
        setField(term7095, term7095.getClass(), "keySet", null);
        setField(term7095, term7095.getClass(), "values", null);
        setField(term6993, term6993.getClass(), "domainQueue", term7095);
        setIntField(term6993, term6993.getClass(), "maxQueueUsed", -130649791);
        setField(term6993, term6993.getClass(), "reporterInputNodes", null);
        setField(term6993, term6993.getClass(), "reporterInputEdges", null);
        term7121 = new Long(6338971839666144092L);
        term7123 = new Long(5295517562699482299L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term7121;
        args[1] = term7123;
        callMethod(klass, "setValue", argTypes, term6993, args);
    }

};


