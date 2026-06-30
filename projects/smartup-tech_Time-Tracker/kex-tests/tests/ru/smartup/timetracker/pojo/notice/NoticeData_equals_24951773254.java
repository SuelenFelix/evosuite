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

public class NoticeData_equals_24951773254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49862;

    public NoticeData_equals_24951773254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49862 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        setField(term49862, term49862.getClass(), "project", null);
        setField(term49862, term49862.getClass(), "employee", null);
        setField(term49862, term49862.getClass(), "task", null);
        setField(term49862, term49862.getClass(), "unit", null);
        setField(term49862, term49862.getClass(), "employeesHours", null);
        setField(term49862, term49862.getClass(), "changes", null);
        setField(term49862, term49862.getClass(), "date", null);
        setField(term49862, term49862.getClass(), "error", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term49862, args);
    }

};


