package ru.smartup.timetracker.service;

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
import static ru.smartup.timetracker.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PasswordResetTokenService_deletePasswordResetToken_2138598604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23463;

    public PasswordResetTokenService_deletePasswordResetToken_2138598604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23463 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term23477 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term23463, term23463.getClass(), "employeeId", 794568325);
        setField(term23463, term23463.getClass(), "token", "gltJarNuUk");
        setIntField(term23477, term23477.getClass(), "nanos", 21000000);
        setLongField(term23477, term23477.getClass(), "fastTime", 1791283637000L);
        setField(term23477, term23477.getClass(), "cdate", null);
        setField(term23463, term23463.getClass(), "tokenExpiry", term23477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.PasswordResetTokenService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Object[] args = new Object[1];
        args[0] = term23463;
        callMethod(klass, "deletePasswordResetToken", argTypes, null, args);
    }

};


