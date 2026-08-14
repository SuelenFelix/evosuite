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

public class WeightedGraph_getVertices_10807201305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1673;

    public WeightedGraph_getVertices_10807201305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1676 = new ArrayList();
        ArrayList term1680 = new ArrayList();
        ArrayList term1684 = new ArrayList();
        ArrayList term1688 = new ArrayList();
        ArrayList term1692 = new ArrayList();
        term1673 = newInstance(Class.forName("util.WeightedGraph"));
        Object[] term1675 = (Object[]) newArray("java.util.List", 5);
        setIntField(term1673, term1673.getClass(), "vertices", 644154104);
        setElement(term1675, 0, term1676);
        setElement(term1675, 1, term1680);
        setElement(term1675, 2, term1684);
        setElement(term1675, 3, term1688);
        setElement(term1675, 4, term1692);
        setField(term1673, term1673.getClass(), "adjacencyList", term1675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.WeightedGraph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVertices", argTypes, term1673, args);
    }

};


