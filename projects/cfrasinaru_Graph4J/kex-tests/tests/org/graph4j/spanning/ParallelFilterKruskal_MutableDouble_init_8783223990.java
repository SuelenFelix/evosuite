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

public class ParallelFilterKruskal_MutableDouble_init_8783223990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159228;
     Object term159316;

    public ParallelFilterKruskal_MutableDouble_init_8783223990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term159245 = new Double(0.7583742559203879);
        Double term159252 = new Double(0.34960100086818);
        Double term159254 = new Double(0.6372518655434818);
        Double term159256 = new Double(0.167226799289813);
        Double term159258 = new Double(0.8094222768164622);
        Double term159260 = new Double(0.8118472696512443);
        Double term159262 = new Double(0.5081345064365255);
        Double term159264 = new Double(0.5925047134533268);
        Double term159266 = new Double(0.6565520822905176);
        Double term159273 = new Double(0.1783635750354463);
        Double term159275 = new Double(0.09766055472040214);
        Double term159277 = new Double(0.14435871082881424);
        Double term159284 = new Double(0.13547049799364475);
        Double term159286 = new Double(0.08768922779250798);
        Double term159288 = new Double(0.09838596916429043);
        Double term159290 = new Double(0.2837810681914955);
        Double term159297 = new Double(0.8060983740295946);
        Double term159299 = new Double(0.2068982892476774);
        Double term159301 = new Double(0.042943283383603204);
        Double term159303 = new Double(0.742462178151085);
        Double term159305 = new Double(0.6525775050180439);
        Double term159307 = new Double(0.18741462203040915);
        Double term159309 = new Double(0.4884829694350824);
        term159228 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        Object term159229 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term159232 = (int[]) newIntArray(5);
        Object[] term159239 = (Object[]) newArray("org.graph4j.Edge", 5);
        Object term159240 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term159244 = (Object[]) newArray("java.lang.Double", 1);
        Object term159247 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term159251 = (Object[]) newArray("java.lang.Double", 8);
        Object term159268 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term159272 = (Object[]) newArray("java.lang.Double", 3);
        Object term159279 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term159283 = (Object[]) newArray("java.lang.Double", 4);
        Object term159292 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term159296 = (Object[]) newArray("java.lang.Double", 7);
        Object term159312 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setField(term159228, term159228.getClass(), "tree", null);
        setIntField(term159229, term159229.getClass(), "numVertices", 20929671);
        setBooleanField(term159229, term159229.getClass(), "pathCompression", false);
        setIntElement(term159232, 0, 1102698946);
        setIntElement(term159232, 1, 615669581);
        setIntElement(term159232, 2, 452325538);
        setIntElement(term159232, 3, -527689330);
        setIntElement(term159232, 4, 908244507);
        setField(term159229, term159229.getClass(), "parent", term159232);
        setIntField(term159229, term159229.getClass(), "numSets", -813809672);
        setField(term159228, term159228.getClass(), "unionFind", term159229);
        setBooleanField(term159240, term159240.getClass(), "directed", false);
        setIntField(term159240, term159240.getClass(), "source", 139533394);
        setIntField(term159240, term159240.getClass(), "target", 741141641);
        setElement(term159244, 0, term159245);
        setField(term159240, term159240.getClass(), "data", term159244);
        setField(term159240, term159240.getClass(), "label", null);
        setElement(term159239, 0, term159240);
        setBooleanField(term159247, term159247.getClass(), "directed", true);
        setIntField(term159247, term159247.getClass(), "source", -1552163);
        setIntField(term159247, term159247.getClass(), "target", 1910529730);
        setElement(term159251, 0, term159252);
        setElement(term159251, 1, term159254);
        setElement(term159251, 2, term159256);
        setElement(term159251, 3, term159258);
        setElement(term159251, 4, term159260);
        setElement(term159251, 5, term159262);
        setElement(term159251, 6, term159264);
        setElement(term159251, 7, term159266);
        setField(term159247, term159247.getClass(), "data", term159251);
        setField(term159247, term159247.getClass(), "label", null);
        setElement(term159239, 1, term159247);
        setBooleanField(term159268, term159268.getClass(), "directed", true);
        setIntField(term159268, term159268.getClass(), "source", -2051158496);
        setIntField(term159268, term159268.getClass(), "target", -1520769868);
        setElement(term159272, 0, term159273);
        setElement(term159272, 1, term159275);
        setElement(term159272, 2, term159277);
        setField(term159268, term159268.getClass(), "data", term159272);
        setField(term159268, term159268.getClass(), "label", null);
        setElement(term159239, 2, term159268);
        setBooleanField(term159279, term159279.getClass(), "directed", true);
        setIntField(term159279, term159279.getClass(), "source", 1822305633);
        setIntField(term159279, term159279.getClass(), "target", 301716836);
        setElement(term159283, 0, term159284);
        setElement(term159283, 1, term159286);
        setElement(term159283, 2, term159288);
        setElement(term159283, 3, term159290);
        setField(term159279, term159279.getClass(), "data", term159283);
        setField(term159279, term159279.getClass(), "label", null);
        setElement(term159239, 3, term159279);
        setBooleanField(term159292, term159292.getClass(), "directed", false);
        setIntField(term159292, term159292.getClass(), "source", -889459859);
        setIntField(term159292, term159292.getClass(), "target", -1542697894);
        setElement(term159296, 0, term159297);
        setElement(term159296, 1, term159299);
        setElement(term159296, 2, term159301);
        setElement(term159296, 3, term159303);
        setElement(term159296, 4, term159305);
        setElement(term159296, 5, term159307);
        setElement(term159296, 6, term159309);
        setField(term159292, term159292.getClass(), "data", term159296);
        setField(term159292, term159292.getClass(), "label", null);
        setElement(term159239, 4, term159292);
        setField(term159228, term159228.getClass(), "edges", term159239);
        setLongField(term159228, term159228.getClass(), "finalNrOfEdges", -7370364068296402536L);
        setDoubleField(term159312, term159312.getClass(), "value", 0.9510160790897217);
        setField(term159312, term159312.getClass(), "this$0", null);
        setField(term159228, term159228.getClass(), "totalWeight", term159312);
        setBooleanField(term159228, term159228.getClass(), "calculated", true);
        setField(term159228, term159228.getClass(), "graph", null);
        setBooleanField(term159228, term159228.getClass(), "directed", false);
        term159316 = new Double(0.5179928544112168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term159228;
        args[1] = term159316;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


