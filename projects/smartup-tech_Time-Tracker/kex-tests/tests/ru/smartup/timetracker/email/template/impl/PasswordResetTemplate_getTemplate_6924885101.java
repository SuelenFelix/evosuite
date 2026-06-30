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

public class PasswordResetTemplate_getTemplate_6924885101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2638;
     Object term2639;

    public PasswordResetTemplate_getTemplate_6924885101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2638 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.PasswordResetTemplate"));
        Class<? extends Object> term2688 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term2687 = ((Class) term2688).getDeclaredField((String) "PROJECT_ROLE_CHANGE");
        ((Field) term2687).setAccessible(true);
        Object enum5 = ((Field) term2687).get((Object) null);
        term2639 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term2677 = newInstance(Class.forName("java.lang.Object"));
        Object term2681 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2684 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term2639, term2639.getClass(), "id", 6811161968424632369L);
        setField(term2639, term2639.getClass(), "type", enum5);
        setIntField(term2639, term2639.getClass(), "employeeId", 1725571209);
        setField(term2639, term2639.getClass(), "text", "HyxfbSQYBe");
        setField(term2639, term2639.getClass(), "data", term2677);
        setBooleanField(term2639, term2639.getClass(), "read", false);
        setBooleanField(term2639, term2639.getClass(), "deleted", true);
        setIntField(term2639, term2639.getClass(), "createdBy", -522618178);
        setIntField(term2681, term2681.getClass(), "nanos", 25000000);
        setLongField(term2681, term2681.getClass(), "fastTime", 1797192828000L);
        setField(term2681, term2681.getClass(), "cdate", null);
        setField(term2639, term2639.getClass(), "createdDate", term2681);
        setIntField(term2684, term2684.getClass(), "nanos", 30000000);
        setLongField(term2684, term2684.getClass(), "fastTime", 1589447121000L);
        setField(term2684, term2684.getClass(), "cdate", null);
        setField(term2639, term2639.getClass(), "lastModifiedDate", term2684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.PasswordResetTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[1];
        args[0] = term2639;
        callMethod(klass, "getTemplate", argTypes, term2638, args);
    }

};


