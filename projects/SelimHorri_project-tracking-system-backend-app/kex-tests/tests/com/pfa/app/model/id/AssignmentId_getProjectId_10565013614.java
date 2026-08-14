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

public class AssignmentId_getProjectId_10565013614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;

    public AssignmentId_getProjectId_10565013614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48 = new Integer(-2038273078);
        Integer term50 = new Integer(1227103734);
        term47 = newInstance(Class.forName("com.pfa.app.model.id.AssignmentId"));
        Object term52 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term47, term47.getClass(), "employeeId", term48);
        setField(term47, term47.getClass(), "projectId", term50);
        setIntField(term53, term53.getClass(), "year", 2015);
        setShortField(term53, term53.getClass(), "month", (short) 4);
        setShortField(term53, term53.getClass(), "day", (short) 14);
        setField(term52, term52.getClass(), "date", term53);
        setByteField(term57, term57.getClass(), "hour", (byte) 18);
        setByteField(term57, term57.getClass(), "minute", (byte) 24);
        setByteField(term57, term57.getClass(), "second", (byte) 32);
        setIntField(term57, term57.getClass(), "nano", 369233818);
        setField(term52, term52.getClass(), "time", term57);
        setField(term47, term47.getClass(), "commitDate", term52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.id.AssignmentId");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term47, args);
    }

};


