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

public class AssignmentId_hashCode_8480145248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public AssignmentId_hashCode_8480145248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term120 = new Integer(-1685132342);
        Integer term122 = new Integer(-1456670397);
        term119 = newInstance(Class.forName("com.pfa.app.model.id.AssignmentId"));
        Object term124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119, term119.getClass(), "employeeId", term120);
        setField(term119, term119.getClass(), "projectId", term122);
        setIntField(term125, term125.getClass(), "year", 2029);
        setShortField(term125, term125.getClass(), "month", (short) 8);
        setShortField(term125, term125.getClass(), "day", (short) 29);
        setField(term124, term124.getClass(), "date", term125);
        setByteField(term129, term129.getClass(), "hour", (byte) 15);
        setByteField(term129, term129.getClass(), "minute", (byte) 50);
        setByteField(term129, term129.getClass(), "second", (byte) 1);
        setIntField(term129, term129.getClass(), "nano", 277971904);
        setField(term124, term124.getClass(), "time", term129);
        setField(term119, term119.getClass(), "commitDate", term124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.id.AssignmentId");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term119, args);
    }

};


