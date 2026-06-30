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

public class SuccessFreezeTemplate_getTemplate_4572070481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public SuccessFreezeTemplate_getTemplate_4572070481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.SuccessFreezeTemplate"));
        Class<? extends Object> term350 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term349 = ((Class) term350).getDeclaredField((String) "APPROVAL_REQUIRED");
        ((Field) term349).setAccessible(true);
        Object enum0 = ((Field) term349).get((Object) null);
        term2 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term38 = newInstance(Class.forName("java.lang.Object"));
        Object term42 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term45 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term2, term2.getClass(), "id", 2442117782898005296L);
        setField(term2, term2.getClass(), "type", enum0);
        setIntField(term2, term2.getClass(), "employeeId", 568599855);
        setField(term2, term2.getClass(), "text", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "data", term38);
        setBooleanField(term2, term2.getClass(), "read", false);
        setBooleanField(term2, term2.getClass(), "deleted", false);
        setIntField(term2, term2.getClass(), "createdBy", 1162663216);
        setIntField(term42, term42.getClass(), "nanos", 244000000);
        setLongField(term42, term42.getClass(), "fastTime", 1345860612000L);
        setField(term42, term42.getClass(), "cdate", null);
        setField(term2, term2.getClass(), "createdDate", term42);
        setIntField(term45, term45.getClass(), "nanos", 369000000);
        setLongField(term45, term45.getClass(), "fastTime", 1480427551000L);
        setField(term45, term45.getClass(), "cdate", null);
        setField(term2, term2.getClass(), "lastModifiedDate", term45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.SuccessFreezeTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "getTemplate", argTypes, term1, args);
    }

};


