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

public class AssignmentId_getCommitDate_11764423256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;

    public AssignmentId_getCommitDate_11764423256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term80 = new Integer(1134449235);
        Integer term82 = new Integer(-883034806);
        term79 = newInstance(Class.forName("com.pfa.app.model.id.AssignmentId"));
        Object term84 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term79, term79.getClass(), "employeeId", term80);
        setField(term79, term79.getClass(), "projectId", term82);
        setIntField(term85, term85.getClass(), "year", 2026);
        setShortField(term85, term85.getClass(), "month", (short) 12);
        setShortField(term85, term85.getClass(), "day", (short) 14);
        setField(term84, term84.getClass(), "date", term85);
        setByteField(term89, term89.getClass(), "hour", (byte) 16);
        setByteField(term89, term89.getClass(), "minute", (byte) 34);
        setByteField(term89, term89.getClass(), "second", (byte) 9);
        setIntField(term89, term89.getClass(), "nano", 518326996);
        setField(term84, term84.getClass(), "time", term89);
        setField(term79, term79.getClass(), "commitDate", term84);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.id.AssignmentId");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommitDate", argTypes, term79, args);
    }

};


