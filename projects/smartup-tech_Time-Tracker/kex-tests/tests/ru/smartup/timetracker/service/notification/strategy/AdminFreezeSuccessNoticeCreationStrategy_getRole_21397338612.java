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

public class AdminFreezeSuccessNoticeCreationStrategy_getRole_21397338612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1109;

    public AdminFreezeSuccessNoticeCreationStrategy_getRole_21397338612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1109 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.strategy.AdminFreezeSuccessNoticeCreationStrategy"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.strategy.AdminFreezeSuccessNoticeCreationStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term1109, args);
    }

};


