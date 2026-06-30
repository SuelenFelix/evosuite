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

public class UnfreezeHoursTemplate_getTemplate_19371434431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1267;
     Object term1268;

    public UnfreezeHoursTemplate_getTemplate_19371434431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1267 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.UnfreezeHoursTemplate"));
        Class<? extends Object> term1307 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term1306 = ((Class) term1307).getDeclaredField((String) "UN_FREEZE");
        ((Field) term1306).setAccessible(true);
        Object enum2 = ((Field) term1306).get((Object) null);
        term1268 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term1296 = newInstance(Class.forName("java.lang.Object"));
        Object term1300 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1303 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1268, term1268.getClass(), "id", -8400487765614892086L);
        setField(term1268, term1268.getClass(), "type", enum2);
        setIntField(term1268, term1268.getClass(), "employeeId", -1922583790);
        setField(term1268, term1268.getClass(), "text", "hRNSzYYIrc");
        setField(term1268, term1268.getClass(), "data", term1296);
        setBooleanField(term1268, term1268.getClass(), "read", true);
        setBooleanField(term1268, term1268.getClass(), "deleted", true);
        setIntField(term1268, term1268.getClass(), "createdBy", -616727354);
        setIntField(term1300, term1300.getClass(), "nanos", 302000000);
        setLongField(term1300, term1300.getClass(), "fastTime", 1442628765000L);
        setField(term1300, term1300.getClass(), "cdate", null);
        setField(term1268, term1268.getClass(), "createdDate", term1300);
        setIntField(term1303, term1303.getClass(), "nanos", 18000000);
        setLongField(term1303, term1303.getClass(), "fastTime", 1515879330000L);
        setField(term1303, term1303.getClass(), "cdate", null);
        setField(term1268, term1268.getClass(), "lastModifiedDate", term1303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.UnfreezeHoursTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[1];
        args[0] = term1268;
        callMethod(klass, "getTemplate", argTypes, term1267, args);
    }

};


