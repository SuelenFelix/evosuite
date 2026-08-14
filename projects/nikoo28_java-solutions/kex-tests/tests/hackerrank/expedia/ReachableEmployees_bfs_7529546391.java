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
     Object term26;

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
        term9 = (Object[]) newArray("java.util.ArrayList", 3);
        setElement(term9, 0, term10);
        setElement(term9, 1, term16);
        setElement(term9, 2, term22);
        term26 = (Object[]) newArray("[I", 4);
        int[] term27 = (int[]) newIntArray(5);
        int[] term33 = (int[]) newIntArray(0);
        int[] term34 = (int[]) newIntArray(9);
        int[] term44 = (int[]) newIntArray(0);
        setIntElement(term27, 0, 1162663216);
        setIntElement(term27, 1, 1484323161);
        setIntElement(term27, 2, 391863371);
        setIntElement(term27, 3, -1922583790);
        setIntElement(term27, 4, -616727354);
        setElement(term26, 0, term27);
        setElement(term26, 1, term33);
        setIntElement(term34, 0, -1955890973);
        setIntElement(term34, 1, -2038273078);
        setIntElement(term34, 2, 1227103734);
        setIntElement(term34, 3, -1339778481);
        setIntElement(term34, 4, 1725571209);
        setIntElement(term34, 5, -522618178);
        setIntElement(term34, 6, 1134449235);
        setIntElement(term34, 7, -883034806);
        setIntElement(term34, 8, 1585847225);
        setElement(term26, 2, term34);
        setElement(term26, 3, term44);
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
        args[3] = term26;
        callMethod(klass, "bfs", argTypes, null, args);
    }

};


