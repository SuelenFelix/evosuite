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

public class PasswordResetToken_equals_12642412256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110535;
     Object term110552;

    public PasswordResetToken_equals_12642412256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110535 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term110549 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110535, term110535.getClass(), "employeeId", 1545119095);
        setField(term110535, term110535.getClass(), "token", "HmEvTlmzXo");
        setIntField(term110549, term110549.getClass(), "nanos", 437000000);
        setLongField(term110549, term110549.getClass(), "fastTime", 1693288480000L);
        setField(term110549, term110549.getClass(), "cdate", null);
        setField(term110535, term110535.getClass(), "tokenExpiry", term110549);
        term110552 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term110552;
        callMethod(klass, "equals", argTypes, term110535, args);
    }

};


