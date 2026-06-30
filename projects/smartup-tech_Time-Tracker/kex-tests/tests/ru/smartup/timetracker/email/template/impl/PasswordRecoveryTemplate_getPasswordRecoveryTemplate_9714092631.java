package ru.smartup.timetracker.email.template.impl;

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
import static ru.smartup.timetracker.email.template.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PasswordRecoveryTemplate_getPasswordRecoveryTemplate_9714092631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1174;
     Object term1187;

    public PasswordRecoveryTemplate_getPasswordRecoveryTemplate_9714092631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1174 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.PasswordRecoveryTemplate"));
        setField(term1174, term1174.getClass(), "passwordRecoveryLink", "jJCZpVmanW");
        term1187 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticePersonalToken"));
        setField(term1187, term1187.getClass(), "employeeName", "EGtDIRbSSb");
        setField(term1187, term1187.getClass(), "token", "SzjVpOQTyS");
        setLongField(term1187, term1187.getClass(), "ttlInHours", -8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.PasswordRecoveryTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticePersonalToken");
        Object[] args = new Object[1];
        args[0] = term1187;
        callMethod(klass, "getPasswordRecoveryTemplate", argTypes, term1174, args);
    }

};


