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

public class NoticeData_setUnit_157176841349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49857;

    public NoticeData_setUnit_157176841349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49857 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        setField(term49857, term49857.getClass(), "project", null);
        setField(term49857, term49857.getClass(), "employee", null);
        setField(term49857, term49857.getClass(), "task", null);
        setField(term49857, term49857.getClass(), "unit", null);
        setField(term49857, term49857.getClass(), "employeesHours", null);
        setField(term49857, term49857.getClass(), "changes", null);
        setField(term49857, term49857.getClass(), "date", null);
        setField(term49857, term49857.getClass(), "error", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUnit", argTypes, term49857, args);
    }

};


