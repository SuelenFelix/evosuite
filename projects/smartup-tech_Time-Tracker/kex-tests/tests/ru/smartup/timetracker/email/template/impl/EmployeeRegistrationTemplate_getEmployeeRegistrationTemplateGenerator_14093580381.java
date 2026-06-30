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

public class EmployeeRegistrationTemplate_getEmployeeRegistrationTemplateGenerator_14093580381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2111;
     Object term2124;

    public EmployeeRegistrationTemplate_getEmployeeRegistrationTemplateGenerator_14093580381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2111 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.EmployeeRegistrationTemplate"));
        setField(term2111, term2111.getClass(), "registrationLink", "MxlszYVzRf");
        term2124 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticePersonalToken"));
        setField(term2124, term2124.getClass(), "employeeName", "LQFpaHEwXR");
        setField(term2124, term2124.getClass(), "token", "oVcInYnLWB");
        setLongField(term2124, term2124.getClass(), "ttlInHours", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.EmployeeRegistrationTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticePersonalToken");
        Object[] args = new Object[1];
        args[0] = term2124;
        callMethod(klass, "getEmployeeRegistrationTemplateGenerator", argTypes, term2111, args);
    }

};


