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

public class Student_hashCode_15144158012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2192;

    public Student_hashCode_15144158012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2192 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Student"));
        Object term2193 = newInstance(Class.forName("java.sql.Date"));
        Object term2195 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Major"));
        Object term2209 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Department"));
        setLongField(term2193, term2193.getClass(), "fastTime", 1515890130018L);
        setField(term2193, term2193.getClass(), "cdate", null);
        setField(term2192, term2192.getClass(), "enrolledDate", term2193);
        setIntField(term2195, term2195.getClass(), "id", -157887805);
        setField(term2195, term2195.getClass(), "name", "YRHGsAkhxb");
        setIntField(term2209, term2209.getClass(), "id", 1876565163);
        setField(term2209, term2209.getClass(), "name", "ffYhPOzlUs");
        setField(term2195, term2195.getClass(), "department", term2209);
        setField(term2192, term2192.getClass(), "major", term2195);
        setIntField(term2192, term2192.getClass(), "id", -817164822);
        setField(term2192, term2192.getClass(), "fullName", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2192, args);
    }

};


