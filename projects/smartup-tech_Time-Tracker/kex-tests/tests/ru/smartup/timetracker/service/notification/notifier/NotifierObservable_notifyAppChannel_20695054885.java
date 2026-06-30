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

public class NotifierObservable_notifyAppChannel_20695054885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1836;
     Object term1846;
     Object term1849;

    public NotifierObservable_notifyAppChannel_20695054885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1837 = new HashMap();
        term1836 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable"));
        setField(term1836, term1836.getClass(), "appNotifiers", term1837);
        setField(term1836, term1836.getClass(), "executorService", null);
        term1846 = new LinkedList();
        Class<? extends Object> term1893 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term1892 = ((Class) term1893).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term1892).setAccessible(true);
        Object enum3 = ((Field) term1892).get((Object) null);
        term1849 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term1882 = newInstance(Class.forName("java.lang.Object"));
        Object term1886 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1889 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1849, term1849.getClass(), "id", 5270370404989704783L);
        setField(term1849, term1849.getClass(), "type", enum3);
        setIntField(term1849, term1849.getClass(), "employeeId", -1530420153);
        setField(term1849, term1849.getClass(), "text", "jDtqGUpnZN");
        setField(term1849, term1849.getClass(), "data", term1882);
        setBooleanField(term1849, term1849.getClass(), "read", false);
        setBooleanField(term1849, term1849.getClass(), "deleted", true);
        setIntField(term1849, term1849.getClass(), "createdBy", -469968304);
        setIntField(term1886, term1886.getClass(), "nanos", 394000000);
        setLongField(term1886, term1886.getClass(), "fastTime", 1538068116000L);
        setField(term1886, term1886.getClass(), "cdate", null);
        setField(term1849, term1849.getClass(), "createdDate", term1886);
        setIntField(term1889, term1889.getClass(), "nanos", 937000000);
        setLongField(term1889, term1889.getClass(), "fastTime", 1744079265000L);
        setField(term1889, term1889.getClass(), "cdate", null);
        setField(term1849, term1849.getClass(), "lastModifiedDate", term1889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[2];
        args[0] = term1846;
        args[1] = term1849;
        callMethod(klass, "notifyAppChannel", argTypes, term1836, args);
    }

};


