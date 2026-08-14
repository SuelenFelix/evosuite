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

public class AssignmentId_getEmployeeId_17601650702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;

    public AssignmentId_getEmployeeId_17601650702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16 = new Integer(1484323161);
        Integer term18 = new Integer(391863371);
        term15 = newInstance(Class.forName("com.pfa.app.model.id.AssignmentId"));
        Object term20 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15, term15.getClass(), "employeeId", term16);
        setField(term15, term15.getClass(), "projectId", term18);
        setIntField(term21, term21.getClass(), "year", 2021);
        setShortField(term21, term21.getClass(), "month", (short) 1);
        setShortField(term21, term21.getClass(), "day", (short) 18);
        setField(term20, term20.getClass(), "date", term21);
        setByteField(term25, term25.getClass(), "hour", (byte) 13);
        setByteField(term25, term25.getClass(), "minute", (byte) 38);
        setByteField(term25, term25.getClass(), "second", (byte) 26);
        setIntField(term25, term25.getClass(), "nano", 544608644);
        setField(term20, term20.getClass(), "time", term25);
        setField(term15, term15.getClass(), "commitDate", term20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.id.AssignmentId");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term15, args);
    }

};


