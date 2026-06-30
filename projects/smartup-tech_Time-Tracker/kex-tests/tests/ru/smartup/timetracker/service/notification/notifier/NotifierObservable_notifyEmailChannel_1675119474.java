package ru.smartup.timetracker.service.notification.notifier;

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
import static ru.smartup.timetracker.service.notification.notifier.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class NotifierObservable_notifyEmailChannel_1675119474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420;
     Object term1430;
     Object term1433;

    public NotifierObservable_notifyEmailChannel_1675119474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1421 = new HashMap();
        term1420 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable"));
        setField(term1420, term1420.getClass(), "appNotifiers", term1421);
        setField(term1420, term1420.getClass(), "executorService", null);
        term1430 = new LinkedList();
        Class<? extends Object> term1476 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term1475 = ((Class) term1476).getDeclaredField((String) "ADMIN_REMOVED");
        ((Field) term1475).setAccessible(true);
        Object enum2 = ((Field) term1475).get((Object) null);
        term1433 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term1465 = newInstance(Class.forName("java.lang.Object"));
        Object term1469 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1472 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1433, term1433.getClass(), "id", -8400487765614892086L);
        setField(term1433, term1433.getClass(), "type", enum2);
        setIntField(term1433, term1433.getClass(), "employeeId", 1193880199);
        setField(term1433, term1433.getClass(), "text", "LvtrsXUliU");
        setField(term1433, term1433.getClass(), "data", term1465);
        setBooleanField(term1433, term1433.getClass(), "read", true);
        setBooleanField(term1433, term1433.getClass(), "deleted", false);
        setIntField(term1433, term1433.getClass(), "createdBy", -1087774327);
        setIntField(term1469, term1469.getClass(), "nanos", 689000000);
        setLongField(term1469, term1469.getClass(), "fastTime", 1550688194000L);
        setField(term1469, term1469.getClass(), "cdate", null);
        setField(term1433, term1433.getClass(), "createdDate", term1469);
        setIntField(term1472, term1472.getClass(), "nanos", 131000000);
        setLongField(term1472, term1472.getClass(), "fastTime", 1804987287000L);
        setField(term1472, term1472.getClass(), "cdate", null);
        setField(term1433, term1433.getClass(), "lastModifiedDate", term1472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[2];
        args[0] = term1430;
        args[1] = term1433;
        callMethod(klass, "notifyEmailChannel", argTypes, term1420, args);
    }

};


