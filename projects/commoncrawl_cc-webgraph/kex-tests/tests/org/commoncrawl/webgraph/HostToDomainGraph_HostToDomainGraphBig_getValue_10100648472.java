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
     Object term6825;
     Object term6958;

    public HostToDomainGraph_HostToDomainGraphBig_getValue_10100648472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6916 = new Long(6005241913654469005L);
        Long term6918 = new Long(-1983291584002806658L);
        Long term6920 = new Long(5946780097489996391L);
        Long term6922 = new Long(-8652538484981166496L);
        Long term6924 = new Long(2701184207686293431L);
        Long term6926 = new Long(4474998035090263139L);
        Long term6928 = new Long(2848819812340321742L);
        ArrayList term6914 = new ArrayList();
        ((ArrayList) term6914).add(term6916);
        ((ArrayList) term6914).add(term6918);
        ((ArrayList) term6914).add(term6920);
        ((ArrayList) term6914).add(term6922);
        ((ArrayList) term6914).add(term6924);
        ((ArrayList) term6914).add(term6926);
        ((ArrayList) term6914).add(term6928);
        ArrayList term6951 = new ArrayList();
        ((ArrayList) term6951).add((Object)null);
        term6825 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig"));
        Object[] term6826 = (Object[]) newArray("[J", 7);
        long[] term6827 = (long[]) newLongArray(2);
        long[] term6830 = (long[]) newLongArray(2);
        long[] term6833 = (long[]) newLongArray(0);
        long[] term6834 = (long[]) newLongArray(4);
        long[] term6839 = (long[]) newLongArray(9);
        long[] term6849 = (long[]) newLongArray(6);
        long[] term6856 = (long[]) newLongArray(7);
        int[] term6869 = (int[]) newIntArray(0);
        Object term6887 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term6932 = newInstance(Class.forName("java.util.TreeMap"));
        Object term6933 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term6946 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setLongElement(term6827, 0, -7671399023433976259L);
        setLongElement(term6827, 1, -8653467709084853156L);
        setElement(term6826, 0, term6827);
        setLongElement(term6830, 0, 6135782592145916721L);
        setLongElement(term6830, 1, 7930227263182470549L);
        setElement(term6826, 1, term6830);
        setElement(term6826, 2, term6833);
        setLongElement(term6834, 0, -2571841019708046378L);
        setLongElement(term6834, 1, -4682102699090617454L);
        setLongElement(term6834, 2, 8018453258973130416L);
        setLongElement(term6834, 3, 5592372218942533021L);
        setElement(term6826, 3, term6834);
        setLongElement(term6839, 0, 8423938983545919786L);
        setLongElement(term6839, 1, -6523933176535405885L);
        setLongElement(term6839, 2, 6558561920118298074L);
        setLongElement(term6839, 3, -6261257793045898313L);
        setLongElement(term6839, 4, 6383832776430121737L);
        setLongElement(term6839, 5, 3853743792832767733L);
        setLongElement(term6839, 6, -6064923943154213519L);
        setLongElement(term6839, 7, -6344058468200613078L);
        setLongElement(term6839, 8, 9069301103965727560L);
        setElement(term6826, 4, term6839);
        setLongElement(term6849, 0, 1078204819466025938L);
        setLongElement(term6849, 1, -4526944004625263747L);
        setLongElement(term6849, 2, -8195504192950938590L);
        setLongElement(term6849, 3, -3141593811423226559L);
        setLongElement(term6849, 4, 165312735504471081L);
        setLongElement(term6849, 5, 7910323873668469704L);
        setElement(term6826, 5, term6849);
        setLongElement(term6856, 0, -8034026767184380879L);
        setLongElement(term6856, 1, -1865079020076651952L);
        setLongElement(term6856, 2, -6255610460583667093L);
        setLongElement(term6856, 3, -3947173237186855838L);
        setLongElement(term6856, 4, 1186857065042697930L);
        setLongElement(term6856, 5, 1659080369100392023L);
        setLongElement(term6856, 6, 854087753192360238L);
        setElement(term6826, 6, term6856);
        setField(term6825, term6825.getClass(), "ids", term6826);
        setBooleanField(term6825, term6825.getClass(), "countHosts", false);
        setBooleanField(term6825, term6825.getClass(), "privateDomains", true);
        setBooleanField(term6825, term6825.getClass(), "stripWww", false);
        setBooleanField(term6825, term6825.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term6825, term6825.getClass(), "maxSize", -6246278604466261475L);
        setField(term6825, term6825.getClass(), "ids", term6869);
        setLongField(term6825, term6825.getClass(), "currentId", 9113614356317836741L);
        setLongField(term6825, term6825.getClass(), "lastFromId", 2244124922001093690L);
        setLongField(term6825, term6825.getClass(), "lastToId", -849289244399400018L);
        setLongField(term6825, term6825.getClass(), "numInputLinesNodes", -5334920917680098031L);
        setLongField(term6825, term6825.getClass(), "numInputLinesEdges", -5681371087517724194L);
        setField(term6825, term6825.getClass(), "lastRevHost", "bLPjGVBhlX");
        setField(term6887, term6887.getClass(), "name", "whBvTVIIlC");
        setField(term6887, term6887.getClass(), "revName", "IgRJUzaCwW");
        setLongField(term6887, term6887.getClass(), "id", -2109397517777696156L);
        setLongField(term6887, term6887.getClass(), "numberOfHosts", 6631484353678437959L);
        setField(term6887, term6887.getClass(), "ids", term6914);
        setField(term6825, term6825.getClass(), "lastDomain", term6887);
        setField(term6932, term6932.getClass(), "comparator", null);
        setField(term6933, term6933.getClass(), "key", "JUmudUmaaV");
        setField(term6946, term6946.getClass(), "name", "");
        setField(term6946, term6946.getClass(), "revName", "");
        setLongField(term6946, term6946.getClass(), "id", -1763360854589438694L);
        setLongField(term6946, term6946.getClass(), "numberOfHosts", -4225690761644993738L);
        setField(term6946, term6946.getClass(), "ids", term6951);
        setField(term6933, term6933.getClass(), "value", term6946);
        setField(term6933, term6933.getClass(), "left", null);
        setField(term6933, term6933.getClass(), "right", null);
        setField(term6933, term6933.getClass(), "parent", null);
        setBooleanField(term6933, term6933.getClass(), "color", true);
        setField(term6932, term6932.getClass(), "root", term6933);
        setIntField(term6932, term6932.getClass(), "size", 1);
        setIntField(term6932, term6932.getClass(), "modCount", 1);
        setField(term6932, term6932.getClass(), "entrySet", null);
        setField(term6932, term6932.getClass(), "navigableKeySet", null);
        setField(term6932, term6932.getClass(), "descendingMap", null);
        setField(term6932, term6932.getClass(), "keySet", null);
        setField(term6932, term6932.getClass(), "values", null);
        setField(term6825, term6825.getClass(), "domainQueue", term6932);
        setIntField(term6825, term6825.getClass(), "maxQueueUsed", 534834644);
        setField(term6825, term6825.getClass(), "reporterInputNodes", null);
        setField(term6825, term6825.getClass(), "reporterInputEdges", null);
        term6958 = new Long(4498588544424613697L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$HostToDomainGraphBig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6958;
        callMethod(klass, "getValue", argTypes, term6825, args);
    }

};


