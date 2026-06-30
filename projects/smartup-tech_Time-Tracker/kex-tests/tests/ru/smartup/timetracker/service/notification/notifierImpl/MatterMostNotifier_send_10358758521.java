package ru.smartup.timetracker.service.notification.notifierImpl;

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
import static ru.smartup.timetracker.service.notification.notifierImpl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class MatterMostNotifier_send_10358758521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2259;
     Object term2284;
     Object term2287;

    public MatterMostNotifier_send_10358758521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2259 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifierImpl.MatterMostNotifier"));
        setField(term2259, term2259.getClass(), "httpClient", null);
        setField(term2259, term2259.getClass(), "WEBHOOK_URL", "kuTXqwMtDB");
        setField(term2259, term2259.getClass(), "timeTrackerUrl", "Ghbwtircqb");
        term2284 = new LinkedList();
        Class<? extends Object> term2346 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term2345 = ((Class) term2346).getDeclaredField((String) "UN_FREEZE");
        ((Field) term2345).setAccessible(true);
        Object enum4 = ((Field) term2345).get((Object) null);
        term2287 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term2315 = newInstance(Class.forName("java.lang.Object"));
        Object term2319 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2322 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term2287, term2287.getClass(), "id", -8257434502486459194L);
        setField(term2287, term2287.getClass(), "type", enum4);
        setIntField(term2287, term2287.getClass(), "employeeId", -1275173084);
        setField(term2287, term2287.getClass(), "text", "xrwlQZdwCp");
        setField(term2287, term2287.getClass(), "data", term2315);
        setBooleanField(term2287, term2287.getClass(), "read", false);
        setBooleanField(term2287, term2287.getClass(), "deleted", true);
        setIntField(term2287, term2287.getClass(), "createdBy", -244121226);
        setIntField(term2319, term2319.getClass(), "nanos", 364000000);
        setLongField(term2319, term2319.getClass(), "fastTime", 1882628084000L);
        setField(term2319, term2319.getClass(), "cdate", null);
        setField(term2287, term2287.getClass(), "createdDate", term2319);
        setIntField(term2322, term2322.getClass(), "nanos", 580000000);
        setLongField(term2322, term2322.getClass(), "fastTime", 1437746523000L);
        setField(term2322, term2322.getClass(), "cdate", null);
        setField(term2287, term2287.getClass(), "lastModifiedDate", term2322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.notifierImpl.MatterMostNotifier");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[2];
        args[0] = term2284;
        args[1] = term2287;
        callMethod(klass, "send", argTypes, term2259, args);
    }

};


