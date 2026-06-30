package ru.smartup.timetracker.service.notification.strategy;

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
import static ru.smartup.timetracker.service.notification.strategy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ReportReceiverFreezeSuccessNoticeCreationStrategy_createNotice_19267405161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public ReportReceiverFreezeSuccessNoticeCreationStrategy_createNotice_19267405161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.strategy.ReportReceiverFreezeSuccessNoticeCreationStrategy"));
        Class<? extends Object> term340 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term339 = ((Class) term340).getDeclaredField((String) "APPROVAL_REQUIRED");
        ((Field) term339).setAccessible(true);
        Object enum0 = ((Field) term339).get((Object) null);
        term2 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term36 = newInstance(Class.forName("java.lang.Object"));
        setField(term2, term2.getClass(), "type", enum0);
        setField(term2, term2.getClass(), "text", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "data", term36);
        setIntField(term2, term2.getClass(), "createdBy", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.strategy.ReportReceiverFreezeSuccessNoticeCreationStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "createNotice", argTypes, term1, args);
    }

};


