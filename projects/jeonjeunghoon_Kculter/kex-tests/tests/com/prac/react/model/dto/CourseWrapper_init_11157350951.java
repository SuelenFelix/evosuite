package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class CourseWrapper_init_11157350951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13851;
     Object term14070;
     Object term14072;

    public CourseWrapper_init_11157350951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13854 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term13854, term13854.getClass(), "placeNum", -1239406390);
        setField(term13854, term13854.getClass(), "keyHash", "HJwNgUzZZR");
        setIntField(term13854, term13854.getClass(), "placeType", 1557431527);
        setField(term13854, term13854.getClass(), "culture", "FvUCZgTXhq");
        setField(term13854, term13854.getClass(), "kpop", "wWWidPCHzx");
        setDoubleField(term13854, term13854.getClass(), "lat", 0.7171972879282721);
        setDoubleField(term13854, term13854.getClass(), "lng", 0.9006361024877096);
        setIntField(term13854, term13854.getClass(), "status", -1504890659);
        setField(term13854, term13854.getClass(), "name", "OwPIiBRuKK");
        setField(term13854, term13854.getClass(), "explain", "sgfGySMODT");
        setField(term13854, term13854.getClass(), "address", "ndAITnOsny");
        setField(term13854, term13854.getClass(), "fileUrl", "CVZnTiJucs");
        Object term13945 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term13945, term13945.getClass(), "placeNum", 1358829571);
        setField(term13945, term13945.getClass(), "keyHash", "");
        setIntField(term13945, term13945.getClass(), "placeType", 991356662);
        setField(term13945, term13945.getClass(), "culture", "");
        setField(term13945, term13945.getClass(), "kpop", "");
        setDoubleField(term13945, term13945.getClass(), "lat", 0.5644914462415626);
        setDoubleField(term13945, term13945.getClass(), "lng", 0.509895859167191);
        setIntField(term13945, term13945.getClass(), "status", -506958186);
        setField(term13945, term13945.getClass(), "name", "");
        setField(term13945, term13945.getClass(), "explain", "");
        setField(term13945, term13945.getClass(), "address", "");
        setField(term13945, term13945.getClass(), "fileUrl", "");
        Object term13959 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term13959, term13959.getClass(), "placeNum", -507387516);
        setField(term13959, term13959.getClass(), "keyHash", null);
        setIntField(term13959, term13959.getClass(), "placeType", -1970452551);
        setField(term13959, term13959.getClass(), "culture", null);
        setField(term13959, term13959.getClass(), "kpop", null);
        setDoubleField(term13959, term13959.getClass(), "lat", 0.07417792024383196);
        setDoubleField(term13959, term13959.getClass(), "lng", 0.686293604788188);
        setIntField(term13959, term13959.getClass(), "status", -1896376975);
        setField(term13959, term13959.getClass(), "name", null);
        setField(term13959, term13959.getClass(), "explain", null);
        setField(term13959, term13959.getClass(), "address", null);
        setField(term13959, term13959.getClass(), "fileUrl", null);
        term13851 = new LinkedList();
        ((LinkedList) term13851).add(term13854);
        ((LinkedList) term13851).add(term13945);
        ((LinkedList) term13851).add(term13959);
        ((LinkedList) term13851).add((Object)null);
        ((LinkedList) term13851).add((Object)null);
        term14070 = new Integer(-1882480155);
        term14072 = new Integer(-1410220680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term13851;
        args[1] = "mNgDshwZNc";
        args[2] = term14070;
        args[3] = term14072;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


