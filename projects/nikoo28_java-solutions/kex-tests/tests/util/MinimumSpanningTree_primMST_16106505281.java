package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class MinimumSpanningTree_primMST_16106505281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1071;
     Object term1072;

    public MinimumSpanningTree_primMST_16106505281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1071 = newInstance(Class.forName("util.MinimumSpanningTree"));
        ArrayList term1075 = new ArrayList();
        term1072 = newInstance(Class.forName("util.WeightedGraph"));
        Object[] term1074 = (Object[]) newArray("java.util.List", 1);
        setIntField(term1072, term1072.getClass(), "vertices", -1703035419);
        setElement(term1074, 0, term1075);
        setField(term1072, term1072.getClass(), "adjacencyList", term1074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.MinimumSpanningTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.WeightedGraph");
        Object[] args = new Object[1];
        args[0] = term1072;
        callMethod(klass, "primMST", argTypes, term1071, args);
    }

};


