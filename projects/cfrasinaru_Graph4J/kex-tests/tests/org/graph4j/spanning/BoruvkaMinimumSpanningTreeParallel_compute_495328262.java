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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class BoruvkaMinimumSpanningTreeParallel_compute_495328262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152;

    public BoruvkaMinimumSpanningTreeParallel_compute_495328262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1159 = new Double(0.08858836329417497);
        Double term1166 = new Double(0.8582456540284578);
        Double term1168 = new Double(0.061434557058998585);
        Double term1175 = new Double(0.1621025751381594);
        Double term1177 = new Double(0.8809657273235505);
        Double term1179 = new Double(0.33296332053567956);
        Double term1181 = new Double(0.593079122289713);
        Double term1183 = new Double(0.7455431255888774);
        Double term1185 = new Double(0.9459012738750242);
        Double term1187 = new Double(0.967474946781822);
        Double term1194 = new Double(0.4429892630967539);
        Double term1196 = new Double(0.10126144382177782);
        Double term1198 = new Double(0.5029736700336335);
        Double term1205 = new Double(0.2617673558897229);
        Double term1207 = new Double(0.052590327313127294);
        Double term1209 = new Double(0.004207750553928968);
        Double term1216 = new Double(0.9107074560109533);
        Double term1218 = new Double(0.22308265923522352);
        Double term1220 = new Double(0.46226950865842764);
        Double term1222 = new Double(0.6482086250011448);
        HashMap term1232 = new HashMap();
        Set<Object> term1258 =  ((Map) term1232).keySet();
        HashSet term1231 = new HashSet((Collection<? extends Object>) term1258);
        term1152 = newInstance(Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeParallel"));
        Object[] term1153 = (Object[]) newArray("org.graph4j.Edge", 6);
        Object term1154 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1158 = (Object[]) newArray("java.lang.Double", 1);
        Object term1161 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1165 = (Object[]) newArray("java.lang.Double", 2);
        Object term1170 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1174 = (Object[]) newArray("java.lang.Double", 7);
        Object term1189 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1193 = (Object[]) newArray("java.lang.Double", 3);
        Object term1200 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1204 = (Object[]) newArray("java.lang.Double", 3);
        Object term1211 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1215 = (Object[]) newArray("java.lang.Double", 4);
        Object term1225 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term1226 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1228 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1229 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term1244 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        Object[] term1248 = (Object[]) newArray("org.graph4j.Edge", 2);
        Object term1249 = newInstance(Class.forName("org.graph4j.Edge"));
        Object term1253 = newInstance(Class.forName("org.graph4j.Edge"));
        setBooleanField(term1154, term1154.getClass(), "directed", true);
        setIntField(term1154, term1154.getClass(), "source", -519881101);
        setIntField(term1154, term1154.getClass(), "target", -680920524);
        setElement(term1158, 0, term1159);
        setField(term1154, term1154.getClass(), "data", term1158);
        setField(term1154, term1154.getClass(), "label", null);
        setElement(term1153, 0, term1154);
        setBooleanField(term1161, term1161.getClass(), "directed", false);
        setIntField(term1161, term1161.getClass(), "source", -916335264);
        setIntField(term1161, term1161.getClass(), "target", -919416536);
        setElement(term1165, 0, term1166);
        setElement(term1165, 1, term1168);
        setField(term1161, term1161.getClass(), "data", term1165);
        setField(term1161, term1161.getClass(), "label", null);
        setElement(term1153, 1, term1161);
        setBooleanField(term1170, term1170.getClass(), "directed", false);
        setIntField(term1170, term1170.getClass(), "source", -43417861);
        setIntField(term1170, term1170.getClass(), "target", -1533843432);
        setElement(term1174, 0, term1175);
        setElement(term1174, 1, term1177);
        setElement(term1174, 2, term1179);
        setElement(term1174, 3, term1181);
        setElement(term1174, 4, term1183);
        setElement(term1174, 5, term1185);
        setElement(term1174, 6, term1187);
        setField(term1170, term1170.getClass(), "data", term1174);
        setField(term1170, term1170.getClass(), "label", null);
        setElement(term1153, 2, term1170);
        setBooleanField(term1189, term1189.getClass(), "directed", false);
        setIntField(term1189, term1189.getClass(), "source", -123338791);
        setIntField(term1189, term1189.getClass(), "target", -1467089634);
        setElement(term1193, 0, term1194);
        setElement(term1193, 1, term1196);
        setElement(term1193, 2, term1198);
        setField(term1189, term1189.getClass(), "data", term1193);
        setField(term1189, term1189.getClass(), "label", null);
        setElement(term1153, 3, term1189);
        setBooleanField(term1200, term1200.getClass(), "directed", false);
        setIntField(term1200, term1200.getClass(), "source", 413548937);
        setIntField(term1200, term1200.getClass(), "target", 1901317214);
        setElement(term1204, 0, term1205);
        setElement(term1204, 1, term1207);
        setElement(term1204, 2, term1209);
        setField(term1200, term1200.getClass(), "data", term1204);
        setField(term1200, term1200.getClass(), "label", null);
        setElement(term1153, 4, term1200);
        setBooleanField(term1211, term1211.getClass(), "directed", false);
        setIntField(term1211, term1211.getClass(), "source", 1166710220);
        setIntField(term1211, term1211.getClass(), "target", -1070592289);
        setElement(term1215, 0, term1216);
        setElement(term1215, 1, term1218);
        setElement(term1215, 2, term1220);
        setElement(term1215, 3, term1222);
        setField(term1211, term1211.getClass(), "data", term1215);
        setField(term1211, term1211.getClass(), "label", null);
        setElement(term1153, 5, term1211);
        setField(term1152, term1152.getClass(), "allEdges", term1153);
        setIntField(term1152, term1152.getClass(), "nrThreads", -1464172784);
        setIntField(term1226, term1226.getClass(), "value", 568599855);
        setField(term1225, term1225.getClass(), "ctl", term1226);
        setField(term1225, term1225.getClass(), "workQueue", null);
        setField(term1229, term1229.getClass(), "head", null);
        setField(term1229, term1229.getClass(), "tail", null);
        setIntField(term1229, term1229.getClass(), "state", 0);
        setField(term1229, term1229.getClass(), "exclusiveOwnerThread", null);
        setField(term1228, term1228.getClass(), "sync", term1229);
        setField(term1225, term1225.getClass(), "mainLock", term1228);
        setField(term1225, term1225.getClass(), "workers", term1231);
        setField(term1225, term1225.getClass(), "termination", null);
        setIntField(term1225, term1225.getClass(), "largestPoolSize", 1252951645);
        setLongField(term1225, term1225.getClass(), "completedTaskCount", 6375119433582206027L);
        setField(term1225, term1225.getClass(), "threadFactory", null);
        setField(term1225, term1225.getClass(), "handler", null);
        setLongField(term1225, term1225.getClass(), "keepAliveTime", 0L);
        setBooleanField(term1225, term1225.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term1225, term1225.getClass(), "corePoolSize", 0);
        setIntField(term1225, term1225.getClass(), "maximumPoolSize", 0);
        setField(term1152, term1152.getClass(), "executor", term1225);
        setIntField(term1244, term1244.getClass(), "numVertices", 0);
        setBooleanField(term1244, term1244.getClass(), "pathCompression", false);
        setField(term1244, term1244.getClass(), "parent", null);
        setIntField(term1244, term1244.getClass(), "numSets", 0);
        setField(term1152, term1152.getClass(), "uf", term1244);
        setBooleanField(term1249, term1249.getClass(), "directed", false);
        setIntField(term1249, term1249.getClass(), "source", 0);
        setIntField(term1249, term1249.getClass(), "target", 0);
        setField(term1249, term1249.getClass(), "data", null);
        setField(term1249, term1249.getClass(), "label", null);
        setElement(term1248, 0, term1249);
        setBooleanField(term1253, term1253.getClass(), "directed", false);
        setIntField(term1253, term1253.getClass(), "source", 0);
        setIntField(term1253, term1253.getClass(), "target", 0);
        setField(term1253, term1253.getClass(), "data", null);
        setField(term1253, term1253.getClass(), "label", null);
        setElement(term1248, 1, term1253);
        setField(term1152, term1152.getClass(), "cheapest", term1248);
        setField(term1152, term1152.getClass(), "tree", null);
        setField(term1152, term1152.getClass(), "treeEdges", null);
        setField(term1152, term1152.getClass(), "minWeight", null);
        setField(term1152, term1152.getClass(), "graph", null);
        setBooleanField(term1152, term1152.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeParallel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term1152, args);
    }

};


