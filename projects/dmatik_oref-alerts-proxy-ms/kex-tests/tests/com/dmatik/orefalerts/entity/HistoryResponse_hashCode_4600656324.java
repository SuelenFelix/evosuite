package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HistoryResponse_hashCode_4600656324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7216;

    public HistoryResponse_hashCode_4600656324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7216 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryResponse"));
        Object[] term7217 = (Object[]) newArray("com.dmatik.orefalerts.entity.HistoryItem", 6);
        Object term7218 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term7256 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term7294 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term7332 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term7370 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term7408 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term7218, term7218.getClass(), "alertDate", "rIPMBcrNqB");
        setField(term7218, term7218.getClass(), "title", "UDaboHZHhz");
        setField(term7218, term7218.getClass(), "data", "nRvKihUSPj");
        setIntField(term7218, term7218.getClass(), "category", -469968304);
        setElement(term7217, 0, term7218);
        setField(term7256, term7256.getClass(), "alertDate", "BbNeQJpYPr");
        setField(term7256, term7256.getClass(), "title", "riMtzCoxNj");
        setField(term7256, term7256.getClass(), "data", "YAXkVjQZcV");
        setIntField(term7256, term7256.getClass(), "category", -1145578966);
        setElement(term7217, 1, term7256);
        setField(term7294, term7294.getClass(), "alertDate", "pumvwBWvpy");
        setField(term7294, term7294.getClass(), "title", "HwLHeGLyhe");
        setField(term7294, term7294.getClass(), "data", "RDnkgWkcbz");
        setIntField(term7294, term7294.getClass(), "category", 679763016);
        setElement(term7217, 2, term7294);
        setField(term7332, term7332.getClass(), "alertDate", "IBpaxltauX");
        setField(term7332, term7332.getClass(), "title", "hePqROaplw");
        setField(term7332, term7332.getClass(), "data", "PJcSNDruWd");
        setIntField(term7332, term7332.getClass(), "category", 1962444399);
        setElement(term7217, 3, term7332);
        setField(term7370, term7370.getClass(), "alertDate", "VVNNlAePXF");
        setField(term7370, term7370.getClass(), "title", "jnwVnmKAFv");
        setField(term7370, term7370.getClass(), "data", "TXyHhqeCjR");
        setIntField(term7370, term7370.getClass(), "category", 767834723);
        setElement(term7217, 4, term7370);
        setField(term7408, term7408.getClass(), "alertDate", "lZIgPZPgTu");
        setField(term7408, term7408.getClass(), "title", "iuCxnHGMoW");
        setField(term7408, term7408.getClass(), "data", "GPSEWEDSTo");
        setIntField(term7408, term7408.getClass(), "category", -602026508);
        setElement(term7217, 5, term7408);
        setField(term7216, term7216.getClass(), "history", term7217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7216, args);
    }

};


