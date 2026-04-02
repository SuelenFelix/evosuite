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
import java.lang.Object;
import java.util.ArrayList;

public class ReachableEmployees_bfs_7529546391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term9;
     Object term50;

    public ReachableEmployees_bfs_7529546391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term3 = (boolean[]) newBooleanArray(5);
        setBooleanElement(term3, 4, true);
        Integer term12 = new Integer(568599855);
        ArrayList term10 = new ArrayList();
        ((ArrayList) term10).add(term12);
        Integer term18 = new Integer(1162663216);
        ArrayList term16 = new ArrayList();
        ((ArrayList) term16).add(term18);
        ArrayList term22 = new ArrayList();
        ArrayList term26 = new ArrayList();
        ArrayList term30 = new ArrayList();
        ArrayList term34 = new ArrayList();
        Integer term40 = new Integer(1484323161);
        Integer term42 = new Integer(391863371);
        Integer term44 = new Integer(-1922583790);
        Integer term46 = new Integer(-616727354);
        ArrayList term38 = new ArrayList();
        ((ArrayList) term38).add(term40);
        ((ArrayList) term38).add(term42);
        ((ArrayList) term38).add(term44);
        ((ArrayList) term38).add(term46);
        term9 = (Object[]) newArray("java.util.ArrayList", 7);
        setElement(term9, 0, term10);
        setElement(term9, 1, term16);
        setElement(term9, 2, term22);
        setElement(term9, 3, term26);
        setElement(term9, 4, term30);
        setElement(term9, 5, term34);
        setElement(term9, 6, term38);
        term50 = (Object[]) newArray("[I", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.expedia.ReachableEmployees");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.util.ArrayList"), 0).getClass();
        argTypes[3] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term1;
        args[1] = term3;
        args[2] = term9;
        args[3] = term50;
        callMethod(klass, "bfs", argTypes, null, args);
    }

};


