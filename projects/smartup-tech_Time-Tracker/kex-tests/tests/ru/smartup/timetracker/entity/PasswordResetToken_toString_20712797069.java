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

public class PasswordResetToken_toString_20712797069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110618;

    public PasswordResetToken_toString_20712797069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110618 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term110632 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110618, term110618.getClass(), "employeeId", -514195141);
        setField(term110618, term110618.getClass(), "token", "xVFgeyYxZS");
        setIntField(term110632, term110632.getClass(), "nanos", 766000000);
        setLongField(term110632, term110632.getClass(), "fastTime", 1612509877000L);
        setField(term110632, term110632.getClass(), "cdate", null);
        setField(term110618, term110618.getClass(), "tokenExpiry", term110632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term110618, args);
    }

};


