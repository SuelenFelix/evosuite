package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Notice_canEqual_183215690523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12620;
     Object term12663;

    public Notice_canEqual_183215690523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12665 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term12664 = ((Class) term12665).getDeclaredField((String) "PROJECT_UPDATE");
        ((Field) term12664).setAccessible(true);
        Object enum30 = ((Field) term12664).get((Object) null);
        term12620 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term12653 = newInstance(Class.forName("java.lang.Object"));
        Object term12657 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term12660 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term12620, term12620.getClass(), "id", 8059786003080744426L);
        setField(term12620, term12620.getClass(), "type", enum30);
        setIntField(term12620, term12620.getClass(), "employeeId", 1632125673);
        setField(term12620, term12620.getClass(), "text", "OWDIEULEFu");
        setField(term12620, term12620.getClass(), "data", term12653);
        setBooleanField(term12620, term12620.getClass(), "read", false);
        setBooleanField(term12620, term12620.getClass(), "deleted", true);
        setIntField(term12620, term12620.getClass(), "createdBy", 454281060);
        setIntField(term12657, term12657.getClass(), "nanos", 434000000);
        setLongField(term12657, term12657.getClass(), "fastTime", 1426008074000L);
        setField(term12657, term12657.getClass(), "cdate", null);
        setField(term12620, term12620.getClass(), "createdDate", term12657);
        setIntField(term12660, term12660.getClass(), "nanos", 487000000);
        setLongField(term12660, term12660.getClass(), "fastTime", 1632993975000L);
        setField(term12660, term12660.getClass(), "cdate", null);
        setField(term12620, term12620.getClass(), "lastModifiedDate", term12660);
        term12663 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12663;
        callMethod(klass, "canEqual", argTypes, term12620, args);
    }

};


