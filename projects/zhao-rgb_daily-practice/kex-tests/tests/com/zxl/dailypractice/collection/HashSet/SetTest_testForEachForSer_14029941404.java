package com.zxl.dailypractice.collection.HashSet;

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
import static com.zxl.dailypractice.collection.HashSet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SetTest_testForEachForSer_14029941404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122;
     Object term127;

    public SetTest_testForEachForSer_14029941404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term123 = new ArrayList();
        term122 = newInstance(Class.forName("com.zxl.dailypractice.collection.HashSet.SetTest"));
        setField(term122, term122.getClass(), "students", term123);
        HashMap term153 = new HashMap();
        Set<Object> term187 =  ((Map) term153).keySet();
        HashSet term152 = new HashSet((Collection<? extends Object>) term187);
        term127 = newInstance(Class.forName("com.zxl.dailypractice.collection.HashSet.PD"));
        setField(term127, term127.getClass(), "id", "EGtDIRbSSb");
        setField(term127, term127.getClass(), "name", "SzjVpOQTyS");
        setField(term127, term127.getClass(), "students", term152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.collection.HashSet.SetTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.collection.HashSet.PD");
        Object[] args = new Object[1];
        args[0] = term127;
        callMethod(klass, "testForEachForSer", argTypes, term122, args);
    }

};


