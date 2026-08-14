package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;

public class BacktrackColoringBase_Worker_offerNode_19845985752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6162;

    public BacktrackColoringBase_Worker_offerNode_19845985752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6220 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term6223 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term6229 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term6231 = (Object[]) newArray("org.graph4j.util.Domain", 4);
        Object term6232 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setField(term6220, term6220.getClass(), "alg", null);
        setIntField(term6220, term6220.getClass(), "vertex", 1511699134);
        setIntField(term6220, term6220.getClass(), "color", 185647247);
        setField(term6223, term6223.getClass(), "alg", null);
        setIntField(term6223, term6223.getClass(), "vertex", 720814309);
        setIntField(term6223, term6223.getClass(), "color", 964137425);
        setField(term6223, term6223.getClass(), "parent", null);
        setField(term6223, term6223.getClass(), "coloring", null);
        setField(term6223, term6223.getClass(), "domains", null);
        setField(term6223, term6223.getClass(), "minDomain", null);
        setBooleanField(term6223, term6223.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term6223, term6223.getClass(), "propagator", false);
        setBooleanField(term6223, term6223.getClass(), "failed", false);
        setField(term6220, term6220.getClass(), "parent", term6223);
        setField(term6229, term6229.getClass(), "graph", null);
        setField(term6229, term6229.getClass(), "vertexColor", null);
        setIntField(term6229, term6229.getClass(), "numColoredVertices", 0);
        setField(term6229, term6229.getClass(), "usedColors", null);
        setField(term6229, term6229.getClass(), "colorMap", null);
        setField(term6220, term6220.getClass(), "coloring", term6229);
        setField(term6220, term6220.getClass(), "domains", term6231);
        setIntField(term6232, term6232.getClass(), "vertex", 0);
        setField(term6232, term6232.getClass(), "values", null);
        setField(term6232, term6232.getClass(), "positions", null);
        setIntField(term6232, term6232.getClass(), "size", 0);
        setField(term6220, term6220.getClass(), "minDomain", term6232);
        setBooleanField(term6220, term6220.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term6220, term6220.getClass(), "propagator", true);
        setBooleanField(term6220, term6220.getClass(), "failed", false);
        Object term6238 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        setField(term6238, term6238.getClass(), "alg", null);
        setIntField(term6238, term6238.getClass(), "vertex", 0);
        setIntField(term6238, term6238.getClass(), "color", 0);
        setField(term6238, term6238.getClass(), "parent", null);
        setField(term6238, term6238.getClass(), "coloring", null);
        setField(term6238, term6238.getClass(), "domains", null);
        setField(term6238, term6238.getClass(), "minDomain", null);
        setBooleanField(term6238, term6238.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term6238, term6238.getClass(), "propagator", false);
        setBooleanField(term6238, term6238.getClass(), "failed", false);
        Object term6244 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        setField(term6244, term6244.getClass(), "alg", null);
        setIntField(term6244, term6244.getClass(), "vertex", 0);
        setIntField(term6244, term6244.getClass(), "color", 0);
        setField(term6244, term6244.getClass(), "parent", null);
        setField(term6244, term6244.getClass(), "coloring", null);
        setField(term6244, term6244.getClass(), "domains", null);
        setField(term6244, term6244.getClass(), "minDomain", null);
        setBooleanField(term6244, term6244.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term6244, term6244.getClass(), "propagator", false);
        setBooleanField(term6244, term6244.getClass(), "failed", false);
        ArrayDeque term6218 = new ArrayDeque();
        ((ArrayDeque) term6218).add(term6220);
        ((ArrayDeque) term6218).add(term6238);
        ((ArrayDeque) term6218).add(term6244);
        term6162 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker"));
        Object[] term6165 = (Object[]) newArray("[I", 7);
        int[] term6166 = (int[]) newIntArray(7);
        int[] term6174 = (int[]) newIntArray(6);
        int[] term6181 = (int[]) newIntArray(9);
        int[] term6191 = (int[]) newIntArray(8);
        int[] term6200 = (int[]) newIntArray(6);
        int[] term6207 = (int[]) newIntArray(7);
        int[] term6215 = (int[]) newIntArray(2);
        setBooleanField(term6162, term6162.getClass(), "running", false);
        setIntField(term6162, term6162.getClass(), "numColors", 1050420173);
        setIntElement(term6166, 0, 994300935);
        setIntElement(term6166, 1, 433954476);
        setIntElement(term6166, 2, 1780958641);
        setIntElement(term6166, 3, 1890582085);
        setIntElement(term6166, 4, 2146568808);
        setIntElement(term6166, 5, 245081679);
        setIntElement(term6166, 6, 1199789398);
        setElement(term6165, 0, term6166);
        setIntElement(term6174, 0, -1056402285);
        setIntElement(term6174, 1, 1881803912);
        setIntElement(term6174, 2, -188535038);
        setIntElement(term6174, 3, 254650626);
        setIntElement(term6174, 4, -1789030917);
        setIntElement(term6174, 5, 912208163);
        setElement(term6165, 1, term6174);
        setIntElement(term6181, 0, 909767683);
        setIntElement(term6181, 1, -639390893);
        setIntElement(term6181, 2, 1176415280);
        setIntElement(term6181, 3, -1272714687);
        setIntElement(term6181, 4, -762778853);
        setIntElement(term6181, 5, 946727239);
        setIntElement(term6181, 6, 349182490);
        setIntElement(term6181, 7, -353671511);
        setIntElement(term6181, 8, 1598831363);
        setElement(term6165, 2, term6181);
        setIntElement(term6191, 0, -690367798);
        setIntElement(term6191, 1, 1863738073);
        setIntElement(term6191, 2, 2009028243);
        setIntElement(term6191, 3, 1900131331);
        setIntElement(term6191, 4, -1489604464);
        setIntElement(term6191, 5, 601642248);
        setIntElement(term6191, 6, -1186936928);
        setIntElement(term6191, 7, -315380004);
        setElement(term6165, 3, term6191);
        setIntElement(term6200, 0, -1945754843);
        setIntElement(term6200, 1, -1512221115);
        setIntElement(term6200, 2, -515486706);
        setIntElement(term6200, 3, -612862488);
        setIntElement(term6200, 4, 52739905);
        setIntElement(term6200, 5, -2105349391);
        setElement(term6165, 4, term6200);
        setIntElement(term6207, 0, -1176968921);
        setIntElement(term6207, 1, -1986225025);
        setIntElement(term6207, 2, -838689952);
        setIntElement(term6207, 3, -307464652);
        setIntElement(term6207, 4, 460605690);
        setIntElement(term6207, 5, 2119231643);
        setIntElement(term6207, 6, 688546450);
        setElement(term6165, 5, term6207);
        setIntElement(term6215, 0, 115635779);
        setIntElement(term6215, 1, -1081685171);
        setElement(term6165, 6, term6215);
        setField(term6162, term6162.getClass(), "assignQueue", term6165);
        setField(term6162, term6162.getClass(), "nodeStack", term6218);
        setField(term6162, term6162.getClass(), "this$0", null);
        setField(term6162, term6162.getClass(), "name", "MxlszYVzRf");
        setIntField(term6162, term6162.getClass(), "priority", -187311406);
        setBooleanField(term6162, term6162.getClass(), "daemon", false);
        setBooleanField(term6162, term6162.getClass(), "stillborn", false);
        setLongField(term6162, term6162.getClass(), "eetop", 2936323121573284007L);
        setField(term6162, term6162.getClass(), "target", null);
        setField(term6162, term6162.getClass(), "group", null);
        setField(term6162, term6162.getClass(), "contextClassLoader", null);
        setField(term6162, term6162.getClass(), "inheritedAccessControlContext", null);
        setField(term6162, term6162.getClass(), "threadLocals", null);
        setField(term6162, term6162.getClass(), "inheritableThreadLocals", null);
        setLongField(term6162, term6162.getClass(), "stackSize", 0L);
        setLongField(term6162, term6162.getClass(), "tid", 0L);
        setIntField(term6162, term6162.getClass(), "threadStatus", 0);
        setField(term6162, term6162.getClass(), "parkBlocker", null);
        setField(term6162, term6162.getClass(), "blocker", null);
        setField(term6162, term6162.getClass(), "blockerLock", null);
        setField(term6162, term6162.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term6162, term6162.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term6162, term6162.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term6162, term6162.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "offerNode", argTypes, term6162, args);
    }

};


