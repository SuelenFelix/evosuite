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
import java.lang.Double;

public class EdgeArray_init_7196666613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943;

    public EdgeArray_init_7196666613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term954 = new Double(0.13238746331190498);
        Double term956 = new Double(0.3455959125047594);
        Double term963 = new Double(0.5523635872663106);
        Double term965 = new Double(0.544608645520025);
        Double term972 = new Double(0.28570734989730284);
        Double term974 = new Double(0.40176586625454525);
        Double term976 = new Double(0.2641345529914265);
        Double term978 = new Double(0.36923381893433327);
        Double term980 = new Double(0.6076495596892013);
        Double term982 = new Double(0.37773193782763337);
        Double term984 = new Double(0.8474802076607362);
        Double term986 = new Double(0.5183269973490326);
        Double term988 = new Double(0.7655020693602768);
        Double term995 = new Double(0.1374549299694151);
        Double term997 = new Double(0.7031006357544823);
        Double term999 = new Double(0.9527281779865117);
        Double term1006 = new Double(0.9828442029246764);
        Double term1008 = new Double(0.2779719046761513);
        Double term1010 = new Double(0.6436713023569729);
        Double term1012 = new Double(0.7332741045694002);
        Double term1014 = new Double(0.4569171842750229);
        Double term1016 = new Double(0.8598297828918529);
        Double term1018 = new Double(0.43692187681405226);
        Double term1025 = new Double(0.7633268466829064);
        Double term1027 = new Double(0.13481025392611334);
        Double term1029 = new Double(0.3800088629986428);
        Double term1031 = new Double(0.5840714198152577);
        Double term1033 = new Double(0.7559240768573477);
        Double term1040 = new Double(0.10667076642995188);
        Double term1042 = new Double(0.11493000848982304);
        Double term1044 = new Double(0.37161417339133307);
        Double term1046 = new Double(0.6805867182029153);
        term943 = (Object[]) newArray("org.graph4j.Edge", 8);
        Object term944 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term948 = (Object[]) newArray("java.lang.Double", 0);
        Object term949 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term953 = (Object[]) newArray("java.lang.Double", 2);
        Object term958 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term962 = (Object[]) newArray("java.lang.Double", 2);
        Object term967 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term971 = (Object[]) newArray("java.lang.Double", 9);
        Object term990 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term994 = (Object[]) newArray("java.lang.Double", 3);
        Object term1001 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1005 = (Object[]) newArray("java.lang.Double", 7);
        Object term1020 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1024 = (Object[]) newArray("java.lang.Double", 5);
        Object term1035 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1039 = (Object[]) newArray("java.lang.Double", 4);
        setBooleanField(term944, term944.getClass(), "directed", true);
        setIntField(term944, term944.getClass(), "source", -634976996);
        setIntField(term944, term944.getClass(), "target", -1015274146);
        setField(term944, term944.getClass(), "data", term948);
        setField(term944, term944.getClass(), "label", null);
        setElement(term943, 0, term944);
        setBooleanField(term949, term949.getClass(), "directed", false);
        setIntField(term949, term949.getClass(), "source", -49052672);
        setIntField(term949, term949.getClass(), "target", 339372704);
        setElement(term953, 0, term954);
        setElement(term953, 1, term956);
        setField(term949, term949.getClass(), "data", term953);
        setField(term949, term949.getClass(), "label", null);
        setElement(term943, 1, term949);
        setBooleanField(term958, term958.getClass(), "directed", true);
        setIntField(term958, term958.getClass(), "source", -851097944);
        setIntField(term958, term958.getClass(), "target", 803925431);
        setElement(term962, 0, term963);
        setElement(term962, 1, term965);
        setField(term958, term958.getClass(), "data", term962);
        setField(term958, term958.getClass(), "label", null);
        setElement(term943, 2, term958);
        setBooleanField(term967, term967.getClass(), "directed", false);
        setIntField(term967, term967.getClass(), "source", 76929641);
        setIntField(term967, term967.getClass(), "target", -2003192918);
        setElement(term971, 0, term972);
        setElement(term971, 1, term974);
        setElement(term971, 2, term976);
        setElement(term971, 3, term978);
        setElement(term971, 4, term980);
        setElement(term971, 5, term982);
        setElement(term971, 6, term984);
        setElement(term971, 7, term986);
        setElement(term971, 8, term988);
        setField(term967, term967.getClass(), "data", term971);
        setField(term967, term967.getClass(), "label", null);
        setElement(term943, 3, term967);
        setBooleanField(term990, term990.getClass(), "directed", true);
        setIntField(term990, term990.getClass(), "source", -1362856620);
        setIntField(term990, term990.getClass(), "target", -1835839814);
        setElement(term994, 0, term995);
        setElement(term994, 1, term997);
        setElement(term994, 2, term999);
        setField(term990, term990.getClass(), "data", term994);
        setField(term990, term990.getClass(), "label", null);
        setElement(term943, 4, term990);
        setBooleanField(term1001, term1001.getClass(), "directed", false);
        setIntField(term1001, term1001.getClass(), "source", -1404350380);
        setIntField(term1001, term1001.getClass(), "target", -2013924238);
        setElement(term1005, 0, term1006);
        setElement(term1005, 1, term1008);
        setElement(term1005, 2, term1010);
        setElement(term1005, 3, term1012);
        setElement(term1005, 4, term1014);
        setElement(term1005, 5, term1016);
        setElement(term1005, 6, term1018);
        setField(term1001, term1001.getClass(), "data", term1005);
        setField(term1001, term1001.getClass(), "label", null);
        setElement(term943, 5, term1001);
        setBooleanField(term1020, term1020.getClass(), "directed", false);
        setIntField(term1020, term1020.getClass(), "source", 579006268);
        setIntField(term1020, term1020.getClass(), "target", -1694747156);
        setElement(term1024, 0, term1025);
        setElement(term1024, 1, term1027);
        setElement(term1024, 2, term1029);
        setElement(term1024, 3, term1031);
        setElement(term1024, 4, term1033);
        setField(term1020, term1020.getClass(), "data", term1024);
        setField(term1020, term1020.getClass(), "label", null);
        setElement(term943, 6, term1020);
        setBooleanField(term1035, term1035.getClass(), "directed", true);
        setIntField(term1035, term1035.getClass(), "source", 1466373988);
        setIntField(term1035, term1035.getClass(), "target", -358526505);
        setElement(term1039, 0, term1040);
        setElement(term1039, 1, term1042);
        setElement(term1039, 2, term1044);
        setElement(term1039, 3, term1046);
        setField(term1035, term1035.getClass(), "data", term1039);
        setField(term1035, term1035.getClass(), "label", null);
        setElement(term943, 7, term1035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term943;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


