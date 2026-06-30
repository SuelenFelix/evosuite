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

public class PasswordResetToken_getToken_1892138091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110373;

    public PasswordResetToken_getToken_1892138091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110373 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term110387 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110373, term110373.getClass(), "employeeId", -1367122405);
        setField(term110373, term110373.getClass(), "token", "FrTZLybkKk");
        setIntField(term110387, term110387.getClass(), "nanos", 362000000);
        setLongField(term110387, term110387.getClass(), "fastTime", 1572161779000L);
        setField(term110387, term110387.getClass(), "cdate", null);
        setField(term110373, term110373.getClass(), "tokenExpiry", term110387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term110373, args);
    }

};


