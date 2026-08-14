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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class WeightedSpanningTreeIterator_refine_6484071254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652;
     Object term721;

    public WeightedSpanningTreeIterator_refine_6484071254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term660 = new Double(0.3238255203811462);
        Double term662 = new Double(0.2843894095932772);
        Double term664 = new Double(0.2382345237223229);
        Double term666 = new Double(0.6037093070161561);
        Double term668 = new Double(0.48050706663913145);
        Double term675 = new Double(0.4990217874180345);
        Double term682 = new Double(0.22767631814145395);
        Double term684 = new Double(0.4630082575704827);
        Double term686 = new Double(0.8732511635701926);
        Double term688 = new Double(0.8977760608415547);
        Double term695 = new Double(0.3107086749915061);
        Double term702 = new Double(0.18330246984174836);
        Double term709 = new Double(0.1941255640189572);
        Double term711 = new Double(0.2889811903417371);
        Double term713 = new Double(0.7856101337088763);
        Double term715 = new Double(0.1782857269567425);
        Double term717 = new Double(0.17829386444171214);
        Double term719 = new Double(0.547995853732519);
        term652 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator"));
        Object[] term654 = (Object[]) newArray("org.graph4j.Edge", 6);
        Object term655 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term659 = (Object[]) newArray("java.lang.Double", 5);
        Object term670 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term674 = (Object[]) newArray("java.lang.Double", 1);
        Object term677 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term681 = (Object[]) newArray("java.lang.Double", 4);
        Object term690 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term694 = (Object[]) newArray("java.lang.Double", 1);
        Object term697 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term701 = (Object[]) newArray("java.lang.Double", 1);
        Object term704 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term708 = (Object[]) newArray("java.lang.Double", 6);
        setField(term652, term652.getClass(), "graph", null);
        setIntField(term652, term652.getClass(), "numVertices", 2095798786);
        setBooleanField(term655, term655.getClass(), "directed", false);
        setIntField(term655, term655.getClass(), "source", -1565502840);
        setIntField(term655, term655.getClass(), "target", 344323424);
        setElement(term659, 0, term660);
        setElement(term659, 1, term662);
        setElement(term659, 2, term664);
        setElement(term659, 3, term666);
        setElement(term659, 4, term668);
        setField(term655, term655.getClass(), "data", term659);
        setField(term655, term655.getClass(), "label", null);
        setElement(term654, 0, term655);
        setBooleanField(term670, term670.getClass(), "directed", true);
        setIntField(term670, term670.getClass(), "source", 9726679);
        setIntField(term670, term670.getClass(), "target", -25637976);
        setElement(term674, 0, term675);
        setField(term670, term670.getClass(), "data", term674);
        setField(term670, term670.getClass(), "label", null);
        setElement(term654, 1, term670);
        setBooleanField(term677, term677.getClass(), "directed", false);
        setIntField(term677, term677.getClass(), "source", 1555897383);
        setIntField(term677, term677.getClass(), "target", 202001407);
        setElement(term681, 0, term682);
        setElement(term681, 1, term684);
        setElement(term681, 2, term686);
        setElement(term681, 3, term688);
        setField(term677, term677.getClass(), "data", term681);
        setField(term677, term677.getClass(), "label", null);
        setElement(term654, 2, term677);
        setBooleanField(term690, term690.getClass(), "directed", false);
        setIntField(term690, term690.getClass(), "source", 158873461);
        setIntField(term690, term690.getClass(), "target", -430151637);
        setElement(term694, 0, term695);
        setField(term690, term690.getClass(), "data", term694);
        setField(term690, term690.getClass(), "label", null);
        setElement(term654, 3, term690);
        setBooleanField(term697, term697.getClass(), "directed", true);
        setIntField(term697, term697.getClass(), "source", -1697741339);
        setIntField(term697, term697.getClass(), "target", 98922530);
        setElement(term701, 0, term702);
        setField(term697, term697.getClass(), "data", term701);
        setField(term697, term697.getClass(), "label", null);
        setElement(term654, 4, term697);
        setBooleanField(term704, term704.getClass(), "directed", false);
        setIntField(term704, term704.getClass(), "source", -1388471422);
        setIntField(term704, term704.getClass(), "target", -1498296052);
        setElement(term708, 0, term709);
        setElement(term708, 1, term711);
        setElement(term708, 2, term713);
        setElement(term708, 3, term715);
        setElement(term708, 4, term717);
        setElement(term708, 5, term719);
        setField(term704, term704.getClass(), "data", term708);
        setField(term704, term704.getClass(), "label", null);
        setElement(term654, 5, term704);
        setField(term652, term652.getClass(), "edges", term654);
        setField(term652, term652.getClass(), "queue", null);
        HashMap term723 = new HashMap();
        Set<Object> term769 =  ((Map) term723).keySet();
        HashSet term722 = new HashSet((Collection<? extends Object>) term769);
        HashMap term729 = new HashMap();
        Set<Object> term770 =  ((Map) term729).keySet();
        HashSet term728 = new HashSet((Collection<? extends Object>) term770);
        HashMap term750 = new HashMap();
        Set<Object> term771 =  ((Map) term750).keySet();
        HashSet term749 = new HashSet((Collection<? extends Object>) term771);
        term721 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part"));
        setField(term721, term721.getClass(), "included", term722);
        setField(term721, term721.getClass(), "excluded", term728);
        setField(term721, term721.getClass(), "mstEdges", term749);
        setDoubleField(term721, term721.getClass(), "mstWeight", 0.37773193782763337);
        setField(term721, term721.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        Object[] args = new Object[1];
        args[0] = term721;
        callMethod(klass, "refine", argTypes, term652, args);
    }

};


