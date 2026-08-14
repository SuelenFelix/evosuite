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

public class AssignmentId_setCommitDate_7668271157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;
     Object term109;

    public AssignmentId_setCommitDate_7668271157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term95 = new Integer(1585847225);
        Integer term97 = new Integer(597278769);
        term94 = newInstance(Class.forName("com.pfa.app.model.id.AssignmentId"));
        Object term99 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term94, term94.getClass(), "employeeId", term95);
        setField(term94, term94.getClass(), "projectId", term97);
        setIntField(term100, term100.getClass(), "year", 2025);
        setShortField(term100, term100.getClass(), "month", (short) 4);
        setShortField(term100, term100.getClass(), "day", (short) 24);
        setField(term99, term99.getClass(), "date", term100);
        setByteField(term104, term104.getClass(), "hour", (byte) 18);
        setByteField(term104, term104.getClass(), "minute", (byte) 11);
        setByteField(term104, term104.getClass(), "second", (byte) 40);
        setIntField(term104, term104.getClass(), "nano", 137454929);
        setField(term99, term99.getClass(), "time", term104);
        setField(term94, term94.getClass(), "commitDate", term99);
        term109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term110, term110.getClass(), "year", 2024);
        setShortField(term110, term110.getClass(), "month", (short) 1);
        setShortField(term110, term110.getClass(), "day", (short) 24);
        setField(term109, term109.getClass(), "date", term110);
        setByteField(term114, term114.getClass(), "hour", (byte) 20);
        setByteField(term114, term114.getClass(), "minute", (byte) 28);
        setByteField(term114, term114.getClass(), "second", (byte) 39);
        setIntField(term114, term114.getClass(), "nano", 952728177);
        setField(term109, term109.getClass(), "time", term114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.id.AssignmentId");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term109;
        callMethod(klass, "setCommitDate", argTypes, term94, args);
    }

};


