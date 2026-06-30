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

public class ReportReceiverFreezeSuccessNoticeCreationStrategy_createNotice_19267405164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713;

    public ReportReceiverFreezeSuccessNoticeCreationStrategy_createNotice_19267405164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term713 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.strategy.ReportReceiverFreezeSuccessNoticeCreationStrategy"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.strategy.ReportReceiverFreezeSuccessNoticeCreationStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createNotice", argTypes, term713, args);
    }

};


