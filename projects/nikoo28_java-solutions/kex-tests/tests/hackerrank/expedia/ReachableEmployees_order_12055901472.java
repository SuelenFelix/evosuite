package hackerrank.expedia;

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
import static hackerrank.expedia.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Object;

public class ReachableEmployees_order_12055901472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term58;
     Object term61;
     Object term79;

    public ReachableEmployees_order_12055901472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = new Integer(1162663216);
        term58 = new LinkedList();
        Integer term64 = new Integer(-1955890973);
        Integer term67 = new Integer(-2038273078);
        Integer term70 = new Integer(1227103734);
        Integer term73 = new Integer(-1339778481);
        term61 = new LinkedList();
        ((LinkedList) term61).add(term64);
        ((LinkedList) term61).add(term67);
        ((LinkedList) term61).add(term70);
        ((LinkedList) term61).add(term73);
        ((LinkedList) term61).add((Object)null);
        term79 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.expedia.ReachableEmployees");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term56;
        args[1] = term58;
        args[2] = term61;
        args[3] = term79;
        callMethod(klass, "order", argTypes, null, args);
    }

};


