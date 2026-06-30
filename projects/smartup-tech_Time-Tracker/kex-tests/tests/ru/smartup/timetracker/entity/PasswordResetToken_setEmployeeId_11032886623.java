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
import java.lang.Integer;

public class PasswordResetToken_setEmployeeId_11032886623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110427;
     Object term110444;

    public PasswordResetToken_setEmployeeId_11032886623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110427 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term110441 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110427, term110427.getClass(), "employeeId", 1104108112);
        setField(term110427, term110427.getClass(), "token", "fgOpAWlGYN");
        setIntField(term110441, term110441.getClass(), "nanos", 811000000);
        setLongField(term110441, term110441.getClass(), "fastTime", 1567902963000L);
        setField(term110441, term110441.getClass(), "cdate", null);
        setField(term110427, term110427.getClass(), "tokenExpiry", term110441);
        term110444 = new Integer(1648665618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term110444;
        callMethod(klass, "setEmployeeId", argTypes, term110427, args);
    }

};


