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

public class PasswordResetToken_hashCode_17129279008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110591;

    public PasswordResetToken_hashCode_17129279008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110591 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term110605 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110591, term110591.getClass(), "employeeId", 34167717);
        setField(term110591, term110591.getClass(), "token", "QXyFXBjFde");
        setIntField(term110605, term110605.getClass(), "nanos", 564000000);
        setLongField(term110605, term110605.getClass(), "fastTime", 1387548056000L);
        setField(term110605, term110605.getClass(), "cdate", null);
        setField(term110591, term110591.getClass(), "tokenExpiry", term110605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term110591, args);
    }

};


