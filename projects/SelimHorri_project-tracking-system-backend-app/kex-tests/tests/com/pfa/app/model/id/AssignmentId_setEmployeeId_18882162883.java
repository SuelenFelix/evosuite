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

public class AssignmentId_setEmployeeId_18882162883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;
     Object term45;

    public AssignmentId_setEmployeeId_18882162883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31 = new Integer(-1922583790);
        Integer term33 = new Integer(-616727354);
        term30 = newInstance(Class.forName("com.pfa.app.model.id.AssignmentId"));
        Object term35 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30, term30.getClass(), "employeeId", term31);
        setField(term30, term30.getClass(), "projectId", term33);
        setIntField(term36, term36.getClass(), "year", 2015);
        setShortField(term36, term36.getClass(), "month", (short) 9);
        setShortField(term36, term36.getClass(), "day", (short) 19);
        setField(term35, term35.getClass(), "date", term36);
        setByteField(term40, term40.getClass(), "hour", (byte) 9);
        setByteField(term40, term40.getClass(), "minute", (byte) 4);
        setByteField(term40, term40.getClass(), "second", (byte) 10);
        setIntField(term40, term40.getClass(), "nano", 401765865);
        setField(term35, term35.getClass(), "time", term40);
        setField(term30, term30.getClass(), "commitDate", term35);
        term45 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.id.AssignmentId");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term45;
        callMethod(klass, "setEmployeeId", argTypes, term30, args);
    }

};


