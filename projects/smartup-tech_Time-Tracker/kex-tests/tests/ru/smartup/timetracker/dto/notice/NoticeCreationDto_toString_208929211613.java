package ru.smartup.timetracker.dto.notice;

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
import static ru.smartup.timetracker.dto.notice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NoticeCreationDto_toString_208929211613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17400;

    public NoticeCreationDto_toString_208929211613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17437 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term17436 = ((Class) term17437).getDeclaredField((String) "APPROVAL_REQUIRED");
        ((Field) term17436).setAccessible(true);
        Object enum41 = ((Field) term17436).get((Object) null);
        term17400 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term17434 = newInstance(Class.forName("java.lang.Object"));
        setField(term17400, term17400.getClass(), "type", enum41);
        setField(term17400, term17400.getClass(), "text", "wSQxaModmm");
        setField(term17400, term17400.getClass(), "data", term17434);
        setIntField(term17400, term17400.getClass(), "createdBy", -112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17400, args);
    }

};


