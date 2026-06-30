package ru.smartup.timetracker.service.notification;

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
import static ru.smartup.timetracker.service.notification.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class NoticeService_deleteNoticesByIdsAndEmployeeId_730442988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8373;
     Object term8379;

    public NoticeService_deleteNoticesByIdsAndEmployeeId_730442988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8374 = new HashMap();
        Set<Object> term8381 =  ((Map) term8374).keySet();
        term8373 = new HashSet((Collection<? extends Object>) term8381);
        term8379 = new Integer(-2015048153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.NoticeService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8373;
        args[1] = term8379;
        callMethod(klass, "deleteNoticesByIdsAndEmployeeId", argTypes, null, args);
    }

};


