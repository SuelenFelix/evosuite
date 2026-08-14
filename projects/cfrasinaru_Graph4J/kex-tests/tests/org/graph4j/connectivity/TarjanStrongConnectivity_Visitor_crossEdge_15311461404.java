package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarjanStrongConnectivity_Visitor_crossEdge_15311461404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1165;
     Object term1191;
     Object term1216;

    public TarjanStrongConnectivity_Visitor_crossEdge_15311461404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1165 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor"));
        int[] term1167 = (int[]) newIntArray(6);
        Object term1174 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term1175 = (int[]) newIntArray(7);
        Object term1185 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1186 = (long[]) newLongArray(1);
        boolean[] term1190 = (boolean[]) newBooleanArray(0);
        setBooleanField(term1165, term1165.getClass(), "checkOnly", false);
        setIntElement(term1167, 0, 1065595802);
        setIntElement(term1167, 1, 21031843);
        setIntElement(term1167, 2, -380787857);
        setIntElement(term1167, 3, 319853052);
        setIntElement(term1167, 4, -1097563716);
        setIntElement(term1167, 5, 1572907769);
        setField(term1165, term1165.getClass(), "low", term1167);
        setField(term1174, term1174.getClass(), "graph", null);
        setIntElement(term1175, 0, 1608016787);
        setIntElement(term1175, 1, -516303035);
        setIntElement(term1175, 2, -2143043890);
        setIntElement(term1175, 3, -2138825831);
        setIntElement(term1175, 4, 1454781562);
        setIntElement(term1175, 5, -27944011);
        setIntElement(term1175, 6, -20614472);
        setField(term1174, term1174.getClass(), "vertices", term1175);
        setIntField(term1174, term1174.getClass(), "numVertices", 1126618861);
        setIntField(term1174, term1174.getClass(), "first", 947449400);
        setField(term1185, term1185.getClass(), "words", term1186);
        setIntField(term1185, term1185.getClass(), "wordsInUse", -763799087);
        setBooleanField(term1185, term1185.getClass(), "sizeIsSticky", true);
        setField(term1174, term1174.getClass(), "bitset", term1185);
        setField(term1165, term1165.getClass(), "stack", term1174);
        setField(term1165, term1165.getClass(), "instack", term1190);
        setField(term1165, term1165.getClass(), "this$0", null);
        term1191 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1196 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1201 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1206 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1211 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1191, term1191.getClass(), "component", 1207142014);
        setIntField(term1191, term1191.getClass(), "vertex", -876426634);
        setIntField(term1191, term1191.getClass(), "level", 213831054);
        setIntField(term1191, term1191.getClass(), "order", 330043745);
        setIntField(term1196, term1196.getClass(), "component", -509349195);
        setIntField(term1196, term1196.getClass(), "vertex", -1639041228);
        setIntField(term1196, term1196.getClass(), "level", 2027686272);
        setIntField(term1196, term1196.getClass(), "order", -1494356104);
        setIntField(term1201, term1201.getClass(), "component", -695279311);
        setIntField(term1201, term1201.getClass(), "vertex", 114279242);
        setIntField(term1201, term1201.getClass(), "level", 990883365);
        setIntField(term1201, term1201.getClass(), "order", 633598642);
        setIntField(term1206, term1206.getClass(), "component", 1862841859);
        setIntField(term1206, term1206.getClass(), "vertex", -1114668574);
        setIntField(term1206, term1206.getClass(), "level", 514511037);
        setIntField(term1206, term1206.getClass(), "order", 1713573821);
        setIntField(term1211, term1211.getClass(), "component", 1956590498);
        setIntField(term1211, term1211.getClass(), "vertex", 1467356494);
        setIntField(term1211, term1211.getClass(), "level", -26316536);
        setIntField(term1211, term1211.getClass(), "order", 1716165145);
        setField(term1211, term1211.getClass(), "parent", null);
        setField(term1206, term1206.getClass(), "parent", term1211);
        setField(term1201, term1201.getClass(), "parent", term1206);
        setField(term1196, term1196.getClass(), "parent", term1201);
        setField(term1191, term1191.getClass(), "parent", term1196);
        term1216 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1221 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1226 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1231 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1236 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1216, term1216.getClass(), "component", 864645689);
        setIntField(term1216, term1216.getClass(), "vertex", 279384872);
        setIntField(term1216, term1216.getClass(), "level", 1427305953);
        setIntField(term1216, term1216.getClass(), "order", -781832877);
        setIntField(term1221, term1221.getClass(), "component", 797203987);
        setIntField(term1221, term1221.getClass(), "vertex", 1973060703);
        setIntField(term1221, term1221.getClass(), "level", -138239905);
        setIntField(term1221, term1221.getClass(), "order", 1709474063);
        setIntField(term1226, term1226.getClass(), "component", 1406617209);
        setIntField(term1226, term1226.getClass(), "vertex", 1706047059);
        setIntField(term1226, term1226.getClass(), "level", 590451710);
        setIntField(term1226, term1226.getClass(), "order", -1999787419);
        setIntField(term1231, term1231.getClass(), "component", -1224443634);
        setIntField(term1231, term1231.getClass(), "vertex", 1048451946);
        setIntField(term1231, term1231.getClass(), "level", 5603560);
        setIntField(term1231, term1231.getClass(), "order", -1079020032);
        setIntField(term1236, term1236.getClass(), "component", -1973791064);
        setIntField(term1236, term1236.getClass(), "vertex", -2072158633);
        setIntField(term1236, term1236.getClass(), "level", -355469363);
        setIntField(term1236, term1236.getClass(), "order", 1465188553);
        setField(term1236, term1236.getClass(), "parent", null);
        setField(term1231, term1231.getClass(), "parent", term1236);
        setField(term1226, term1226.getClass(), "parent", term1231);
        setField(term1221, term1221.getClass(), "parent", term1226);
        setField(term1216, term1216.getClass(), "parent", term1221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1191;
        args[1] = term1216;
        callMethod(klass, "crossEdge", argTypes, term1165, args);
    }

};


