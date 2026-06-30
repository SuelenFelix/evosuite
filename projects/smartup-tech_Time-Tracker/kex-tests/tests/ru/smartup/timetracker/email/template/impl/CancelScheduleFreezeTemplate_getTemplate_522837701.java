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

public class CancelScheduleFreezeTemplate_getTemplate_522837701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2204;
     Object term2205;

    public CancelScheduleFreezeTemplate_getTemplate_522837701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2204 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.CancelScheduleFreezeTemplate"));
        Class<? extends Object> term2249 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term2248 = ((Class) term2249).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term2248).setAccessible(true);
        Object enum4 = ((Field) term2248).get((Object) null);
        term2205 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term2238 = newInstance(Class.forName("java.lang.Object"));
        Object term2242 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2245 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term2205, term2205.getClass(), "id", 4872422362414183754L);
        setField(term2205, term2205.getClass(), "type", enum4);
        setIntField(term2205, term2205.getClass(), "employeeId", 1227103734);
        setField(term2205, term2205.getClass(), "text", "ZiaGIbnzTs");
        setField(term2205, term2205.getClass(), "data", term2238);
        setBooleanField(term2205, term2205.getClass(), "read", false);
        setBooleanField(term2205, term2205.getClass(), "deleted", true);
        setIntField(term2205, term2205.getClass(), "createdBy", -1339778481);
        setIntField(term2242, term2242.getClass(), "nanos", 896000000);
        setLongField(term2242, term2242.getClass(), "fastTime", 1645823234000L);
        setField(term2242, term2242.getClass(), "cdate", null);
        setField(term2205, term2205.getClass(), "createdDate", term2242);
        setIntField(term2245, term2245.getClass(), "nanos", 23000000);
        setLongField(term2245, term2245.getClass(), "fastTime", 1500710268000L);
        setField(term2245, term2245.getClass(), "cdate", null);
        setField(term2205, term2205.getClass(), "lastModifiedDate", term2245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.CancelScheduleFreezeTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[1];
        args[0] = term2205;
        callMethod(klass, "getTemplate", argTypes, term2204, args);
    }

};


