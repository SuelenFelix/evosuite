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

public class AssignmentId_setProjectId_17540385855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term77;

    public AssignmentId_setProjectId_17540385855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term63 = new Integer(-1339778481);
        Integer term65 = new Integer(1725571209);
        term62 = newInstance(Class.forName("com.pfa.app.model.id.AssignmentId"));
        Object term67 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term62, term62.getClass(), "employeeId", term63);
        setField(term62, term62.getClass(), "projectId", term65);
        setIntField(term68, term68.getClass(), "year", 2022);
        setShortField(term68, term68.getClass(), "month", (short) 2);
        setShortField(term68, term68.getClass(), "day", (short) 26);
        setField(term67, term67.getClass(), "date", term68);
        setByteField(term72, term72.getClass(), "hour", (byte) 11);
        setByteField(term72, term72.getClass(), "minute", (byte) 42);
        setByteField(term72, term72.getClass(), "second", (byte) 15);
        setIntField(term72, term72.getClass(), "nano", 377731937);
        setField(term67, term67.getClass(), "time", term72);
        setField(term62, term62.getClass(), "commitDate", term67);
        term77 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.id.AssignmentId");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term77;
        callMethod(klass, "setProjectId", argTypes, term62, args);
    }

};


