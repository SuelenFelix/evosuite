package com.zxl.dailypractice.structure;

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
import static com.zxl.dailypractice.structure.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class StudentSystem_displayStudent_20351311246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2624;

    public StudentSystem_displayStudent_20351311246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2627 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term2627, term2627.getClass(), "id", "XylxrMBraH");
        setField(term2627, term2627.getClass(), "name", "pORebkoRdD");
        setField(term2627, term2627.getClass(), "gender", "mXGCWJDOqA");
        setField(term2627, term2627.getClass(), "age", "dpNsDgfPso");
        setField(term2627, term2627.getClass(), "zy", "hCWPJQKpdc");
        setField(term2627, term2627.getClass(), "score", "WzMEhMXkKx");
        Object term2701 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term2701, term2701.getClass(), "id", "");
        setField(term2701, term2701.getClass(), "name", "");
        setField(term2701, term2701.getClass(), "gender", "");
        setField(term2701, term2701.getClass(), "age", "");
        setField(term2701, term2701.getClass(), "zy", "");
        setField(term2701, term2701.getClass(), "score", "");
        Object term2709 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term2709, term2709.getClass(), "id", null);
        setField(term2709, term2709.getClass(), "name", null);
        setField(term2709, term2709.getClass(), "gender", null);
        setField(term2709, term2709.getClass(), "age", null);
        setField(term2709, term2709.getClass(), "zy", null);
        setField(term2709, term2709.getClass(), "score", null);
        term2624 = new LinkedList();
        ((LinkedList) term2624).add(term2627);
        ((LinkedList) term2624).add(term2701);
        ((LinkedList) term2624).add(term2709);
        ((LinkedList) term2624).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.StudentSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2624;
        callMethod(klass, "displayStudent", argTypes, null, args);
    }

};


