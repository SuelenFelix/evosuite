package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PasswordResetToken_getEmployeeId_20176684400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110346;

    public PasswordResetToken_getEmployeeId_20176684400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110346 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term110360 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110346, term110346.getClass(), "employeeId", 27043781);
        setField(term110346, term110346.getClass(), "token", "AdYzLPMcwe");
        setIntField(term110360, term110360.getClass(), "nanos", 436000000);
        setLongField(term110360, term110360.getClass(), "fastTime", 1532384192000L);
        setField(term110360, term110360.getClass(), "cdate", null);
        setField(term110346, term110346.getClass(), "tokenExpiry", term110360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term110346, args);
    }

};


