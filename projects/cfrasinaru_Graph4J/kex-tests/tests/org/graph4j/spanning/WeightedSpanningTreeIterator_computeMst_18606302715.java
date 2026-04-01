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

public class WeightedSpanningTreeIterator_computeMst_18606302715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term772;
     Object term814;

    public WeightedSpanningTreeIterator_computeMst_18606302715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term780 = new Double(0.18561351983828822);
        Double term782 = new Double(0.9678135126533798);
        Double term784 = new Double(0.3275035827937727);
        Double term786 = new Double(0.13747524521333288);
        Double term793 = new Double(0.7149120009558162);
        Double term795 = new Double(0.0013046823258857643);
        Double term797 = new Double(0.5404409545293147);
        Double term799 = new Double(0.9172358414700745);
        Double term801 = new Double(0.3804251745476508);
        Double term803 = new Double(0.6704848280926606);
        Double term805 = new Double(0.6213122016266206);
        Double term807 = new Double(0.540850203722707);
        term772 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator"));
        Object[] term774 = (Object[]) newArray("org.graph4j.Edge", 3);
        Object term775 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term779 = (Object[]) newArray("java.lang.Double", 4);
        Object term788 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term792 = (Object[]) newArray("java.lang.Double", 8);
        Object term809 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term813 = (Object[]) newArray("java.lang.Double", 0);
        setField(term772, term772.getClass(), "graph", null);
        setIntField(term772, term772.getClass(), "numVertices", 1358829571);
        setBooleanField(term775, term775.getClass(), "directed", false);
        setIntField(term775, term775.getClass(), "source", 991356662);
        setIntField(term775, term775.getClass(), "target", -506958186);
        setElement(term779, 0, term780);
        setElement(term779, 1, term782);
        setElement(term779, 2, term784);
        setElement(term779, 3, term786);
        setField(term775, term775.getClass(), "data", term779);
        setField(term775, term775.getClass(), "label", null);
        setElement(term774, 0, term775);
        setBooleanField(term788, term788.getClass(), "directed", false);
        setIntField(term788, term788.getClass(), "source", -507387516);
        setIntField(term788, term788.getClass(), "target", -1970452551);
        setElement(term792, 0, term793);
        setElement(term792, 1, term795);
        setElement(term792, 2, term797);
        setElement(term792, 3, term799);
        setElement(term792, 4, term801);
        setElement(term792, 5, term803);
        setElement(term792, 6, term805);
        setElement(term792, 7, term807);
        setField(term788, term788.getClass(), "data", term792);
        setField(term788, term788.getClass(), "label", null);
        setElement(term774, 1, term788);
        setBooleanField(term809, term809.getClass(), "directed", false);
        setIntField(term809, term809.getClass(), "source", -1896376975);
        setIntField(term809, term809.getClass(), "target", 729658803);
        setField(term809, term809.getClass(), "data", term813);
        setField(term809, term809.getClass(), "label", null);
        setElement(term774, 2, term809);
        setField(term772, term772.getClass(), "edges", term774);
        setField(term772, term772.getClass(), "queue", null);
        HashMap term816 = new HashMap();
        Set<Object> term857 =  ((Map) term816).keySet();
        HashSet term815 = new HashSet((Collection<? extends Object>) term857);
        HashMap term831 = new HashMap();
        Set<Object> term858 =  ((Map) term831).keySet();
        HashSet term830 = new HashSet((Collection<? extends Object>) term858);
        HashMap term840 = new HashMap();
        Set<Object> term859 =  ((Map) term840).keySet();
        HashSet term839 = new HashSet((Collection<? extends Object>) term859);
        term814 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part"));
        setField(term814, term814.getClass(), "included", term815);
        setField(term814, term814.getClass(), "excluded", term830);
        setField(term814, term814.getClass(), "mstEdges", term839);
        setDoubleField(term814, term814.getClass(), "mstWeight", 0.5183269973490326);
        setField(term814, term814.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        Object[] args = new Object[1];
        args[0] = term814;
        callMethod(klass, "computeMst", argTypes, term772, args);
    }

};


