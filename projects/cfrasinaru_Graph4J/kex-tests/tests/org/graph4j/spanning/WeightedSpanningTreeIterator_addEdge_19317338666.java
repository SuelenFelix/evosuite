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

public class WeightedSpanningTreeIterator_addEdge_19317338666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term860;
     Object term932;
     Object term977;
     Object term992;

    public WeightedSpanningTreeIterator_addEdge_19317338666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term868 = new Double(0.16681991355621673);
        Double term870 = new Double(0.24168508149332457);
        Double term872 = new Double(0.9765582392968284);
        Double term874 = new Double(0.33340230026214834);
        Double term876 = new Double(0.7912735654922212);
        Double term878 = new Double(0.7177162541558186);
        Double term885 = new Double(0.4751993224281752);
        Double term887 = new Double(0.246784352391756);
        Double term889 = new Double(0.6746769370801629);
        Double term901 = new Double(0.09436531082165778);
        Double term903 = new Double(0.1882701721081318);
        Double term905 = new Double(0.20230843747579808);
        Double term907 = new Double(0.4995447078885714);
        Double term909 = new Double(0.19855958465701706);
        Double term916 = new Double(0.6202418999768349);
        Double term918 = new Double(0.9848907582209794);
        Double term920 = new Double(0.9658751931880928);
        Double term922 = new Double(0.6990187833274262);
        Double term924 = new Double(0.6970994777067232);
        Double term926 = new Double(0.4309992370378436);
        term860 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator"));
        Object[] term862 = (Object[]) newArray("org.graph4j.Edge", 5);
        Object term863 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term867 = (Object[]) newArray("java.lang.Double", 6);
        Object term880 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term884 = (Object[]) newArray("java.lang.Double", 3);
        Object term891 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term895 = (Object[]) newArray("java.lang.Double", 0);
        Object term896 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term900 = (Object[]) newArray("java.lang.Double", 5);
        Object term911 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term915 = (Object[]) newArray("java.lang.Double", 6);
        Object term928 = newInstance(Class.forName("java.util.PriorityQueue"));
        Object[] term929 = (Object[]) newArray("java.lang.Object", 11);
        setField(term860, term860.getClass(), "graph", null);
        setIntField(term860, term860.getClass(), "numVertices", 880977281);
        setBooleanField(term863, term863.getClass(), "directed", true);
        setIntField(term863, term863.getClass(), "source", 371943306);
        setIntField(term863, term863.getClass(), "target", 982388293);
        setElement(term867, 0, term868);
        setElement(term867, 1, term870);
        setElement(term867, 2, term872);
        setElement(term867, 3, term874);
        setElement(term867, 4, term876);
        setElement(term867, 5, term878);
        setField(term863, term863.getClass(), "data", term867);
        setField(term863, term863.getClass(), "label", null);
        setElement(term862, 0, term863);
        setBooleanField(term880, term880.getClass(), "directed", true);
        setIntField(term880, term880.getClass(), "source", -159494544);
        setIntField(term880, term880.getClass(), "target", -75206835);
        setElement(term884, 0, term885);
        setElement(term884, 1, term887);
        setElement(term884, 2, term889);
        setField(term880, term880.getClass(), "data", term884);
        setField(term880, term880.getClass(), "label", null);
        setElement(term862, 1, term880);
        setBooleanField(term891, term891.getClass(), "directed", true);
        setIntField(term891, term891.getClass(), "source", -1618206977);
        setIntField(term891, term891.getClass(), "target", -1747406163);
        setField(term891, term891.getClass(), "data", term895);
        setField(term891, term891.getClass(), "label", null);
        setElement(term862, 2, term891);
        setBooleanField(term896, term896.getClass(), "directed", false);
        setIntField(term896, term896.getClass(), "source", 388157121);
        setIntField(term896, term896.getClass(), "target", 1684998508);
        setElement(term900, 0, term901);
        setElement(term900, 1, term903);
        setElement(term900, 2, term905);
        setElement(term900, 3, term907);
        setElement(term900, 4, term909);
        setField(term896, term896.getClass(), "data", term900);
        setField(term896, term896.getClass(), "label", null);
        setElement(term862, 3, term896);
        setBooleanField(term911, term911.getClass(), "directed", false);
        setIntField(term911, term911.getClass(), "source", -1476644457);
        setIntField(term911, term911.getClass(), "target", 1270666529);
        setElement(term915, 0, term916);
        setElement(term915, 1, term918);
        setElement(term915, 2, term920);
        setElement(term915, 3, term922);
        setElement(term915, 4, term924);
        setElement(term915, 5, term926);
        setField(term911, term911.getClass(), "data", term915);
        setField(term911, term911.getClass(), "label", null);
        setElement(term862, 4, term911);
        setField(term860, term860.getClass(), "edges", term862);
        setField(term928, term928.getClass(), "queue", term929);
        setIntField(term928, term928.getClass(), "size", 0);
        setField(term928, term928.getClass(), "comparator", null);
        setIntField(term928, term928.getClass(), "modCount", 0);
        setField(term860, term860.getClass(), "queue", term928);
        HashMap term934 = new HashMap();
        Set<Object> term1003 =  ((Map) term934).keySet();
        HashSet term933 = new HashSet((Collection<? extends Object>) term1003);
        HashMap term947 = new HashMap();
        Set<Object> term1004 =  ((Map) term947).keySet();
        HashSet term946 = new HashSet((Collection<? extends Object>) term1004);
        HashMap term960 = new HashMap();
        Set<Object> term1005 =  ((Map) term960).keySet();
        HashSet term959 = new HashSet((Collection<? extends Object>) term1005);
        term932 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part"));
        setField(term932, term932.getClass(), "included", term933);
        setField(term932, term932.getClass(), "excluded", term946);
        setField(term932, term932.getClass(), "mstEdges", term959);
        setDoubleField(term932, term932.getClass(), "mstWeight", 0.7655020693602768);
        setField(term932, term932.getClass(), "this$0", null);
        Double term982 = new Double(0.5548341997020813);
        Double term984 = new Double(0.4059165385720548);
        Double term986 = new Double(0.3800208987762318);
        Double term988 = new Double(0.6329228631168875);
        Double term990 = new Double(0.06928634128023836);
        term977 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term981 = (Object[]) newArray("java.lang.Double", 5);
        setBooleanField(term977, term977.getClass(), "directed", true);
        setIntField(term977, term977.getClass(), "source", 842904495);
        setIntField(term977, term977.getClass(), "target", 1008080511);
        setElement(term981, 0, term982);
        setElement(term981, 1, term984);
        setElement(term981, 2, term986);
        setElement(term981, 3, term988);
        setElement(term981, 4, term990);
        setField(term977, term977.getClass(), "data", term981);
        setField(term977, term977.getClass(), "label", null);
        term992 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term995 = (int[]) newIntArray(6);
        setIntField(term992, term992.getClass(), "numVertices", 1935707624);
        setBooleanField(term992, term992.getClass(), "pathCompression", false);
        setIntElement(term995, 0, 1507074215);
        setIntElement(term995, 1, -282881827);
        setIntElement(term995, 2, -1183353915);
        setIntElement(term995, 3, -420030135);
        setIntElement(term995, 4, 267763294);
        setIntElement(term995, 5, -1497710478);
        setField(term992, term992.getClass(), "parent", term995);
        setIntField(term992, term992.getClass(), "numSets", 49950830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        argTypes[1] = Class.forName("org.graph4j.Edge");
        argTypes[2] = Class.forName("org.graph4j.util.UnionFind");
        Object[] args = new Object[3];
        args[0] = term932;
        args[1] = term977;
        args[2] = term992;
        callMethod(klass, "addEdge", argTypes, term860, args);
    }

};


