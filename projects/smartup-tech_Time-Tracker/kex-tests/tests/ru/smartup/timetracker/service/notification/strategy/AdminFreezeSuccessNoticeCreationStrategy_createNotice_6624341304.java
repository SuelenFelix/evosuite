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

public class AdminFreezeSuccessNoticeCreationStrategy_createNotice_6624341304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1110;

    public AdminFreezeSuccessNoticeCreationStrategy_createNotice_6624341304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1110 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.strategy.AdminFreezeSuccessNoticeCreationStrategy"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.strategy.AdminFreezeSuccessNoticeCreationStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createNotice", argTypes, term1110, args);
    }

};


