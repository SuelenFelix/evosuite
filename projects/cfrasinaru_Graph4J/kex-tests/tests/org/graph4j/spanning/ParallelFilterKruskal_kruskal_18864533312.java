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

public class ParallelFilterKruskal_kruskal_18864533312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149257;

    public ParallelFilterKruskal_kruskal_18864533312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term149277 = new Double(0.2605061149930482);
        Double term149279 = new Double(0.033595562894201625);
        Double term149281 = new Double(0.39232732860701935);
        Double term149283 = new Double(0.7914296018947934);
        Double term149285 = new Double(0.09194044012181457);
        Double term149287 = new Double(0.7419234846002456);
        Double term149289 = new Double(0.7847448973268806);
        Double term149291 = new Double(0.7475866933925822);
        Double term149298 = new Double(0.175500624303907);
        Double term149300 = new Double(0.952706612509487);
        Double term149302 = new Double(0.6258653167615772);
        Double term149304 = new Double(0.27745631197945686);
        Double term149306 = new Double(0.48054780123911967);
        Double term149308 = new Double(0.1929824244999918);
        Double term149310 = new Double(0.17503909932426287);
        Double term149312 = new Double(0.11939395248958418);
        term149257 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        Object term149258 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term149261 = (int[]) newIntArray(8);
        Object[] term149271 = (Object[]) newArray("org.graph4j.Edge", 2);
        Object term149272 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term149276 = (Object[]) newArray("java.lang.Double", 8);
        Object term149293 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term149297 = (Object[]) newArray("java.lang.Double", 8);
        Object term149315 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setField(term149257, term149257.getClass(), "tree", null);
        setIntField(term149258, term149258.getClass(), "numVertices", -497305427);
        setBooleanField(term149258, term149258.getClass(), "pathCompression", true);
        setIntElement(term149261, 0, -1741689278);
        setIntElement(term149261, 1, 2059178452);
        setIntElement(term149261, 2, -684471281);
        setIntElement(term149261, 3, -272768917);
        setIntElement(term149261, 4, -1466239022);
        setIntElement(term149261, 5, -1584905531);
        setIntElement(term149261, 6, -179101143);
        setIntElement(term149261, 7, 1753851412);
        setField(term149258, term149258.getClass(), "parent", term149261);
        setIntField(term149258, term149258.getClass(), "numSets", -2003045633);
        setField(term149257, term149257.getClass(), "unionFind", term149258);
        setBooleanField(term149272, term149272.getClass(), "directed", true);
        setIntField(term149272, term149272.getClass(), "source", 610364207);
        setIntField(term149272, term149272.getClass(), "target", -441070510);
        setElement(term149276, 0, term149277);
        setElement(term149276, 1, term149279);
        setElement(term149276, 2, term149281);
        setElement(term149276, 3, term149283);
        setElement(term149276, 4, term149285);
        setElement(term149276, 5, term149287);
        setElement(term149276, 6, term149289);
        setElement(term149276, 7, term149291);
        setField(term149272, term149272.getClass(), "data", term149276);
        setField(term149272, term149272.getClass(), "label", null);
        setElement(term149271, 0, term149272);
        setBooleanField(term149293, term149293.getClass(), "directed", true);
        setIntField(term149293, term149293.getClass(), "source", 2121753275);
        setIntField(term149293, term149293.getClass(), "target", -897069662);
        setElement(term149297, 0, term149298);
        setElement(term149297, 1, term149300);
        setElement(term149297, 2, term149302);
        setElement(term149297, 3, term149304);
        setElement(term149297, 4, term149306);
        setElement(term149297, 5, term149308);
        setElement(term149297, 6, term149310);
        setElement(term149297, 7, term149312);
        setField(term149293, term149293.getClass(), "data", term149297);
        setField(term149293, term149293.getClass(), "label", null);
        setElement(term149271, 1, term149293);
        setField(term149257, term149257.getClass(), "edges", term149271);
        setLongField(term149257, term149257.getClass(), "finalNrOfEdges", 2809748481176687920L);
        setDoubleField(term149315, term149315.getClass(), "value", 0.69063472580739);
        setField(term149315, term149315.getClass(), "this$0", null);
        setField(term149257, term149257.getClass(), "totalWeight", term149315);
        setBooleanField(term149257, term149257.getClass(), "calculated", true);
        setField(term149257, term149257.getClass(), "graph", null);
        setBooleanField(term149257, term149257.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "kruskal", argTypes, term149257, args);
    }

};


