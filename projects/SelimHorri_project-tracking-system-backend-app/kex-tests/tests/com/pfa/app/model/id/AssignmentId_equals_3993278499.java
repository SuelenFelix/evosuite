package com.pfa.app.model.id;

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
import static com.pfa.app.model.id.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class AssignmentId_equals_3993278499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;
     Object term149;

    public AssignmentId_equals_3993278499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term135 = new Integer(1622346318);
        Integer term137 = new Integer(1048535127);
        term134 = newInstance(Class.forName("com.pfa.app.model.id.AssignmentId"));
        Object term139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term134, term134.getClass(), "employeeId", term135);
        setField(term134, term134.getClass(), "projectId", term137);
        setIntField(term140, term140.getClass(), "year", 2022);
        setShortField(term140, term140.getClass(), "month", (short) 11);
        setShortField(term140, term140.getClass(), "day", (short) 16);
        setField(term139, term139.getClass(), "date", term140);
        setByteField(term144, term144.getClass(), "hour", (byte) 15);
        setByteField(term144, term144.getClass(), "minute", (byte) 54);
        setByteField(term144, term144.getClass(), "second", (byte) 2);
        setIntField(term144, term144.getClass(), "nano", 733274103);
        setField(term139, term139.getClass(), "time", term144);
        setField(term134, term134.getClass(), "commitDate", term139);
        term149 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.id.AssignmentId");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term149;
        callMethod(klass, "equals", argTypes, term134, args);
    }

};


