package ru.smartup.timetracker.pojo.notice;

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
import static ru.smartup.timetracker.pojo.notice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NoticeChanges_equals_19790880735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17095;
     Object term17098;

    public NoticeChanges_equals_19790880735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17095 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeChanges"));
        Object term17096 = newInstance(Class.forName("java.lang.Object"));
        Object term17097 = newInstance(Class.forName("java.lang.Object"));
        setField(term17095, term17095.getClass(), "oldValue", term17096);
        setField(term17095, term17095.getClass(), "newValue", term17097);
        term17098 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeChanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17098;
        callMethod(klass, "equals", argTypes, term17095, args);
    }

};


