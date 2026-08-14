package hackerrank.algorithms.implementation;

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
import static hackerrank.algorithms.implementation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Integer;
import java.lang.Object;

public class BetweenTwoSets_getTotalX_6058885633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term40;
     Object term58;

    public BetweenTwoSets_getTotalX_6058885633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("hackerrank.algorithms.implementation.BetweenTwoSets"));
        Integer term43 = new Integer(568599855);
        Integer term46 = new Integer(1162663216);
        Integer term49 = new Integer(1484323161);
        Integer term52 = new Integer(391863371);
        term40 = new LinkedList();
        ((LinkedList) term40).add(term43);
        ((LinkedList) term40).add(term46);
        ((LinkedList) term40).add(term49);
        ((LinkedList) term40).add(term52);
        ((LinkedList) term40).add((Object)null);
        Integer term61 = new Integer(-616727354);
        Integer term64 = new Integer(-1955890973);
        Integer term67 = new Integer(-2038273078);
        Integer term70 = new Integer(1227103734);
        term58 = new LinkedList();
        ((LinkedList) term58).add(term61);
        ((LinkedList) term58).add(term64);
        ((LinkedList) term58).add(term67);
        ((LinkedList) term58).add(term70);
        ((LinkedList) term58).add((Object)null);
        ((LinkedList) term58).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.algorithms.implementation.BetweenTwoSets");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term40;
        args[1] = term58;
        callMethod(klass, "getTotalX", argTypes, term39, args);
    }

};


