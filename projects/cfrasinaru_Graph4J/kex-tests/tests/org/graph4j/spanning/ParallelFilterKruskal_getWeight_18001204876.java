package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class ParallelFilterKruskal_getWeight_18001204876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149570;

    public ParallelFilterKruskal_getWeight_18001204876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term149592 = new Double(0.6326911540704958);
        Double term149594 = new Double(0.9709554643348661);
        Double term149596 = new Double(0.2695830254677728);
        Double term149598 = new Double(0.6854250716294141);
        Double term149600 = new Double(0.25621511712059697);
        Double term149602 = new Double(0.3816357800048622);
        Double term149604 = new Double(0.30537444836656047);
        Double term149606 = new Double(0.12294763927016261);
        Double term149608 = new Double(0.1771195655130856);
        Double term149620 = new Double(0.649351552726493);
        Double term149627 = new Double(0.34279000047783226);
        Double term149629 = new Double(0.41410088697379166);
        term149570 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        Object term149571 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term149574 = (int[]) newIntArray(5);
        Object[] term149581 = (Object[]) newArray("org.graph4j.Edge", 5);
        Object term149582 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term149586 = (Object[]) newArray("java.lang.Double", 0);
        Object term149587 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term149591 = (Object[]) newArray("java.lang.Double", 9);
        Object term149610 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term149614 = (Object[]) newArray("java.lang.Double", 0);
        Object term149615 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term149619 = (Object[]) newArray("java.lang.Double", 1);
        Object term149622 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term149626 = (Object[]) newArray("java.lang.Double", 2);
        Object term149632 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setField(term149570, term149570.getClass(), "tree", null);
        setIntField(term149571, term149571.getClass(), "numVertices", -678252178);
        setBooleanField(term149571, term149571.getClass(), "pathCompression", false);
        setIntElement(term149574, 0, -1455734392);
        setIntElement(term149574, 1, 928833652);
        setIntElement(term149574, 2, 665498508);
        setIntElement(term149574, 3, 959272336);
        setIntElement(term149574, 4, 81183347);
        setField(term149571, term149571.getClass(), "parent", term149574);
        setIntField(term149571, term149571.getClass(), "numSets", 1289871424);
        setField(term149570, term149570.getClass(), "unionFind", term149571);
        setBooleanField(term149582, term149582.getClass(), "directed", false);
        setIntField(term149582, term149582.getClass(), "source", -236079370);
        setIntField(term149582, term149582.getClass(), "target", 2010037939);
        setField(term149582, term149582.getClass(), "data", term149586);
        setField(term149582, term149582.getClass(), "label", null);
        setElement(term149581, 0, term149582);
        setBooleanField(term149587, term149587.getClass(), "directed", false);
        setIntField(term149587, term149587.getClass(), "source", 248119278);
        setIntField(term149587, term149587.getClass(), "target", 1723462859);
        setElement(term149591, 0, term149592);
        setElement(term149591, 1, term149594);
        setElement(term149591, 2, term149596);
        setElement(term149591, 3, term149598);
        setElement(term149591, 4, term149600);
        setElement(term149591, 5, term149602);
        setElement(term149591, 6, term149604);
        setElement(term149591, 7, term149606);
        setElement(term149591, 8, term149608);
        setField(term149587, term149587.getClass(), "data", term149591);
        setField(term149587, term149587.getClass(), "label", null);
        setElement(term149581, 1, term149587);
        setBooleanField(term149610, term149610.getClass(), "directed", true);
        setIntField(term149610, term149610.getClass(), "source", -289108625);
        setIntField(term149610, term149610.getClass(), "target", 1929649061);
        setField(term149610, term149610.getClass(), "data", term149614);
        setField(term149610, term149610.getClass(), "label", null);
        setElement(term149581, 2, term149610);
        setBooleanField(term149615, term149615.getClass(), "directed", true);
        setIntField(term149615, term149615.getClass(), "source", 1925642870);
        setIntField(term149615, term149615.getClass(), "target", -502476370);
        setElement(term149619, 0, term149620);
        setField(term149615, term149615.getClass(), "data", term149619);
        setField(term149615, term149615.getClass(), "label", null);
        setElement(term149581, 3, term149615);
        setBooleanField(term149622, term149622.getClass(), "directed", true);
        setIntField(term149622, term149622.getClass(), "source", 1224458415);
        setIntField(term149622, term149622.getClass(), "target", -1271822706);
        setElement(term149626, 0, term149627);
        setElement(term149626, 1, term149629);
        setField(term149622, term149622.getClass(), "data", term149626);
        setField(term149622, term149622.getClass(), "label", null);
        setElement(term149581, 4, term149622);
        setField(term149570, term149570.getClass(), "edges", term149581);
        setLongField(term149570, term149570.getClass(), "finalNrOfEdges", -5004803270846838598L);
        setDoubleField(term149632, term149632.getClass(), "value", 0.9765468963999548);
        setField(term149632, term149632.getClass(), "this$0", null);
        setField(term149570, term149570.getClass(), "totalWeight", term149632);
        setBooleanField(term149570, term149570.getClass(), "calculated", false);
        setField(term149570, term149570.getClass(), "graph", null);
        setBooleanField(term149570, term149570.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeight", argTypes, term149570, args);
    }

};


