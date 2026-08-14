package cn.edu.sustech.cs307.dto;

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
import static cn.edu.sustech.cs307.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Semester_equals_4721047091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1016;
     Object term1034;

    public Semester_equals_4721047091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1016 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Semester"));
        Object term1030 = newInstance(Class.forName("java.sql.Date"));
        Object term1032 = newInstance(Class.forName("java.sql.Date"));
        setIntField(term1016, term1016.getClass(), "id", 1227103734);
        setField(term1016, term1016.getClass(), "name", "MxlszYVzRf");
        setLongField(term1030, term1030.getClass(), "fastTime", 1345871412244L);
        setField(term1030, term1030.getClass(), "cdate", null);
        setField(term1016, term1016.getClass(), "begin", term1030);
        setLongField(term1032, term1032.getClass(), "fastTime", 1480438351369L);
        setField(term1032, term1032.getClass(), "cdate", null);
        setField(term1016, term1016.getClass(), "end", term1032);
        term1034 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.Semester");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1034;
        callMethod(klass, "equals", argTypes, term1016, args);
    }

};


