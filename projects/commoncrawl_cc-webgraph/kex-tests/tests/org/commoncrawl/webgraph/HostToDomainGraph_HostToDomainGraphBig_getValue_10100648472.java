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

public class HostToDomainGraph_HostToDomainGraphBig_getValue_10100648472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7199;
     Object term7344;

    public HostToDomainGraph_HostToDomainGraphBig_getValue_10100648472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7290 = new Long(6005241913654469005L);
        Long term7292 = new Long(-1983291584002806658L);
        Long term7294 = new Long(5946780097489996391L);
        Long term7296 = new Long(-8652538484981166496L);
        Long term7298 = new Long(2701184207686293431L);
        Long term7300 = new Long(4474998035090263139L);
        Long term7302 = new Long(2848819812340321742L);
        ArrayList term7288 = new ArrayList();
        ((ArrayList) term7288).add(term7290);
        ((ArrayList) term7288).add(term7292);
        ((ArrayList) term7288).add(term7294);
        ((ArrayList) term7288).add(term7296);
        ((ArrayList) term7288).add(term7298);
        ((ArrayList) term7288).add(term7300);
        ((ArrayList) term7288).add(term7302);
        ArrayList term7337 = new ArrayList();
        ((ArrayList) term7337).add((Object)null);
        term7199 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig"));
        Object[] term7200 = (Object[]) newArray("[J", 7);
        long[] term7201 = (long[]) newLongArray(2);
        long[] term7204 = (long[]) newLongArray(2);
        long[] term7207 = (long[]) newLongArray(0);
        long[] term7208 = (long[]) newLongArray(4);
        long[] term7213 = (long[]) newLongArray(9);
        long[] term7223 = (long[]) newLongArray(6);
        long[] term7230 = (long[]) newLongArray(7);
        int[] term7243 = (int[]) newIntArray(0);
        Object term7261 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term7318 = newInstance(Class.forName("java.util.TreeMap"));
        Object term7319 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term7332 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setLongElement(term7201, 0, -7671399023433976259L);
        setLongElement(term7201, 1, -8653467709084853156L);
        setElement(term7200, 0, term7201);
        setLongElement(term7204, 0, 6135782592145916721L);
        setLongElement(term7204, 1, 7930227263182470549L);
        setElement(term7200, 1, term7204);
        setElement(term7200, 2, term7207);
        setLongElement(term7208, 0, -2571841019708046378L);
        setLongElement(term7208, 1, -4682102699090617454L);
        setLongElement(term7208, 2, 8018453258973130416L);
        setLongElement(term7208, 3, 5592372218942533021L);
        setElement(term7200, 3, term7208);
        setLongElement(term7213, 0, 8423938983545919786L);
        setLongElement(term7213, 1, -6523933176535405885L);
        setLongElement(term7213, 2, 6558561920118298074L);
        setLongElement(term7213, 3, -6261257793045898313L);
        setLongElement(term7213, 4, 6383832776430121737L);
        setLongElement(term7213, 5, 3853743792832767733L);
        setLongElement(term7213, 6, -6064923943154213519L);
        setLongElement(term7213, 7, -6344058468200613078L);
        setLongElement(term7213, 8, 9069301103965727560L);
        setElement(term7200, 4, term7213);
        setLongElement(term7223, 0, 1078204819466025938L);
        setLongElement(term7223, 1, -4526944004625263747L);
        setLongElement(term7223, 2, -8195504192950938590L);
        setLongElement(term7223, 3, -3141593811423226559L);
        setLongElement(term7223, 4, 165312735504471081L);
        setLongElement(term7223, 5, 7910323873668469704L);
        setElement(term7200, 5, term7223);
        setLongElement(term7230, 0, -8034026767184380879L);
        setLongElement(term7230, 1, -1865079020076651952L);
        setLongElement(term7230, 2, -6255610460583667093L);
        setLongElement(term7230, 3, -3947173237186855838L);
        setLongElement(term7230, 4, 1186857065042697930L);
        setLongElement(term7230, 5, 1659080369100392023L);
        setLongElement(term7230, 6, 854087753192360238L);
        setElement(term7200, 6, term7230);
        setField(term7199, term7199.getClass(), "ids", term7200);
        setBooleanField(term7199, term7199.getClass(), "countHosts", false);
        setBooleanField(term7199, term7199.getClass(), "privateDomains", true);
        setBooleanField(term7199, term7199.getClass(), "stripWww", false);
        setBooleanField(term7199, term7199.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term7199, term7199.getClass(), "maxSize", -6246278604466261475L);
        setField(term7199, term7199.getClass(), "ids", term7243);
        setLongField(term7199, term7199.getClass(), "currentId", 9113614356317836741L);
        setLongField(term7199, term7199.getClass(), "lastFromId", 2244124922001093690L);
        setLongField(term7199, term7199.getClass(), "lastToId", -849289244399400018L);
        setLongField(term7199, term7199.getClass(), "numInputLinesNodes", -5334920917680098031L);
        setLongField(term7199, term7199.getClass(), "numInputLinesEdges", -5681371087517724194L);
        setField(term7199, term7199.getClass(), "lastRevHost", "PHvxnGHptP");
        setField(term7261, term7261.getClass(), "name", "TimdotUuNC");
        setField(term7261, term7261.getClass(), "revName", "PkWMRdJcBb");
        setLongField(term7261, term7261.getClass(), "id", -2109397517777696156L);
        setLongField(term7261, term7261.getClass(), "numberOfHosts", 6631484353678437959L);
        setField(term7261, term7261.getClass(), "ids", term7288);
        setField(term7199, term7199.getClass(), "lastDomain", term7261);
        setField(term7199, term7199.getClass(), "lastOutputDomain", "jSpAteRute");
        setField(term7318, term7318.getClass(), "comparator", null);
        setField(term7319, term7319.getClass(), "key", "swZVeJAxjt");
        setField(term7332, term7332.getClass(), "name", "");
        setField(term7332, term7332.getClass(), "revName", "");
        setLongField(term7332, term7332.getClass(), "id", -1763360854589438694L);
        setLongField(term7332, term7332.getClass(), "numberOfHosts", -4225690761644993738L);
        setField(term7332, term7332.getClass(), "ids", term7337);
        setField(term7319, term7319.getClass(), "value", term7332);
        setField(term7319, term7319.getClass(), "left", null);
        setField(term7319, term7319.getClass(), "right", null);
        setField(term7319, term7319.getClass(), "parent", null);
        setBooleanField(term7319, term7319.getClass(), "color", true);
        setField(term7318, term7318.getClass(), "root", term7319);
        setIntField(term7318, term7318.getClass(), "size", 1);
        setIntField(term7318, term7318.getClass(), "modCount", 1);
        setField(term7318, term7318.getClass(), "entrySet", null);
        setField(term7318, term7318.getClass(), "navigableKeySet", null);
        setField(term7318, term7318.getClass(), "descendingMap", null);
        setField(term7318, term7318.getClass(), "keySet", null);
        setField(term7318, term7318.getClass(), "values", null);
        setField(term7199, term7199.getClass(), "domainQueue", term7318);
        setIntField(term7199, term7199.getClass(), "maxQueueUsed", 534834644);
        setField(term7199, term7199.getClass(), "reporterInputNodes", null);
        setField(term7199, term7199.getClass(), "reporterInputEdges", null);
        term7344 = new Long(4498588544424613697L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7344;
        callMethod(klass, "getValue", argTypes, term7199, args);
    }

};


