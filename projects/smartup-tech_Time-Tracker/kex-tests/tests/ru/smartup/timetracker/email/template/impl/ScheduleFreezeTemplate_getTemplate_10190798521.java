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

public class ScheduleFreezeTemplate_getTemplate_10190798521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3503;
     Object term3504;

    public ScheduleFreezeTemplate_getTemplate_10190798521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3503 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.ScheduleFreezeTemplate"));
        Class<? extends Object> term3548 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term3547 = ((Class) term3548).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term3547).setAccessible(true);
        Object enum7 = ((Field) term3547).get((Object) null);
        term3504 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term3537 = newInstance(Class.forName("java.lang.Object"));
        Object term3541 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3544 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term3504, term3504.getClass(), "id", 6967924379644551255L);
        setField(term3504, term3504.getClass(), "type", enum7);
        setIntField(term3504, term3504.getClass(), "employeeId", 1585847225);
        setField(term3504, term3504.getClass(), "text", "RkybSrpybU");
        setField(term3504, term3504.getClass(), "data", term3537);
        setBooleanField(term3504, term3504.getClass(), "read", false);
        setBooleanField(term3504, term3504.getClass(), "deleted", false);
        setIntField(term3504, term3504.getClass(), "createdBy", 597278769);
        setIntField(term3541, term3541.getClass(), "nanos", 457000000);
        setLongField(term3541, term3541.getClass(), "fastTime", 1706067372000L);
        setField(term3541, term3541.getClass(), "cdate", null);
        setField(term3504, term3504.getClass(), "createdDate", term3541);
        setIntField(term3544, term3544.getClass(), "nanos", 992000000);
        setLongField(term3544, term3544.getClass(), "fastTime", 1863620294000L);
        setField(term3544, term3544.getClass(), "cdate", null);
        setField(term3504, term3504.getClass(), "lastModifiedDate", term3544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.ScheduleFreezeTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[1];
        args[0] = term3504;
        callMethod(klass, "getTemplate", argTypes, term3503, args);
    }

};


