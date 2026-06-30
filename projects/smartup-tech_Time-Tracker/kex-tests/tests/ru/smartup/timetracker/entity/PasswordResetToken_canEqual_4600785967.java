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

public class PasswordResetToken_canEqual_4600785967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110563;
     Object term110580;

    public PasswordResetToken_canEqual_4600785967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110563 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term110577 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110563, term110563.getClass(), "employeeId", 1671229683);
        setField(term110563, term110563.getClass(), "token", "BMMonTIZgJ");
        setIntField(term110577, term110577.getClass(), "nanos", 622000000);
        setLongField(term110577, term110577.getClass(), "fastTime", 1462729419000L);
        setField(term110577, term110577.getClass(), "cdate", null);
        setField(term110563, term110563.getClass(), "tokenExpiry", term110577);
        term110580 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term110580;
        callMethod(klass, "canEqual", argTypes, term110563, args);
    }

};


