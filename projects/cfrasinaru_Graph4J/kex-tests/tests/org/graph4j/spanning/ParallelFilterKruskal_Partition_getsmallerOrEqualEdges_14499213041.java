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

public class ParallelFilterKruskal_Partition_getsmallerOrEqualEdges_14499213041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2903;

    public ParallelFilterKruskal_Partition_getsmallerOrEqualEdges_14499213041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2910 = new Double(0.3831812963915012);
        Double term2912 = new Double(0.4282106854555081);
        Double term2914 = new Double(0.1826861672590545);
        Double term2916 = new Double(0.9791936141175877);
        Double term2918 = new Double(0.25117946251535295);
        Double term2920 = new Double(0.5726119417156881);
        Double term2922 = new Double(0.190417489318088);
        Double term2924 = new Double(0.6263202945251085);
        Double term2931 = new Double(0.47971707140048314);
        Double term2933 = new Double(0.11814755873301563);
        Double term2935 = new Double(0.043843045689821336);
        Double term2937 = new Double(0.3166434459249081);
        Double term2939 = new Double(0.3001038134239822);
        Double term2941 = new Double(0.07007378007322307);
        Double term2943 = new Double(0.15701878581568673);
        Double term2951 = new Double(0.002952762503631967);
        Double term2953 = new Double(0.3176774647268311);
        Double term2955 = new Double(0.18514821141841376);
        Double term2957 = new Double(0.20888628884386784);
        Double term2959 = new Double(0.493613742285562);
        Double term2961 = new Double(0.4797764207198135);
        Double term2963 = new Double(0.056284870993027813);
        Double term2970 = new Double(0.6862332128231466);
        Double term2972 = new Double(0.8799451196211497);
        Double term2974 = new Double(0.9739388367741902);
        Double term2976 = new Double(0.2503677695709047);
        Double term2978 = new Double(0.09474948219863522);
        Double term2980 = new Double(0.4383399830188074);
        Double term2982 = new Double(0.31844331712731666);
        Double term2984 = new Double(0.036973761145152384);
        Double term2991 = new Double(0.9425796768484118);
        Double term2993 = new Double(0.2348226206523183);
        Double term2995 = new Double(0.443439873192083);
        Double term2997 = new Double(0.03969974986368108);
        term2903 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$Partition"));
        Object[] term2904 = (Object[]) newArray("org.graph4j.Edge", 2);
        Object term2905 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2909 = (Object[]) newArray("java.lang.Double", 8);
        Object term2926 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2930 = (Object[]) newArray("java.lang.Double", 7);
        Object[] term2945 = (Object[]) newArray("org.graph4j.Edge", 3);
        Object term2946 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2950 = (Object[]) newArray("java.lang.Double", 7);
        Object term2965 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2969 = (Object[]) newArray("java.lang.Double", 8);
        Object term2986 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2990 = (Object[]) newArray("java.lang.Double", 4);
        setBooleanField(term2905, term2905.getClass(), "directed", true);
        setIntField(term2905, term2905.getClass(), "source", -1538936030);
        setIntField(term2905, term2905.getClass(), "target", -752870423);
        setElement(term2909, 0, term2910);
        setElement(term2909, 1, term2912);
        setElement(term2909, 2, term2914);
        setElement(term2909, 3, term2916);
        setElement(term2909, 4, term2918);
        setElement(term2909, 5, term2920);
        setElement(term2909, 6, term2922);
        setElement(term2909, 7, term2924);
        setField(term2905, term2905.getClass(), "data", term2909);
        setField(term2905, term2905.getClass(), "label", null);
        setElement(term2904, 0, term2905);
        setBooleanField(term2926, term2926.getClass(), "directed", false);
        setIntField(term2926, term2926.getClass(), "source", -1698809299);
        setIntField(term2926, term2926.getClass(), "target", 401512128);
        setElement(term2930, 0, term2931);
        setElement(term2930, 1, term2933);
        setElement(term2930, 2, term2935);
        setElement(term2930, 3, term2937);
        setElement(term2930, 4, term2939);
        setElement(term2930, 5, term2941);
        setElement(term2930, 6, term2943);
        setField(term2926, term2926.getClass(), "data", term2930);
        setField(term2926, term2926.getClass(), "label", null);
        setElement(term2904, 1, term2926);
        setField(term2903, term2903.getClass(), "smallerOrEqualEdges", term2904);
        setBooleanField(term2946, term2946.getClass(), "directed", true);
        setIntField(term2946, term2946.getClass(), "source", -2069930777);
        setIntField(term2946, term2946.getClass(), "target", 1543696412);
        setElement(term2950, 0, term2951);
        setElement(term2950, 1, term2953);
        setElement(term2950, 2, term2955);
        setElement(term2950, 3, term2957);
        setElement(term2950, 4, term2959);
        setElement(term2950, 5, term2961);
        setElement(term2950, 6, term2963);
        setField(term2946, term2946.getClass(), "data", term2950);
        setField(term2946, term2946.getClass(), "label", null);
        setElement(term2945, 0, term2946);
        setBooleanField(term2965, term2965.getClass(), "directed", true);
        setIntField(term2965, term2965.getClass(), "source", -1385748168);
        setIntField(term2965, term2965.getClass(), "target", -270592367);
        setElement(term2969, 0, term2970);
        setElement(term2969, 1, term2972);
        setElement(term2969, 2, term2974);
        setElement(term2969, 3, term2976);
        setElement(term2969, 4, term2978);
        setElement(term2969, 5, term2980);
        setElement(term2969, 6, term2982);
        setElement(term2969, 7, term2984);
        setField(term2965, term2965.getClass(), "data", term2969);
        setField(term2965, term2965.getClass(), "label", null);
        setElement(term2945, 1, term2965);
        setBooleanField(term2986, term2986.getClass(), "directed", false);
        setIntField(term2986, term2986.getClass(), "source", 178847646);
        setIntField(term2986, term2986.getClass(), "target", 273590437);
        setElement(term2990, 0, term2991);
        setElement(term2990, 1, term2993);
        setElement(term2990, 2, term2995);
        setElement(term2990, 3, term2997);
        setField(term2986, term2986.getClass(), "data", term2990);
        setField(term2986, term2986.getClass(), "label", null);
        setElement(term2945, 2, term2986);
        setField(term2903, term2903.getClass(), "biggerEdges", term2945);
        setDoubleField(term2903, term2903.getClass(), "exampleOfSmallerWeight", 0.2852810965221698);
        setField(term2903, term2903.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal$Partition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getsmallerOrEqualEdges", argTypes, term2903, args);
    }

};


