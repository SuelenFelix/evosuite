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
import java.lang.String;
import java.lang.Object;

public class PasswordRecoveryTemplate_getTemplate_18460529460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748;
     Object term761;

    public PasswordRecoveryTemplate_getTemplate_18460529460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term748 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.PasswordRecoveryTemplate"));
        setField(term748, term748.getClass(), "passwordRecoveryLink", "MuLcgQHgqz");
        Class<? extends Object> term814 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term813 = ((Class) term814).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term813).setAccessible(true);
        Object enum1 = ((Field) term813).get((Object) null);
        term761 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term793 = newInstance(Class.forName("java.lang.Object"));
        Object term797 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term800 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term761, term761.getClass(), "id", 6375119433582206027L);
        setField(term761, term761.getClass(), "type", enum1);
        setIntField(term761, term761.getClass(), "employeeId", 1484323161);
        setField(term761, term761.getClass(), "text", "xxtlPwDYFs");
        setField(term761, term761.getClass(), "data", term793);
        setBooleanField(term761, term761.getClass(), "read", false);
        setBooleanField(term761, term761.getClass(), "deleted", false);
        setIntField(term761, term761.getClass(), "createdBy", 391863371);
        setIntField(term797, term797.getClass(), "nanos", 830000000);
        setLongField(term797, term797.getClass(), "fastTime", 1610929382000L);
        setField(term797, term797.getClass(), "cdate", null);
        setField(term761, term761.getClass(), "createdDate", term797);
        setIntField(term800, term800.getClass(), "nanos", 837000000);
        setLongField(term800, term800.getClass(), "fastTime", 1606034835000L);
        setField(term800, term800.getClass(), "cdate", null);
        setField(term761, term761.getClass(), "lastModifiedDate", term800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.PasswordRecoveryTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[1];
        args[0] = term761;
        callMethod(klass, "getTemplate", argTypes, term748, args);
    }

};


