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
     Object term64;
     Object term66;
     Object term93;
     Object term96;

    public ReachableEmployees_order_12055901472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = new Integer(597278769);
        Integer term69 = new Integer(1484323161);
        Integer term72 = new Integer(391863371);
        Integer term75 = new Integer(-1922583790);
        Integer term78 = new Integer(-616727354);
        term66 = new LinkedList();
        ((LinkedList) term66).add(term69);
        ((LinkedList) term66).add(term72);
        ((LinkedList) term66).add(term75);
        ((LinkedList) term66).add(term78);
        ((LinkedList) term66).add((Object)null);
        ((LinkedList) term66).add((Object)null);
        ((LinkedList) term66).add((Object)null);
        ((LinkedList) term66).add((Object)null);
        ((LinkedList) term66).add((Object)null);
        term93 = new LinkedList();
        term96 = new Integer(-1685132342);
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
        args[0] = term64;
        args[1] = term66;
        args[2] = term93;
        args[3] = term96;
        callMethod(klass, "order", argTypes, null, args);
    }

};


