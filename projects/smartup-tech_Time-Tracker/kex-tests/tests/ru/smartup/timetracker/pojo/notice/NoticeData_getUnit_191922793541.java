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

public class NoticeData_getUnit_191922793541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49849;

    public NoticeData_getUnit_191922793541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49849 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        setField(term49849, term49849.getClass(), "project", null);
        setField(term49849, term49849.getClass(), "employee", null);
        setField(term49849, term49849.getClass(), "task", null);
        setField(term49849, term49849.getClass(), "unit", null);
        setField(term49849, term49849.getClass(), "employeesHours", null);
        setField(term49849, term49849.getClass(), "changes", null);
        setField(term49849, term49849.getClass(), "date", null);
        setField(term49849, term49849.getClass(), "error", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnit", argTypes, term49849, args);
    }

};


