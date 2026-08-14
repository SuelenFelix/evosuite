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

public class Semester_hashCode_9207913842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1045;

    public Semester_hashCode_9207913842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1045 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Semester"));
        Object term1059 = newInstance(Class.forName("java.sql.Date"));
        Object term1061 = newInstance(Class.forName("java.sql.Date"));
        setIntField(term1045, term1045.getClass(), "id", -1339778481);
        setField(term1045, term1045.getClass(), "name", "LQFpaHEwXR");
        setLongField(term1059, term1059.getClass(), "fastTime", 1610940182830L);
        setField(term1059, term1059.getClass(), "cdate", null);
        setField(term1045, term1045.getClass(), "begin", term1059);
        setLongField(term1061, term1061.getClass(), "fastTime", 1606045635837L);
        setField(term1061, term1061.getClass(), "cdate", null);
        setField(term1045, term1045.getClass(), "end", term1061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.Semester");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1045, args);
    }

};


