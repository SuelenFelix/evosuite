package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class EdgeArray_remove_53474525013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62193;
     Object term62243;
     Object term62245;

    public EdgeArray_remove_53474525013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62193 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62194 = (Object[]) newArray("[I", 7);
        int[] term62195 = (int[]) newIntArray(9);
        int[] term62205 = (int[]) newIntArray(3);
        int[] term62209 = (int[]) newIntArray(6);
        int[] term62216 = (int[]) newIntArray(4);
        int[] term62221 = (int[]) newIntArray(3);
        int[] term62225 = (int[]) newIntArray(8);
        int[] term62234 = (int[]) newIntArray(7);
        setField(term62193, term62193.getClass(), "graph", null);
        setIntElement(term62195, 0, -958163406);
        setIntElement(term62195, 1, 1073272246);
        setIntElement(term62195, 2, -393108425);
        setIntElement(term62195, 3, -1491497666);
        setIntElement(term62195, 4, 501016087);
        setIntElement(term62195, 5, -1697577715);
        setIntElement(term62195, 6, -1600100261);
        setIntElement(term62195, 7, -96376593);
        setIntElement(term62195, 8, -782918431);
        setElement(term62194, 0, term62195);
        setIntElement(term62205, 0, 68274251);
        setIntElement(term62205, 1, -446931106);
        setIntElement(term62205, 2, 831138363);
        setElement(term62194, 1, term62205);
        setIntElement(term62209, 0, -1626486283);
        setIntElement(term62209, 1, -116608439);
        setIntElement(term62209, 2, -1820369393);
        setIntElement(term62209, 3, 1514212056);
        setIntElement(term62209, 4, -1119664670);
        setIntElement(term62209, 5, -537451132);
        setElement(term62194, 2, term62209);
        setIntElement(term62216, 0, -1722921664);
        setIntElement(term62216, 1, -1820864777);
        setIntElement(term62216, 2, 417281189);
        setIntElement(term62216, 3, 1929634576);
        setElement(term62194, 3, term62216);
        setIntElement(term62221, 0, -405127258);
        setIntElement(term62221, 1, 647360332);
        setIntElement(term62221, 2, 1501751336);
        setElement(term62194, 4, term62221);
        setIntElement(term62225, 0, 1460802763);
        setIntElement(term62225, 1, 1587708420);
        setIntElement(term62225, 2, -1895182227);
        setIntElement(term62225, 3, 958523148);
        setIntElement(term62225, 4, -16365866);
        setIntElement(term62225, 5, 394594696);
        setIntElement(term62225, 6, 1325767520);
        setIntElement(term62225, 7, -1016128601);
        setElement(term62194, 5, term62225);
        setIntElement(term62234, 0, -1791687615);
        setIntElement(term62234, 1, 534570101);
        setIntElement(term62234, 2, 702057326);
        setIntElement(term62234, 3, 20934480);
        setIntElement(term62234, 4, -1500640507);
        setIntElement(term62234, 5, -1484484351);
        setIntElement(term62234, 6, 338609469);
        setElement(term62194, 6, term62234);
        setField(term62193, term62193.getClass(), "edges", term62194);
        setIntField(term62193, term62193.getClass(), "numEdges", 1029985753);
        term62243 = new Integer(-491631818);
        term62245 = new Integer(-378773888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term62243;
        args[1] = term62245;
        callMethod(klass, "remove", argTypes, term62193, args);
    }

};


