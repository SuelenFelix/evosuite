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
import java.lang.Long;

public class NoticeNumberEmployeesHours_setNumberEmployees_18263945316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18285;
     Object term18289;

    public NoticeNumberEmployeesHours_setNumberEmployees_18263945316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18285 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        setIntField(term18285, term18285.getClass(), "projectId", 0);
        setLongField(term18285, term18285.getClass(), "numberEmployees", 0L);
        setDoubleField(term18285, term18285.getClass(), "sumHours", 0.0);
        term18289 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term18289;
        callMethod(klass, "setNumberEmployees", argTypes, term18285, args);
    }

};


