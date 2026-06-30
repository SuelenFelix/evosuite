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

public class AdminFreezeSuccessNoticeCreationStrategy_createNotice_6624341301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715;
     Object term716;

    public AdminFreezeSuccessNoticeCreationStrategy_createNotice_6624341301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.strategy.AdminFreezeSuccessNoticeCreationStrategy"));
        Class<? extends Object> term749 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term748 = ((Class) term749).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term748).setAccessible(true);
        Object enum1 = ((Field) term748).get((Object) null);
        term716 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term746 = newInstance(Class.forName("java.lang.Object"));
        setField(term716, term716.getClass(), "type", enum1);
        setField(term716, term716.getClass(), "text", "sjlJAEtRrb");
        setField(term716, term716.getClass(), "data", term746);
        setIntField(term716, term716.getClass(), "createdBy", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.strategy.AdminFreezeSuccessNoticeCreationStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Object[] args = new Object[1];
        args[0] = term716;
        callMethod(klass, "createNotice", argTypes, term715, args);
    }

};


