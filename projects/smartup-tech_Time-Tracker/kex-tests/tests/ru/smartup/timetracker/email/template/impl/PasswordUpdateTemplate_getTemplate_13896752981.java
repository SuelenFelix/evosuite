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

public class PasswordUpdateTemplate_getTemplate_13896752981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3092;
     Object term3093;

    public PasswordUpdateTemplate_getTemplate_13896752981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3092 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.PasswordUpdateTemplate"));
        Class<? extends Object> term3137 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term3136 = ((Class) term3137).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term3136).setAccessible(true);
        Object enum6 = ((Field) term3136).get((Object) null);
        term3093 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term3126 = newInstance(Class.forName("java.lang.Object"));
        Object term3130 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3133 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term3093, term3093.getClass(), "id", -7237588299778557629L);
        setField(term3093, term3093.getClass(), "type", enum6);
        setIntField(term3093, term3093.getClass(), "employeeId", 1134449235);
        setField(term3093, term3093.getClass(), "text", "hNxWaHcfhY");
        setField(term3093, term3093.getClass(), "data", term3126);
        setBooleanField(term3093, term3093.getClass(), "read", false);
        setBooleanField(term3093, term3093.getClass(), "deleted", true);
        setIntField(term3093, term3093.getClass(), "createdBy", -883034806);
        setIntField(term3130, term3130.getClass(), "nanos", 80000000);
        setLongField(term3130, term3130.getClass(), "fastTime", 1745452162000L);
        setField(term3130, term3130.getClass(), "cdate", null);
        setField(term3093, term3093.getClass(), "createdDate", term3130);
        setIntField(term3133, term3133.getClass(), "nanos", 960000000);
        setLongField(term3133, term3133.getClass(), "fastTime", 1349058953000L);
        setField(term3133, term3133.getClass(), "cdate", null);
        setField(term3093, term3093.getClass(), "lastModifiedDate", term3133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.PasswordUpdateTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[1];
        args[0] = term3093;
        callMethod(klass, "getTemplate", argTypes, term3092, args);
    }

};


