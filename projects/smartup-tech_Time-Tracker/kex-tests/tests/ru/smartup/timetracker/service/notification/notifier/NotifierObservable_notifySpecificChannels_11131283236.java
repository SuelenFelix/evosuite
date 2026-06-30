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

public class NotifierObservable_notifySpecificChannels_11131283236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2256;
     Object term2266;
     Object term2269;
     Object term2317;

    public NotifierObservable_notifySpecificChannels_11131283236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2257 = new HashMap();
        term2256 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable"));
        setField(term2256, term2256.getClass(), "appNotifiers", term2257);
        setField(term2256, term2256.getClass(), "executorService", null);
        term2266 = new LinkedList();
        Class<? extends Object> term2331 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term2330 = ((Class) term2331).getDeclaredField((String) "PROJECT_ROLE_CHANGE");
        ((Field) term2330).setAccessible(true);
        Object enum4 = ((Field) term2330).get((Object) null);
        term2269 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term2307 = newInstance(Class.forName("java.lang.Object"));
        Object term2311 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2314 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term2269, term2269.getClass(), "id", 7411271909051562686L);
        setField(term2269, term2269.getClass(), "type", enum4);
        setIntField(term2269, term2269.getClass(), "employeeId", -1145578966);
        setField(term2269, term2269.getClass(), "text", "UiUYnPrcCi");
        setField(term2269, term2269.getClass(), "data", term2307);
        setBooleanField(term2269, term2269.getClass(), "read", true);
        setBooleanField(term2269, term2269.getClass(), "deleted", false);
        setIntField(term2269, term2269.getClass(), "createdBy", 679763016);
        setIntField(term2311, term2311.getClass(), "nanos", 385000000);
        setLongField(term2311, term2311.getClass(), "fastTime", 1347389761000L);
        setField(term2311, term2311.getClass(), "cdate", null);
        setField(term2269, term2269.getClass(), "createdDate", term2311);
        setIntField(term2314, term2314.getClass(), "nanos", 899000000);
        setLongField(term2314, term2314.getClass(), "fastTime", 1502147353000L);
        setField(term2314, term2314.getClass(), "cdate", null);
        setField(term2269, term2269.getClass(), "lastModifiedDate", term2314);
        term2317 = (Object[]) newArray("java.lang.String", 1);
        setElement(term2317, 0, "UoYtihxVaS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.Notice");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2266;
        args[1] = term2269;
        args[2] = term2317;
        callMethod(klass, "notifySpecificChannels", argTypes, term2256, args);
    }

};


