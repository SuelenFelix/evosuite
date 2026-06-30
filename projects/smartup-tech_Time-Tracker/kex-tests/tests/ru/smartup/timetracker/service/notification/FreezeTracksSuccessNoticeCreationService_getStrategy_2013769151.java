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
import java.lang.String;
import java.lang.Object;

public class FreezeTracksSuccessNoticeCreationService_getStrategy_2013769151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8401;
     Object enum16;

    public FreezeTracksSuccessNoticeCreationService_getStrategy_2013769151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8402 = new HashMap();
        term8401 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.FreezeTracksSuccessNoticeCreationService"));
        setField(term8401, term8401.getClass(), "noticeCreationStrategies", term8402);
        Class<? extends Object> term8485 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term8484 = ((Class) term8485).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term8484).setAccessible(true);
        enum16 = ((Field) term8484).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.FreezeTracksSuccessNoticeCreationService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Object[] args = new Object[1];
        args[0] = enum16;
        callMethod(klass, "getStrategy", argTypes, term8401, args);
    }

};


